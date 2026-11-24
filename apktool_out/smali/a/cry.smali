.class public final La/cry;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public b:I

.field public c:Ljava/io/Serializable;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 25
    const/4 v0, 0x1

    iput-byte v0, p0, La/cry;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/bry;La/vd40;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/cry;->a:B

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/cry;->c:Ljava/io/Serializable;

    .line 11
    .line 12
    iput-object p2, p0, La/cry;->d:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p3, p0, La/cry;->e:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p4, p0, La/cry;->f:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p5, p0, La/cry;->g:Ljava/lang/Object;

    .line 19
    .line 20
    iput-object p6, p0, La/cry;->h:Ljava/lang/Object;

    .line 21
    .line 22
    iput p7, p0, La/cry;->b:I

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;ILa/zr40;II)V
    .locals 6

    .line 1
    iget-object p4, p0, La/cry;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p4, Landroid/graphics/Paint;

    .line 4
    .line 5
    iget-object p5, p0, La/cry;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p5, Landroid/graphics/Paint;

    .line 8
    .line 9
    iget-object p3, p3, La/zr40;->a:La/ywu;

    .line 10
    .line 11
    const/4 p3, 0x1

    .line 12
    sub-int/2addr p2, p3

    .line 13
    move v0, p3

    .line 14
    :goto_0
    if-ge v0, p2, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, La/cry;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, [F

    .line 19
    .line 20
    mul-int/lit8 v2, v0, 0x2

    .line 21
    .line 22
    aget v3, v1, v2

    .line 23
    .line 24
    add-int/2addr v2, p3

    .line 25
    aget v1, v1, v2

    .line 26
    .line 27
    iget-object v2, p0, La/cry;->e:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, Landroid/graphics/Path;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, La/cry;->e:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Landroid/graphics/Path;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    const/high16 v4, 0x41200000    # 10.0f

    .line 45
    .line 46
    add-float v5, v1, v4

    .line 47
    .line 48
    invoke-virtual {v2, v3, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 49
    .line 50
    .line 51
    iget-object v2, p0, La/cry;->e:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Landroid/graphics/Path;

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    add-float v5, v3, v4

    .line 59
    .line 60
    invoke-virtual {v2, v5, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 61
    .line 62
    .line 63
    iget-object v2, p0, La/cry;->e:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, Landroid/graphics/Path;

    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    sub-float v5, v1, v4

    .line 71
    .line 72
    invoke-virtual {v2, v3, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 73
    .line 74
    .line 75
    iget-object v2, p0, La/cry;->e:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v2, Landroid/graphics/Path;

    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    sub-float/2addr v3, v4

    .line 83
    invoke-virtual {v2, v3, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, La/cry;->e:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v1, Landroid/graphics/Path;

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    .line 94
    .line 95
    .line 96
    iget-object v1, p0, La/cry;->e:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v1, Landroid/graphics/Path;

    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v1, p5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 104
    .line 105
    .line 106
    add-int/lit8 v0, v0, 0x1

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_0
    iget-object p2, p0, La/cry;->c:Ljava/io/Serializable;

    .line 110
    .line 111
    check-cast p2, [F

    .line 112
    .line 113
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    array-length p2, p2

    .line 117
    if-le p2, p3, :cond_1

    .line 118
    .line 119
    iget-object p2, p0, La/cry;->c:Ljava/io/Serializable;

    .line 120
    .line 121
    check-cast p2, [F

    .line 122
    .line 123
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    const/4 p5, 0x0

    .line 127
    aget p2, p2, p5

    .line 128
    .line 129
    iget-object p5, p0, La/cry;->c:Ljava/io/Serializable;

    .line 130
    .line 131
    check-cast p5, [F

    .line 132
    .line 133
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    aget p5, p5, p3

    .line 137
    .line 138
    const/high16 v0, 0x41000000    # 8.0f

    .line 139
    .line 140
    invoke-virtual {p1, p2, p5, v0, p4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 141
    .line 142
    .line 143
    iget-object p2, p0, La/cry;->c:Ljava/io/Serializable;

    .line 144
    .line 145
    check-cast p2, [F

    .line 146
    .line 147
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    iget-object p5, p0, La/cry;->c:Ljava/io/Serializable;

    .line 151
    .line 152
    check-cast p5, [F

    .line 153
    .line 154
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    array-length p5, p5

    .line 158
    add-int/lit8 p5, p5, -0x2

    .line 159
    .line 160
    aget p2, p2, p5

    .line 161
    .line 162
    iget-object p5, p0, La/cry;->c:Ljava/io/Serializable;

    .line 163
    .line 164
    check-cast p5, [F

    .line 165
    .line 166
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    iget-object p0, p0, La/cry;->c:Ljava/io/Serializable;

    .line 170
    .line 171
    check-cast p0, [F

    .line 172
    .line 173
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    array-length p0, p0

    .line 177
    sub-int/2addr p0, p3

    .line 178
    aget p0, p5, p0

    .line 179
    .line 180
    invoke-virtual {p1, p2, p0, v0, p4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 181
    .line 182
    .line 183
    :cond_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-byte v0, p0, La/cry;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, La/cry;->c:Ljava/io/Serializable;

    .line 17
    .line 18
    check-cast v1, La/bry;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, " version="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, La/cry;->d:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, La/vd40;

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
