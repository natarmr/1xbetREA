.class public final La/f;
.super La/h;
.source "SourceFile"


# instance fields
.field public final synthetic c:B


# direct methods
.method public synthetic constructor <init>(La/p68;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/f;->c:B

    invoke-direct {p0, p1}, La/c2;-><init>(La/p68;)V

    return-void
.end method


# virtual methods
.method public final C()Ljava/lang/String;
    .locals 9

    .line 1
    iget-byte v0, p0, La/f;->c:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x32

    .line 5
    .line 6
    const/16 v3, 0x29

    .line 7
    .line 8
    const/4 v4, 0x2

    .line 9
    const/16 v5, 0x30

    .line 10
    .line 11
    const/16 v6, 0x8

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    const-string v0, "(01)"

    .line 17
    .line 18
    invoke-static {v0}, La/brm0;->r(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    iget-object v2, p0, La/c2;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, La/oif0;

    .line 29
    .line 30
    iget-object v3, v2, La/oif0;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v3, La/p68;

    .line 33
    .line 34
    const/4 v4, 0x4

    .line 35
    invoke-static {v4, v4, v3}, La/oif0;->m(IILa/p68;)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0, v6, v1}, La/h;->R(Ljava/lang/StringBuilder;II)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v5, v0}, La/oif0;->g(ILjava/lang/StringBuilder;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :pswitch_0
    iget-object v0, p0, La/c2;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, La/oif0;

    .line 53
    .line 54
    iget-object v7, v0, La/oif0;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v7, La/p68;

    .line 57
    .line 58
    iget-object v8, p0, La/c2;->a:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v8, La/p68;

    .line 61
    .line 62
    iget v8, v8, La/p68;->b:I

    .line 63
    .line 64
    if-lt v8, v5, :cond_2

    .line 65
    .line 66
    new-instance v8, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v6, v8}, La/h;->Q(ILjava/lang/StringBuilder;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v5, v4, v7}, La/oif0;->m(IILa/p68;)I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    const-string v4, "(393"

    .line 79
    .line 80
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v8, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const/16 p0, 0xa

    .line 90
    .line 91
    invoke-static {v2, p0, v7}, La/oif0;->m(IILa/p68;)I

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    div-int/lit8 v2, p0, 0x64

    .line 96
    .line 97
    if-nez v2, :cond_0

    .line 98
    .line 99
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    :cond_0
    div-int/lit8 v2, p0, 0xa

    .line 103
    .line 104
    if-nez v2, :cond_1

    .line 105
    .line 106
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    :cond_1
    invoke-virtual {v8, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const/16 p0, 0x3c

    .line 113
    .line 114
    invoke-virtual {v0, p0, v1}, La/oif0;->i(ILjava/lang/String;)La/lkj;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    iget-object p0, p0, La/lkj;->e:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {v8, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0

    .line 128
    :cond_2
    invoke-static {}, La/o660;->a()La/o660;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    throw p0

    .line 133
    :pswitch_1
    iget-object v0, p0, La/c2;->b:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, La/oif0;

    .line 136
    .line 137
    iget-object v7, p0, La/c2;->a:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v7, La/p68;

    .line 140
    .line 141
    iget v7, v7, La/p68;->b:I

    .line 142
    .line 143
    if-lt v7, v5, :cond_3

    .line 144
    .line 145
    new-instance v7, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, v6, v7}, La/h;->Q(ILjava/lang/StringBuilder;)V

    .line 151
    .line 152
    .line 153
    iget-object p0, v0, La/oif0;->b:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast p0, La/p68;

    .line 156
    .line 157
    invoke-static {v5, v4, p0}, La/oif0;->m(IILa/p68;)I

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    const-string v4, "(392"

    .line 162
    .line 163
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v2, v1}, La/oif0;->i(ILjava/lang/String;)La/lkj;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    iget-object p0, p0, La/lkj;->e:Ljava/lang/String;

    .line 177
    .line 178
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    return-object p0

    .line 186
    :cond_3
    invoke-static {}, La/o660;->a()La/o660;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    throw p0

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
