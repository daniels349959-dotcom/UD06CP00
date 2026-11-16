package com.example.ud06cp00

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonaAdapter(private val personas: List<Persona>) :
    RecyclerView.Adapter<PersonaAdapter.PersonaViewHolder>() {

    class PersonaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val foto: ImageView = view.findViewById(R.id.foto)
        val nombre: TextView = view.findViewById(R.id.nombre)
        val descripcion: TextView = view.findViewById(R.id.descripcion)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_persona, parent, false)
        return PersonaViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonaViewHolder, position: Int) {
        val persona = personas[position]
        holder.foto.setImageResource(persona.foto)
        holder.foto.contentDescription = persona.nombre
        holder.nombre.text = persona.nombre
        holder.descripcion.text = persona.descripcion
    }

    override fun getItemCount(): Int = personas.size
}
