.class public final La/t6k0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/r6k0;

.field public final b:Ljava/lang/String;

.field public final c:La/jt2;

.field public final d:La/wti;

.field public final e:La/zx10;

.field public final f:Ljava/util/concurrent/atomic/AtomicReference;

.field public final g:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public h:La/s6k0;

.field public i:J

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:Ljava/util/Map;


# direct methods
.method public constructor <init>(La/r6k0;Ljava/lang/String;La/jt2;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/t6k0;->a:La/r6k0;

    .line 14
    .line 15
    iput-object p2, p0, La/t6k0;->b:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p3, p0, La/t6k0;->c:La/jt2;

    .line 18
    .line 19
    new-instance p2, La/wti;

    .line 20
    .line 21
    const/4 p3, 0x4

    .line 22
    invoke-direct {p2, p3}, La/wti;-><init>(B)V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, La/t6k0;->d:La/wti;

    .line 26
    .line 27
    new-instance p2, La/zx10;

    .line 28
    .line 29
    invoke-direct {p2, p1}, La/zx10;-><init>(La/r6k0;)V

    .line 30
    .line 31
    .line 32
    iput-object p2, p0, La/t6k0;->e:La/zx10;

    .line 33
    .line 34
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 35
    .line 36
    const/4 p2, 0x0

    .line 37
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, La/t6k0;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 41
    .line 42
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 43
    .line 44
    const/4 p2, 0x0

    .line 45
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, La/t6k0;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 49
    .line 50
    const-string p1, ""

    .line 51
    .line 52
    iput-object p1, p0, La/t6k0;->j:Ljava/lang/String;

    .line 53
    .line 54
    iput-object p1, p0, La/t6k0;->k:Ljava/lang/String;

    .line 55
    .line 56
    iput-object p1, p0, La/t6k0;->l:Ljava/lang/String;

    .line 57
    .line 58
    iput-object p1, p0, La/t6k0;->m:Ljava/lang/String;

    .line 59
    .line 60
    sget-object p1, La/lun;->a:La/lun;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, La/t6k0;->n:Ljava/util/Map;

    .line 66
    .line 67
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)La/qoj0;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, La/t6k0;->a:La/r6k0;

    .line 4
    .line 5
    iget-object v8, v1, La/t6k0;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    sget-object v2, La/i99;->b:La/i99;

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    const/4 v9, 0x0

    .line 23
    const/16 v4, 0x10

    .line 24
    .line 25
    invoke-static {v9, v4, v2, v3}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 26
    .line 27
    .line 28
    move-result-object v10

    .line 29
    iget-object v11, v1, La/t6k0;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 30
    .line 31
    invoke-virtual {v11, v10}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    move-object/from16 v13, p1

    .line 35
    .line 36
    :try_start_0
    iput-object v13, v1, La/t6k0;->j:Ljava/lang/String;

    .line 37
    .line 38
    move-object/from16 v14, p2

    .line 39
    .line 40
    iput-object v14, v1, La/t6k0;->k:Ljava/lang/String;

    .line 41
    .line 42
    move-object/from16 v5, p3

    .line 43
    .line 44
    iput-object v5, v1, La/t6k0;->l:Ljava/lang/String;

    .line 45
    .line 46
    move-object/from16 v2, p4

    .line 47
    .line 48
    iput-object v2, v1, La/t6k0;->n:Ljava/util/Map;

    .line 49
    .line 50
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    const-string v4, "-"

    .line 62
    .line 63
    const-string v6, ""

    .line 64
    .line 65
    invoke-static {v3, v4, v6, v9}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    iput-object v3, v1, La/t6k0;->m:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v8, v9}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 72
    .line 73
    .line 74
    const-wide/16 v3, 0x1

    .line 75
    .line 76
    iput-wide v3, v1, La/t6k0;->i:J

    .line 77
    .line 78
    invoke-virtual {v0}, La/r6k0;->f()Landroid/javax/sip/SipProvider;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-static {}, La/r6k0;->b()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v15

    .line 86
    iget-object v12, v1, La/t6k0;->e:La/zx10;

    .line 87
    .line 88
    iget-wide v3, v1, La/t6k0;->i:J

    .line 89
    .line 90
    iget-object v0, v1, La/t6k0;->m:Ljava/lang/String;

    .line 91
    .line 92
    const/16 v21, 0x12c

    .line 93
    .line 94
    move-object/from16 v19, v0

    .line 95
    .line 96
    move-object/from16 v20, v2

    .line 97
    .line 98
    move-wide/from16 v17, v3

    .line 99
    .line 100
    move-object/from16 v16, v5

    .line 101
    .line 102
    invoke-virtual/range {v12 .. v21}, La/zx10;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/Map;I)Landroid/javax/sip/message/Request;

    .line 103
    .line 104
    .line 105
    move-result-object v12

    .line 106
    new-instance v13, La/s6k0;

    .line 107
    .line 108
    iget-object v14, v1, La/t6k0;->a:La/r6k0;

    .line 109
    .line 110
    iget-object v0, v1, La/t6k0;->c:La/jt2;

    .line 111
    .line 112
    move-object v4, v0

    .line 113
    new-instance v0, La/bg0;

    .line 114
    .line 115
    const/16 v7, 0x11

    .line 116
    .line 117
    move-object v2, v15

    .line 118
    move-object v15, v4

    .line 119
    move-object v4, v2

    .line 120
    move-object/from16 v2, p1

    .line 121
    .line 122
    move-object/from16 v3, p2

    .line 123
    .line 124
    move-object/from16 v5, p3

    .line 125
    .line 126
    invoke-direct/range {v0 .. v7}, La/bg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 127
    .line 128
    .line 129
    move-object v7, v6

    .line 130
    move-object v6, v0

    .line 131
    move-object v0, v1

    .line 132
    move-object v5, v8

    .line 133
    move-object v2, v11

    .line 134
    move-object v1, v13

    .line 135
    move-object v3, v14

    .line 136
    move-object v4, v15

    .line 137
    invoke-direct/range {v1 .. v6}, La/s6k0;-><init>(Ljava/util/concurrent/atomic/AtomicReference;La/r6k0;La/jt2;Ljava/util/concurrent/atomic/AtomicBoolean;La/bg0;)V

    .line 138
    .line 139
    .line 140
    iget-object v2, v0, La/t6k0;->h:La/s6k0;

    .line 141
    .line 142
    if-eqz v2, :cond_0

    .line 143
    .line 144
    invoke-interface {v7, v2}, Landroid/javax/sip/SipProvider;->removeSipListener(Landroid/javax/sip/SipListener;)V

    .line 145
    .line 146
    .line 147
    :cond_0
    invoke-interface {v7, v1}, Landroid/javax/sip/SipProvider;->addSipListener(Landroid/javax/sip/SipListener;)V

    .line 148
    .line 149
    .line 150
    iput-object v1, v0, La/t6k0;->h:La/s6k0;

    .line 151
    .line 152
    invoke-interface {v7, v12}, Landroid/javax/sip/SipProvider;->getNewClientTransaction(Landroid/javax/sip/message/Request;)Landroid/javax/sip/ClientTransaction;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-interface {v1}, Landroid/javax/sip/ClientTransaction;->sendRequest()V

    .line 160
    .line 161
    .line 162
    iget-object v0, v0, La/t6k0;->c:La/jt2;

    .line 163
    .line 164
    const-string v1, "registerSent"

    .line 165
    .line 166
    const-string v2, "REGISTER sent"

    .line 167
    .line 168
    iget-object v0, v0, La/jt2;->a:La/n6k0;

    .line 169
    .line 170
    invoke-virtual {v0, v1, v2}, La/n6k0;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    .line 172
    .line 173
    return-object v10

    .line 174
    :catch_0
    new-instance v0, La/y6k0;

    .line 175
    .line 176
    invoke-direct {v0, v9}, La/y6k0;-><init>(Z)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v10, v0}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    return-object v10
.end method
