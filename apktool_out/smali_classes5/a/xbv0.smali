.class public abstract La/xbv0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/xbv0;->a:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    return-void
.end method

.method public static a(ILjava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object p1, La/xbv0;->a:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-interface {p1, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static b(ILjava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1}, La/f140;->i(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/app/Application;Ljava/lang/String;)La/ozi;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v2, La/xbv0;->a:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, La/ozi;

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    return-object v3

    .line 19
    :cond_0
    instance-of v3, v0, La/af3;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    check-cast v0, La/af3;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-object v0, v4

    .line 28
    :goto_0
    const-class v3, La/ybv0;

    .line 29
    .line 30
    if-eqz v0, :cond_4

    .line 31
    .line 32
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, La/o5d0;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, La/ze3;

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move-object v0, v4

    .line 52
    :goto_1
    instance-of v5, v0, La/ybv0;

    .line 53
    .line 54
    if-nez v5, :cond_3

    .line 55
    .line 56
    move-object v0, v4

    .line 57
    :cond_3
    check-cast v0, La/ybv0;

    .line 58
    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    iget-object v7, v0, La/ybv0;->d:La/cad;

    .line 62
    .line 63
    iget-object v6, v0, La/ybv0;->a:La/onv;

    .line 64
    .line 65
    iget-object v9, v0, La/ybv0;->b:La/sue;

    .line 66
    .line 67
    iget-object v10, v0, La/ybv0;->c:La/vqc;

    .line 68
    .line 69
    iget-object v12, v0, La/ybv0;->e:La/knf0;

    .line 70
    .line 71
    iget-object v13, v0, La/ybv0;->f:La/gii0;

    .line 72
    .line 73
    iget-object v14, v0, La/ybv0;->g:La/gst0;

    .line 74
    .line 75
    iget-object v8, v0, La/ybv0;->h:La/clc;

    .line 76
    .line 77
    iget-object v15, v0, La/ybv0;->i:La/ctf0;

    .line 78
    .line 79
    iget-object v3, v0, La/ybv0;->j:La/mii0;

    .line 80
    .line 81
    iget-object v4, v0, La/ybv0;->k:La/x20;

    .line 82
    .line 83
    iget-object v5, v0, La/ybv0;->l:La/pru;

    .line 84
    .line 85
    iget-object v11, v0, La/ybv0;->m:La/ii;

    .line 86
    .line 87
    move-object/from16 v16, v3

    .line 88
    .line 89
    iget-object v3, v0, La/ybv0;->n:La/ouu;

    .line 90
    .line 91
    move-object/from16 v20, v3

    .line 92
    .line 93
    iget-object v3, v0, La/ybv0;->o:La/zfo;

    .line 94
    .line 95
    move-object/from16 v21, v3

    .line 96
    .line 97
    iget-object v3, v0, La/ybv0;->p:La/edo;

    .line 98
    .line 99
    move-object/from16 v22, v3

    .line 100
    .line 101
    iget-object v3, v0, La/ybv0;->q:La/j1q0;

    .line 102
    .line 103
    move-object/from16 v19, v11

    .line 104
    .line 105
    iget-object v11, v0, La/ybv0;->r:La/onv;

    .line 106
    .line 107
    iget-object v0, v0, La/ybv0;->s:La/b3c0;

    .line 108
    .line 109
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    move-object/from16 v18, v5

    .line 140
    .line 141
    new-instance v5, La/ozi;

    .line 142
    .line 143
    move-object/from16 v24, v0

    .line 144
    .line 145
    move-object/from16 v23, v3

    .line 146
    .line 147
    move-object/from16 v17, v4

    .line 148
    .line 149
    invoke-direct/range {v5 .. v24}, La/ozi;-><init>(La/onv;La/cad;La/clc;La/sue;La/vqc;La/onv;La/knf0;La/gii0;La/gst0;La/ctf0;La/mii0;La/x20;La/pru;La/ii;La/ouu;La/zfo;La/edo;La/j1q0;La/b3c0;)V

    .line 150
    .line 151
    .line 152
    invoke-interface {v2, v1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    return-object v5

    .line 156
    :cond_4
    const-string v0, "Cannot create dependency "

    .line 157
    .line 158
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    return-object v4
.end method
