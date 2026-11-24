.class public final synthetic La/y02;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/y02;->a:B

    iput p1, p0, La/y02;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/y02;->a:B

    .line 4
    .line 5
    iget v2, v0, La/y02;->b:I

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/n9u0;

    .line 11
    .line 12
    sget-object v1, La/iun;->a:La/iun;

    .line 13
    .line 14
    sget-object v3, La/o8u0;->a:La/o8u0;

    .line 15
    .line 16
    sget-object v4, La/mbu0;->b:La/svs0;

    .line 17
    .line 18
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {v2}, La/svs0;->a(I)La/mbu0;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-direct {v0, v1, v3, v2}, La/n9u0;-><init>(Ljava/util/List;La/o8u0;La/mbu0;)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :pswitch_0
    invoke-static {v2}, Landroidx/compose/runtime/e;->b(I)La/cgk0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    return-object v0

    .line 34
    :pswitch_1
    sget-object v3, La/pdm;->c:La/pdm;

    .line 35
    .line 36
    sget-object v0, La/pb10;->c:La/xuz;

    .line 37
    .line 38
    sget-object v1, La/pb10;->r1:La/pb10;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-static {v1, v2}, La/xuz;->a(La/pb10;I)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    new-instance v1, La/mdm;

    .line 48
    .line 49
    const-wide/16 v12, 0x0

    .line 50
    .line 51
    const/16 v14, 0x2dc

    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    const/4 v5, 0x0

    .line 55
    const/4 v6, 0x0

    .line 56
    const v7, 0x7f130e37

    .line 57
    .line 58
    .line 59
    const/4 v8, 0x0

    .line 60
    const/4 v9, 0x0

    .line 61
    const-wide/16 v10, 0x0

    .line 62
    .line 63
    invoke-direct/range {v1 .. v14}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 64
    .line 65
    .line 66
    return-object v1

    .line 67
    :pswitch_2
    new-instance v2, La/qu50;

    .line 68
    .line 69
    sget-object v3, La/iun;->a:La/iun;

    .line 70
    .line 71
    sget-object v1, La/lb10;->a:La/lb10;

    .line 72
    .line 73
    new-instance v5, La/mb10;

    .line 74
    .line 75
    const/4 v4, 0x0

    .line 76
    invoke-direct {v5, v1, v4}, La/mb10;-><init>(La/lb10;La/mdm;)V

    .line 77
    .line 78
    .line 79
    const/4 v8, 0x0

    .line 80
    const/4 v4, 0x1

    .line 81
    iget v7, v0, La/y02;->b:I

    .line 82
    .line 83
    move-object v6, v3

    .line 84
    invoke-direct/range {v2 .. v8}, La/qu50;-><init>(Ljava/util/List;ZLa/mb10;Ljava/util/List;IZ)V

    .line 85
    .line 86
    .line 87
    return-object v2

    .line 88
    :pswitch_3
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    return-object v0

    .line 93
    :pswitch_4
    invoke-static {v2}, Landroidx/compose/runtime/e;->b(I)La/cgk0;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    return-object v0

    .line 98
    :pswitch_5
    invoke-static {v2}, Landroidx/compose/runtime/e;->b(I)La/cgk0;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    return-object v0

    .line 103
    :pswitch_6
    new-instance v0, La/xcz;

    .line 104
    .line 105
    const/4 v1, 0x2

    .line 106
    const/4 v3, 0x0

    .line 107
    invoke-direct {v0, v2, v1, v3}, La/xcz;-><init>(III)V

    .line 108
    .line 109
    .line 110
    return-object v0

    .line 111
    :pswitch_7
    sget-object v7, La/ldm;->b:La/ldm;

    .line 112
    .line 113
    sget-object v0, La/pb10;->c:La/xuz;

    .line 114
    .line 115
    sget-object v1, La/pb10;->g:La/pb10;

    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-static {v1, v2}, La/xuz;->a(La/pb10;I)I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    new-instance v4, La/mdm;

    .line 125
    .line 126
    const-wide/16 v15, 0x0

    .line 127
    .line 128
    const/16 v17, 0x2da

    .line 129
    .line 130
    const/4 v6, 0x0

    .line 131
    const/4 v8, 0x0

    .line 132
    const/4 v9, 0x0

    .line 133
    const v10, 0x7f13028f

    .line 134
    .line 135
    .line 136
    const/4 v11, 0x0

    .line 137
    const/4 v12, 0x0

    .line 138
    const-wide/16 v13, 0x0

    .line 139
    .line 140
    invoke-direct/range {v4 .. v17}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 141
    .line 142
    .line 143
    return-object v4

    .line 144
    :pswitch_8
    sget-object v8, La/ldm;->b:La/ldm;

    .line 145
    .line 146
    sget-object v0, La/pb10;->c:La/xuz;

    .line 147
    .line 148
    sget-object v1, La/pb10;->g:La/pb10;

    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-static {v1, v2}, La/xuz;->a(La/pb10;I)I

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    new-instance v5, La/mdm;

    .line 158
    .line 159
    const-wide/16 v16, 0x0

    .line 160
    .line 161
    const/16 v18, 0x25a

    .line 162
    .line 163
    const/4 v7, 0x0

    .line 164
    const/4 v9, 0x0

    .line 165
    const/4 v10, 0x0

    .line 166
    const v11, 0x7f1307c4

    .line 167
    .line 168
    .line 169
    const/4 v12, 0x0

    .line 170
    const v13, 0x7f131690

    .line 171
    .line 172
    .line 173
    const-wide/16 v14, 0x2710

    .line 174
    .line 175
    invoke-direct/range {v5 .. v18}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 176
    .line 177
    .line 178
    return-object v5

    .line 179
    :pswitch_9
    int-to-float v0, v2

    .line 180
    const/high16 v1, 0x42c80000    # 100.0f

    .line 181
    .line 182
    div-float/2addr v0, v1

    .line 183
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    return-object v0

    .line 188
    nop

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
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
