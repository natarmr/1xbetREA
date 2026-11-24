.class public final La/h0q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/dqt0;
.implements La/ylu0;
.implements La/ngw0;
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/h0q0;La/okt0;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, La/h0q0;->c:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashMap;

    .line 28
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, La/h0q0;->d:Ljava/lang/Object;

    iput-object p1, p0, La/h0q0;->a:Ljava/lang/Object;

    iput-object p2, p0, La/h0q0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/piu0;La/miu0;La/wbf;)V
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
    iput-object p1, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p2, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p3, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 18
    .line 19
    new-instance p1, La/s2m0;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(La/rrd;La/zfo;La/edo;La/j1q0;)V
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 36
    iput-object p2, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 37
    iput-object p3, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 38
    iput-object p4, p0, La/h0q0;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/z220;La/gst0;La/b3c0;La/uzc;)V
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 31
    iput-object p2, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 32
    iput-object p3, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 33
    iput-object p4, p0, La/h0q0;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 39
    iput-object p1, p0, La/h0q0;->a:Ljava/lang/Object;

    iput-object p2, p0, La/h0q0;->b:Ljava/lang/Object;

    iput-object p3, p0, La/h0q0;->c:Ljava/lang/Object;

    iput-object p4, p0, La/h0q0;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public A(La/h6m0;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/qaq0;

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    invoke-direct {v0, p0, p1, v1}, La/qaq0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    monitor-enter v1

    .line 13
    :try_start_0
    iget-object v2, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Ljava/lang/Runnable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    monitor-exit v1

    .line 24
    iget-object p0, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, La/cad;

    .line 27
    .line 28
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Landroid/os/Handler;

    .line 31
    .line 32
    const-wide/32 v1, 0x5265c0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    monitor-exit v1

    .line 41
    throw p0
.end method

.method public B(La/jlw0;)La/jlw0;
    .locals 1

    .line 1
    iget-object v0, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/okt0;

    .line 4
    .line 5
    invoke-virtual {v0, p0, p1}, La/okt0;->s(La/h0q0;La/jlw0;)La/jlw0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public C()La/uqw0;
    .locals 7

    .line 1
    iget-object v0, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/brw0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_a

    .line 7
    .line 8
    iget-object v2, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, La/rkt0;

    .line 11
    .line 12
    if-eqz v2, :cond_9

    .line 13
    .line 14
    iget-object v3, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, La/rkt0;

    .line 17
    .line 18
    if-eqz v3, :cond_9

    .line 19
    .line 20
    iget v4, v0, La/brw0;->a:I

    .line 21
    .line 22
    iget-object v2, v2, La/rkt0;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, La/icw0;

    .line 25
    .line 26
    iget-object v2, v2, La/icw0;->a:[B

    .line 27
    .line 28
    array-length v2, v2

    .line 29
    if-ne v4, v2, :cond_8

    .line 30
    .line 31
    iget v2, v0, La/brw0;->b:I

    .line 32
    .line 33
    iget-object v3, v3, La/rkt0;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v3, La/icw0;

    .line 36
    .line 37
    iget-object v3, v3, La/icw0;->a:[B

    .line 38
    .line 39
    array-length v3, v3

    .line 40
    if-ne v2, v3, :cond_7

    .line 41
    .line 42
    invoke-virtual {v0}, La/brw0;->a()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    iget-object v0, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Ljava/lang/Integer;

    .line 51
    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const-string p0, "Cannot create key without ID requirement with parameters with ID requirement"

    .line 56
    .line 57
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_1
    :goto_0
    iget-object v0, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, La/brw0;

    .line 64
    .line 65
    invoke-virtual {v0}, La/brw0;->a()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_3

    .line 70
    .line 71
    iget-object v0, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Ljava/lang/Integer;

    .line 74
    .line 75
    if-nez v0, :cond_2

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    const-string p0, "Cannot create key with ID requirement with parameters without ID requirement"

    .line 79
    .line 80
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-object v1

    .line 84
    :cond_3
    :goto_1
    iget-object v0, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, La/brw0;

    .line 87
    .line 88
    iget-object v0, v0, La/brw0;->e:La/arw0;

    .line 89
    .line 90
    sget-object v2, La/arw0;->e:La/arw0;

    .line 91
    .line 92
    if-ne v0, v2, :cond_4

    .line 93
    .line 94
    sget-object v0, La/q6x0;->a:La/icw0;

    .line 95
    .line 96
    :goto_2
    move-object v5, v0

    .line 97
    goto :goto_3

    .line 98
    :cond_4
    sget-object v2, La/arw0;->d:La/arw0;

    .line 99
    .line 100
    if-ne v0, v2, :cond_5

    .line 101
    .line 102
    iget-object v0, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, Ljava/lang/Integer;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    invoke-static {v0}, La/q6x0;->a(I)La/icw0;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    goto :goto_2

    .line 115
    :cond_5
    sget-object v2, La/arw0;->c:La/arw0;

    .line 116
    .line 117
    if-ne v0, v2, :cond_6

    .line 118
    .line 119
    iget-object v0, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, Ljava/lang/Integer;

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    invoke-static {v0}, La/q6x0;->b(I)La/icw0;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    goto :goto_2

    .line 132
    :goto_3
    new-instance v1, La/uqw0;

    .line 133
    .line 134
    iget-object v0, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 135
    .line 136
    move-object v2, v0

    .line 137
    check-cast v2, La/brw0;

    .line 138
    .line 139
    iget-object v0, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 140
    .line 141
    move-object v3, v0

    .line 142
    check-cast v3, La/rkt0;

    .line 143
    .line 144
    iget-object v0, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 145
    .line 146
    move-object v4, v0

    .line 147
    check-cast v4, La/rkt0;

    .line 148
    .line 149
    iget-object p0, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 150
    .line 151
    move-object v6, p0

    .line 152
    check-cast v6, Ljava/lang/Integer;

    .line 153
    .line 154
    invoke-direct/range {v1 .. v6}, La/uqw0;-><init>(La/brw0;La/rkt0;La/rkt0;La/icw0;Ljava/lang/Integer;)V

    .line 155
    .line 156
    .line 157
    return-object v1

    .line 158
    :cond_6
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    const-string v0, "Unknown AesCtrHmacAeadParameters.Variant: "

    .line 163
    .line 164
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    return-object v1

    .line 172
    :cond_7
    const-string p0, "HMAC key size mismatch"

    .line 173
    .line 174
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    return-object v1

    .line 178
    :cond_8
    const-string p0, "AES key size mismatch"

    .line 179
    .line 180
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    return-object v1

    .line 184
    :cond_9
    const-string p0, "Cannot build without key material"

    .line 185
    .line 186
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    return-object v1

    .line 190
    :cond_a
    const-string p0, "Cannot build without parameters"

    .line 191
    .line 192
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    return-object v1
.end method

.method public D()La/mrw0;
    .locals 4

    .line 1
    iget-object v0, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Integer;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-object v2, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, La/p50;

    .line 11
    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    iget-object v2, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Ljava/lang/Integer;

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget-object v2, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Ljava/lang/Integer;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    new-instance v1, La/mrw0;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v2, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    iget-object v3, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v3, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    iget-object p0, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, La/p50;

    .line 51
    .line 52
    invoke-direct {v1, v0, v2, v3, p0}, La/mrw0;-><init>(IIILa/p50;)V

    .line 53
    .line 54
    .line 55
    return-object v1

    .line 56
    :cond_0
    const-string p0, "Tag size is not set"

    .line 57
    .line 58
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_1
    const-string p0, "IV size is not set"

    .line 63
    .line 64
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_2
    const-string p0, "Variant is not set"

    .line 69
    .line 70
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_3
    const-string p0, "Key size is not set"

    .line 75
    .line 76
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-object v1
.end method

.method public E()La/e0x0;
    .locals 4

    .line 1
    iget-object v0, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/d0x0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    iget-object v2, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, La/c0x0;

    .line 11
    .line 12
    if-eqz v2, :cond_4

    .line 13
    .line 14
    iget-object v3, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, La/b0x0;

    .line 17
    .line 18
    if-eqz v3, :cond_3

    .line 19
    .line 20
    iget-object v3, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v3, La/m60;

    .line 23
    .line 24
    if-eqz v3, :cond_2

    .line 25
    .line 26
    sget-object v3, La/d0x0;->g:La/d0x0;

    .line 27
    .line 28
    if-eq v0, v3, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    sget-object v0, La/c0x0;->c:La/c0x0;

    .line 32
    .line 33
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    :goto_0
    new-instance v0, La/e0x0;

    .line 40
    .line 41
    iget-object v1, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, La/d0x0;

    .line 44
    .line 45
    iget-object v2, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, La/c0x0;

    .line 48
    .line 49
    iget-object v3, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v3, La/b0x0;

    .line 52
    .line 53
    iget-object p0, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, La/m60;

    .line 56
    .line 57
    invoke-direct {v0, v1, v2, v3, p0}, La/e0x0;-><init>(La/d0x0;La/c0x0;La/b0x0;La/m60;)V

    .line 58
    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_1
    const-string p0, "Only SHA256 KDF is supported with X-Wing KEM"

    .line 62
    .line 63
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_2
    const-string p0, "HPKE variant is not set"

    .line 68
    .line 69
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    const-string p0, "HPKE AEAD parameter is not set"

    .line 74
    .line 75
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-object v1

    .line 79
    :cond_4
    const-string p0, "HPKE KDF parameter is not set"

    .line 80
    .line 81
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-object v1

    .line 85
    :cond_5
    const-string p0, "HPKE KEM parameter is not set"

    .line 86
    .line 87
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-object v1
.end method

.method public F()La/p8x0;
    .locals 5

    .line 1
    iget-object v0, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Integer;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_f

    .line 7
    .line 8
    iget-object v2, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Ljava/lang/Integer;

    .line 11
    .line 12
    if-eqz v2, :cond_e

    .line 13
    .line 14
    iget-object v2, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, La/o8x0;

    .line 17
    .line 18
    if-eqz v2, :cond_d

    .line 19
    .line 20
    iget-object v2, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, La/arw0;

    .line 23
    .line 24
    if-eqz v2, :cond_c

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/16 v2, 0x10

    .line 31
    .line 32
    if-lt v0, v2, :cond_b

    .line 33
    .line 34
    iget-object v0, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    iget-object v3, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, La/o8x0;

    .line 45
    .line 46
    const/16 v4, 0xa

    .line 47
    .line 48
    if-lt v2, v4, :cond_a

    .line 49
    .line 50
    sget-object v4, La/o8x0;->b:La/o8x0;

    .line 51
    .line 52
    if-ne v3, v4, :cond_1

    .line 53
    .line 54
    const/16 v1, 0x14

    .line 55
    .line 56
    if-gt v2, v1, :cond_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 60
    .line 61
    const-string v1, "Invalid tag size in bytes %d; can be at most 20 bytes for SHA1"

    .line 62
    .line 63
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p0

    .line 75
    :cond_1
    sget-object v4, La/o8x0;->c:La/o8x0;

    .line 76
    .line 77
    if-ne v3, v4, :cond_3

    .line 78
    .line 79
    const/16 v1, 0x1c

    .line 80
    .line 81
    if-gt v2, v1, :cond_2

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 85
    .line 86
    const-string v1, "Invalid tag size in bytes %d; can be at most 28 bytes for SHA224"

    .line 87
    .line 88
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw p0

    .line 100
    :cond_3
    sget-object v4, La/o8x0;->d:La/o8x0;

    .line 101
    .line 102
    if-ne v3, v4, :cond_5

    .line 103
    .line 104
    const/16 v1, 0x20

    .line 105
    .line 106
    if-gt v2, v1, :cond_4

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_4
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 110
    .line 111
    const-string v1, "Invalid tag size in bytes %d; can be at most 32 bytes for SHA256"

    .line 112
    .line 113
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw p0

    .line 125
    :cond_5
    sget-object v4, La/o8x0;->e:La/o8x0;

    .line 126
    .line 127
    if-ne v3, v4, :cond_7

    .line 128
    .line 129
    const/16 v1, 0x30

    .line 130
    .line 131
    if-gt v2, v1, :cond_6

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_6
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 135
    .line 136
    const-string v1, "Invalid tag size in bytes %d; can be at most 48 bytes for SHA384"

    .line 137
    .line 138
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw p0

    .line 150
    :cond_7
    sget-object v4, La/o8x0;->f:La/o8x0;

    .line 151
    .line 152
    if-ne v3, v4, :cond_9

    .line 153
    .line 154
    const/16 v1, 0x40

    .line 155
    .line 156
    if-gt v2, v1, :cond_8

    .line 157
    .line 158
    :goto_0
    new-instance v0, La/p8x0;

    .line 159
    .line 160
    iget-object v1, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v1, Ljava/lang/Integer;

    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    iget-object v2, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v2, Ljava/lang/Integer;

    .line 171
    .line 172
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    iget-object v3, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v3, La/arw0;

    .line 179
    .line 180
    iget-object p0, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast p0, La/o8x0;

    .line 183
    .line 184
    invoke-direct {v0, v1, v2, v3, p0}, La/p8x0;-><init>(IILa/arw0;La/o8x0;)V

    .line 185
    .line 186
    .line 187
    return-object v0

    .line 188
    :cond_8
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 189
    .line 190
    const-string v1, "Invalid tag size in bytes %d; can be at most 64 bytes for SHA512"

    .line 191
    .line 192
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    throw p0

    .line 204
    :cond_9
    const-string p0, "unknown hash type; must be SHA256, SHA384 or SHA512"

    .line 205
    .line 206
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    return-object v1

    .line 210
    :cond_a
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 211
    .line 212
    const-string v1, "Invalid tag size in bytes %d; must be at least 10 bytes"

    .line 213
    .line 214
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    throw p0

    .line 226
    :cond_b
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    .line 227
    .line 228
    iget-object p0, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast p0, Ljava/lang/Integer;

    .line 231
    .line 232
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    const-string v1, "Invalid key size in bytes %d; must be at least 16 bytes"

    .line 237
    .line 238
    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    invoke-direct {v0, p0}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    throw v0

    .line 246
    :cond_c
    const-string p0, "variant is not set"

    .line 247
    .line 248
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    return-object v1

    .line 252
    :cond_d
    const-string p0, "hash type is not set"

    .line 253
    .line 254
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    return-object v1

    .line 258
    :cond_e
    const-string p0, "tag size is not set"

    .line 259
    .line 260
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    return-object v1

    .line 264
    :cond_f
    const-string p0, "key size is not set"

    .line 265
    .line 266
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    return-object v1
.end method

.method public G()V
    .locals 1

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method

.method public H(La/rew0;)La/jlw0;
    .locals 3

    .line 1
    sget-object v0, La/jlw0;->V0:La/wlw0;

    .line 2
    .line 3
    invoke-virtual {p1}, La/rew0;->j()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object v2, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, La/okt0;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, La/rew0;->l(I)La/jlw0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v2, p0, v0}, La/okt0;->s(La/h0q0;La/jlw0;)La/jlw0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    instance-of v2, v0, La/kgw0;

    .line 36
    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    :cond_1
    return-object v0
.end method

.method public I(I)V
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0x18

    .line 6
    .line 7
    if-eq p1, v0, :cond_1

    .line 8
    .line 9
    const/16 v0, 0x20

    .line 10
    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p0, Ljava/security/InvalidAlgorithmParameterException;

    .line 15
    .line 16
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v0, "Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported"

    .line 25
    .line 26
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {p0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw p0

    .line 34
    :cond_1
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 39
    .line 40
    return-void
.end method

.method public J()La/h0q0;
    .locals 2

    .line 1
    new-instance v0, La/h0q0;

    .line 2
    .line 3
    iget-object v1, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/okt0;

    .line 6
    .line 7
    invoke-direct {v0, p0, v1}, La/h0q0;-><init>(La/h0q0;La/okt0;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public K()V
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method

.method public L(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    iget-object p0, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, La/h0q0;

    .line 16
    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0, p1}, La/h0q0;->L(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public M(Ljava/lang/String;La/jlw0;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, La/h0q0;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1, p1}, La/h0q0;->L(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1, p1, p2}, La/h0q0;->M(Ljava/lang/String;La/jlw0;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-object p0, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    if-nez p2, :cond_2

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public N(Ljava/lang/String;La/jlw0;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object p0, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Ljava/util/HashMap;

    .line 15
    .line 16
    if-nez p2, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public O(Ljava/lang/String;)La/jlw0;
    .locals 2

    .line 1
    iget-object v0, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, La/jlw0;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    iget-object p0, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, La/h0q0;

    .line 21
    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, p1}, La/h0q0;->O(Ljava/lang/String;)La/jlw0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    const-string p0, " is not defined"

    .line 30
    .line 31
    invoke-static {p1, p0}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method

.method public a(I)I
    .locals 2

    .line 1
    iget-object v0, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/util/SparseIntArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/util/SparseIntArray;->indexOfKey(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ltz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/util/SparseIntArray;->valueAt(I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const-string v0, "requested global type "

    .line 17
    .line 18
    const-string v1, " does not belong to the adapter:"

    .line 19
    .line 20
    invoke-static {p1, v0, v1}, La/b1j;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object p0, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, La/nj50;

    .line 27
    .line 28
    iget-object p0, p0, La/nj50;->c:La/yge0;

    .line 29
    .line 30
    invoke-static {p1, p0}, La/itt0;->n(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public b(I)I
    .locals 5

    .line 1
    iget-object v0, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/util/SparseIntArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/util/SparseIntArray;->indexOfKey(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, -0x1

    .line 10
    if-le v1, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/util/SparseIntArray;->valueAt(I)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    iget-object v1, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, La/h8m0;

    .line 20
    .line 21
    iget-object v2, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, La/nj50;

    .line 24
    .line 25
    iget v3, v1, La/h8m0;->b:I

    .line 26
    .line 27
    add-int/lit8 v4, v3, 0x1

    .line 28
    .line 29
    iput v4, v1, La/h8m0;->b:I

    .line 30
    .line 31
    iget-object v1, v1, La/h8m0;->a:Landroid/util/SparseArray;

    .line 32
    .line 33
    invoke-virtual {v1, v3, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p1, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 37
    .line 38
    .line 39
    iget-object p0, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Landroid/util/SparseIntArray;

    .line 42
    .line 43
    invoke-virtual {p0, v3, p1}, Landroid/util/SparseIntArray;->put(II)V

    .line 44
    .line 45
    .line 46
    return v3
.end method

.method public c(La/pn;La/yje;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/n0o0;

    .line 4
    .line 5
    instance-of v1, p2, La/eqt0;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p2

    .line 10
    check-cast v1, La/eqt0;

    .line 11
    .line 12
    iget v2, v1, La/eqt0;->k:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, La/eqt0;->k:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, La/eqt0;

    .line 25
    .line 26
    check-cast p2, La/zje;

    .line 27
    .line 28
    invoke-direct {v1, p0, p2}, La/eqt0;-><init>(La/h0q0;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object p2, v1, La/eqt0;->i:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v2, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v3, v1, La/eqt0;->k:I

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    const-string v5, "CXCP"

    .line 39
    .line 40
    const/4 v6, 0x1

    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    if-ne v3, v6, :cond_1

    .line 44
    .line 45
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v4

    .line 55
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    new-instance p2, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v3, "shouldUseTorchAsFlash: hasUwCameraUnderexposedFlashCaptureQuirk = "

    .line 61
    .line 62
    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v3, Ljava/lang/Boolean;

    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-static {v5, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    check-cast p2, Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    if-nez p2, :cond_3

    .line 96
    .line 97
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 98
    .line 99
    return-object p0

    .line 100
    :cond_3
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 101
    .line 102
    const/16 v0, 0x1d

    .line 103
    .line 104
    if-ge p2, v0, :cond_4

    .line 105
    .line 106
    const-string p0, "shouldUseTorchAsFlash: API level is too low to know if it\'s ultra wide camera, defaulting to workaround for safety."

    .line 107
    .line 108
    invoke-static {v5, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 112
    .line 113
    return-object p0

    .line 114
    :cond_4
    iput v6, v1, La/eqt0;->k:I

    .line 115
    .line 116
    invoke-virtual {p1, v1}, La/pn;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    if-ne p2, v2, :cond_5

    .line 121
    .line 122
    return-object v2

    .line 123
    :cond_5
    :goto_1
    check-cast p2, La/pz2;

    .line 124
    .line 125
    if-nez p2, :cond_6

    .line 126
    .line 127
    const-string p0, "shouldUseTorchAsFlash: frameMetadata is null, defaulting to workaround for safety."

    .line 128
    .line 129
    invoke-static {v5, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 133
    .line 134
    return-object p0

    .line 135
    :cond_6
    invoke-static {}, La/i8q0;->d()Landroid/hardware/camera2/CaptureResult$Key;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    iget-object p2, p2, La/pz2;->a:Landroid/hardware/camera2/CaptureResult;

    .line 143
    .line 144
    invoke-virtual {p2, p1}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    check-cast p1, Ljava/lang/String;

    .line 149
    .line 150
    if-nez p1, :cond_7

    .line 151
    .line 152
    const-string p0, "isUltraWideCamera: could not get active physical camera ID to identify if it\'s ultra wide camera."

    .line 153
    .line 154
    invoke-static {v5, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 155
    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_7
    iget-object p2, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p2, La/zy9;

    .line 161
    .line 162
    invoke-static {p1}, La/g0a;->a(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-static {p2, p1}, La/zy9;->b(La/zy9;Ljava/lang/String;)La/c1a;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    iget-object p0, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast p0, La/jnx;

    .line 172
    .line 173
    :try_start_0
    invoke-virtual {p0, p2}, La/jnx;->b(La/c1a;)I

    .line 174
    .line 175
    .line 176
    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 177
    int-to-float p0, p0

    .line 178
    :try_start_1
    invoke-static {p2}, La/jnx;->c(La/c1a;)F

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    invoke-static {p2}, La/jnx;->d(La/c1a;)F

    .line 183
    .line 184
    .line 185
    move-result p2

    .line 186
    invoke-static {v0, p2}, La/jnx;->a(FF)I

    .line 187
    .line 188
    .line 189
    move-result p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 190
    int-to-float p2, p2

    .line 191
    div-float/2addr p0, p2

    .line 192
    :try_start_2
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    goto :goto_3

    .line 197
    :catch_0
    move-exception p0

    .line 198
    goto :goto_2

    .line 199
    :catch_1
    move-exception p0

    .line 200
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 201
    .line 202
    const-string v0, "Failed to get a valid view angle"

    .line 203
    .line 204
    invoke-direct {p2, v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 205
    .line 206
    .line 207
    throw p2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 208
    :goto_2
    const-string p2, "Failed to get the intrinsic zoom ratio"

    .line 209
    .line 210
    invoke-static {v5, p2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 211
    .line 212
    .line 213
    move-object p0, v4

    .line 214
    :goto_3
    if-eqz p0, :cond_9

    .line 215
    .line 216
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 217
    .line 218
    .line 219
    move-result p0

    .line 220
    new-instance p2, Ljava/lang/StringBuilder;

    .line 221
    .line 222
    const-string v0, "isUltraWideCamera: cameraId = "

    .line 223
    .line 224
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    const-string p1, ", intrinsicZoomRatio = "

    .line 231
    .line 232
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    invoke-static {v5, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 243
    .line 244
    .line 245
    const/high16 p1, 0x3f800000    # 1.0f

    .line 246
    .line 247
    cmpg-float p0, p0, p1

    .line 248
    .line 249
    if-gez p0, :cond_8

    .line 250
    .line 251
    move p0, v6

    .line 252
    goto :goto_4

    .line 253
    :cond_8
    const/4 p0, 0x0

    .line 254
    :goto_4
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    goto :goto_5

    .line 259
    :cond_9
    const-string p0, "isUltraWideCamera: could not calculate intrinsic zoom ratio."

    .line 260
    .line 261
    invoke-static {v5, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 262
    .line 263
    .line 264
    :goto_5
    if-eqz v4, :cond_a

    .line 265
    .line 266
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 267
    .line 268
    .line 269
    move-result v6

    .line 270
    :cond_a
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    return-object p0
.end method

.method public d()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/n0o0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    xor-int/lit8 p0, p0, 0x1

    .line 16
    .line 17
    return p0
.end method

.method public e(La/zje;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/l7w0;

    .line 4
    .line 5
    instance-of v1, p1, La/b8w0;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p1

    .line 10
    check-cast v1, La/b8w0;

    .line 11
    .line 12
    iget v2, v1, La/b8w0;->q:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, La/b8w0;->q:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, La/b8w0;

    .line 25
    .line 26
    invoke-direct {v1, p0, p1}, La/b8w0;-><init>(La/h0q0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p1, v1, La/b8w0;->o:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v2, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v3, v1, La/b8w0;->q:I

    .line 34
    .line 35
    const/4 v4, 0x2

    .line 36
    const/4 v5, 0x1

    .line 37
    const/4 v6, 0x0

    .line 38
    if-eqz v3, :cond_3

    .line 39
    .line 40
    if-eq v3, v5, :cond_2

    .line 41
    .line 42
    if-ne v3, v4, :cond_1

    .line 43
    .line 44
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v6

    .line 54
    :cond_2
    iget-object v3, v1, La/b8w0;->n:[Ljava/lang/Object;

    .line 55
    .line 56
    iget-object v7, v1, La/b8w0;->m:[Ljava/lang/Object;

    .line 57
    .line 58
    iget-object v8, v1, La/b8w0;->l:[Ljava/lang/Object;

    .line 59
    .line 60
    iget-object v9, v1, La/b8w0;->k:Ljava/lang/String;

    .line 61
    .line 62
    iget-object v10, v1, La/b8w0;->j:[Ljava/lang/Object;

    .line 63
    .line 64
    iget-object v11, v1, La/b8w0;->i:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    new-array v7, v5, [Ljava/lang/Object;

    .line 74
    .line 75
    const/4 p1, 0x3

    .line 76
    new-array v3, p1, [Ljava/lang/Object;

    .line 77
    .line 78
    iget-object p1, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p1, La/mmy;

    .line 81
    .line 82
    const-string v11, "%s"

    .line 83
    .line 84
    iput-object v11, v1, La/b8w0;->i:Ljava/lang/String;

    .line 85
    .line 86
    iput-object v7, v1, La/b8w0;->j:[Ljava/lang/Object;

    .line 87
    .line 88
    const-string v9, "%3$s%2$s%1$s"

    .line 89
    .line 90
    iput-object v9, v1, La/b8w0;->k:Ljava/lang/String;

    .line 91
    .line 92
    iput-object v3, v1, La/b8w0;->l:[Ljava/lang/Object;

    .line 93
    .line 94
    iput-object v7, v1, La/b8w0;->m:[Ljava/lang/Object;

    .line 95
    .line 96
    iput-object v3, v1, La/b8w0;->n:[Ljava/lang/Object;

    .line 97
    .line 98
    iput v5, v1, La/b8w0;->q:I

    .line 99
    .line 100
    check-cast p1, Lorg/xplatform/secret/impl/KeysImpl;

    .line 101
    .line 102
    invoke-virtual {p1, v1}, Lorg/xplatform/secret/impl/KeysImpl;->Z(La/zje;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    if-ne p1, v2, :cond_4

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    move-object v8, v3

    .line 110
    move-object v10, v7

    .line 111
    :goto_1
    const/4 v12, 0x0

    .line 112
    aput-object p1, v3, v12

    .line 113
    .line 114
    invoke-interface {v0}, La/l7w0;->c()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    aput-object p1, v8, v5

    .line 119
    .line 120
    iget-object p1, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast p1, Landroid/content/Context;

    .line 123
    .line 124
    invoke-interface {v0}, La/l7w0;->a()I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    aput-object p1, v8, v4

    .line 133
    .line 134
    array-length p1, v8

    .line 135
    invoke-static {v8, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-static {v9, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    aput-object p1, v7, v12

    .line 144
    .line 145
    array-length p1, v10

    .line 146
    invoke-static {v10, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-static {v11, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    iget-object p0, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast p0, La/z8w0;

    .line 157
    .line 158
    iput-object v6, v1, La/b8w0;->i:Ljava/lang/String;

    .line 159
    .line 160
    iput-object v6, v1, La/b8w0;->j:[Ljava/lang/Object;

    .line 161
    .line 162
    iput-object v6, v1, La/b8w0;->k:Ljava/lang/String;

    .line 163
    .line 164
    iput-object v6, v1, La/b8w0;->l:[Ljava/lang/Object;

    .line 165
    .line 166
    iput-object v6, v1, La/b8w0;->m:[Ljava/lang/Object;

    .line 167
    .line 168
    iput-object v6, v1, La/b8w0;->n:[Ljava/lang/Object;

    .line 169
    .line 170
    iput v4, v1, La/b8w0;->q:I

    .line 171
    .line 172
    invoke-virtual {p0, v1, p1, v12}, La/z8w0;->d(La/zje;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    if-ne p0, v2, :cond_5

    .line 177
    .line 178
    :goto_2
    return-object v2

    .line 179
    :cond_5
    return-object p0
.end method

.method public f(Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, La/h0q0;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/z8w0;

    .line 8
    .line 9
    iget-object v3, v0, La/h0q0;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Landroid/content/Context;

    .line 12
    .line 13
    iget-object v4, v0, La/h0q0;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, La/mmy;

    .line 16
    .line 17
    iget-object v5, v0, La/h0q0;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v5, La/l7w0;

    .line 20
    .line 21
    instance-of v6, v1, La/k8w0;

    .line 22
    .line 23
    if-eqz v6, :cond_0

    .line 24
    .line 25
    move-object v6, v1

    .line 26
    check-cast v6, La/k8w0;

    .line 27
    .line 28
    iget v7, v6, La/k8w0;->s:I

    .line 29
    .line 30
    const/high16 v8, -0x80000000

    .line 31
    .line 32
    and-int v9, v7, v8

    .line 33
    .line 34
    if-eqz v9, :cond_0

    .line 35
    .line 36
    sub-int/2addr v7, v8

    .line 37
    iput v7, v6, La/k8w0;->s:I

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance v6, La/k8w0;

    .line 41
    .line 42
    invoke-direct {v6, v0, v1}, La/k8w0;-><init>(La/h0q0;La/zje;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    iget-object v0, v6, La/k8w0;->q:Ljava/lang/Object;

    .line 46
    .line 47
    sget-object v1, La/wne;->a:La/wne;

    .line 48
    .line 49
    iget v7, v6, La/k8w0;->s:I

    .line 50
    .line 51
    const-string v8, "%2$s%1$s%3$s"

    .line 52
    .line 53
    const-string v9, "%s"

    .line 54
    .line 55
    const/4 v10, 0x5

    .line 56
    const/4 v11, 0x4

    .line 57
    const/4 v13, 0x3

    .line 58
    const/4 v14, 0x2

    .line 59
    const/4 v15, 0x1

    .line 60
    const/16 p0, 0x0

    .line 61
    .line 62
    const/4 v12, 0x0

    .line 63
    if-eqz v7, :cond_6

    .line 64
    .line 65
    if-eq v7, v15, :cond_5

    .line 66
    .line 67
    if-eq v7, v14, :cond_4

    .line 68
    .line 69
    if-eq v7, v13, :cond_3

    .line 70
    .line 71
    if-eq v7, v11, :cond_2

    .line 72
    .line 73
    if-ne v7, v10, :cond_1

    .line 74
    .line 75
    iget-object v1, v6, La/k8w0;->m:Ljava/io/Serializable;

    .line 76
    .line 77
    check-cast v1, Ljava/lang/String;

    .line 78
    .line 79
    iget-object v1, v6, La/k8w0;->l:Ljava/io/Serializable;

    .line 80
    .line 81
    check-cast v1, Ljava/lang/String;

    .line 82
    .line 83
    iget-object v1, v6, La/k8w0;->k:Ljava/io/Serializable;

    .line 84
    .line 85
    check-cast v1, Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    return-object v0

    .line 91
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 92
    .line 93
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-object v12

    .line 97
    :cond_2
    iget-object v2, v6, La/k8w0;->l:Ljava/io/Serializable;

    .line 98
    .line 99
    check-cast v2, Ljava/lang/String;

    .line 100
    .line 101
    iget-object v3, v6, La/k8w0;->k:Ljava/io/Serializable;

    .line 102
    .line 103
    check-cast v3, Ljava/lang/String;

    .line 104
    .line 105
    iget-object v3, v6, La/k8w0;->i:Ljava/lang/String;

    .line 106
    .line 107
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    move-object v14, v3

    .line 111
    move-object v3, v12

    .line 112
    goto/16 :goto_4

    .line 113
    .line 114
    :cond_3
    iget-object v3, v6, La/k8w0;->k:Ljava/io/Serializable;

    .line 115
    .line 116
    check-cast v3, Ljava/lang/String;

    .line 117
    .line 118
    iget-object v3, v6, La/k8w0;->j:Ljava/lang/String;

    .line 119
    .line 120
    iget-object v4, v6, La/k8w0;->i:Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    move-object v14, v12

    .line 126
    move-object v12, v3

    .line 127
    move-object v3, v14

    .line 128
    move-object v14, v4

    .line 129
    move/from16 v4, p0

    .line 130
    .line 131
    goto/16 :goto_3

    .line 132
    .line 133
    :cond_4
    iget-object v4, v6, La/k8w0;->p:[Ljava/lang/Object;

    .line 134
    .line 135
    iget-object v7, v6, La/k8w0;->o:[Ljava/lang/Object;

    .line 136
    .line 137
    iget-object v8, v6, La/k8w0;->n:[Ljava/lang/Object;

    .line 138
    .line 139
    iget-object v9, v6, La/k8w0;->m:Ljava/io/Serializable;

    .line 140
    .line 141
    check-cast v9, Ljava/lang/String;

    .line 142
    .line 143
    iget-object v10, v6, La/k8w0;->l:Ljava/io/Serializable;

    .line 144
    .line 145
    check-cast v10, [Ljava/lang/Object;

    .line 146
    .line 147
    iget-object v11, v6, La/k8w0;->k:Ljava/io/Serializable;

    .line 148
    .line 149
    check-cast v11, Ljava/lang/String;

    .line 150
    .line 151
    iget-object v12, v6, La/k8w0;->j:Ljava/lang/String;

    .line 152
    .line 153
    move/from16 v16, v14

    .line 154
    .line 155
    iget-object v14, v6, La/k8w0;->i:Ljava/lang/String;

    .line 156
    .line 157
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    move-object v13, v11

    .line 161
    move-object v11, v8

    .line 162
    move-object v8, v9

    .line 163
    move-object v9, v13

    .line 164
    move-object v13, v10

    .line 165
    move-object v10, v7

    .line 166
    move/from16 v7, v16

    .line 167
    .line 168
    goto/16 :goto_2

    .line 169
    .line 170
    :cond_5
    move/from16 v16, v14

    .line 171
    .line 172
    iget-object v7, v6, La/k8w0;->o:[Ljava/lang/Object;

    .line 173
    .line 174
    iget-object v10, v6, La/k8w0;->n:[Ljava/lang/Object;

    .line 175
    .line 176
    iget-object v11, v6, La/k8w0;->m:Ljava/io/Serializable;

    .line 177
    .line 178
    check-cast v11, [Ljava/lang/Object;

    .line 179
    .line 180
    iget-object v12, v6, La/k8w0;->l:Ljava/io/Serializable;

    .line 181
    .line 182
    check-cast v12, Ljava/lang/String;

    .line 183
    .line 184
    iget-object v14, v6, La/k8w0;->k:Ljava/io/Serializable;

    .line 185
    .line 186
    check-cast v14, [Ljava/lang/Object;

    .line 187
    .line 188
    iget-object v13, v6, La/k8w0;->j:Ljava/lang/String;

    .line 189
    .line 190
    iget-object v15, v6, La/k8w0;->i:Ljava/lang/String;

    .line 191
    .line 192
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    move-object/from16 v17, v12

    .line 196
    .line 197
    move-object v12, v0

    .line 198
    move-object v0, v14

    .line 199
    move-object v14, v13

    .line 200
    move-object/from16 v13, v17

    .line 201
    .line 202
    const/16 v17, 0x1

    .line 203
    .line 204
    goto :goto_1

    .line 205
    :cond_6
    move/from16 v16, v14

    .line 206
    .line 207
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    const/4 v0, 0x1

    .line 211
    new-array v10, v0, [Ljava/lang/Object;

    .line 212
    .line 213
    const/4 v7, 0x3

    .line 214
    new-array v11, v7, [Ljava/lang/Object;

    .line 215
    .line 216
    move-object/from16 v7, p1

    .line 217
    .line 218
    iput-object v7, v6, La/k8w0;->i:Ljava/lang/String;

    .line 219
    .line 220
    iput-object v9, v6, La/k8w0;->j:Ljava/lang/String;

    .line 221
    .line 222
    iput-object v10, v6, La/k8w0;->k:Ljava/io/Serializable;

    .line 223
    .line 224
    iput-object v8, v6, La/k8w0;->l:Ljava/io/Serializable;

    .line 225
    .line 226
    iput-object v11, v6, La/k8w0;->m:Ljava/io/Serializable;

    .line 227
    .line 228
    iput-object v10, v6, La/k8w0;->n:[Ljava/lang/Object;

    .line 229
    .line 230
    iput-object v11, v6, La/k8w0;->o:[Ljava/lang/Object;

    .line 231
    .line 232
    iput v0, v6, La/k8w0;->s:I

    .line 233
    .line 234
    move-object v12, v4

    .line 235
    check-cast v12, Lorg/xplatform/secret/impl/KeysImpl;

    .line 236
    .line 237
    invoke-virtual {v12, v6}, Lorg/xplatform/secret/impl/KeysImpl;->P(La/zje;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v12

    .line 241
    if-ne v12, v1, :cond_7

    .line 242
    .line 243
    goto/16 :goto_5

    .line 244
    .line 245
    :cond_7
    move/from16 v17, v0

    .line 246
    .line 247
    move-object v15, v7

    .line 248
    move-object v13, v8

    .line 249
    move-object v14, v9

    .line 250
    move-object v0, v10

    .line 251
    move-object v7, v11

    .line 252
    :goto_1
    aput-object v12, v7, p0

    .line 253
    .line 254
    invoke-interface {v5}, La/l7w0;->e()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v7

    .line 258
    aput-object v7, v11, v17

    .line 259
    .line 260
    invoke-interface {v5}, La/l7w0;->i()I

    .line 261
    .line 262
    .line 263
    move-result v7

    .line 264
    invoke-virtual {v3, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v7

    .line 268
    aput-object v7, v11, v16

    .line 269
    .line 270
    array-length v7, v11

    .line 271
    invoke-static {v11, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v7

    .line 275
    invoke-static {v13, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    aput-object v7, v10, p0

    .line 280
    .line 281
    array-length v7, v0

    .line 282
    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-static {v14, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    move/from16 v7, v17

    .line 291
    .line 292
    new-array v10, v7, [Ljava/lang/Object;

    .line 293
    .line 294
    const/4 v7, 0x3

    .line 295
    new-array v11, v7, [Ljava/lang/Object;

    .line 296
    .line 297
    iput-object v15, v6, La/k8w0;->i:Ljava/lang/String;

    .line 298
    .line 299
    iput-object v0, v6, La/k8w0;->j:Ljava/lang/String;

    .line 300
    .line 301
    iput-object v9, v6, La/k8w0;->k:Ljava/io/Serializable;

    .line 302
    .line 303
    iput-object v10, v6, La/k8w0;->l:Ljava/io/Serializable;

    .line 304
    .line 305
    iput-object v8, v6, La/k8w0;->m:Ljava/io/Serializable;

    .line 306
    .line 307
    iput-object v11, v6, La/k8w0;->n:[Ljava/lang/Object;

    .line 308
    .line 309
    iput-object v10, v6, La/k8w0;->o:[Ljava/lang/Object;

    .line 310
    .line 311
    iput-object v11, v6, La/k8w0;->p:[Ljava/lang/Object;

    .line 312
    .line 313
    move/from16 v7, v16

    .line 314
    .line 315
    iput v7, v6, La/k8w0;->s:I

    .line 316
    .line 317
    check-cast v4, Lorg/xplatform/secret/impl/KeysImpl;

    .line 318
    .line 319
    invoke-virtual {v4, v6}, Lorg/xplatform/secret/impl/KeysImpl;->Q(La/zje;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    if-ne v4, v1, :cond_8

    .line 324
    .line 325
    goto/16 :goto_5

    .line 326
    .line 327
    :cond_8
    move-object v12, v0

    .line 328
    move-object v0, v4

    .line 329
    move-object v13, v10

    .line 330
    move-object v4, v11

    .line 331
    move-object v14, v15

    .line 332
    :goto_2
    aput-object v0, v4, p0

    .line 333
    .line 334
    invoke-interface {v5}, La/l7w0;->j()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    const/16 v17, 0x1

    .line 339
    .line 340
    aput-object v0, v11, v17

    .line 341
    .line 342
    invoke-interface {v5}, La/l7w0;->d()I

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    aput-object v0, v11, v7

    .line 351
    .line 352
    array-length v0, v11

    .line 353
    invoke-static {v11, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-static {v8, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    aput-object v0, v10, p0

    .line 362
    .line 363
    array-length v0, v13

    .line 364
    invoke-static {v13, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-static {v9, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    iput-object v14, v6, La/k8w0;->i:Ljava/lang/String;

    .line 373
    .line 374
    iput-object v12, v6, La/k8w0;->j:Ljava/lang/String;

    .line 375
    .line 376
    const/4 v3, 0x0

    .line 377
    iput-object v3, v6, La/k8w0;->k:Ljava/io/Serializable;

    .line 378
    .line 379
    iput-object v3, v6, La/k8w0;->l:Ljava/io/Serializable;

    .line 380
    .line 381
    iput-object v3, v6, La/k8w0;->m:Ljava/io/Serializable;

    .line 382
    .line 383
    iput-object v3, v6, La/k8w0;->n:[Ljava/lang/Object;

    .line 384
    .line 385
    iput-object v3, v6, La/k8w0;->o:[Ljava/lang/Object;

    .line 386
    .line 387
    iput-object v3, v6, La/k8w0;->p:[Ljava/lang/Object;

    .line 388
    .line 389
    const/4 v7, 0x3

    .line 390
    iput v7, v6, La/k8w0;->s:I

    .line 391
    .line 392
    move/from16 v4, p0

    .line 393
    .line 394
    invoke-virtual {v2, v6, v0, v4}, La/z8w0;->d(La/zje;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    if-ne v0, v1, :cond_9

    .line 399
    .line 400
    goto :goto_5

    .line 401
    :cond_9
    :goto_3
    check-cast v0, Ljava/lang/String;

    .line 402
    .line 403
    iput-object v14, v6, La/k8w0;->i:Ljava/lang/String;

    .line 404
    .line 405
    iput-object v3, v6, La/k8w0;->j:Ljava/lang/String;

    .line 406
    .line 407
    iput-object v3, v6, La/k8w0;->k:Ljava/io/Serializable;

    .line 408
    .line 409
    iput-object v0, v6, La/k8w0;->l:Ljava/io/Serializable;

    .line 410
    .line 411
    const/4 v5, 0x4

    .line 412
    iput v5, v6, La/k8w0;->s:I

    .line 413
    .line 414
    invoke-virtual {v2, v6, v12, v4}, La/z8w0;->d(La/zje;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    if-ne v2, v1, :cond_a

    .line 419
    .line 420
    goto :goto_5

    .line 421
    :cond_a
    move-object/from16 v18, v2

    .line 422
    .line 423
    move-object v2, v0

    .line 424
    move-object/from16 v0, v18

    .line 425
    .line 426
    :goto_4
    check-cast v0, Ljava/lang/String;

    .line 427
    .line 428
    iput-object v3, v6, La/k8w0;->i:Ljava/lang/String;

    .line 429
    .line 430
    iput-object v3, v6, La/k8w0;->j:Ljava/lang/String;

    .line 431
    .line 432
    iput-object v3, v6, La/k8w0;->k:Ljava/io/Serializable;

    .line 433
    .line 434
    iput-object v3, v6, La/k8w0;->l:Ljava/io/Serializable;

    .line 435
    .line 436
    iput-object v3, v6, La/k8w0;->m:Ljava/io/Serializable;

    .line 437
    .line 438
    const/4 v3, 0x5

    .line 439
    iput v3, v6, La/k8w0;->s:I

    .line 440
    .line 441
    invoke-static {v2}, La/z8w0;->b(Ljava/lang/String;)[B

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    invoke-static {v0}, La/z8w0;->b(Ljava/lang/String;)[B

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    invoke-static {v14, v2, v0}, La/z8w0;->c(Ljava/lang/String;[B[B)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    if-ne v0, v1, :cond_b

    .line 454
    .line 455
    :goto_5
    return-object v1

    .line 456
    :cond_b
    return-object v0
.end method

.method public g(IJLa/zje;Ljava/lang/String;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p4, La/eyu0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/eyu0;

    .line 7
    .line 8
    iget v1, v0, La/eyu0;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/eyu0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/eyu0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, La/eyu0;-><init>(La/h0q0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, La/eyu0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/eyu0;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, La/eyu0;->i:La/kys0;

    .line 37
    .line 38
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p4, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p4, La/kys0;

    .line 55
    .line 56
    iget-object v2, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, La/lkr0;

    .line 59
    .line 60
    invoke-virtual {v2}, La/lkr0;->invoke()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, La/uvu0;

    .line 65
    .line 66
    iget-object p0, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, La/btt0;

    .line 69
    .line 70
    invoke-virtual {p0}, La/btt0;->a()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    new-instance v4, La/lq;

    .line 75
    .line 76
    invoke-direct {v4, p5, p1, p2, p3}, La/lq;-><init>(Ljava/lang/String;IJ)V

    .line 77
    .line 78
    .line 79
    iput-object p4, v0, La/eyu0;->i:La/kys0;

    .line 80
    .line 81
    iput v3, v0, La/eyu0;->l:I

    .line 82
    .line 83
    invoke-interface {v2, p0, v4, v0}, La/uvu0;->a(Ljava/lang/String;La/lq;La/yje;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    if-ne p0, v1, :cond_3

    .line 88
    .line 89
    return-object v1

    .line 90
    :cond_3
    move-object v6, p4

    .line 91
    move-object p4, p0

    .line 92
    move-object p0, v6

    .line 93
    :goto_1
    check-cast p4, La/q16;

    .line 94
    .line 95
    invoke-virtual {p4}, La/q16;->a()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    check-cast p1, La/oq;

    .line 100
    .line 101
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    new-instance v0, La/vvu0;

    .line 105
    .line 106
    iget-object p0, p1, La/oq;->b:Ljava/lang/String;

    .line 107
    .line 108
    if-nez p0, :cond_4

    .line 109
    .line 110
    const-string p0, ""

    .line 111
    .line 112
    :cond_4
    move-object v5, p0

    .line 113
    iget-object p0, p1, La/oq;->a:Ljava/lang/Long;

    .line 114
    .line 115
    const-wide/16 p2, 0x0

    .line 116
    .line 117
    if-eqz p0, :cond_5

    .line 118
    .line 119
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 120
    .line 121
    .line 122
    move-result-wide p4

    .line 123
    move-wide v1, p4

    .line 124
    goto :goto_2

    .line 125
    :cond_5
    move-wide v1, p2

    .line 126
    :goto_2
    iget-object p0, p1, La/oq;->c:Ljava/lang/Long;

    .line 127
    .line 128
    if-eqz p0, :cond_6

    .line 129
    .line 130
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 131
    .line 132
    .line 133
    move-result-wide p2

    .line 134
    :cond_6
    move-wide v3, p2

    .line 135
    invoke-direct/range {v0 .. v5}, La/vvu0;-><init>(JJLjava/lang/String;)V

    .line 136
    .line 137
    .line 138
    return-object v0
.end method

.method public h(La/xfw0;)V
    .locals 3

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaia;

    .line 2
    .line 3
    new-instance v0, La/mhw0;

    .line 4
    .line 5
    iget-object v1, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lcom/google/firebase/auth/EmailAuthCredential;

    .line 8
    .line 9
    iget-object p1, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaia;->b:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v2, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Ljava/lang/String;

    .line 14
    .line 15
    invoke-direct {v0, v1, p1, v2}, La/mhw0;-><init>(Lcom/google/firebase/auth/EmailAuthCredential;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, La/nmt0;

    .line 21
    .line 22
    iget-object p0, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, La/hcp0;

    .line 25
    .line 26
    invoke-virtual {p1, v0, p0}, La/nmt0;->f(La/mhw0;La/hcp0;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public i(Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, La/h0q0;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/z8w0;

    .line 8
    .line 9
    iget-object v3, v0, La/h0q0;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Landroid/content/Context;

    .line 12
    .line 13
    iget-object v4, v0, La/h0q0;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, La/mmy;

    .line 16
    .line 17
    iget-object v5, v0, La/h0q0;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v5, La/l7w0;

    .line 20
    .line 21
    instance-of v6, v1, La/g8w0;

    .line 22
    .line 23
    if-eqz v6, :cond_0

    .line 24
    .line 25
    move-object v6, v1

    .line 26
    check-cast v6, La/g8w0;

    .line 27
    .line 28
    iget v7, v6, La/g8w0;->s:I

    .line 29
    .line 30
    const/high16 v8, -0x80000000

    .line 31
    .line 32
    and-int v9, v7, v8

    .line 33
    .line 34
    if-eqz v9, :cond_0

    .line 35
    .line 36
    sub-int/2addr v7, v8

    .line 37
    iput v7, v6, La/g8w0;->s:I

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance v6, La/g8w0;

    .line 41
    .line 42
    invoke-direct {v6, v0, v1}, La/g8w0;-><init>(La/h0q0;La/zje;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    iget-object v0, v6, La/g8w0;->q:Ljava/lang/Object;

    .line 46
    .line 47
    sget-object v1, La/wne;->a:La/wne;

    .line 48
    .line 49
    iget v7, v6, La/g8w0;->s:I

    .line 50
    .line 51
    const-string v8, "%1$s%3$s%2$s"

    .line 52
    .line 53
    const-string v9, "%s"

    .line 54
    .line 55
    const/4 v10, 0x5

    .line 56
    const/4 v11, 0x4

    .line 57
    const/4 v13, 0x3

    .line 58
    const/4 v14, 0x2

    .line 59
    const/4 v15, 0x1

    .line 60
    const/16 p0, 0x0

    .line 61
    .line 62
    const/4 v12, 0x0

    .line 63
    if-eqz v7, :cond_6

    .line 64
    .line 65
    if-eq v7, v15, :cond_5

    .line 66
    .line 67
    if-eq v7, v14, :cond_4

    .line 68
    .line 69
    if-eq v7, v13, :cond_3

    .line 70
    .line 71
    if-eq v7, v11, :cond_2

    .line 72
    .line 73
    if-ne v7, v10, :cond_1

    .line 74
    .line 75
    iget-object v1, v6, La/g8w0;->m:Ljava/io/Serializable;

    .line 76
    .line 77
    check-cast v1, Ljava/lang/String;

    .line 78
    .line 79
    iget-object v1, v6, La/g8w0;->l:Ljava/io/Serializable;

    .line 80
    .line 81
    check-cast v1, Ljava/lang/String;

    .line 82
    .line 83
    iget-object v1, v6, La/g8w0;->k:Ljava/io/Serializable;

    .line 84
    .line 85
    check-cast v1, Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    return-object v0

    .line 91
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 92
    .line 93
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-object v12

    .line 97
    :cond_2
    iget-object v2, v6, La/g8w0;->l:Ljava/io/Serializable;

    .line 98
    .line 99
    check-cast v2, Ljava/lang/String;

    .line 100
    .line 101
    iget-object v3, v6, La/g8w0;->k:Ljava/io/Serializable;

    .line 102
    .line 103
    check-cast v3, Ljava/lang/String;

    .line 104
    .line 105
    iget-object v3, v6, La/g8w0;->i:Ljava/lang/String;

    .line 106
    .line 107
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    move-object v14, v3

    .line 111
    move-object v3, v12

    .line 112
    goto/16 :goto_4

    .line 113
    .line 114
    :cond_3
    iget-object v3, v6, La/g8w0;->k:Ljava/io/Serializable;

    .line 115
    .line 116
    check-cast v3, Ljava/lang/String;

    .line 117
    .line 118
    iget-object v3, v6, La/g8w0;->j:Ljava/lang/String;

    .line 119
    .line 120
    iget-object v4, v6, La/g8w0;->i:Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    move-object v14, v12

    .line 126
    move-object v12, v3

    .line 127
    move-object v3, v14

    .line 128
    move-object v14, v4

    .line 129
    move/from16 v4, p0

    .line 130
    .line 131
    goto/16 :goto_3

    .line 132
    .line 133
    :cond_4
    iget-object v4, v6, La/g8w0;->p:[Ljava/lang/Object;

    .line 134
    .line 135
    iget-object v7, v6, La/g8w0;->o:[Ljava/lang/Object;

    .line 136
    .line 137
    iget-object v8, v6, La/g8w0;->n:[Ljava/lang/Object;

    .line 138
    .line 139
    iget-object v9, v6, La/g8w0;->m:Ljava/io/Serializable;

    .line 140
    .line 141
    check-cast v9, Ljava/lang/String;

    .line 142
    .line 143
    iget-object v10, v6, La/g8w0;->l:Ljava/io/Serializable;

    .line 144
    .line 145
    check-cast v10, [Ljava/lang/Object;

    .line 146
    .line 147
    iget-object v11, v6, La/g8w0;->k:Ljava/io/Serializable;

    .line 148
    .line 149
    check-cast v11, Ljava/lang/String;

    .line 150
    .line 151
    iget-object v12, v6, La/g8w0;->j:Ljava/lang/String;

    .line 152
    .line 153
    move/from16 v16, v14

    .line 154
    .line 155
    iget-object v14, v6, La/g8w0;->i:Ljava/lang/String;

    .line 156
    .line 157
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    move-object v13, v11

    .line 161
    move-object v11, v8

    .line 162
    move-object v8, v9

    .line 163
    move-object v9, v13

    .line 164
    move-object v13, v10

    .line 165
    move-object v10, v7

    .line 166
    move/from16 v7, v16

    .line 167
    .line 168
    goto/16 :goto_2

    .line 169
    .line 170
    :cond_5
    move/from16 v16, v14

    .line 171
    .line 172
    iget-object v7, v6, La/g8w0;->o:[Ljava/lang/Object;

    .line 173
    .line 174
    iget-object v10, v6, La/g8w0;->n:[Ljava/lang/Object;

    .line 175
    .line 176
    iget-object v11, v6, La/g8w0;->m:Ljava/io/Serializable;

    .line 177
    .line 178
    check-cast v11, [Ljava/lang/Object;

    .line 179
    .line 180
    iget-object v12, v6, La/g8w0;->l:Ljava/io/Serializable;

    .line 181
    .line 182
    check-cast v12, Ljava/lang/String;

    .line 183
    .line 184
    iget-object v14, v6, La/g8w0;->k:Ljava/io/Serializable;

    .line 185
    .line 186
    check-cast v14, [Ljava/lang/Object;

    .line 187
    .line 188
    iget-object v13, v6, La/g8w0;->j:Ljava/lang/String;

    .line 189
    .line 190
    iget-object v15, v6, La/g8w0;->i:Ljava/lang/String;

    .line 191
    .line 192
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    move-object/from16 v17, v12

    .line 196
    .line 197
    move-object v12, v0

    .line 198
    move-object v0, v14

    .line 199
    move-object v14, v13

    .line 200
    move-object/from16 v13, v17

    .line 201
    .line 202
    const/16 v17, 0x1

    .line 203
    .line 204
    goto :goto_1

    .line 205
    :cond_6
    move/from16 v16, v14

    .line 206
    .line 207
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    const/4 v0, 0x1

    .line 211
    new-array v10, v0, [Ljava/lang/Object;

    .line 212
    .line 213
    const/4 v7, 0x3

    .line 214
    new-array v11, v7, [Ljava/lang/Object;

    .line 215
    .line 216
    move-object/from16 v7, p1

    .line 217
    .line 218
    iput-object v7, v6, La/g8w0;->i:Ljava/lang/String;

    .line 219
    .line 220
    iput-object v9, v6, La/g8w0;->j:Ljava/lang/String;

    .line 221
    .line 222
    iput-object v10, v6, La/g8w0;->k:Ljava/io/Serializable;

    .line 223
    .line 224
    iput-object v8, v6, La/g8w0;->l:Ljava/io/Serializable;

    .line 225
    .line 226
    iput-object v11, v6, La/g8w0;->m:Ljava/io/Serializable;

    .line 227
    .line 228
    iput-object v10, v6, La/g8w0;->n:[Ljava/lang/Object;

    .line 229
    .line 230
    iput-object v11, v6, La/g8w0;->o:[Ljava/lang/Object;

    .line 231
    .line 232
    iput v0, v6, La/g8w0;->s:I

    .line 233
    .line 234
    move-object v12, v4

    .line 235
    check-cast v12, Lorg/xplatform/secret/impl/KeysImpl;

    .line 236
    .line 237
    invoke-virtual {v12, v6}, Lorg/xplatform/secret/impl/KeysImpl;->q(La/zje;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v12

    .line 241
    if-ne v12, v1, :cond_7

    .line 242
    .line 243
    goto/16 :goto_5

    .line 244
    .line 245
    :cond_7
    move/from16 v17, v0

    .line 246
    .line 247
    move-object v15, v7

    .line 248
    move-object v13, v8

    .line 249
    move-object v14, v9

    .line 250
    move-object v0, v10

    .line 251
    move-object v7, v11

    .line 252
    :goto_1
    aput-object v12, v7, p0

    .line 253
    .line 254
    invoke-interface {v5}, La/l7w0;->b()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v7

    .line 258
    aput-object v7, v11, v17

    .line 259
    .line 260
    invoke-interface {v5}, La/l7w0;->k()I

    .line 261
    .line 262
    .line 263
    move-result v7

    .line 264
    invoke-virtual {v3, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v7

    .line 268
    aput-object v7, v11, v16

    .line 269
    .line 270
    array-length v7, v11

    .line 271
    invoke-static {v11, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v7

    .line 275
    invoke-static {v13, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    aput-object v7, v10, p0

    .line 280
    .line 281
    array-length v7, v0

    .line 282
    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-static {v14, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    move/from16 v7, v17

    .line 291
    .line 292
    new-array v10, v7, [Ljava/lang/Object;

    .line 293
    .line 294
    const/4 v7, 0x3

    .line 295
    new-array v11, v7, [Ljava/lang/Object;

    .line 296
    .line 297
    iput-object v15, v6, La/g8w0;->i:Ljava/lang/String;

    .line 298
    .line 299
    iput-object v0, v6, La/g8w0;->j:Ljava/lang/String;

    .line 300
    .line 301
    iput-object v9, v6, La/g8w0;->k:Ljava/io/Serializable;

    .line 302
    .line 303
    iput-object v10, v6, La/g8w0;->l:Ljava/io/Serializable;

    .line 304
    .line 305
    iput-object v8, v6, La/g8w0;->m:Ljava/io/Serializable;

    .line 306
    .line 307
    iput-object v11, v6, La/g8w0;->n:[Ljava/lang/Object;

    .line 308
    .line 309
    iput-object v10, v6, La/g8w0;->o:[Ljava/lang/Object;

    .line 310
    .line 311
    iput-object v11, v6, La/g8w0;->p:[Ljava/lang/Object;

    .line 312
    .line 313
    move/from16 v7, v16

    .line 314
    .line 315
    iput v7, v6, La/g8w0;->s:I

    .line 316
    .line 317
    check-cast v4, Lorg/xplatform/secret/impl/KeysImpl;

    .line 318
    .line 319
    invoke-virtual {v4, v6}, Lorg/xplatform/secret/impl/KeysImpl;->r(La/zje;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    if-ne v4, v1, :cond_8

    .line 324
    .line 325
    goto/16 :goto_5

    .line 326
    .line 327
    :cond_8
    move-object v12, v0

    .line 328
    move-object v0, v4

    .line 329
    move-object v13, v10

    .line 330
    move-object v4, v11

    .line 331
    move-object v14, v15

    .line 332
    :goto_2
    aput-object v0, v4, p0

    .line 333
    .line 334
    invoke-interface {v5}, La/l7w0;->f()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    const/16 v17, 0x1

    .line 339
    .line 340
    aput-object v0, v11, v17

    .line 341
    .line 342
    invoke-interface {v5}, La/l7w0;->m()I

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    aput-object v0, v11, v7

    .line 351
    .line 352
    array-length v0, v11

    .line 353
    invoke-static {v11, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-static {v8, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    aput-object v0, v10, p0

    .line 362
    .line 363
    array-length v0, v13

    .line 364
    invoke-static {v13, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-static {v9, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    iput-object v14, v6, La/g8w0;->i:Ljava/lang/String;

    .line 373
    .line 374
    iput-object v12, v6, La/g8w0;->j:Ljava/lang/String;

    .line 375
    .line 376
    const/4 v3, 0x0

    .line 377
    iput-object v3, v6, La/g8w0;->k:Ljava/io/Serializable;

    .line 378
    .line 379
    iput-object v3, v6, La/g8w0;->l:Ljava/io/Serializable;

    .line 380
    .line 381
    iput-object v3, v6, La/g8w0;->m:Ljava/io/Serializable;

    .line 382
    .line 383
    iput-object v3, v6, La/g8w0;->n:[Ljava/lang/Object;

    .line 384
    .line 385
    iput-object v3, v6, La/g8w0;->o:[Ljava/lang/Object;

    .line 386
    .line 387
    iput-object v3, v6, La/g8w0;->p:[Ljava/lang/Object;

    .line 388
    .line 389
    const/4 v7, 0x3

    .line 390
    iput v7, v6, La/g8w0;->s:I

    .line 391
    .line 392
    move/from16 v4, p0

    .line 393
    .line 394
    invoke-virtual {v2, v6, v0, v4}, La/z8w0;->d(La/zje;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    if-ne v0, v1, :cond_9

    .line 399
    .line 400
    goto :goto_5

    .line 401
    :cond_9
    :goto_3
    check-cast v0, Ljava/lang/String;

    .line 402
    .line 403
    iput-object v14, v6, La/g8w0;->i:Ljava/lang/String;

    .line 404
    .line 405
    iput-object v3, v6, La/g8w0;->j:Ljava/lang/String;

    .line 406
    .line 407
    iput-object v3, v6, La/g8w0;->k:Ljava/io/Serializable;

    .line 408
    .line 409
    iput-object v0, v6, La/g8w0;->l:Ljava/io/Serializable;

    .line 410
    .line 411
    const/4 v5, 0x4

    .line 412
    iput v5, v6, La/g8w0;->s:I

    .line 413
    .line 414
    invoke-virtual {v2, v6, v12, v4}, La/z8w0;->d(La/zje;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    if-ne v2, v1, :cond_a

    .line 419
    .line 420
    goto :goto_5

    .line 421
    :cond_a
    move-object/from16 v18, v2

    .line 422
    .line 423
    move-object v2, v0

    .line 424
    move-object/from16 v0, v18

    .line 425
    .line 426
    :goto_4
    check-cast v0, Ljava/lang/String;

    .line 427
    .line 428
    iput-object v3, v6, La/g8w0;->i:Ljava/lang/String;

    .line 429
    .line 430
    iput-object v3, v6, La/g8w0;->j:Ljava/lang/String;

    .line 431
    .line 432
    iput-object v3, v6, La/g8w0;->k:Ljava/io/Serializable;

    .line 433
    .line 434
    iput-object v3, v6, La/g8w0;->l:Ljava/io/Serializable;

    .line 435
    .line 436
    iput-object v3, v6, La/g8w0;->m:Ljava/io/Serializable;

    .line 437
    .line 438
    const/4 v3, 0x5

    .line 439
    iput v3, v6, La/g8w0;->s:I

    .line 440
    .line 441
    invoke-static {v2}, La/z8w0;->b(Ljava/lang/String;)[B

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    invoke-static {v0}, La/z8w0;->b(Ljava/lang/String;)[B

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    invoke-static {v14, v2, v0}, La/z8w0;->c(Ljava/lang/String;[B[B)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    if-ne v0, v1, :cond_b

    .line 454
    .line 455
    :goto_5
    return-object v1

    .line 456
    :cond_b
    return-object v0
.end method

.method public j(La/h6m0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ljava/lang/Runnable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    monitor-exit v0

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    iget-object p0, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, La/cad;

    .line 23
    .line 24
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Landroid/os/Handler;

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    monitor-exit v0

    .line 34
    throw p0
.end method

.method public k(JLa/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p3, La/fyu0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/fyu0;

    .line 7
    .line 8
    iget v1, v0, La/fyu0;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/fyu0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/fyu0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/fyu0;-><init>(La/h0q0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/fyu0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/fyu0;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, La/fyu0;->i:La/bzs0;

    .line 37
    .line 38
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p3, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p3, La/bzs0;

    .line 55
    .line 56
    iget-object v2, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, La/lkr0;

    .line 59
    .line 60
    invoke-virtual {v2}, La/lkr0;->invoke()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, La/uvu0;

    .line 65
    .line 66
    iget-object p0, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, La/btt0;

    .line 69
    .line 70
    invoke-virtual {p0}, La/btt0;->a()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    new-instance v4, La/t4k;

    .line 75
    .line 76
    invoke-direct {v4, p1, p2}, La/t4k;-><init>(J)V

    .line 77
    .line 78
    .line 79
    iput-object p3, v0, La/fyu0;->i:La/bzs0;

    .line 80
    .line 81
    iput v3, v0, La/fyu0;->l:I

    .line 82
    .line 83
    invoke-interface {v2, p0, v4, v0}, La/uvu0;->b(Ljava/lang/String;La/t4k;La/yje;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    if-ne p0, v1, :cond_3

    .line 88
    .line 89
    return-object v1

    .line 90
    :cond_3
    move-object v6, p3

    .line 91
    move-object p3, p0

    .line 92
    move-object p0, v6

    .line 93
    :goto_1
    check-cast p3, La/q16;

    .line 94
    .line 95
    invoke-virtual {p3}, La/q16;->a()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    check-cast p1, La/oq;

    .line 100
    .line 101
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    new-instance v0, La/vvu0;

    .line 105
    .line 106
    iget-object p0, p1, La/oq;->b:Ljava/lang/String;

    .line 107
    .line 108
    if-nez p0, :cond_4

    .line 109
    .line 110
    const-string p0, ""

    .line 111
    .line 112
    :cond_4
    move-object v5, p0

    .line 113
    iget-object p0, p1, La/oq;->c:Ljava/lang/Long;

    .line 114
    .line 115
    if-eqz p0, :cond_5

    .line 116
    .line 117
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 118
    .line 119
    .line 120
    move-result-wide p0

    .line 121
    :goto_2
    move-wide v3, p0

    .line 122
    goto :goto_3

    .line 123
    :cond_5
    const-wide/16 p0, 0x0

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :goto_3
    const-wide/16 v1, 0x0

    .line 127
    .line 128
    invoke-direct/range {v0 .. v5}, La/vvu0;-><init>(JJLjava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-object v0
.end method

.method public l()La/bsv0;
    .locals 0

    .line 1
    iget-object p0, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/pz40;

    .line 4
    .line 5
    check-cast p0, La/hgk0;

    .line 6
    .line 7
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, La/bsv0;

    .line 12
    .line 13
    return-object p0
.end method

.method public m()La/msv0;
    .locals 0

    .line 1
    iget-object p0, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/pz40;

    .line 4
    .line 5
    check-cast p0, La/hgk0;

    .line 6
    .line 7
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, La/msv0;

    .line 12
    .line 13
    return-object p0
.end method

.method public n(ILjava/util/List;ZJLa/jvn;JLa/zje;)Ljava/io/Serializable;
    .locals 5

    .line 1
    instance-of v1, p9, La/t5r0;

    .line 2
    .line 3
    if-eqz v1, :cond_0

    .line 4
    .line 5
    move-object v1, p9

    .line 6
    check-cast v1, La/t5r0;

    .line 7
    .line 8
    iget v2, v1, La/t5r0;->l:I

    .line 9
    .line 10
    const/high16 v3, -0x80000000

    .line 11
    .line 12
    and-int v4, v2, v3

    .line 13
    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    sub-int/2addr v2, v3

    .line 17
    iput v2, v1, La/t5r0;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v1, La/t5r0;

    .line 21
    .line 22
    invoke-direct {v1, p0, p9}, La/t5r0;-><init>(La/h0q0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object v0, v1, La/t5r0;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v2, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v3, v1, La/t5r0;->l:I

    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    if-eqz v3, :cond_2

    .line 33
    .line 34
    if-ne v3, v4, :cond_1

    .line 35
    .line 36
    iget-wide p1, v1, La/t5r0;->i:J

    .line 37
    .line 38
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual/range {p0 .. p6}, La/h0q0;->q(ILjava/util/List;ZJLa/jvn;)Ljava/util/TreeMap;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iget-object p2, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p2, La/w4p0;

    .line 59
    .line 60
    iput-wide p7, v1, La/t5r0;->i:J

    .line 61
    .line 62
    iput v4, v1, La/t5r0;->l:I

    .line 63
    .line 64
    iget-object p2, p2, La/w4p0;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p2, La/enj0;

    .line 67
    .line 68
    invoke-virtual {p2}, La/enj0;->invoke()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    check-cast p2, La/w5r0;

    .line 73
    .line 74
    invoke-interface {p2, p1, v1}, La/w5r0;->b(Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-ne v0, v2, :cond_3

    .line 79
    .line 80
    return-object v2

    .line 81
    :cond_3
    move-wide p1, p7

    .line 82
    :goto_1
    check-cast v0, La/dx5;

    .line 83
    .line 84
    invoke-virtual {v0}, La/dx5;->a()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    check-cast p3, Ljava/lang/Iterable;

    .line 89
    .line 90
    new-instance p4, Ljava/util/ArrayList;

    .line 91
    .line 92
    const/16 p5, 0xa

    .line 93
    .line 94
    invoke-static {p3, p5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 95
    .line 96
    .line 97
    move-result p5

    .line 98
    invoke-direct {p4, p5}, Ljava/util/ArrayList;-><init>(I)V

    .line 99
    .line 100
    .line 101
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object p3

    .line 105
    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result p5

    .line 109
    if-eqz p5, :cond_4

    .line 110
    .line 111
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p5

    .line 115
    check-cast p5, La/su10;

    .line 116
    .line 117
    sget-object p6, La/sip;->b:La/sip;

    .line 118
    .line 119
    invoke-static {p5, p6, p1, p2}, La/g7x;->a0(La/su10;La/sip;J)La/nas;

    .line 120
    .line 121
    .line 122
    move-result-object p5

    .line 123
    invoke-virtual {p4, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_4
    iget-object p0, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast p0, La/s5r0;

    .line 130
    .line 131
    iget-object p0, p0, La/s5r0;->b:La/ir30;

    .line 132
    .line 133
    invoke-virtual {p0, p4}, La/ir30;->d(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    return-object p4
.end method

.method public o(ILjava/util/List;ZJLa/jvn;La/zje;)Ljava/io/Serializable;
    .locals 4

    .line 1
    instance-of v0, p7, La/u5r0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p7

    .line 6
    check-cast v0, La/u5r0;

    .line 7
    .line 8
    iget v1, v0, La/u5r0;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/u5r0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/u5r0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p7}, La/u5r0;-><init>(La/h0q0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p7, v0, La/u5r0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/u5r0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p7}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    move-object p1, p0

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    return-object p0

    .line 48
    :cond_2
    invoke-static {p7}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    move-object p7, p6

    .line 52
    move-wide p5, p4

    .line 53
    move p4, p3

    .line 54
    move-object p3, p2

    .line 55
    move p2, p1

    .line 56
    move-object p1, p0

    .line 57
    invoke-virtual/range {p1 .. p7}, La/h0q0;->q(ILjava/util/List;ZJLa/jvn;)Ljava/util/TreeMap;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    iget-object p2, p1, La/h0q0;->a:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p2, La/w4p0;

    .line 64
    .line 65
    iput v3, v0, La/u5r0;->k:I

    .line 66
    .line 67
    iget-object p2, p2, La/w4p0;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p2, La/enj0;

    .line 70
    .line 71
    invoke-virtual {p2}, La/enj0;->invoke()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    check-cast p2, La/w5r0;

    .line 76
    .line 77
    invoke-interface {p2, p0, v0}, La/w5r0;->a(Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p7

    .line 81
    if-ne p7, v1, :cond_3

    .line 82
    .line 83
    return-object v1

    .line 84
    :cond_3
    :goto_1
    check-cast p7, La/dx5;

    .line 85
    .line 86
    invoke-virtual {p7}, La/dx5;->a()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, Ljava/lang/Iterable;

    .line 91
    .line 92
    new-instance p2, Ljava/util/ArrayList;

    .line 93
    .line 94
    const/16 p3, 0xa

    .line 95
    .line 96
    invoke-static {p0, p3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 97
    .line 98
    .line 99
    move-result p3

    .line 100
    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 101
    .line 102
    .line 103
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result p3

    .line 111
    if-eqz p3, :cond_4

    .line 112
    .line 113
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p3

    .line 117
    check-cast p3, La/su10;

    .line 118
    .line 119
    sget-object p4, La/sip;->a:La/bek;

    .line 120
    .line 121
    invoke-static {p3}, La/g7x;->Z(La/su10;)La/nas;

    .line 122
    .line 123
    .line 124
    move-result-object p3

    .line 125
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_4
    iget-object p0, p1, La/h0q0;->b:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast p0, La/s5r0;

    .line 132
    .line 133
    iget-object p0, p0, La/s5r0;->a:La/ir30;

    .line 134
    .line 135
    invoke-virtual {p0, p2}, La/ir30;->d(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    return-object p2
.end method

.method public p()La/bxv0;
    .locals 0

    .line 1
    iget-object p0, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/pz40;

    .line 4
    .line 5
    check-cast p0, La/hgk0;

    .line 6
    .line 7
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, La/bxv0;

    .line 12
    .line 13
    return-object p0
.end method

.method public q(ILjava/util/List;ZJLa/jvn;)Ljava/util/TreeMap;
    .locals 9

    .line 1
    iget-object v0, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/knf0;

    .line 4
    .line 5
    iget-object p0, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/x2c0;

    .line 8
    .line 9
    invoke-virtual {p0}, La/x2c0;->a()La/m2c0;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, La/m2c0;->c:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {p0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    :goto_0
    invoke-virtual {v0}, La/knf0;->b()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v0}, La/knf0;->c()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    new-instance v2, La/jo20;

    .line 38
    .line 39
    invoke-direct {v2}, La/jo20;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p6}, La/jvn;->getId()I

    .line 43
    .line 44
    .line 45
    move-result p6

    .line 46
    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object p6

    .line 50
    const-string v3, "cfView"

    .line 51
    .line 52
    invoke-virtual {v2, v3, p6}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    const-string p6, "count"

    .line 56
    .line 57
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {v2, p6, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    if-eqz p0, :cond_1

    .line 65
    .line 66
    const-string p1, "country"

    .line 67
    .line 68
    invoke-virtual {v2, p1, p0}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    :cond_1
    const-string p0, "fcountry"

    .line 72
    .line 73
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {v2, p0, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    const-string p0, "gr"

    .line 81
    .line 82
    const/16 p1, 0x54d

    .line 83
    .line 84
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {v2, p0, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    const-string p0, "lng"

    .line 92
    .line 93
    invoke-virtual {v2, p0, v0}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    const-string p0, "ref"

    .line 97
    .line 98
    const/4 p1, 0x1

    .line 99
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {v2, p0, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    if-nez p0, :cond_2

    .line 111
    .line 112
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->z0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    const/4 v7, 0x0

    .line 117
    const/16 v8, 0x3e

    .line 118
    .line 119
    const-string v4, ","

    .line 120
    .line 121
    const/4 v5, 0x0

    .line 122
    const/4 v6, 0x0

    .line 123
    invoke-static/range {v3 .. v8}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    const-string p1, "sportIds"

    .line 128
    .line 129
    invoke-virtual {v2, p1, p0}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    :cond_2
    if-eqz p3, :cond_3

    .line 133
    .line 134
    const-string p0, "userId"

    .line 135
    .line 136
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {v2, p0, p1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    :cond_3
    const-string p0, "whence"

    .line 144
    .line 145
    const/16 p1, 0x16

    .line 146
    .line 147
    invoke-static {p1, v2, p0}, La/w6x;->j(ILa/jo20;Ljava/lang/String;)La/jo20;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    new-instance p1, Ljava/util/TreeMap;

    .line 152
    .line 153
    invoke-direct {p1, p0}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    .line 154
    .line 155
    .line 156
    return-object p1
.end method

.method public r(IZLjava/lang/Integer;La/zje;)Ljava/io/Serializable;
    .locals 9

    .line 1
    iget-object v0, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/knf0;

    .line 4
    .line 5
    instance-of v1, p4, La/n9s0;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p4

    .line 10
    check-cast v1, La/n9s0;

    .line 11
    .line 12
    iget v2, v1, La/n9s0;->k:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, La/n9s0;->k:I

    .line 22
    .line 23
    :goto_0
    move-object v7, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v1, La/n9s0;

    .line 26
    .line 27
    invoke-direct {v1, p0, p4}, La/n9s0;-><init>(La/h0q0;La/zje;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object p4, v7, La/n9s0;->i:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v1, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v2, v7, La/n9s0;->k:I

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    const/4 v8, 0x0

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    if-ne v2, v3, :cond_1

    .line 42
    .line 43
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v8

    .line 53
    :cond_2
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p4, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 57
    .line 58
    move-object v2, p4

    .line 59
    check-cast v2, La/l9s0;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, La/knf0;->c()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    if-eqz p2, :cond_3

    .line 69
    .line 70
    iget-object p0, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p0, La/btt0;

    .line 73
    .line 74
    invoke-virtual {p0}, La/btt0;->a()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    goto :goto_2

    .line 79
    :cond_3
    move-object p0, v8

    .line 80
    :goto_2
    iput v3, v7, La/n9s0;->k:I

    .line 81
    .line 82
    move-object v3, p0

    .line 83
    move v5, p1

    .line 84
    move-object v6, p3

    .line 85
    invoke-static/range {v2 .. v7}, La/l9s0;->b(La/l9s0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;La/zje;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p4

    .line 89
    if-ne p4, v1, :cond_4

    .line 90
    .line 91
    return-object v1

    .line 92
    :cond_4
    :goto_3
    check-cast p4, La/dx5;

    .line 93
    .line 94
    invoke-virtual {p4}, La/dx5;->a()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    check-cast p0, La/fzr0;

    .line 99
    .line 100
    iget-object p0, p0, La/fzr0;->a:Ljava/util/List;

    .line 101
    .line 102
    if-nez p0, :cond_5

    .line 103
    .line 104
    sget-object p0, La/iun;->a:La/iun;

    .line 105
    .line 106
    :cond_5
    new-instance p1, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    :cond_6
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    if-eqz p2, :cond_8

    .line 120
    .line 121
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    check-cast p2, La/bzr0;

    .line 126
    .line 127
    :try_start_0
    sget-object p3, La/j0g0;->b:La/e0g0;

    .line 128
    .line 129
    invoke-static {p2}, La/eyr0;->a(La/bzr0;)La/myr0;

    .line 130
    .line 131
    .line 132
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    goto :goto_5

    .line 134
    :catchall_0
    move-exception v0

    .line 135
    move-object p2, v0

    .line 136
    sget-object p3, La/j0g0;->b:La/e0g0;

    .line 137
    .line 138
    new-instance p3, La/g0g0;

    .line 139
    .line 140
    invoke-direct {p3, p2}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    move-object p2, p3

    .line 144
    :goto_5
    nop

    .line 145
    instance-of p3, p2, La/g0g0;

    .line 146
    .line 147
    if-eqz p3, :cond_7

    .line 148
    .line 149
    move-object p2, v8

    .line 150
    :cond_7
    check-cast p2, La/myr0;

    .line 151
    .line 152
    if-eqz p2, :cond_6

    .line 153
    .line 154
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_8
    return-object p1
.end method

.method public s(Ljava/util/ArrayList;La/zje;)Ljava/io/Serializable;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v2, v0, La/h0q0;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/knf0;

    .line 8
    .line 9
    instance-of v3, v1, La/o9s0;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    move-object v3, v1

    .line 14
    check-cast v3, La/o9s0;

    .line 15
    .line 16
    iget v4, v3, La/o9s0;->k:I

    .line 17
    .line 18
    const/high16 v5, -0x80000000

    .line 19
    .line 20
    and-int v6, v4, v5

    .line 21
    .line 22
    if-eqz v6, :cond_0

    .line 23
    .line 24
    sub-int/2addr v4, v5

    .line 25
    iput v4, v3, La/o9s0;->k:I

    .line 26
    .line 27
    :goto_0
    move-object v10, v3

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-instance v3, La/o9s0;

    .line 30
    .line 31
    invoke-direct {v3, v0, v1}, La/o9s0;-><init>(La/h0q0;La/zje;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    iget-object v1, v10, La/o9s0;->i:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v3, La/wne;->a:La/wne;

    .line 38
    .line 39
    iget v4, v10, La/o9s0;->k:I

    .line 40
    .line 41
    const/4 v5, 0x1

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    return-object v0

    .line 57
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object v1, v0, La/h0q0;->b:Ljava/lang/Object;

    .line 61
    .line 62
    move-object v4, v1

    .line 63
    check-cast v4, La/l9s0;

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, La/knf0;->c()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    iget-object v0, v0, La/h0q0;->d:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, La/btt0;

    .line 75
    .line 76
    invoke-virtual {v0}, La/btt0;->a()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const/4 v15, 0x0

    .line 81
    const/16 v16, 0x3e

    .line 82
    .line 83
    const-string v12, ","

    .line 84
    .line 85
    const/4 v13, 0x0

    .line 86
    const/4 v14, 0x0

    .line 87
    move-object/from16 v11, p1

    .line 88
    .line 89
    invoke-static/range {v11 .. v16}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    iput v5, v10, La/o9s0;->k:I

    .line 94
    .line 95
    new-instance v9, La/fk9;

    .line 96
    .line 97
    const/4 v1, 0x0

    .line 98
    invoke-direct {v9, v1}, La/fk9;-><init>(Z)V

    .line 99
    .line 100
    .line 101
    const/16 v7, 0x16

    .line 102
    .line 103
    move-object v5, v0

    .line 104
    invoke-interface/range {v4 .. v10}, La/l9s0;->a(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;La/fk9;La/yje;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    if-ne v1, v3, :cond_3

    .line 109
    .line 110
    return-object v3

    .line 111
    :cond_3
    :goto_2
    check-cast v1, La/dx5;

    .line 112
    .line 113
    invoke-virtual {v1}, La/dx5;->a()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, La/v9s0;

    .line 118
    .line 119
    iget-object v0, v0, La/v9s0;->a:Ljava/util/List;

    .line 120
    .line 121
    if-nez v0, :cond_4

    .line 122
    .line 123
    sget-object v0, La/iun;->a:La/iun;

    .line 124
    .line 125
    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    .line 126
    .line 127
    const/16 v2, 0xa

    .line 128
    .line 129
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 134
    .line 135
    .line 136
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    if-eqz v2, :cond_5

    .line 145
    .line 146
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    check-cast v2, La/z2s0;

    .line 151
    .line 152
    invoke-static {v2}, La/yum0;->o(La/z2s0;)La/w2s0;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_5
    return-object v1
.end method

.method public t(La/sgy;Ljava/lang/String;)La/diu0;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, La/s2m0;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, La/piu0;

    .line 12
    .line 13
    iget-object v1, v1, La/piu0;->a:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-virtual {v1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, La/diu0;

    .line 20
    .line 21
    invoke-interface {p1, v1}, La/sgy;->r(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    iget-object p0, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, La/miu0;

    .line 30
    .line 31
    instance-of p1, p0, La/r0h0;

    .line 32
    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    check-cast p0, La/r0h0;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, La/r0h0;->d:La/glz;

    .line 41
    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    iget-object p0, p0, La/r0h0;->e:La/kd30;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {v1, p0, p1}, La/azw;->A(La/diu0;La/kd30;La/glz;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception p0

    .line 54
    goto :goto_4

    .line 55
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_1
    new-instance v1, La/by40;

    .line 60
    .line 61
    iget-object v2, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, La/wbf;

    .line 64
    .line 65
    invoke-direct {v1, v2}, La/by40;-><init>(La/wbf;)V

    .line 66
    .line 67
    .line 68
    sget-object v2, La/oiu0;->a:La/kys0;

    .line 69
    .line 70
    iget-object v3, v1, La/wbf;->a:Ljava/util/LinkedHashMap;

    .line 71
    .line 72
    invoke-interface {v3, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    iget-object v2, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v2, La/miu0;

    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    .line 81
    .line 82
    :try_start_1
    invoke-interface {v2, p1, v1}, La/miu0;->a(La/sgy;La/by40;)La/diu0;

    .line 83
    .line 84
    .line 85
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/AbstractMethodError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    :goto_1
    move-object v1, p1

    .line 87
    goto :goto_2

    .line 88
    :catch_0
    :try_start_2
    invoke-static {p1}, La/azw;->G(La/sgy;)Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-interface {v2, v3, v1}, La/miu0;->c(Ljava/lang/Class;La/by40;)La/diu0;

    .line 93
    .line 94
    .line 95
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/AbstractMethodError; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 96
    goto :goto_1

    .line 97
    :catch_1
    :try_start_3
    invoke-static {p1}, La/azw;->G(La/sgy;)Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-interface {v2, p1}, La/miu0;->b(Ljava/lang/Class;)La/diu0;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    goto :goto_1

    .line 106
    :goto_2
    iget-object p0, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast p0, La/piu0;

    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    iget-object p0, p0, La/piu0;->a:Ljava/util/LinkedHashMap;

    .line 117
    .line 118
    invoke-interface {p0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    check-cast p0, La/diu0;

    .line 123
    .line 124
    if-eqz p0, :cond_2

    .line 125
    .line 126
    invoke-virtual {p0}, La/diu0;->t()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 127
    .line 128
    .line 129
    :cond_2
    :goto_3
    monitor-exit v0

    .line 130
    return-object v1

    .line 131
    :goto_4
    monitor-exit v0

    .line 132
    throw p0
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_2

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, La/s0x;->H(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object v2, La/jfw0;->a:Landroid/util/SparseArray;

    .line 19
    .line 20
    instance-of v2, v1, La/rfq;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    check-cast v1, La/rfq;

    .line 25
    .line 26
    iget-object v1, v1, La/rfq;->b:Ljava/lang/String;

    .line 27
    .line 28
    const-string v2, "INVALID_RECAPTCHA_TOKEN"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v1, 0x0

    .line 36
    :goto_0
    if-eqz v1, :cond_2

    .line 37
    .line 38
    const/4 p1, 0x4

    .line 39
    const-string v1, "RecaptchaCallWrapper"

    .line 40
    .line 41
    invoke-static {v1, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    new-instance p1, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v2, "Invalid token - Refreshing Recaptcha Enterprise config and fetching new token for tenant "

    .line 50
    .line 51
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    :cond_1
    iget-object p1, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, La/zcw0;

    .line 67
    .line 68
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 69
    .line 70
    iget-object v2, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, Lcom/google/android/recaptcha/RecaptchaAction;

    .line 73
    .line 74
    invoke-virtual {p1, v0, v1, v2}, La/zcw0;->c(Ljava/lang/String;Ljava/lang/Boolean;Lcom/google/android/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object p0, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p0, La/ikt0;

    .line 81
    .line 82
    invoke-virtual {p1, p0}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :cond_2
    return-object p1
.end method

.method public u(La/kka;ZZLa/zje;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p4, La/clt0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/clt0;

    .line 7
    .line 8
    iget v1, v0, La/clt0;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/clt0;->o:I

    .line 18
    .line 19
    :goto_0
    move-object v9, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/clt0;

    .line 22
    .line 23
    invoke-direct {v0, p0, p4}, La/clt0;-><init>(La/h0q0;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p4, v9, La/clt0;->m:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v9, La/clt0;->o:I

    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    const/4 v3, 0x1

    .line 35
    const/4 v10, 0x0

    .line 36
    if-eqz v1, :cond_4

    .line 37
    .line 38
    if-eq v1, v3, :cond_2

    .line 39
    .line 40
    if-ne v1, v2, :cond_1

    .line 41
    .line 42
    iget-boolean p0, v9, La/clt0;->k:Z

    .line 43
    .line 44
    iget-object p1, v9, La/clt0;->i:La/kka;

    .line 45
    .line 46
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto/16 :goto_4

    .line 50
    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v10

    .line 57
    :cond_2
    iget-boolean p3, v9, La/clt0;->l:Z

    .line 58
    .line 59
    iget-boolean p2, v9, La/clt0;->k:Z

    .line 60
    .line 61
    iget-object p1, v9, La/clt0;->j:La/krt0;

    .line 62
    .line 63
    iget-object v1, v9, La/clt0;->i:La/kka;

    .line 64
    .line 65
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object v8, p4

    .line 69
    move-object p4, p1

    .line 70
    move-object p1, v1

    .line 71
    move-object v1, v8

    .line 72
    :cond_3
    move v8, p3

    .line 73
    goto :goto_2

    .line 74
    :cond_4
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object p4, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p4, La/gst0;

    .line 80
    .line 81
    iget-object p4, p4, La/gst0;->a:La/rrt0;

    .line 82
    .line 83
    invoke-virtual {p4}, La/rrt0;->a()La/krt0;

    .line 84
    .line 85
    .line 86
    move-result-object p4

    .line 87
    iget-object v1, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v1, La/b3c0;

    .line 90
    .line 91
    iput-object p1, v9, La/clt0;->i:La/kka;

    .line 92
    .line 93
    iput-object p4, v9, La/clt0;->j:La/krt0;

    .line 94
    .line 95
    iput-boolean p2, v9, La/clt0;->k:Z

    .line 96
    .line 97
    iput-boolean p3, v9, La/clt0;->l:Z

    .line 98
    .line 99
    iput v3, v9, La/clt0;->o:I

    .line 100
    .line 101
    invoke-virtual {v1, v9}, La/b3c0;->b(La/yje;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    if-ne v1, v0, :cond_3

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :goto_2
    check-cast v1, La/m2c0;

    .line 109
    .line 110
    iget-object p3, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p3, La/z220;

    .line 113
    .line 114
    move v3, v2

    .line 115
    iget v2, p1, La/kka;->a:I

    .line 116
    .line 117
    iget-object p0, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p0, La/uzc;

    .line 120
    .line 121
    invoke-virtual {p0}, La/uzc;->b()La/jvn;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-virtual {p0}, La/jvn;->getId()I

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    iget-wide v4, p4, La/krt0;->a:J

    .line 130
    .line 131
    long-to-int v4, v4

    .line 132
    iget-object v5, p1, La/kka;->j:La/teo;

    .line 133
    .line 134
    iget v6, v5, La/teo;->i:I

    .line 135
    .line 136
    iget-boolean v7, p4, La/krt0;->b:Z

    .line 137
    .line 138
    iget-object v5, v1, La/m2c0;->c:Ljava/lang/String;

    .line 139
    .line 140
    iput-object p1, v9, La/clt0;->i:La/kka;

    .line 141
    .line 142
    iput-object v10, v9, La/clt0;->j:La/krt0;

    .line 143
    .line 144
    iput-boolean p2, v9, La/clt0;->k:Z

    .line 145
    .line 146
    iput-boolean v8, v9, La/clt0;->l:Z

    .line 147
    .line 148
    iput v3, v9, La/clt0;->o:I

    .line 149
    .line 150
    move v3, p0

    .line 151
    move-object v1, p3

    .line 152
    invoke-virtual/range {v1 .. v9}, La/z220;->m(IIILjava/lang/String;IZZLa/zje;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p4

    .line 156
    if-ne p4, v0, :cond_5

    .line 157
    .line 158
    :goto_3
    return-object v0

    .line 159
    :cond_5
    move p0, p2

    .line 160
    :goto_4
    check-cast p4, La/a600;

    .line 161
    .line 162
    iget-object p2, p4, La/a600;->c:Ljava/util/List;

    .line 163
    .line 164
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    :cond_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result p3

    .line 172
    if-eqz p3, :cond_7

    .line 173
    .line 174
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p3

    .line 178
    move-object p4, p3

    .line 179
    check-cast p4, La/w500;

    .line 180
    .line 181
    iget v0, p4, La/w500;->a:I

    .line 182
    .line 183
    iget-object v1, p1, La/kka;->j:La/teo;

    .line 184
    .line 185
    iget v2, v1, La/teo;->a:I

    .line 186
    .line 187
    if-ne v0, v2, :cond_6

    .line 188
    .line 189
    iget-wide v2, p4, La/w500;->e:D

    .line 190
    .line 191
    iget-wide v4, v1, La/teo;->d:D

    .line 192
    .line 193
    cmpg-double v0, v2, v4

    .line 194
    .line 195
    if-nez v0, :cond_6

    .line 196
    .line 197
    iget p4, p4, La/w500;->b:I

    .line 198
    .line 199
    iget-object v0, v1, La/teo;->c:La/c9a0;

    .line 200
    .line 201
    iget v0, v0, La/c9a0;->a:I

    .line 202
    .line 203
    if-ne p4, v0, :cond_6

    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_7
    move-object p3, v10

    .line 207
    :goto_5
    check-cast p3, La/w500;

    .line 208
    .line 209
    if-nez p3, :cond_8

    .line 210
    .line 211
    return-object p1

    .line 212
    :cond_8
    if-eqz p0, :cond_9

    .line 213
    .line 214
    iget-object p0, p1, La/kka;->j:La/teo;

    .line 215
    .line 216
    iget-wide v0, p0, La/teo;->e:D

    .line 217
    .line 218
    new-instance p0, Ljava/lang/Double;

    .line 219
    .line 220
    invoke-direct {p0, v0, v1}, Ljava/lang/Double;-><init>(D)V

    .line 221
    .line 222
    .line 223
    goto :goto_6

    .line 224
    :cond_9
    move-object p0, v10

    .line 225
    :goto_6
    iget-object p2, p1, La/kka;->j:La/teo;

    .line 226
    .line 227
    iget-object p4, p3, La/w500;->d:Ljava/lang/String;

    .line 228
    .line 229
    iget-wide v0, p3, La/w500;->c:D

    .line 230
    .line 231
    invoke-static {p2, v0, v1, p0, p4}, La/teo;->a(La/teo;DLjava/lang/Double;Ljava/lang/String;)La/teo;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    const/16 p2, 0x7dff

    .line 236
    .line 237
    invoke-static {p1, p0, v10, v10, p2}, La/kka;->a(La/kka;La/teo;La/v5h0;La/bnq0;I)La/kka;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    return-object p0
.end method

.method public v(Ljava/lang/String;La/s77;Ljava/lang/String;ZJIZLjava/util/List;ZZLa/zje;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p4

    .line 4
    .line 5
    move-wide/from16 v2, p5

    .line 6
    .line 7
    move/from16 v4, p7

    .line 8
    .line 9
    move/from16 v5, p8

    .line 10
    .line 11
    move-object/from16 v6, p12

    .line 12
    .line 13
    instance-of v7, v6, La/bjt0;

    .line 14
    .line 15
    if-eqz v7, :cond_0

    .line 16
    .line 17
    move-object v7, v6

    .line 18
    check-cast v7, La/bjt0;

    .line 19
    .line 20
    iget v8, v7, La/bjt0;->A:I

    .line 21
    .line 22
    const/high16 v9, -0x80000000

    .line 23
    .line 24
    and-int v10, v8, v9

    .line 25
    .line 26
    if-eqz v10, :cond_0

    .line 27
    .line 28
    sub-int/2addr v8, v9

    .line 29
    iput v8, v7, La/bjt0;->A:I

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v7, La/bjt0;

    .line 33
    .line 34
    invoke-direct {v7, v0, v6}, La/bjt0;-><init>(La/h0q0;La/zje;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    iget-object v6, v7, La/bjt0;->y:Ljava/lang/Object;

    .line 38
    .line 39
    sget-object v8, La/wne;->a:La/wne;

    .line 40
    .line 41
    iget v9, v7, La/bjt0;->A:I

    .line 42
    .line 43
    const/4 v10, 0x3

    .line 44
    const/4 v11, 0x2

    .line 45
    const/4 v12, 0x1

    .line 46
    const/4 v13, 0x0

    .line 47
    if-eqz v9, :cond_4

    .line 48
    .line 49
    if-eq v9, v12, :cond_3

    .line 50
    .line 51
    if-eq v9, v11, :cond_2

    .line 52
    .line 53
    if-ne v9, v10, :cond_1

    .line 54
    .line 55
    invoke-static {v6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-object v6

    .line 59
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v13

    .line 65
    :cond_2
    iget-boolean v1, v7, La/bjt0;->t:Z

    .line 66
    .line 67
    iget-boolean v2, v7, La/bjt0;->s:Z

    .line 68
    .line 69
    iget v3, v7, La/bjt0;->x:I

    .line 70
    .line 71
    iget-wide v4, v7, La/bjt0;->v:J

    .line 72
    .line 73
    iget-boolean v9, v7, La/bjt0;->r:Z

    .line 74
    .line 75
    iget-boolean v11, v7, La/bjt0;->q:Z

    .line 76
    .line 77
    iget-boolean v12, v7, La/bjt0;->p:Z

    .line 78
    .line 79
    iget v14, v7, La/bjt0;->w:I

    .line 80
    .line 81
    move v15, v11

    .line 82
    iget-wide v10, v7, La/bjt0;->u:J

    .line 83
    .line 84
    iget-boolean v13, v7, La/bjt0;->o:Z

    .line 85
    .line 86
    move/from16 v17, v1

    .line 87
    .line 88
    iget-object v1, v7, La/bjt0;->n:Ljava/util/List;

    .line 89
    .line 90
    move-object/from16 v18, v1

    .line 91
    .line 92
    iget-object v1, v7, La/bjt0;->m:Ljava/lang/String;

    .line 93
    .line 94
    move-object/from16 v19, v1

    .line 95
    .line 96
    iget-object v1, v7, La/bjt0;->l:La/s77;

    .line 97
    .line 98
    move-object/from16 v20, v1

    .line 99
    .line 100
    iget-object v1, v7, La/bjt0;->k:Ljava/lang/String;

    .line 101
    .line 102
    move-object/from16 v21, v1

    .line 103
    .line 104
    iget-object v1, v7, La/bjt0;->j:La/rrd;

    .line 105
    .line 106
    move-object/from16 v22, v1

    .line 107
    .line 108
    iget-object v1, v7, La/bjt0;->i:Ljava/util/List;

    .line 109
    .line 110
    invoke-static {v6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    move/from16 p1, v2

    .line 114
    .line 115
    move-object/from16 p2, v6

    .line 116
    .line 117
    move v6, v13

    .line 118
    move-object/from16 p4, v18

    .line 119
    .line 120
    move-object/from16 v13, v19

    .line 121
    .line 122
    move-object/from16 p3, v22

    .line 123
    .line 124
    move-object/from16 v18, v1

    .line 125
    .line 126
    move-wide v1, v10

    .line 127
    move-wide v10, v4

    .line 128
    move v5, v12

    .line 129
    move v4, v15

    .line 130
    move/from16 v15, v17

    .line 131
    .line 132
    move-object/from16 v12, v20

    .line 133
    .line 134
    move-object/from16 v17, v8

    .line 135
    .line 136
    move v8, v14

    .line 137
    move v14, v3

    .line 138
    move v3, v9

    .line 139
    move-object/from16 v9, v21

    .line 140
    .line 141
    goto/16 :goto_2

    .line 142
    .line 143
    :cond_3
    iget-boolean v1, v7, La/bjt0;->t:Z

    .line 144
    .line 145
    iget-boolean v2, v7, La/bjt0;->s:Z

    .line 146
    .line 147
    iget v3, v7, La/bjt0;->x:I

    .line 148
    .line 149
    iget-wide v4, v7, La/bjt0;->v:J

    .line 150
    .line 151
    iget-boolean v9, v7, La/bjt0;->r:Z

    .line 152
    .line 153
    iget-boolean v10, v7, La/bjt0;->q:Z

    .line 154
    .line 155
    iget-boolean v12, v7, La/bjt0;->p:Z

    .line 156
    .line 157
    iget v13, v7, La/bjt0;->w:I

    .line 158
    .line 159
    iget-wide v14, v7, La/bjt0;->u:J

    .line 160
    .line 161
    iget-boolean v11, v7, La/bjt0;->o:Z

    .line 162
    .line 163
    move/from16 v18, v1

    .line 164
    .line 165
    iget-object v1, v7, La/bjt0;->m:Ljava/lang/String;

    .line 166
    .line 167
    move-object/from16 v19, v1

    .line 168
    .line 169
    iget-object v1, v7, La/bjt0;->l:La/s77;

    .line 170
    .line 171
    move-object/from16 v20, v1

    .line 172
    .line 173
    iget-object v1, v7, La/bjt0;->k:Ljava/lang/String;

    .line 174
    .line 175
    move-object/from16 v21, v1

    .line 176
    .line 177
    iget-object v1, v7, La/bjt0;->j:La/rrd;

    .line 178
    .line 179
    move-object/from16 v22, v1

    .line 180
    .line 181
    iget-object v1, v7, La/bjt0;->i:Ljava/util/List;

    .line 182
    .line 183
    invoke-static {v6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    move-wide/from16 p1, v4

    .line 187
    .line 188
    move-object/from16 v23, v8

    .line 189
    .line 190
    move-object v8, v1

    .line 191
    move v1, v11

    .line 192
    move-object/from16 v11, v21

    .line 193
    .line 194
    move/from16 v21, v3

    .line 195
    .line 196
    move-object/from16 v3, v22

    .line 197
    .line 198
    move-object/from16 v22, v6

    .line 199
    .line 200
    move v6, v13

    .line 201
    move-object/from16 v13, v20

    .line 202
    .line 203
    move/from16 v20, v2

    .line 204
    .line 205
    move v2, v9

    .line 206
    move/from16 v24, v18

    .line 207
    .line 208
    move-object/from16 v18, v23

    .line 209
    .line 210
    move/from16 v23, v12

    .line 211
    .line 212
    move v12, v10

    .line 213
    move-wide v9, v14

    .line 214
    move-object/from16 v14, v19

    .line 215
    .line 216
    move/from16 v15, v23

    .line 217
    .line 218
    move/from16 v19, v24

    .line 219
    .line 220
    goto :goto_1

    .line 221
    :cond_4
    invoke-static {v6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    iget-object v6, v0, La/h0q0;->a:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v6, La/rrd;

    .line 227
    .line 228
    iget-object v9, v0, La/h0q0;->c:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v9, La/edo;

    .line 231
    .line 232
    move-object/from16 v10, p9

    .line 233
    .line 234
    iput-object v10, v7, La/bjt0;->i:Ljava/util/List;

    .line 235
    .line 236
    iput-object v6, v7, La/bjt0;->j:La/rrd;

    .line 237
    .line 238
    move-object/from16 v11, p1

    .line 239
    .line 240
    iput-object v11, v7, La/bjt0;->k:Ljava/lang/String;

    .line 241
    .line 242
    move-object/from16 v13, p2

    .line 243
    .line 244
    iput-object v13, v7, La/bjt0;->l:La/s77;

    .line 245
    .line 246
    move-object/from16 v14, p3

    .line 247
    .line 248
    iput-object v14, v7, La/bjt0;->m:Ljava/lang/String;

    .line 249
    .line 250
    iput-boolean v1, v7, La/bjt0;->o:Z

    .line 251
    .line 252
    iput-wide v2, v7, La/bjt0;->u:J

    .line 253
    .line 254
    iput v4, v7, La/bjt0;->w:I

    .line 255
    .line 256
    iput-boolean v5, v7, La/bjt0;->p:Z

    .line 257
    .line 258
    move/from16 v15, p10

    .line 259
    .line 260
    iput-boolean v15, v7, La/bjt0;->q:Z

    .line 261
    .line 262
    move/from16 v12, p11

    .line 263
    .line 264
    iput-boolean v12, v7, La/bjt0;->r:Z

    .line 265
    .line 266
    iput-wide v2, v7, La/bjt0;->v:J

    .line 267
    .line 268
    iput v4, v7, La/bjt0;->x:I

    .line 269
    .line 270
    iput-boolean v1, v7, La/bjt0;->s:Z

    .line 271
    .line 272
    iput-boolean v5, v7, La/bjt0;->t:Z

    .line 273
    .line 274
    const/4 v1, 0x1

    .line 275
    iput v1, v7, La/bjt0;->A:I

    .line 276
    .line 277
    invoke-virtual {v9, v7}, La/edo;->b(La/zje;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    if-ne v1, v8, :cond_5

    .line 282
    .line 283
    move-object v5, v8

    .line 284
    goto/16 :goto_4

    .line 285
    .line 286
    :cond_5
    move/from16 v20, p4

    .line 287
    .line 288
    move-object/from16 v22, v1

    .line 289
    .line 290
    move-wide/from16 p1, v2

    .line 291
    .line 292
    move/from16 v21, v4

    .line 293
    .line 294
    move/from16 v19, v5

    .line 295
    .line 296
    move-object/from16 v18, v8

    .line 297
    .line 298
    move-object v8, v10

    .line 299
    move/from16 v1, v20

    .line 300
    .line 301
    move-wide/from16 v9, p1

    .line 302
    .line 303
    move-object v3, v6

    .line 304
    move v2, v12

    .line 305
    move v12, v15

    .line 306
    move/from16 v6, v21

    .line 307
    .line 308
    move/from16 v15, v19

    .line 309
    .line 310
    :goto_1
    move-object/from16 v4, v22

    .line 311
    .line 312
    check-cast v4, Ljava/util/List;

    .line 313
    .line 314
    iget-object v5, v0, La/h0q0;->b:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v5, La/zfo;

    .line 317
    .line 318
    iput-object v8, v7, La/bjt0;->i:Ljava/util/List;

    .line 319
    .line 320
    iput-object v3, v7, La/bjt0;->j:La/rrd;

    .line 321
    .line 322
    iput-object v11, v7, La/bjt0;->k:Ljava/lang/String;

    .line 323
    .line 324
    iput-object v13, v7, La/bjt0;->l:La/s77;

    .line 325
    .line 326
    iput-object v14, v7, La/bjt0;->m:Ljava/lang/String;

    .line 327
    .line 328
    iput-object v4, v7, La/bjt0;->n:Ljava/util/List;

    .line 329
    .line 330
    iput-boolean v1, v7, La/bjt0;->o:Z

    .line 331
    .line 332
    iput-wide v9, v7, La/bjt0;->u:J

    .line 333
    .line 334
    iput v6, v7, La/bjt0;->w:I

    .line 335
    .line 336
    iput-boolean v15, v7, La/bjt0;->p:Z

    .line 337
    .line 338
    iput-boolean v12, v7, La/bjt0;->q:Z

    .line 339
    .line 340
    iput-boolean v2, v7, La/bjt0;->r:Z

    .line 341
    .line 342
    move/from16 v22, v1

    .line 343
    .line 344
    move/from16 p3, v2

    .line 345
    .line 346
    move-wide/from16 v1, p1

    .line 347
    .line 348
    iput-wide v1, v7, La/bjt0;->v:J

    .line 349
    .line 350
    move/from16 v1, v21

    .line 351
    .line 352
    iput v1, v7, La/bjt0;->x:I

    .line 353
    .line 354
    move/from16 v2, v20

    .line 355
    .line 356
    iput-boolean v2, v7, La/bjt0;->s:Z

    .line 357
    .line 358
    move/from16 v20, v1

    .line 359
    .line 360
    move/from16 v1, v19

    .line 361
    .line 362
    iput-boolean v1, v7, La/bjt0;->t:Z

    .line 363
    .line 364
    const/4 v1, 0x2

    .line 365
    iput v1, v7, La/bjt0;->A:I

    .line 366
    .line 367
    invoke-virtual {v5, v7}, La/zfo;->b(La/yje;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    move-object/from16 v5, v18

    .line 372
    .line 373
    if-ne v1, v5, :cond_6

    .line 374
    .line 375
    goto/16 :goto_4

    .line 376
    .line 377
    :cond_6
    move-object/from16 p4, v3

    .line 378
    .line 379
    move/from16 v3, p3

    .line 380
    .line 381
    move-object/from16 p3, p4

    .line 382
    .line 383
    move-object/from16 p4, v4

    .line 384
    .line 385
    move-object/from16 v17, v5

    .line 386
    .line 387
    move-object/from16 v18, v8

    .line 388
    .line 389
    move v4, v12

    .line 390
    move-object v12, v13

    .line 391
    move-object v13, v14

    .line 392
    move v5, v15

    .line 393
    move/from16 v15, v19

    .line 394
    .line 395
    move/from16 v14, v20

    .line 396
    .line 397
    move v8, v6

    .line 398
    move/from16 v6, v22

    .line 399
    .line 400
    move-wide/from16 v23, p1

    .line 401
    .line 402
    move-object/from16 p2, v1

    .line 403
    .line 404
    move/from16 p1, v2

    .line 405
    .line 406
    move-wide v1, v9

    .line 407
    move-object v9, v11

    .line 408
    move-wide/from16 v10, v23

    .line 409
    .line 410
    :goto_2
    move-object/from16 v19, p2

    .line 411
    .line 412
    check-cast v19, Ljava/util/List;

    .line 413
    .line 414
    iget-object v0, v0, La/h0q0;->d:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast v0, La/j1q0;

    .line 417
    .line 418
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 419
    .line 420
    invoke-virtual {v0}, La/m1q0;->j()Z

    .line 421
    .line 422
    .line 423
    move-result v0

    .line 424
    move/from16 p6, v0

    .line 425
    .line 426
    const/4 v0, 0x0

    .line 427
    iput-object v0, v7, La/bjt0;->i:Ljava/util/List;

    .line 428
    .line 429
    iput-object v0, v7, La/bjt0;->j:La/rrd;

    .line 430
    .line 431
    iput-object v0, v7, La/bjt0;->k:Ljava/lang/String;

    .line 432
    .line 433
    iput-object v0, v7, La/bjt0;->l:La/s77;

    .line 434
    .line 435
    iput-object v0, v7, La/bjt0;->m:Ljava/lang/String;

    .line 436
    .line 437
    iput-object v0, v7, La/bjt0;->n:Ljava/util/List;

    .line 438
    .line 439
    iput-boolean v6, v7, La/bjt0;->o:Z

    .line 440
    .line 441
    iput-wide v1, v7, La/bjt0;->u:J

    .line 442
    .line 443
    iput v8, v7, La/bjt0;->w:I

    .line 444
    .line 445
    iput-boolean v5, v7, La/bjt0;->p:Z

    .line 446
    .line 447
    iput-boolean v4, v7, La/bjt0;->q:Z

    .line 448
    .line 449
    iput-boolean v3, v7, La/bjt0;->r:Z

    .line 450
    .line 451
    const/4 v0, 0x3

    .line 452
    iput v0, v7, La/bjt0;->A:I

    .line 453
    .line 454
    if-eqz p1, :cond_7

    .line 455
    .line 456
    move-object/from16 v8, p3

    .line 457
    .line 458
    move-object/from16 v16, p4

    .line 459
    .line 460
    move/from16 v21, v3

    .line 461
    .line 462
    move/from16 v20, v4

    .line 463
    .line 464
    move-object/from16 v22, v7

    .line 465
    .line 466
    move-object/from16 v5, v17

    .line 467
    .line 468
    move-object/from16 v17, v19

    .line 469
    .line 470
    move/from16 v19, p6

    .line 471
    .line 472
    invoke-virtual/range {v8 .. v22}, La/rrd;->k(Ljava/lang/String;JLa/s77;Ljava/lang/String;IZLjava/util/List;Ljava/util/List;Ljava/util/List;ZZZLa/zje;)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    goto :goto_3

    .line 477
    :cond_7
    move-object/from16 v8, p3

    .line 478
    .line 479
    move-object/from16 v16, p4

    .line 480
    .line 481
    move/from16 v21, v3

    .line 482
    .line 483
    move/from16 v20, v4

    .line 484
    .line 485
    move-object/from16 v22, v7

    .line 486
    .line 487
    move-object/from16 v5, v17

    .line 488
    .line 489
    move-object/from16 v17, v19

    .line 490
    .line 491
    move/from16 v19, p6

    .line 492
    .line 493
    iget-object v0, v8, La/rrd;->g:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast v0, La/m0w;

    .line 496
    .line 497
    invoke-virtual {v0, v9}, La/m0w;->a(Ljava/lang/String;)La/rg7;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    if-eqz v0, :cond_8

    .line 502
    .line 503
    move-object/from16 p0, v0

    .line 504
    .line 505
    move-object/from16 p1, v12

    .line 506
    .line 507
    move-object/from16 p2, v13

    .line 508
    .line 509
    move/from16 p3, v15

    .line 510
    .line 511
    move-object/from16 p4, v16

    .line 512
    .line 513
    move-object/from16 p5, v17

    .line 514
    .line 515
    move-object/from16 p7, v18

    .line 516
    .line 517
    move/from16 p6, v19

    .line 518
    .line 519
    move/from16 p8, v20

    .line 520
    .line 521
    move/from16 p9, v21

    .line 522
    .line 523
    invoke-static/range {p0 .. p9}, La/bkb;->r0(La/rg7;La/s77;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;ZLjava/util/List;ZZ)La/n3w;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    goto :goto_3

    .line 528
    :cond_8
    invoke-virtual/range {v8 .. v22}, La/rrd;->k(Ljava/lang/String;JLa/s77;Ljava/lang/String;IZLjava/util/List;Ljava/util/List;Ljava/util/List;ZZZLa/zje;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    :goto_3
    if-ne v0, v5, :cond_9

    .line 533
    .line 534
    :goto_4
    return-object v5

    .line 535
    :cond_9
    return-object v0
.end method

.method public w(Ljava/util/ArrayList;ILa/zje;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p3, La/gjt0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/gjt0;

    .line 7
    .line 8
    iget v1, v0, La/gjt0;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/gjt0;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/gjt0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/gjt0;-><init>(La/h0q0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/gjt0;->m:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/gjt0;->o:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v4, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    iget-boolean p1, v0, La/gjt0;->l:Z

    .line 41
    .line 42
    iget-object p2, v0, La/gjt0;->j:Ljava/util/List;

    .line 43
    .line 44
    iget-object v0, v0, La/gjt0;->i:Ljava/util/List;

    .line 45
    .line 46
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v5

    .line 56
    :cond_2
    iget p2, v0, La/gjt0;->k:I

    .line 57
    .line 58
    iget-object p1, v0, La/gjt0;->i:Ljava/util/List;

    .line 59
    .line 60
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object p3, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p3, La/c5k;

    .line 70
    .line 71
    iput-object p1, v0, La/gjt0;->i:Ljava/util/List;

    .line 72
    .line 73
    iput p2, v0, La/gjt0;->k:I

    .line 74
    .line 75
    iput v4, v0, La/gjt0;->o:I

    .line 76
    .line 77
    invoke-virtual {p3, p2, v0}, La/c5k;->i(ILa/zje;)Ljava/io/Serializable;

    .line 78
    .line 79
    .line 80
    move-result-object p3

    .line 81
    if-ne p3, v1, :cond_4

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    :goto_1
    check-cast p3, Ljava/util/List;

    .line 85
    .line 86
    iget-object v2, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v2, La/gst0;

    .line 89
    .line 90
    invoke-virtual {v2}, La/gst0;->a()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_6

    .line 95
    .line 96
    iget-object v4, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v4, La/urt;

    .line 99
    .line 100
    iput-object p1, v0, La/gjt0;->i:Ljava/util/List;

    .line 101
    .line 102
    iput-object p3, v0, La/gjt0;->j:Ljava/util/List;

    .line 103
    .line 104
    iput p2, v0, La/gjt0;->k:I

    .line 105
    .line 106
    iput-boolean v2, v0, La/gjt0;->l:Z

    .line 107
    .line 108
    iput v3, v0, La/gjt0;->o:I

    .line 109
    .line 110
    invoke-static {v4, v0}, La/urt;->a(La/urt;La/zje;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    if-ne p2, v1, :cond_5

    .line 115
    .line 116
    :goto_2
    return-object v1

    .line 117
    :cond_5
    move-object v0, p3

    .line 118
    move-object p3, p2

    .line 119
    move-object p2, v0

    .line 120
    move-object v0, p1

    .line 121
    move p1, v2

    .line 122
    :goto_3
    check-cast p3, Ljava/util/List;

    .line 123
    .line 124
    move v2, p1

    .line 125
    move-object p1, v0

    .line 126
    goto :goto_4

    .line 127
    :cond_6
    sget-object p2, La/iun;->a:La/iun;

    .line 128
    .line 129
    move-object v11, p3

    .line 130
    move-object p3, p2

    .line 131
    move-object p2, v11

    .line 132
    :goto_4
    new-instance v0, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    :cond_7
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-eqz v1, :cond_a

    .line 146
    .line 147
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    move-object v3, v1

    .line 152
    check-cast v3, La/vuf;

    .line 153
    .line 154
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    :cond_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    if-eqz v6, :cond_9

    .line 163
    .line 164
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    move-object v7, v6

    .line 169
    check-cast v7, La/vzf;

    .line 170
    .line 171
    iget-wide v7, v7, La/vzf;->a:J

    .line 172
    .line 173
    iget-wide v9, v3, La/vuf;->a:J

    .line 174
    .line 175
    cmp-long v7, v7, v9

    .line 176
    .line 177
    if-nez v7, :cond_8

    .line 178
    .line 179
    goto :goto_6

    .line 180
    :cond_9
    move-object v6, v5

    .line 181
    :goto_6
    if-eqz v6, :cond_7

    .line 182
    .line 183
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_a
    if-eqz v2, :cond_f

    .line 188
    .line 189
    new-instance p1, Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-eqz v1, :cond_e

    .line 203
    .line 204
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    move-object v2, v1

    .line 209
    check-cast v2, La/vuf;

    .line 210
    .line 211
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    :cond_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    if-eqz v4, :cond_c

    .line 220
    .line 221
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    move-object v6, v4

    .line 226
    check-cast v6, La/ql5;

    .line 227
    .line 228
    iget-wide v6, v6, La/ql5;->e:J

    .line 229
    .line 230
    iget-wide v8, v2, La/vuf;->a:J

    .line 231
    .line 232
    cmp-long v6, v6, v8

    .line 233
    .line 234
    if-nez v6, :cond_b

    .line 235
    .line 236
    goto :goto_8

    .line 237
    :cond_c
    move-object v4, v5

    .line 238
    :goto_8
    if-eqz v4, :cond_d

    .line 239
    .line 240
    goto :goto_7

    .line 241
    :cond_d
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    goto :goto_7

    .line 245
    :cond_e
    move-object v0, p1

    .line 246
    :cond_f
    new-instance p1, Ljava/util/ArrayList;

    .line 247
    .line 248
    const/16 p3, 0xa

    .line 249
    .line 250
    invoke-static {p2, p3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 255
    .line 256
    .line 257
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 262
    .line 263
    .line 264
    move-result v2

    .line 265
    if-eqz v2, :cond_10

    .line 266
    .line 267
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    check-cast v2, La/vzf;

    .line 272
    .line 273
    iget-wide v2, v2, La/vzf;->a:J

    .line 274
    .line 275
    invoke-static {v2, v3, p1}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 276
    .line 277
    .line 278
    goto :goto_9

    .line 279
    :cond_10
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->S0(Ljava/lang/Iterable;)La/rx3;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    invoke-static {p1, p3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    invoke-static {v1}, La/wp20;->a(I)I

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    const/16 v2, 0x10

    .line 292
    .line 293
    if-ge v1, v2, :cond_11

    .line 294
    .line 295
    move v1, v2

    .line 296
    :cond_11
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 297
    .line 298
    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {p1}, La/rx3;->iterator()Ljava/util/Iterator;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    :goto_a
    move-object v1, p1

    .line 306
    check-cast v1, La/iil;

    .line 307
    .line 308
    iget-object v3, v1, La/iil;->b:Ljava/util/Iterator;

    .line 309
    .line 310
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 311
    .line 312
    .line 313
    move-result v3

    .line 314
    if-eqz v3, :cond_12

    .line 315
    .line 316
    invoke-virtual {v1}, La/iil;->next()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    check-cast v1, Lkotlin/collections/IndexedValue;

    .line 321
    .line 322
    iget-object v3, v1, Lkotlin/collections/IndexedValue;->b:Ljava/lang/Object;

    .line 323
    .line 324
    iget v1, v1, Lkotlin/collections/IndexedValue;->a:I

    .line 325
    .line 326
    new-instance v4, Ljava/lang/Integer;

    .line 327
    .line 328
    invoke-direct {v4, v1}, Ljava/lang/Integer;-><init>(I)V

    .line 329
    .line 330
    .line 331
    invoke-interface {v2, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    goto :goto_a

    .line 335
    :cond_12
    new-instance p1, La/b0c;

    .line 336
    .line 337
    const/4 v1, 0x7

    .line 338
    invoke-direct {p1, v2, v1}, La/b0c;-><init>(Ljava/util/LinkedHashMap;B)V

    .line 339
    .line 340
    .line 341
    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    iget-object p0, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast p0, La/dq00;

    .line 348
    .line 349
    new-instance v0, Ljava/util/ArrayList;

    .line 350
    .line 351
    invoke-static {p1, p3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 352
    .line 353
    .line 354
    move-result p3

    .line 355
    invoke-direct {v0, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 356
    .line 357
    .line 358
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    :goto_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 363
    .line 364
    .line 365
    move-result p3

    .line 366
    if-eqz p3, :cond_16

    .line 367
    .line 368
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object p3

    .line 372
    check-cast p3, La/vuf;

    .line 373
    .line 374
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    :cond_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 379
    .line 380
    .line 381
    move-result v2

    .line 382
    if-eqz v2, :cond_14

    .line 383
    .line 384
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    move-object v3, v2

    .line 389
    check-cast v3, La/vzf;

    .line 390
    .line 391
    iget-wide v3, v3, La/vzf;->a:J

    .line 392
    .line 393
    iget-wide v6, p3, La/vuf;->a:J

    .line 394
    .line 395
    cmp-long v3, v3, v6

    .line 396
    .line 397
    if-nez v3, :cond_13

    .line 398
    .line 399
    goto :goto_c

    .line 400
    :cond_14
    move-object v2, v5

    .line 401
    :goto_c
    check-cast v2, La/vzf;

    .line 402
    .line 403
    if-eqz v2, :cond_15

    .line 404
    .line 405
    iget-boolean v1, v2, La/vzf;->b:Z

    .line 406
    .line 407
    goto :goto_d

    .line 408
    :cond_15
    const/4 v1, 0x0

    .line 409
    :goto_d
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    new-instance v2, La/hq90;

    .line 413
    .line 414
    iget-wide v3, p3, La/vuf;->a:J

    .line 415
    .line 416
    long-to-int v3, v3

    .line 417
    iget-object v4, p3, La/vuf;->b:Ljava/lang/String;

    .line 418
    .line 419
    iget-object p3, p3, La/vuf;->c:Ljava/lang/String;

    .line 420
    .line 421
    invoke-direct {v2, v3, v4, p3, v1}, La/hq90;-><init>(ILjava/lang/String;Ljava/lang/String;Z)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    goto :goto_b

    .line 428
    :cond_16
    invoke-virtual {p0, v0}, La/dq00;->k(Ljava/util/List;)V

    .line 429
    .line 430
    .line 431
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 432
    .line 433
    return-object p0
.end method

.method public x(ZZLa/zje;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p3, La/oev0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/oev0;

    .line 7
    .line 8
    iget v1, v0, La/oev0;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/oev0;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/oev0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/oev0;-><init>(La/h0q0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/oev0;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/oev0;->m:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v9, 0x0

    .line 34
    if-eqz v2, :cond_4

    .line 35
    .line 36
    if-eq v2, v4, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    iget-boolean p1, v0, La/oev0;->j:Z

    .line 41
    .line 42
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    iget-boolean p2, v0, La/oev0;->j:Z

    .line 54
    .line 55
    iget-boolean p1, v0, La/oev0;->i:Z

    .line 56
    .line 57
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :cond_3
    move v7, p1

    .line 61
    goto :goto_1

    .line 62
    :cond_4
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object p3, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p3, La/rtu;

    .line 68
    .line 69
    iput-boolean p1, v0, La/oev0;->i:Z

    .line 70
    .line 71
    iput-boolean p2, v0, La/oev0;->j:Z

    .line 72
    .line 73
    iput v4, v0, La/oev0;->m:I

    .line 74
    .line 75
    const/4 v2, 0x0

    .line 76
    invoke-virtual {p3, p1, v2, v0}, La/rtu;->a(ZILa/yje;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    if-ne p3, v1, :cond_3

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :goto_1
    move-object v8, p3

    .line 84
    check-cast v8, La/c3c0;

    .line 85
    .line 86
    iget-object p1, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p1, La/drm0;

    .line 89
    .line 90
    iput-boolean v7, v0, La/oev0;->i:Z

    .line 91
    .line 92
    iput-boolean p2, v0, La/oev0;->j:Z

    .line 93
    .line 94
    iput v3, v0, La/oev0;->m:I

    .line 95
    .line 96
    iget-object p1, p1, La/drm0;->a:Ljava/lang/Object;

    .line 97
    .line 98
    move-object v6, p1

    .line 99
    check-cast v6, La/fht0;

    .line 100
    .line 101
    new-instance v5, La/xj1;

    .line 102
    .line 103
    const/16 v10, 0x17

    .line 104
    .line 105
    invoke-direct/range {v5 .. v10}, La/xj1;-><init>(Ljava/lang/Object;ZLjava/lang/Object;La/yje;B)V

    .line 106
    .line 107
    .line 108
    const-wide/16 v2, 0x3c

    .line 109
    .line 110
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 111
    .line 112
    invoke-static {v2, v3, p1, v5}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 113
    .line 114
    .line 115
    move-result-object p3

    .line 116
    if-ne p3, v1, :cond_5

    .line 117
    .line 118
    :goto_2
    return-object v1

    .line 119
    :cond_5
    move p1, p2

    .line 120
    :goto_3
    check-cast p3, La/gmq;

    .line 121
    .line 122
    new-instance p2, La/xpp;

    .line 123
    .line 124
    const/16 v0, 0x11

    .line 125
    .line 126
    invoke-direct {p2, v9, p0, p1, v0}, La/xpp;-><init>(La/yje;Ljava/lang/Object;ZB)V

    .line 127
    .line 128
    .line 129
    invoke-static {p3, p2}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    return-object p0
.end method

.method public y(La/tfk;)Z
    .locals 1

    .line 1
    iget-object v0, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/tfk;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    iget-object p0, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, La/h0q0;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/h0q0;->y(La/tfk;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move p0, v0

    .line 24
    :goto_0
    if-eqz p0, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    return v0

    .line 28
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 29
    return p0
.end method

.method public z(JLa/zje;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, La/h0q0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/knf0;

    .line 4
    .line 5
    instance-of v1, p3, La/rps0;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p3

    .line 10
    check-cast v1, La/rps0;

    .line 11
    .line 12
    iget v2, v1, La/rps0;->k:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, La/rps0;->k:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, La/rps0;

    .line 25
    .line 26
    invoke-direct {v1, p0, p3}, La/rps0;-><init>(La/h0q0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p3, v1, La/rps0;->i:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v2, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v3, v1, La/rps0;->k:I

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x1

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    if-ne v3, v5, :cond_1

    .line 40
    .line 41
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v4

    .line 51
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p3, p0, La/h0q0;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p3, La/g090;

    .line 57
    .line 58
    iget-object v3, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v3, La/btt0;

    .line 61
    .line 62
    invoke-virtual {v3}, La/btt0;->a()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    new-instance v6, La/mx90;

    .line 67
    .line 68
    invoke-virtual {v0}, La/knf0;->c()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-direct {v6, p1, p2, v0}, La/mx90;-><init>(JLjava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iput v5, v1, La/rps0;->k:I

    .line 76
    .line 77
    iget-object p1, p3, La/g090;->b:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p1, La/qir0;

    .line 80
    .line 81
    invoke-virtual {p1}, La/qir0;->invoke()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, La/kps0;

    .line 86
    .line 87
    invoke-interface {p1, v3, v6, v1}, La/kps0;->a(Ljava/lang/String;La/mx90;La/yje;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p3

    .line 91
    if-ne p3, v2, :cond_3

    .line 92
    .line 93
    return-object v2

    .line 94
    :cond_3
    :goto_1
    check-cast p3, La/u2t;

    .line 95
    .line 96
    invoke-virtual {p3}, La/u2t;->a()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast p1, La/px90;

    .line 101
    .line 102
    new-instance v5, La/qx90;

    .line 103
    .line 104
    iget-object p2, p1, La/px90;->a:Ljava/lang/Long;

    .line 105
    .line 106
    if-eqz p2, :cond_4

    .line 107
    .line 108
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 109
    .line 110
    .line 111
    move-result-wide p2

    .line 112
    :goto_2
    move-wide v9, p2

    .line 113
    goto :goto_3

    .line 114
    :cond_4
    const-wide/16 p2, 0x0

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :goto_3
    iget-object p2, p1, La/px90;->b:Ljava/lang/Integer;

    .line 118
    .line 119
    if-eqz p2, :cond_7

    .line 120
    .line 121
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    iget-object p2, p1, La/px90;->c:Ljava/lang/Integer;

    .line 126
    .line 127
    if-eqz p2, :cond_6

    .line 128
    .line 129
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    iget-object p1, p1, La/px90;->d:Ljava/lang/Integer;

    .line 134
    .line 135
    if-eqz p1, :cond_5

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 138
    .line 139
    .line 140
    move-result v8

    .line 141
    invoke-direct/range {v5 .. v10}, La/qx90;-><init>(IIIJ)V

    .line 142
    .line 143
    .line 144
    iget-object p0, p0, La/h0q0;->a:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p0, La/qps0;

    .line 147
    .line 148
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    iput-object v5, p0, La/qps0;->a:La/qx90;

    .line 152
    .line 153
    return-object v5

    .line 154
    :cond_5
    invoke-static {v4}, La/jf4;->k(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    return-object v4

    .line 158
    :cond_6
    invoke-static {v4}, La/jf4;->k(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    return-object v4

    .line 162
    :cond_7
    invoke-static {v4}, La/jf4;->k(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    return-object v4
.end method

.method public zza(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, La/msm0;->v(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, La/h0q0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/hcp0;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, La/hcp0;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
