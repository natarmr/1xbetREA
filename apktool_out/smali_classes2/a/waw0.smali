.class public final La/waw0;
.super La/b9v;
.source "SourceFile"


# instance fields
.field public final B:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;La/qgd;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;La/h9w0;La/h9w0;)V
    .locals 14

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    const/16 v4, 0x5b

    .line 4
    .line 5
    move-object v1, p0

    .line 6
    move-object v2, p1

    .line 7
    move-object/from16 v3, p2

    .line 8
    .line 9
    move-object/from16 v5, p3

    .line 10
    .line 11
    move-object/from16 v6, p5

    .line 12
    .line 13
    move-object/from16 v7, p6

    .line 14
    .line 15
    invoke-direct/range {v1 .. v7}, La/b9v;-><init>(Landroid/content/Context;Landroid/os/Looper;ILa/qgd;La/qav;La/rav;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, v5, La/qgd;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Ljava/util/Set;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    new-instance v2, La/ebv;

    .line 25
    .line 26
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v3, Ljava/util/HashSet;

    .line 30
    .line 31
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v3, v2, La/ebv;->a:Ljava/util/HashSet;

    .line 35
    .line 36
    new-instance v3, Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v3, v2, La/ebv;->h:Ljava/util/HashMap;

    .line 42
    .line 43
    new-instance v3, Ljava/util/HashSet;

    .line 44
    .line 45
    iget-object v4, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->b:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v3, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 48
    .line 49
    .line 50
    iput-object v3, v2, La/ebv;->a:Ljava/util/HashSet;

    .line 51
    .line 52
    iget-boolean v3, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->e:Z

    .line 53
    .line 54
    iput-boolean v3, v2, La/ebv;->b:Z

    .line 55
    .line 56
    iget-boolean v3, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->f:Z

    .line 57
    .line 58
    iput-boolean v3, v2, La/ebv;->c:Z

    .line 59
    .line 60
    iget-boolean v3, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->d:Z

    .line 61
    .line 62
    iput-boolean v3, v2, La/ebv;->d:Z

    .line 63
    .line 64
    iget-object v3, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->g:Ljava/lang/String;

    .line 65
    .line 66
    iput-object v3, v2, La/ebv;->e:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v3, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->c:Landroid/accounts/Account;

    .line 69
    .line 70
    iput-object v3, v2, La/ebv;->f:Landroid/accounts/Account;

    .line 71
    .line 72
    iget-object v3, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->h:Ljava/lang/String;

    .line 73
    .line 74
    iput-object v3, v2, La/ebv;->g:Ljava/lang/String;

    .line 75
    .line 76
    iget-object v3, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->i:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-static {v3}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->o(Ljava/util/ArrayList;)Ljava/util/HashMap;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    iput-object v3, v2, La/ebv;->h:Ljava/util/HashMap;

    .line 83
    .line 84
    iget-object v0, v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->j:Ljava/lang/String;

    .line 85
    .line 86
    iput-object v0, v2, La/ebv;->i:Ljava/lang/String;

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_0
    new-instance v2, La/ebv;

    .line 90
    .line 91
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 92
    .line 93
    .line 94
    new-instance v0, Ljava/util/HashSet;

    .line 95
    .line 96
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 97
    .line 98
    .line 99
    iput-object v0, v2, La/ebv;->a:Ljava/util/HashSet;

    .line 100
    .line 101
    new-instance v0, Ljava/util/HashMap;

    .line 102
    .line 103
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 104
    .line 105
    .line 106
    iput-object v0, v2, La/ebv;->h:Ljava/util/HashMap;

    .line 107
    .line 108
    :goto_0
    invoke-static {}, La/qaw0;->a()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    iput-object v0, v2, La/ebv;->i:Ljava/lang/String;

    .line 113
    .line 114
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-nez v0, :cond_1

    .line 119
    .line 120
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-eqz v0, :cond_1

    .line 129
    .line 130
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    check-cast v0, Lcom/google/android/gms/common/api/Scope;

    .line 135
    .line 136
    const/4 v3, 0x0

    .line 137
    new-array v3, v3, [Lcom/google/android/gms/common/api/Scope;

    .line 138
    .line 139
    iget-object v4, v2, La/ebv;->a:Ljava/util/HashSet;

    .line 140
    .line 141
    invoke-virtual {v4, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-interface {v4, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_1
    iget-object p1, v2, La/ebv;->a:Ljava/util/HashSet;

    .line 153
    .line 154
    sget-object v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->n:Lcom/google/android/gms/common/api/Scope;

    .line 155
    .line 156
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-eqz v0, :cond_2

    .line 161
    .line 162
    sget-object v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->m:Lcom/google/android/gms/common/api/Scope;

    .line 163
    .line 164
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    if-eqz v3, :cond_2

    .line 169
    .line 170
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    :cond_2
    iget-boolean v0, v2, La/ebv;->d:Z

    .line 174
    .line 175
    if-eqz v0, :cond_4

    .line 176
    .line 177
    iget-object v0, v2, La/ebv;->f:Landroid/accounts/Account;

    .line 178
    .line 179
    if-eqz v0, :cond_3

    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-nez v0, :cond_4

    .line 186
    .line 187
    :cond_3
    sget-object v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->l:Lcom/google/android/gms/common/api/Scope;

    .line 188
    .line 189
    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    :cond_4
    new-instance v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 193
    .line 194
    new-instance v5, Ljava/util/ArrayList;

    .line 195
    .line 196
    invoke-direct {v5, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 197
    .line 198
    .line 199
    iget-object v6, v2, La/ebv;->f:Landroid/accounts/Account;

    .line 200
    .line 201
    iget-boolean v7, v2, La/ebv;->d:Z

    .line 202
    .line 203
    iget-boolean v8, v2, La/ebv;->b:Z

    .line 204
    .line 205
    iget-boolean v9, v2, La/ebv;->c:Z

    .line 206
    .line 207
    iget-object v10, v2, La/ebv;->e:Ljava/lang/String;

    .line 208
    .line 209
    iget-object v11, v2, La/ebv;->g:Ljava/lang/String;

    .line 210
    .line 211
    iget-object v12, v2, La/ebv;->h:Ljava/util/HashMap;

    .line 212
    .line 213
    iget-object v13, v2, La/ebv;->i:Ljava/lang/String;

    .line 214
    .line 215
    const/4 v4, 0x3

    .line 216
    invoke-direct/range {v3 .. v13}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;-><init>(ILjava/util/ArrayList;Landroid/accounts/Account;ZZZLjava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    iput-object v3, p0, La/waw0;->B:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 220
    .line 221
    return-void
.end method


# virtual methods
.method public final b(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    const-string p0, "com.google.android.gms.auth.api.signin.internal.ISignInService"

    .line 6
    .line 7
    invoke-interface {p1, p0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v1, v0, La/cbw0;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    check-cast v0, La/cbw0;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    new-instance v0, La/cbw0;

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    invoke-direct {v0, p1, p0, v1}, La/y4w0;-><init>(Landroid/os/IBinder;Ljava/lang/String;B)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public final i()I
    .locals 0

    .line 1
    const p0, 0xbdfcb8

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final m()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "com.google.android.gms.auth.api.signin.internal.ISignInService"

    .line 2
    .line 3
    return-object p0
.end method

.method public final n()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "com.google.android.gms.auth.api.signin.service.START"

    .line 2
    .line 3
    return-object p0
.end method
