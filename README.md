# 🎯 TaskNest - Modern Task Management App

<div align="center">

![TaskNest Logo](https://img.shields.io/badge/TaskNest-React%20%7C%20Spring%20%7C%20MongoDB-blue?style=for-the-badge&logo=react)

**A beautiful, modern task management application built with React, Spring Boot, and MongoDB**

[![React](https://img.shields.io/badge/React-18.0.0-61DAFB?style=flat-square&logo=react)](https://reactjs.org/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.3-6DB33F?style=flat-square&logo=spring)](https://spring.io/)
[![MongoDB](https://img.shields.io/badge/MongoDB-5.0-47A248?style=flat-square&logo=mongodb)](https://mongodb.com/)
[![License](https://img.shields.io/badge/License-MIT-green.svg?style=flat-square)](LICENSE)

[🚀 Live Demo](#) • [📖 Documentation](#features) • [🛠️ Setup](#quick-start) • [🤝 Contributing](#contributing)

</div>

---

## ✨ Features

### 🎨 **Modern UI/UX**
- **Dark Mode Design** - Beautiful dark theme with proper contrast
- **Responsive Layout** - Works perfectly on desktop, tablet, and mobile
- **Smooth Animations** - CSS transitions and hover effects
- **Interactive Elements** - Dropdowns, modals, and tooltips

### 📋 **Task Management**
- **Board Organization** - Create and manage multiple boards
- **List Management** - Organize tasks into lists within boards
- **Task Creation** - Add detailed tasks with descriptions
- **Drag & Drop** - Visual feedback for task management
- **Real-time Updates** - Live updates across all connected clients

### 🔍 **Smart Search**
- **Auto-complete** - Intelligent search suggestions
- **Instant Results** - Fast search across boards, lists, and tasks
- **Focus Management** - Proper input focus handling
- **Search History** - Remember recent searches

### 🚀 **Collaboration**
- **Share Boards** - Generate shareable links
- **Email Sharing** - Send board links via email
- **Settings Management** - Customize board preferences
- **Team Features** - Perfect for team collaboration

### ⚡ **Performance**
- **Fast Loading** - Optimized for speed
- **Efficient State Management** - React hooks and memoization
- **Auto-save** - Automatic data persistence
- **Offline Ready** - Progressive Web App features

---

## 🛠️ Tech Stack

### **Frontend**
| Technology | Version | Purpose |
|------------|---------|---------|
| [React](https://reactjs.org/) | 18.0.0 | UI Framework |
| [CSS3](https://developer.mozilla.org/en-US/docs/Web/CSS) | Latest | Styling & Animations |
| [Axios](https://axios-http.com/) | Latest | HTTP Client |
| [Vercel](https://vercel.com/) | - | Frontend Deployment |

### **Backend**
| Technology | Version | Purpose |
|------------|---------|---------|
| [Spring Boot](https://spring.io/) | 3.2.3 | REST API Framework |
| [Spring Data MongoDB](https://spring.io/projects/spring-data-mongodb) | Latest | Database Integration |
| [Maven](https://maven.apache.org/) | Latest | Dependency Management |
| [Java](https://openjdk.org/) | 17+ | Programming Language |

### **Database**
| Technology | Version | Purpose |
|------------|---------|---------|
| [MongoDB](https://mongodb.com/) | 5.0+ | NoSQL Database |
| [MongoDB Atlas](https://www.mongodb.com/atlas) | - | Cloud Database |

### **DevOps**
| Technology | Purpose |
|------------|---------|
| [Docker](https://docker.com/) | Containerization |
| [Docker Compose](https://docs.docker.com/compose/) | Multi-container Orchestration |
| [Railway](https://railway.app/) | Backend Deployment |
| [Render](https://render.com/) | Alternative Backend Deployment |

---

## 📁 Project Structure

```
tasknest-react-spring-mongo/
├── 📄 README.md                    # Project documentation
├── 📄 LICENSE                      # MIT License
├── 📄 .gitignore                   # Git ignore rules
├── 🎨 frontend/                    # React frontend application
│   ├── 📁 public/                  # Static assets
│   │   ├── 📄 index.html          # HTML template
│   │   ├── 📄 favicon.ico         # App icon
│   │   └── 📄 manifest.json       # PWA manifest
│   ├── 📁 src/                     # Source code
│   │   ├── 📄 App.js              # Main application component
│   │   ├── 📄 App.css             # Application styles
│   │   ├── 📄 index.js            # Application entry point
│   │   └── 📄 index.css           # Global styles
│   ├── 📄 package.json            # Frontend dependencies
│   ├── 📄 vercel.json             # Vercel deployment config
│   └── 📄 README.md               # Frontend documentation
└── ⚙️ backend/                     # Spring Boot backend application
    ├── 📁 src/                     # Source code
    │   ├── 📁 main/                # Main source
    │   │   ├── 📁 java/            # Java source files
    │   │   │   └── 📁 com/tasknest/
    │   │   │       ├── 📁 controller/  # REST controllers
    │   │   │       │   └── 📄 BoardController.java
    │   │   │       ├── 📁 model/       # Data models
    │   │   │       │   └── 📄 Board.java
    │   │   │       ├── 📁 repository/  # Data access layer
    │   │   │       │   └── 📄 BoardRepository.java
    │   │   │       └── 📄 Javaproject1Application.java
    │   │   └── 📁 resources/       # Configuration files
    │   │       └── 📄 application.properties
    │   └── 📁 test/                # Test files
    │       └── 📁 java/com/tasknest/
    │           └── 📄 Javaproject1ApplicationTests.java
    ├── 📄 pom.xml                  # Maven dependencies
    ├── 📄 Dockerfile               # Backend container config
    ├── 📄 docker-compose.yml       # Multi-container setup
    └── 📄 HELP.md                  # Spring Boot help
```

---

## 🚀 Quick Start

### **Prerequisites**

Before you begin, ensure you have the following installed:

- **Node.js** (v16 or higher) - [Download](https://nodejs.org/)
- **Java** (v17 or higher) - [Download](https://openjdk.org/)
- **Maven** (v3.6 or higher) - [Download](https://maven.apache.org/)
- **MongoDB** (v5.0 or higher) - [Download](https://mongodb.com/) or use [MongoDB Atlas](https://www.mongodb.com/atlas)
- **Git** - [Download](https://git-scm.com/)

### **Local Development Setup**

#### **1. Clone the Repository**
```bash
git clone https://github.com/yourusername/tasknest-react-spring-mongo.git
cd tasknest-react-spring-mongo
```

#### **2. Backend Setup**
```bash
# Navigate to backend directory
cd backend

# Install dependencies and build
mvn clean install

# Start the Spring Boot application
mvn spring-boot:run
```

The backend will be available at: **http://localhost:8080**

#### **3. Frontend Setup**
```bash
# Open a new terminal and navigate to frontend directory
cd frontend

# Install dependencies
npm install

# Start the React development server
npm start
```

The frontend will be available at: **http://localhost:3000**

### **Docker Setup (Alternative)**

If you prefer using Docker:

```bash
# Navigate to backend directory
cd backend

# Build and run with Docker Compose
docker-compose up --build
```

This will start:
- **Backend**: http://localhost:8080
- **MongoDB**: mongodb://localhost:27017
- **Frontend**: http://localhost:3000

---

## 🌐 API Documentation

### **Base URL**
```
http://localhost:8080/api
```

### **Boards Endpoints**

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/boards` | Get all boards |
| `POST` | `/boards` | Create a new board |
| `PUT` | `/boards/{id}` | Update a board |
| `DELETE` | `/boards/{id}` | Delete a board |

### **Lists Endpoints**

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/boards/{boardId}/lists` | Get lists for a board |
| `POST` | `/boards/{boardId}/lists` | Create a new list |
| `PUT` | `/lists/{id}` | Update a list |
| `DELETE` | `/lists/{id}` | Delete a list |

### **Tasks Endpoints**

| Method | Endpoint | Description |
|--------|----------|-------------|
| `GET` | `/lists/{listId}/tasks` | Get tasks for a list |
| `POST` | `/lists/{listId}/tasks` | Create a new task |
| `PUT` | `/tasks/{id}` | Update a task |
| `DELETE` | `/tasks/{id}` | Delete a task |

### **Request/Response Examples**

#### **Create Board**
```bash
POST /api/boards
Content-Type: application/json

{
  "name": "My Project Board",
  "createdAt": "2024-01-15T10:30:00Z"
}
```

#### **Response**
```json
{
  "id": "507f1f77bcf86cd799439011",
  "name": "My Project Board",
  "createdAt": "2024-01-15T10:30:00Z"
}
```

---

## 🚀 Deployment

### **Frontend Deployment (Vercel)**

1. **Connect to Vercel**
   - Go to [vercel.com](https://vercel.com)
   - Sign in with your GitHub account
   - Click "New Project"

2. **Import Repository**
   - Select your `tasknest-react-spring-mongo` repository
   - Set the root directory to `frontend`
   - Click "Deploy"

3. **Environment Variables**
   ```env
   REACT_APP_API_URL=https://your-backend-url.com
   ```

### **Backend Deployment (Railway)**

1. **Connect to Railway**
   - Go to [railway.app](https://railway.app)
   - Sign in with your GitHub account
   - Click "New Project"

2. **Deploy from GitHub**
   - Select your repository
   - Set the root directory to `backend`
   - Railway will auto-detect it's a Spring Boot app

3. **Environment Variables**
   ```env
   MONGODB_URI=mongodb+srv://username:password@cluster.mongodb.net/tasknest
   PORT=8080
   ```

### **Database Setup (MongoDB Atlas)**

1. **Create Atlas Cluster**
   - Go to [mongodb.com/atlas](https://www.mongodb.com/atlas)
   - Create a free account
   - Create a new cluster

2. **Get Connection String**
   - Click "Connect" on your cluster
   - Choose "Connect your application"
   - Copy the connection string

3. **Add to Backend**
   - Replace `<password>` with your database password
   - Add to Railway environment variables

### **Alternative Backend Deployment (Render)**

1. **Create Web Service**
   - Go to [render.com](https://render.com)
   - Create a new Web Service
   - Connect your GitHub repository

2. **Build Settings**
   ```
   Build Command: ./mvnw clean package -DskipTests
   Start Command: java -jar target/*.jar
   ```

3. **Environment Variables**
   ```env
   MONGODB_URI=your-mongodb-connection-string
   ```

---

## 🎨 UI Features

### **Responsive Design**
- **Desktop**: Full-featured interface with sidebars and detailed views
- **Tablet**: Optimized layout with touch-friendly controls
- **Mobile**: Streamlined interface with mobile-first design

### **Dark Mode**
- **Modern Theme**: Beautiful dark colors with proper contrast
- **Smooth Transitions**: Elegant theme switching animations
- **Accessibility**: WCAG compliant color combinations

### **Interactive Elements**
- **Hover Effects**: Visual feedback on interactive elements
- **Loading States**: Smooth loading animations
- **Error Handling**: User-friendly error messages
- **Success Feedback**: Confirmation messages for actions

### **Search & Filter**
- **Real-time Search**: Instant results as you type
- **Auto-complete**: Smart suggestions based on content
- **Filter Options**: Filter by board, list, or task status
- **Search History**: Remember recent searches

---

## 🔧 Configuration

### **Environment Variables**

#### **Frontend (.env)**
```env
# API Configuration
REACT_APP_API_URL=http://localhost:8080

# Feature Flags
REACT_APP_ENABLE_AUTO_SAVE=true
REACT_APP_ENABLE_ANIMATIONS=true
```

#### **Backend (application.properties)**
```properties
# Database Configuration
spring.data.mongodb.uri=mongodb://localhost:27017/tasknest

# Server Configuration
server.port=8080
server.servlet.context-path=/api

# CORS Configuration
spring.web.cors.allowed-origins=http://localhost:3000
spring.web.cors.allowed-methods=GET,POST,PUT,DELETE
spring.web.cors.allowed-headers=*

# Logging Configuration
logging.level.com.tasknest=DEBUG
logging.level.org.springframework.web=INFO
```

### **Docker Configuration**

#### **Backend Dockerfile**
```dockerfile
FROM openjdk:17-jdk-slim
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
```

#### **Docker Compose**
```yaml
version: '3.8'
services:
  backend:
    build: .
    ports:
      - "8080:8080"
    environment:
      - SPRING_DATA_MONGODB_URI=mongodb://mongodb:27017/tasknest
    depends_on:
      - mongodb
  
  mongodb:
    image: mongo:5.0
    ports:
      - "27017:27017"
    volumes:
      - mongodb_data:/data/db

volumes:
  mongodb_data:
```

---

## 🤝 Contributing

We welcome contributions! Please follow these steps:

### **1. Fork the Repository**
```bash
git clone https://github.com/yourusername/tasknest-react-spring-mongo.git
cd tasknest-react-spring-mongo
```

### **2. Create a Feature Branch**
```bash
git checkout -b feature/amazing-feature
```

### **3. Make Your Changes**
- Follow the existing code style
- Add tests for new features
- Update documentation as needed

### **4. Commit Your Changes**
```bash
git add .
git commit -m 'Add amazing feature'
```

### **5. Push to Branch**
```bash
git push origin feature/amazing-feature
```

### **6. Open a Pull Request**
- Go to the original repository
- Click "New Pull Request"
- Select your feature branch
- Add description of changes

### **Development Guidelines**

- **Code Style**: Follow existing patterns
- **Testing**: Add unit tests for new features
- **Documentation**: Update README for new features
- **Commits**: Use conventional commit messages

---

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

```
MIT License

Copyright (c) 2024 TaskNest

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

---

## 🙏 Acknowledgments

- **React Team** - For the amazing frontend framework
- **Spring Boot Team** - For the robust backend framework
- **MongoDB Team** - For the flexible database solution
- **Vercel Team** - For seamless frontend deployment
- **Railway Team** - For easy backend deployment
- **All Contributors** - For making this project better

---

## 📞 Support

If you need help or have questions:

- **📧 Email**: roboticsengineering.re@gmail.com
- **🐛 Issues**: [GitHub Issues](https://github.com/yourusername/tasknest-react-spring-mongo/issues)
- **💬 Discussions**: [GitHub Discussions](https://github.com/yourusername/tasknest-react-spring-mongo/discussions)
- **📖 Documentation**: Check this README and inline code comments

### **Common Issues**

#### **CORS Errors**
- Ensure backend CORS is configured correctly
- Check that frontend API URL matches backend URL

#### **Database Connection**
- Verify MongoDB is running
- Check connection string in environment variables
- Ensure network connectivity

#### **Build Errors**
- Update Node.js to v16+
- Update Java to v17+
- Clear npm cache: `npm cache clean --force`

---

<div align="center">

**Made with ❤️ by Kanwal Raj Rahi**

[⭐ Star this repo](https://github.com/yourusername/tasknest-react-spring-mongo) • [🔄 Fork this repo](https://github.com/yourusername/tasknest-react-spring-mongo/fork) • [📖 View on GitHub](https://github.com/yourusername/tasknest-react-spring-mongo)

</div> 
