.class public final synthetic La/pud;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xbf;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:La/we50;

.field public final synthetic g:Ljava/util/List;

.field public final synthetic h:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(ILa/we50;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, La/pud;->a:Ljava/lang/String;

    iput-object p4, p0, La/pud;->b:Ljava/lang/String;

    iput-object p5, p0, La/pud;->c:Ljava/lang/String;

    iput p1, p0, La/pud;->d:I

    iput-object p6, p0, La/pud;->e:Ljava/lang/String;

    iput-object p2, p0, La/pud;->f:La/we50;

    iput-object p7, p0, La/pud;->g:Ljava/util/List;

    iput-object p8, p0, La/pud;->h:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    check-cast p1, La/m1r;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p1, La/nud;->b2:La/kud;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, La/pud;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, La/pud;->b:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, La/pud;->c:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, La/pud;->e:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v3, p0, La/pud;->f:La/we50;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object v4, p0, La/pud;->g:Ljava/util/List;

    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object v5, p0, La/pud;->h:Ljava/util/List;

    .line 42
    .line 43
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    new-instance v6, La/nud;

    .line 47
    .line 48
    invoke-direct {v6}, La/nud;-><init>()V

    .line 49
    .line 50
    .line 51
    sget-object v7, La/nud;->c2:[La/iiy;

    .line 52
    .line 53
    const/4 v8, 0x0

    .line 54
    aget-object v9, v7, v8

    .line 55
    .line 56
    iget-object v10, v6, La/nud;->N1:La/phf0;

    .line 57
    .line 58
    invoke-virtual {v10, v6, v9, p1}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    aget-object v9, v7, p1

    .line 63
    .line 64
    iget-object v10, v6, La/nud;->O1:La/phf0;

    .line 65
    .line 66
    invoke-virtual {v10, v6, v9, v0}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/4 v0, 0x3

    .line 70
    aget-object v9, v7, v0

    .line 71
    .line 72
    iget-object v10, v6, La/nud;->Q1:La/phf0;

    .line 73
    .line 74
    invoke-virtual {v10, v6, v9, v1}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iget p0, p0, La/pud;->d:I

    .line 78
    .line 79
    const/4 v1, 0x2

    .line 80
    const/4 v9, 0x4

    .line 81
    const/4 v10, 0x5

    .line 82
    const/4 v11, 0x6

    .line 83
    const/4 v12, 0x7

    .line 84
    packed-switch p0, :pswitch_data_0

    .line 85
    .line 86
    .line 87
    goto/16 :goto_0

    .line 88
    .line 89
    :pswitch_0
    const/16 v8, 0x1b

    .line 90
    .line 91
    goto/16 :goto_0

    .line 92
    .line 93
    :pswitch_1
    const/16 v8, 0x1a

    .line 94
    .line 95
    goto/16 :goto_0

    .line 96
    .line 97
    :pswitch_2
    const/16 v8, 0x19

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :pswitch_3
    const/16 v8, 0x18

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :pswitch_4
    const/16 v8, 0x17

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :pswitch_5
    const/16 v8, 0x16

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :pswitch_6
    const/16 v8, 0x15

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :pswitch_7
    const/16 v8, 0x14

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :pswitch_8
    const/16 v8, 0x13

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :pswitch_9
    const/16 v8, 0x12

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :pswitch_a
    const/16 v8, 0x11

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :pswitch_b
    const/16 v8, 0x10

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :pswitch_c
    const/16 v8, 0xf

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :pswitch_d
    const/16 v8, 0xe

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :pswitch_e
    const/16 v8, 0xd

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :pswitch_f
    const/16 v8, 0xc

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :pswitch_10
    const/16 v8, 0xb

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :pswitch_11
    const/16 v8, 0xa

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :pswitch_12
    const/16 v8, 0x9

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :pswitch_13
    const/16 v8, 0x8

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :pswitch_14
    move v8, v12

    .line 152
    goto :goto_0

    .line 153
    :pswitch_15
    move v8, v11

    .line 154
    goto :goto_0

    .line 155
    :pswitch_16
    move v8, v10

    .line 156
    goto :goto_0

    .line 157
    :pswitch_17
    move v8, v9

    .line 158
    goto :goto_0

    .line 159
    :pswitch_18
    move v8, v0

    .line 160
    goto :goto_0

    .line 161
    :pswitch_19
    move v8, v1

    .line 162
    goto :goto_0

    .line 163
    :pswitch_1a
    move v8, p1

    .line 164
    :goto_0
    iget-object p0, v6, La/nud;->P1:La/zz2;

    .line 165
    .line 166
    aget-object p1, v7, v1

    .line 167
    .line 168
    invoke-virtual {p0, v6, p1, v8}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 169
    .line 170
    .line 171
    iget-object p0, v6, La/nud;->R1:La/phf0;

    .line 172
    .line 173
    aget-object p1, v7, v9

    .line 174
    .line 175
    invoke-virtual {p0, v6, p1, v2}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    iget-object p0, v6, La/nud;->S1:La/yzn0;

    .line 179
    .line 180
    aget-object p1, v7, v10

    .line 181
    .line 182
    invoke-virtual {p0, v6, p1, v3}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 183
    .line 184
    .line 185
    iget-object p0, v6, La/nud;->U1:La/es;

    .line 186
    .line 187
    aget-object p1, v7, v11

    .line 188
    .line 189
    invoke-virtual {p0, v6, p1, v4}, La/es;->D(Landroidx/fragment/app/Fragment;La/iiy;Ljava/util/List;)V

    .line 190
    .line 191
    .line 192
    iget-object p0, v6, La/nud;->V1:La/es;

    .line 193
    .line 194
    aget-object p1, v7, v12

    .line 195
    .line 196
    invoke-virtual {p0, v6, p1, v5}, La/es;->D(Landroidx/fragment/app/Fragment;La/iiy;Ljava/util/List;)V

    .line 197
    .line 198
    .line 199
    return-object v6

    .line 200
    nop

    .line 201
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
