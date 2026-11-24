.class public final La/yfc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/app/Application;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Application;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yfc;->a:B

    iput-object p1, p0, La/yfc;->b:Landroid/app/Application;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget-byte v0, p0, La/yfc;->a:B

    .line 2
    .line 3
    const-string v1, "Cannot create dependency "

    .line 4
    .line 5
    iget-object p0, p0, La/yfc;->b:Landroid/app/Application;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    instance-of v0, p0, La/af3;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p0, La/af3;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object p0, v2

    .line 19
    :goto_0
    const-class v0, La/bk60;

    .line 20
    .line 21
    if-eqz p0, :cond_3

    .line 22
    .line 23
    invoke-interface {p0}, La/af3;->d()La/wcf0;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/o5d0;

    .line 32
    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, La/ze3;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move-object p0, v2

    .line 43
    :goto_1
    instance-of v3, p0, La/bk60;

    .line 44
    .line 45
    if-nez v3, :cond_2

    .line 46
    .line 47
    move-object p0, v2

    .line 48
    :cond_2
    check-cast p0, La/bk60;

    .line 49
    .line 50
    if-eqz p0, :cond_3

    .line 51
    .line 52
    iget-object v4, p0, La/bk60;->b:La/nr00;

    .line 53
    .line 54
    iget-object v6, p0, La/bk60;->a:La/wsf0;

    .line 55
    .line 56
    iget-object v7, p0, La/bk60;->c:La/mne;

    .line 57
    .line 58
    iget-object v8, p0, La/bk60;->d:La/ctf0;

    .line 59
    .line 60
    iget-object v9, p0, La/bk60;->e:La/r990;

    .line 61
    .line 62
    iget-object v5, p0, La/bk60;->f:La/v6k;

    .line 63
    .line 64
    iget-object v0, p0, La/bk60;->g:La/oeg0;

    .line 65
    .line 66
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    iget-object v11, p0, La/bk60;->h:La/kt2;

    .line 71
    .line 72
    iget-object v12, p0, La/bk60;->i:La/ix0;

    .line 73
    .line 74
    iget-object v13, p0, La/bk60;->j:La/l7k;

    .line 75
    .line 76
    iget-object v14, p0, La/bk60;->k:La/ih5;

    .line 77
    .line 78
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance v3, La/kmi;

    .line 88
    .line 89
    invoke-direct/range {v3 .. v14}, La/kmi;-><init>(La/nr00;La/v6k;La/wsf0;La/mne;La/ctf0;La/r990;La/i1w0;La/kt2;La/ix0;La/l7k;La/ih5;)V

    .line 90
    .line 91
    .line 92
    move-object v2, v3

    .line 93
    goto :goto_2

    .line 94
    :cond_3
    invoke-static {v0, v1}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    :goto_2
    return-object v2

    .line 102
    :pswitch_0
    instance-of v0, p0, La/af3;

    .line 103
    .line 104
    if-eqz v0, :cond_4

    .line 105
    .line 106
    check-cast p0, La/af3;

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_4
    move-object p0, v2

    .line 110
    :goto_3
    const-class v0, La/fgc;

    .line 111
    .line 112
    if-eqz p0, :cond_7

    .line 113
    .line 114
    invoke-interface {p0}, La/af3;->d()La/wcf0;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-virtual {p0, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    check-cast p0, La/o5d0;

    .line 123
    .line 124
    if-eqz p0, :cond_5

    .line 125
    .line 126
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    check-cast p0, La/ze3;

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_5
    move-object p0, v2

    .line 134
    :goto_4
    instance-of v3, p0, La/fgc;

    .line 135
    .line 136
    if-nez v3, :cond_6

    .line 137
    .line 138
    move-object p0, v2

    .line 139
    :cond_6
    check-cast p0, La/fgc;

    .line 140
    .line 141
    if-eqz p0, :cond_7

    .line 142
    .line 143
    iget-object v4, p0, La/fgc;->a:La/cad;

    .line 144
    .line 145
    iget-object v5, p0, La/fgc;->b:La/iw20;

    .line 146
    .line 147
    iget-object v0, p0, La/fgc;->c:La/ii;

    .line 148
    .line 149
    iget-object v6, p0, La/fgc;->d:La/nv20;

    .line 150
    .line 151
    iget-object v7, p0, La/fgc;->e:La/iqt;

    .line 152
    .line 153
    iget-object v1, p0, La/fgc;->f:La/c1d0;

    .line 154
    .line 155
    iget-object v2, p0, La/fgc;->g:La/gr70;

    .line 156
    .line 157
    iget-object v3, p0, La/fgc;->h:La/sue;

    .line 158
    .line 159
    iget-object v8, p0, La/fgc;->i:La/ctf0;

    .line 160
    .line 161
    iget-object v9, p0, La/fgc;->j:La/wgu;

    .line 162
    .line 163
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    new-instance v3, La/mji;

    .line 182
    .line 183
    invoke-direct/range {v3 .. v9}, La/mji;-><init>(La/cad;La/iw20;La/nv20;La/iqt;La/ctf0;La/wgu;)V

    .line 184
    .line 185
    .line 186
    move-object v2, v3

    .line 187
    goto :goto_5

    .line 188
    :cond_7
    invoke-static {v0, v1}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    :goto_5
    return-object v2

    .line 196
    nop

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
