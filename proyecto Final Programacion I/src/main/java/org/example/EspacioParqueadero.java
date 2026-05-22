package org.example;

public class EspacioParqueadero {



        private String codigo;
        private TipoEspacio tipoespacio;
        private boolean disponible;

        public EspacioParqueadero(String codigo, TipoEspacio tipoespacio, boolean disponible) {

            this.codigo = codigo;
            this.tipoespacio = tipoespacio;
            this.disponible = disponible;
        }

        public boolean isDisponible() {
            return disponible;
        }

        public void setDisponible(
                boolean disponible) {

            this.disponible = disponible;
        }

        public TipoEspacio getTipoespacio() {
            return tipoespacio;
        }

        public void setTipoespacio(
                TipoEspacio tipoespacio) {

            this.tipoespacio = tipoespacio;
        }

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(
                String codigo) {

            this.codigo = codigo;
        }
    }


