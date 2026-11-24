.class public final La/esg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/m83;
.implements La/w83;
.implements La/n1x;


# static fields
.field public static g:Ljava/util/HashSet;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/esg0;->a:Ljava/lang/Object;

    iput-object p2, p0, La/esg0;->b:Ljava/lang/Object;

    iput-object p3, p0, La/esg0;->c:Ljava/lang/Object;

    iput-object p4, p0, La/esg0;->d:Ljava/lang/Object;

    iput-object p5, p0, La/esg0;->e:Ljava/lang/Object;

    iput-object p6, p0, La/esg0;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static A0(La/csg0;ZLa/grg0;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/csg0;->a:La/xqg0;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, La/xqg0;->c:Ljava/lang/Float;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, v0, La/xqg0;->e:Ljava/lang/Float;

    .line 9
    .line 10
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    instance-of v1, p2, La/aqg0;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    check-cast p2, La/aqg0;

    .line 19
    .line 20
    iget p2, p2, La/aqg0;->a:I

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    instance-of p2, p2, La/bqg0;

    .line 24
    .line 25
    if-eqz p2, :cond_3

    .line 26
    .line 27
    iget-object p2, p0, La/csg0;->a:La/xqg0;

    .line 28
    .line 29
    iget-object p2, p2, La/xqg0;->k:La/aqg0;

    .line 30
    .line 31
    iget p2, p2, La/aqg0;->a:I

    .line 32
    .line 33
    :goto_1
    invoke-static {v0, p2}, La/esg0;->x(FI)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget-object p0, p0, La/csg0;->d:Landroid/graphics/Paint;

    .line 40
    .line 41
    invoke-virtual {p0, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    iget-object p0, p0, La/csg0;->e:Landroid/graphics/Paint;

    .line 46
    .line 47
    invoke-virtual {p0, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 48
    .line 49
    .line 50
    :cond_3
    return-void
.end method

.method public static B0(Landroid/graphics/drawable/Drawable;ILandroid/graphics/PorterDuff$Mode;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    sget-object p2, La/td3;->b:Landroid/graphics/PorterDuff$Mode;

    .line 8
    .line 9
    :cond_0
    invoke-static {p1, p2}, La/td3;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static varargs E(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "SVGAndroidRenderer"

    .line 2
    .line 3
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static G(La/eqg0;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/frg0;->a:La/cyu;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/cyu;->L(Ljava/lang/String;)La/drg0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance p0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v0, "Gradient reference \'"

    .line 12
    .line 13
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p1, "\' not found"

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string p1, "SVGAndroidRenderer"

    .line 29
    .line 30
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    instance-of v1, v0, La/eqg0;

    .line 35
    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    new-array p0, p0, [Ljava/lang/Object;

    .line 40
    .line 41
    const-string p1, "Gradient href attributes must point to other gradient elements"

    .line 42
    .line 43
    invoke-static {p1, p0}, La/esg0;->E(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    if-ne v0, p0, :cond_2

    .line 48
    .line 49
    const-string p0, "Circular reference in gradient href attribute \'%s\'"

    .line 50
    .line 51
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p0, p1}, La/esg0;->E(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    move-object p1, v0

    .line 60
    check-cast p1, La/eqg0;

    .line 61
    .line 62
    iget-object v1, p0, La/eqg0;->i:Ljava/lang/Boolean;

    .line 63
    .line 64
    if-nez v1, :cond_3

    .line 65
    .line 66
    iget-object v1, p1, La/eqg0;->i:Ljava/lang/Boolean;

    .line 67
    .line 68
    iput-object v1, p0, La/eqg0;->i:Ljava/lang/Boolean;

    .line 69
    .line 70
    :cond_3
    iget-object v1, p0, La/eqg0;->j:Landroid/graphics/Matrix;

    .line 71
    .line 72
    if-nez v1, :cond_4

    .line 73
    .line 74
    iget-object v1, p1, La/eqg0;->j:Landroid/graphics/Matrix;

    .line 75
    .line 76
    iput-object v1, p0, La/eqg0;->j:Landroid/graphics/Matrix;

    .line 77
    .line 78
    :cond_4
    iget v1, p0, La/eqg0;->k:I

    .line 79
    .line 80
    if-nez v1, :cond_5

    .line 81
    .line 82
    iget v1, p1, La/eqg0;->k:I

    .line 83
    .line 84
    iput v1, p0, La/eqg0;->k:I

    .line 85
    .line 86
    :cond_5
    iget-object v1, p0, La/eqg0;->h:Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_6

    .line 93
    .line 94
    iget-object v1, p1, La/eqg0;->h:Ljava/util/ArrayList;

    .line 95
    .line 96
    iput-object v1, p0, La/eqg0;->h:Ljava/util/ArrayList;

    .line 97
    .line 98
    :cond_6
    :try_start_0
    instance-of v1, p0, La/erg0;

    .line 99
    .line 100
    if-eqz v1, :cond_a

    .line 101
    .line 102
    move-object v1, p0

    .line 103
    check-cast v1, La/erg0;

    .line 104
    .line 105
    check-cast v0, La/erg0;

    .line 106
    .line 107
    iget-object v2, v1, La/erg0;->m:La/jqg0;

    .line 108
    .line 109
    if-nez v2, :cond_7

    .line 110
    .line 111
    iget-object v2, v0, La/erg0;->m:La/jqg0;

    .line 112
    .line 113
    iput-object v2, v1, La/erg0;->m:La/jqg0;

    .line 114
    .line 115
    :cond_7
    iget-object v2, v1, La/erg0;->n:La/jqg0;

    .line 116
    .line 117
    if-nez v2, :cond_8

    .line 118
    .line 119
    iget-object v2, v0, La/erg0;->n:La/jqg0;

    .line 120
    .line 121
    iput-object v2, v1, La/erg0;->n:La/jqg0;

    .line 122
    .line 123
    :cond_8
    iget-object v2, v1, La/erg0;->o:La/jqg0;

    .line 124
    .line 125
    if-nez v2, :cond_9

    .line 126
    .line 127
    iget-object v2, v0, La/erg0;->o:La/jqg0;

    .line 128
    .line 129
    iput-object v2, v1, La/erg0;->o:La/jqg0;

    .line 130
    .line 131
    :cond_9
    iget-object v2, v1, La/erg0;->p:La/jqg0;

    .line 132
    .line 133
    if-nez v2, :cond_b

    .line 134
    .line 135
    iget-object v0, v0, La/erg0;->p:La/jqg0;

    .line 136
    .line 137
    iput-object v0, v1, La/erg0;->p:La/jqg0;

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_a
    move-object v1, p0

    .line 141
    check-cast v1, La/irg0;

    .line 142
    .line 143
    check-cast v0, La/irg0;

    .line 144
    .line 145
    invoke-static {v1, v0}, La/esg0;->H(La/irg0;La/irg0;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 146
    .line 147
    .line 148
    :catch_0
    :cond_b
    :goto_0
    iget-object p1, p1, La/eqg0;->l:Ljava/lang/String;

    .line 149
    .line 150
    if-eqz p1, :cond_c

    .line 151
    .line 152
    invoke-static {p0, p1}, La/esg0;->G(La/eqg0;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    :cond_c
    return-void
.end method

.method public static H(La/irg0;La/irg0;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/irg0;->m:La/jqg0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, La/irg0;->m:La/jqg0;

    .line 6
    .line 7
    iput-object v0, p0, La/irg0;->m:La/jqg0;

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, La/irg0;->n:La/jqg0;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p1, La/irg0;->n:La/jqg0;

    .line 14
    .line 15
    iput-object v0, p0, La/irg0;->n:La/jqg0;

    .line 16
    .line 17
    :cond_1
    iget-object v0, p0, La/irg0;->o:La/jqg0;

    .line 18
    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    iget-object v0, p1, La/irg0;->o:La/jqg0;

    .line 22
    .line 23
    iput-object v0, p0, La/irg0;->o:La/jqg0;

    .line 24
    .line 25
    :cond_2
    iget-object v0, p0, La/irg0;->p:La/jqg0;

    .line 26
    .line 27
    if-nez v0, :cond_3

    .line 28
    .line 29
    iget-object v0, p1, La/irg0;->p:La/jqg0;

    .line 30
    .line 31
    iput-object v0, p0, La/irg0;->p:La/jqg0;

    .line 32
    .line 33
    :cond_3
    iget-object v0, p0, La/irg0;->q:La/jqg0;

    .line 34
    .line 35
    if-nez v0, :cond_4

    .line 36
    .line 37
    iget-object p1, p1, La/irg0;->q:La/jqg0;

    .line 38
    .line 39
    iput-object p1, p0, La/irg0;->q:La/jqg0;

    .line 40
    .line 41
    :cond_4
    return-void
.end method

.method public static I(La/rqg0;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/frg0;->a:La/cyu;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La/cyu;->L(Ljava/lang/String;)La/drg0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance p0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v0, "Pattern reference \'"

    .line 12
    .line 13
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p1, "\' not found"

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const-string p1, "SVGAndroidRenderer"

    .line 29
    .line 30
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    instance-of v1, v0, La/rqg0;

    .line 35
    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    new-array p0, p0, [Ljava/lang/Object;

    .line 40
    .line 41
    const-string p1, "Pattern href attributes must point to other pattern elements"

    .line 42
    .line 43
    invoke-static {p1, p0}, La/esg0;->E(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    if-ne v0, p0, :cond_2

    .line 48
    .line 49
    const-string p0, "Circular reference in pattern href attribute \'%s\'"

    .line 50
    .line 51
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p0, p1}, La/esg0;->E(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    check-cast v0, La/rqg0;

    .line 60
    .line 61
    iget-object p1, p0, La/rqg0;->p:Ljava/lang/Boolean;

    .line 62
    .line 63
    if-nez p1, :cond_3

    .line 64
    .line 65
    iget-object p1, v0, La/rqg0;->p:Ljava/lang/Boolean;

    .line 66
    .line 67
    iput-object p1, p0, La/rqg0;->p:Ljava/lang/Boolean;

    .line 68
    .line 69
    :cond_3
    iget-object p1, p0, La/rqg0;->q:Ljava/lang/Boolean;

    .line 70
    .line 71
    if-nez p1, :cond_4

    .line 72
    .line 73
    iget-object p1, v0, La/rqg0;->q:Ljava/lang/Boolean;

    .line 74
    .line 75
    iput-object p1, p0, La/rqg0;->q:Ljava/lang/Boolean;

    .line 76
    .line 77
    :cond_4
    iget-object p1, p0, La/rqg0;->r:Landroid/graphics/Matrix;

    .line 78
    .line 79
    if-nez p1, :cond_5

    .line 80
    .line 81
    iget-object p1, v0, La/rqg0;->r:Landroid/graphics/Matrix;

    .line 82
    .line 83
    iput-object p1, p0, La/rqg0;->r:Landroid/graphics/Matrix;

    .line 84
    .line 85
    :cond_5
    iget-object p1, p0, La/rqg0;->s:La/jqg0;

    .line 86
    .line 87
    if-nez p1, :cond_6

    .line 88
    .line 89
    iget-object p1, v0, La/rqg0;->s:La/jqg0;

    .line 90
    .line 91
    iput-object p1, p0, La/rqg0;->s:La/jqg0;

    .line 92
    .line 93
    :cond_6
    iget-object p1, p0, La/rqg0;->t:La/jqg0;

    .line 94
    .line 95
    if-nez p1, :cond_7

    .line 96
    .line 97
    iget-object p1, v0, La/rqg0;->t:La/jqg0;

    .line 98
    .line 99
    iput-object p1, p0, La/rqg0;->t:La/jqg0;

    .line 100
    .line 101
    :cond_7
    iget-object p1, p0, La/rqg0;->u:La/jqg0;

    .line 102
    .line 103
    if-nez p1, :cond_8

    .line 104
    .line 105
    iget-object p1, v0, La/rqg0;->u:La/jqg0;

    .line 106
    .line 107
    iput-object p1, p0, La/rqg0;->u:La/jqg0;

    .line 108
    .line 109
    :cond_8
    iget-object p1, p0, La/rqg0;->v:La/jqg0;

    .line 110
    .line 111
    if-nez p1, :cond_9

    .line 112
    .line 113
    iget-object p1, v0, La/rqg0;->v:La/jqg0;

    .line 114
    .line 115
    iput-object p1, p0, La/rqg0;->v:La/jqg0;

    .line 116
    .line 117
    :cond_9
    iget-object p1, p0, La/arg0;->i:Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-eqz p1, :cond_a

    .line 124
    .line 125
    iget-object p1, v0, La/arg0;->i:Ljava/util/ArrayList;

    .line 126
    .line 127
    iput-object p1, p0, La/arg0;->i:Ljava/util/ArrayList;

    .line 128
    .line 129
    :cond_a
    iget-object p1, p0, La/jrg0;->o:La/gz40;

    .line 130
    .line 131
    if-nez p1, :cond_b

    .line 132
    .line 133
    iget-object p1, v0, La/jrg0;->o:La/gz40;

    .line 134
    .line 135
    iput-object p1, p0, La/jrg0;->o:La/gz40;

    .line 136
    .line 137
    :cond_b
    iget-object p1, p0, La/hrg0;->n:La/bub0;

    .line 138
    .line 139
    if-nez p1, :cond_c

    .line 140
    .line 141
    iget-object p1, v0, La/hrg0;->n:La/bub0;

    .line 142
    .line 143
    iput-object p1, p0, La/hrg0;->n:La/bub0;

    .line 144
    .line 145
    :cond_c
    iget-object p1, v0, La/rqg0;->w:Ljava/lang/String;

    .line 146
    .line 147
    if-eqz p1, :cond_d

    .line 148
    .line 149
    invoke-static {p0, p1}, La/esg0;->I(La/rqg0;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :cond_d
    return-void
.end method

.method public static synthetic L(La/esg0;La/v0;La/er30;Ljava/lang/Boolean;ZI)Ljava/util/List;
    .locals 9

    .line 1
    and-int/lit8 v0, p5, 0x4

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move v5, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    move v5, v0

    .line 10
    :goto_0
    and-int/lit8 v0, p5, 0x10

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const/4 p3, 0x0

    .line 15
    :cond_1
    move-object v7, p3

    .line 16
    and-int/lit8 p3, p5, 0x20

    .line 17
    .line 18
    if-eqz p3, :cond_2

    .line 19
    .line 20
    move v8, v1

    .line 21
    goto :goto_1

    .line 22
    :cond_2
    move v8, p4

    .line 23
    :goto_1
    const/4 v6, 0x0

    .line 24
    move-object v2, p0

    .line 25
    move-object v3, p1

    .line 26
    move-object v4, p2

    .line 27
    invoke-virtual/range {v2 .. v8}, La/esg0;->K(La/v0;La/er30;ZZLjava/lang/Boolean;Z)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public static T(La/z3;La/h950;La/roi0;IZ)La/er30;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p3, :cond_a

    .line 9
    .line 10
    instance-of v1, p0, La/v2d0;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    sget-object p3, La/egy;->a:La/sso;

    .line 15
    .line 16
    check-cast p0, La/v2d0;

    .line 17
    .line 18
    invoke-static {p0, p1, p2}, La/egy;->a(La/v2d0;La/h950;La/roi0;)La/dfy;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    :cond_0
    invoke-static {p0}, La/ydx;->I(La/s0x;)La/er30;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_1
    instance-of v1, p0, La/i3d0;

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    sget-object p3, La/egy;->a:La/sso;

    .line 36
    .line 37
    check-cast p0, La/i3d0;

    .line 38
    .line 39
    invoke-static {p0, p1, p2}, La/egy;->c(La/i3d0;La/h950;La/roi0;)La/dfy;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-nez p0, :cond_2

    .line 44
    .line 45
    goto/16 :goto_0

    .line 46
    .line 47
    :cond_2
    invoke-static {p0}, La/ydx;->I(La/s0x;)La/er30;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_3
    instance-of v1, p0, La/p3d0;

    .line 53
    .line 54
    if-eqz v1, :cond_9

    .line 55
    .line 56
    move-object v1, p0

    .line 57
    check-cast v1, La/gjt;

    .line 58
    .line 59
    sget-object v2, La/dgy;->d:La/ijt;

    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {v1, v2}, La/h8x;->L(La/gjt;La/ijt;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, La/xfy;

    .line 69
    .line 70
    if-nez v1, :cond_4

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_4
    invoke-static {p3}, La/hne;->E(I)I

    .line 74
    .line 75
    .line 76
    move-result p3

    .line 77
    const/4 v2, 0x1

    .line 78
    if-eq p3, v2, :cond_8

    .line 79
    .line 80
    const/4 p0, 0x2

    .line 81
    if-eq p3, p0, :cond_7

    .line 82
    .line 83
    const/4 p0, 0x3

    .line 84
    if-eq p3, p0, :cond_5

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_5
    iget p0, v1, La/xfy;->b:I

    .line 88
    .line 89
    const/16 p2, 0x8

    .line 90
    .line 91
    and-int/2addr p0, p2

    .line 92
    if-ne p0, p2, :cond_6

    .line 93
    .line 94
    iget-object p0, v1, La/xfy;->f:La/vfy;

    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget p2, p0, La/vfy;->c:I

    .line 100
    .line 101
    invoke-interface {p1, p2}, La/h950;->getString(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    iget p0, p0, La/vfy;->d:I

    .line 106
    .line 107
    invoke-interface {p1, p0}, La/h950;->getString(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    new-instance p1, La/er30;

    .line 118
    .line 119
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-direct {p1, p0}, La/er30;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return-object p1

    .line 127
    :cond_6
    return-object v0

    .line 128
    :cond_7
    invoke-virtual {v1}, La/xfy;->j()Z

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    if-eqz p0, :cond_9

    .line 133
    .line 134
    iget-object p0, v1, La/xfy;->e:La/vfy;

    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iget p2, p0, La/vfy;->c:I

    .line 140
    .line 141
    invoke-interface {p1, p2}, La/h950;->getString(I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    iget p0, p0, La/vfy;->d:I

    .line 146
    .line 147
    invoke-interface {p1, p0}, La/h950;->getString(I)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    new-instance p1, La/er30;

    .line 158
    .line 159
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-direct {p1, p0}, La/er30;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    return-object p1

    .line 167
    :cond_8
    move-object v0, p0

    .line 168
    check-cast v0, La/p3d0;

    .line 169
    .line 170
    const/4 v3, 0x1

    .line 171
    const/4 v4, 0x1

    .line 172
    move-object v1, p1

    .line 173
    move-object v2, p2

    .line 174
    move v5, p4

    .line 175
    invoke-static/range {v0 .. v5}, La/hp4;->F(La/p3d0;La/h950;La/roi0;ZZZ)La/er30;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    return-object p0

    .line 180
    :cond_9
    :goto_0
    return-object v0

    .line 181
    :cond_a
    throw v0
.end method

.method public static V(La/dtf0;Landroid/content/Context;I)Landroid/graphics/drawable/LayerDrawable;
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    const v0, 0x7f0801f0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0, p1}, La/dtf0;->d(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const v1, 0x7f0801f1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v1, p1}, La/dtf0;->d(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    instance-of p1, v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-ne p1, p2, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-ne p1, p2, :cond_0

    .line 39
    .line 40
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 41
    .line 42
    new-instance p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-direct {p1, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    sget-object p1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 53
    .line 54
    invoke-static {p2, p2, p1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    new-instance v2, Landroid/graphics/Canvas;

    .line 59
    .line 60
    invoke-direct {v2, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1, v1, p2, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 67
    .line 68
    .line 69
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 70
    .line 71
    invoke-direct {v0, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    .line 72
    .line 73
    .line 74
    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    .line 75
    .line 76
    invoke-direct {v2, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    .line 77
    .line 78
    .line 79
    move-object p1, v2

    .line 80
    :goto_0
    sget-object v2, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    .line 81
    .line 82
    invoke-virtual {p1, v2}, Landroid/graphics/drawable/BitmapDrawable;->setTileModeX(Landroid/graphics/Shader$TileMode;)V

    .line 83
    .line 84
    .line 85
    instance-of v2, p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 86
    .line 87
    if-eqz v2, :cond_1

    .line 88
    .line 89
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-ne v2, p2, :cond_1

    .line 94
    .line 95
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-ne v2, p2, :cond_1

    .line 100
    .line 101
    check-cast p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_1
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 105
    .line 106
    invoke-static {p2, p2, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    new-instance v3, Landroid/graphics/Canvas;

    .line 111
    .line 112
    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v1, v1, p2, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, v3}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 119
    .line 120
    .line 121
    new-instance p0, Landroid/graphics/drawable/BitmapDrawable;

    .line 122
    .line 123
    invoke-direct {p0, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    .line 124
    .line 125
    .line 126
    :goto_1
    new-instance p2, Landroid/graphics/drawable/LayerDrawable;

    .line 127
    .line 128
    const/4 v2, 0x3

    .line 129
    new-array v2, v2, [Landroid/graphics/drawable/Drawable;

    .line 130
    .line 131
    aput-object v0, v2, v1

    .line 132
    .line 133
    const/4 v0, 0x1

    .line 134
    aput-object p0, v2, v0

    .line 135
    .line 136
    const/4 p0, 0x2

    .line 137
    aput-object p1, v2, p0

    .line 138
    .line 139
    invoke-direct {p2, v2}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 140
    .line 141
    .line 142
    const/high16 p1, 0x1020000

    .line 143
    .line 144
    invoke-virtual {p2, v1, p1}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    .line 145
    .line 146
    .line 147
    const p1, 0x102000f

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2, v0, p1}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    .line 151
    .line 152
    .line 153
    const p1, 0x102000d

    .line 154
    .line 155
    .line 156
    invoke-virtual {p2, p0, p1}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    .line 157
    .line 158
    .line 159
    return-object p2
.end method

.method public static b0(La/xqg0;J)Z
    .locals 2

    .line 1
    iget-wide v0, p0, La/xqg0;->a:J

    .line 2
    .line 3
    and-long p0, v0, p1

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    cmp-long p0, p0, v0

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public static j0(La/sqg0;)Landroid/graphics/Path;
    .locals 5

    .line 1
    new-instance v0, Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La/sqg0;->o:[F

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    aget v2, v1, v2

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    aget v1, v1, v3

    .line 13
    .line 14
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    :goto_0
    iget-object v2, p0, La/sqg0;->o:[F

    .line 19
    .line 20
    array-length v3, v2

    .line 21
    if-ge v1, v3, :cond_0

    .line 22
    .line 23
    aget v3, v2, v1

    .line 24
    .line 25
    add-int/lit8 v4, v1, 0x1

    .line 26
    .line 27
    aget v2, v2, v4

    .line 28
    .line 29
    invoke-virtual {v0, v3, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 30
    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    instance-of v1, p0, La/tqg0;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-object v1, p0, La/crg0;->h:La/gz40;

    .line 43
    .line 44
    if-nez v1, :cond_2

    .line 45
    .line 46
    invoke-static {v0}, La/esg0;->r(Landroid/graphics/Path;)La/gz40;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iput-object v1, p0, La/crg0;->h:La/gz40;

    .line 51
    .line 52
    :cond_2
    return-object v0
.end method

.method public static n(FFFFFZZFFLa/qqg0;)V
    .locals 36

    .line 1
    move/from16 v0, p4

    .line 2
    .line 3
    move/from16 v1, p6

    .line 4
    .line 5
    move/from16 v3, p8

    .line 6
    .line 7
    cmpl-float v4, p0, p7

    .line 8
    .line 9
    if-nez v4, :cond_0

    .line 10
    .line 11
    cmpl-float v4, p1, v3

    .line 12
    .line 13
    if-nez v4, :cond_0

    .line 14
    .line 15
    goto/16 :goto_7

    .line 16
    .line 17
    :cond_0
    const/4 v4, 0x0

    .line 18
    cmpl-float v5, p2, v4

    .line 19
    .line 20
    if-eqz v5, :cond_1

    .line 21
    .line 22
    cmpl-float v4, p3, v4

    .line 23
    .line 24
    if-nez v4, :cond_2

    .line 25
    .line 26
    :cond_1
    move/from16 v2, p7

    .line 27
    .line 28
    move-object/from16 v0, p9

    .line 29
    .line 30
    goto/16 :goto_8

    .line 31
    .line 32
    :cond_2
    invoke-static/range {p2 .. p2}, Ljava/lang/Math;->abs(F)F

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    invoke-static/range {p3 .. p3}, Ljava/lang/Math;->abs(F)F

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    float-to-double v6, v0

    .line 41
    const-wide v8, 0x4076800000000000L    # 360.0

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    rem-double/2addr v6, v8

    .line 47
    invoke-static {v6, v7}, Ljava/lang/Math;->toRadians(D)D

    .line 48
    .line 49
    .line 50
    move-result-wide v6

    .line 51
    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    .line 52
    .line 53
    .line 54
    move-result-wide v8

    .line 55
    invoke-static {v6, v7}, Ljava/lang/Math;->sin(D)D

    .line 56
    .line 57
    .line 58
    move-result-wide v6

    .line 59
    sub-float v10, p0, p7

    .line 60
    .line 61
    float-to-double v10, v10

    .line 62
    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    .line 63
    .line 64
    div-double/2addr v10, v12

    .line 65
    sub-float v14, p1, v3

    .line 66
    .line 67
    float-to-double v14, v14

    .line 68
    div-double/2addr v14, v12

    .line 69
    mul-double v16, v8, v10

    .line 70
    .line 71
    mul-double v18, v6, v14

    .line 72
    .line 73
    move-wide/from16 p2, v12

    .line 74
    .line 75
    add-double v12, v18, v16

    .line 76
    .line 77
    move-wide/from16 v16, v8

    .line 78
    .line 79
    neg-double v8, v6

    .line 80
    mul-double/2addr v8, v10

    .line 81
    mul-double v10, v16, v14

    .line 82
    .line 83
    add-double/2addr v10, v8

    .line 84
    mul-float v8, v4, v4

    .line 85
    .line 86
    float-to-double v8, v8

    .line 87
    mul-float v14, v5, v5

    .line 88
    .line 89
    float-to-double v14, v14

    .line 90
    mul-double v18, v12, v12

    .line 91
    .line 92
    mul-double v20, v10, v10

    .line 93
    .line 94
    div-double v22, v18, v8

    .line 95
    .line 96
    div-double v24, v20, v14

    .line 97
    .line 98
    add-double v24, v24, v22

    .line 99
    .line 100
    const-wide v22, 0x3fefffeb074a771dL    # 0.99999

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    cmpl-double v22, v24, v22

    .line 106
    .line 107
    if-lez v22, :cond_3

    .line 108
    .line 109
    invoke-static/range {v24 .. v25}, Ljava/lang/Math;->sqrt(D)D

    .line 110
    .line 111
    .line 112
    move-result-wide v8

    .line 113
    const-wide v14, 0x3ff0000a7c5ac472L    # 1.00001

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    mul-double/2addr v8, v14

    .line 119
    float-to-double v14, v4

    .line 120
    mul-double/2addr v14, v8

    .line 121
    double-to-float v4, v14

    .line 122
    float-to-double v14, v5

    .line 123
    mul-double/2addr v8, v14

    .line 124
    double-to-float v5, v8

    .line 125
    mul-float v8, v4, v4

    .line 126
    .line 127
    float-to-double v8, v8

    .line 128
    mul-float v14, v5, v5

    .line 129
    .line 130
    float-to-double v14, v14

    .line 131
    :cond_3
    const-wide/high16 v22, -0x4010000000000000L    # -1.0

    .line 132
    .line 133
    const-wide/high16 v24, 0x3ff0000000000000L    # 1.0

    .line 134
    .line 135
    move-wide/from16 v26, v6

    .line 136
    .line 137
    move/from16 v6, p5

    .line 138
    .line 139
    if-ne v6, v1, :cond_4

    .line 140
    .line 141
    move-wide/from16 v6, v22

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_4
    move-wide/from16 v6, v24

    .line 145
    .line 146
    :goto_0
    mul-double v28, v8, v14

    .line 147
    .line 148
    mul-double v8, v8, v20

    .line 149
    .line 150
    sub-double v28, v28, v8

    .line 151
    .line 152
    mul-double v14, v14, v18

    .line 153
    .line 154
    sub-double v28, v28, v14

    .line 155
    .line 156
    add-double/2addr v8, v14

    .line 157
    div-double v28, v28, v8

    .line 158
    .line 159
    const-wide/16 v8, 0x0

    .line 160
    .line 161
    cmpg-double v14, v28, v8

    .line 162
    .line 163
    if-gez v14, :cond_5

    .line 164
    .line 165
    move-wide/from16 v28, v8

    .line 166
    .line 167
    :cond_5
    invoke-static/range {v28 .. v29}, Ljava/lang/Math;->sqrt(D)D

    .line 168
    .line 169
    .line 170
    move-result-wide v14

    .line 171
    mul-double/2addr v14, v6

    .line 172
    float-to-double v6, v4

    .line 173
    mul-double v18, v6, v10

    .line 174
    .line 175
    move-wide/from16 v20, v8

    .line 176
    .line 177
    float-to-double v8, v5

    .line 178
    div-double v18, v18, v8

    .line 179
    .line 180
    mul-double v18, v18, v14

    .line 181
    .line 182
    mul-double v28, v8, v12

    .line 183
    .line 184
    move-wide/from16 v30, v6

    .line 185
    .line 186
    div-double v6, v28, v30

    .line 187
    .line 188
    neg-double v6, v6

    .line 189
    mul-double/2addr v14, v6

    .line 190
    add-float v6, p0, p7

    .line 191
    .line 192
    float-to-double v6, v6

    .line 193
    div-double v6, v6, p2

    .line 194
    .line 195
    add-float v1, p1, v3

    .line 196
    .line 197
    move-wide/from16 v28, v6

    .line 198
    .line 199
    float-to-double v6, v1

    .line 200
    div-double v6, v6, p2

    .line 201
    .line 202
    mul-double v32, v16, v18

    .line 203
    .line 204
    mul-double v34, v26, v14

    .line 205
    .line 206
    sub-double v32, v32, v34

    .line 207
    .line 208
    move-wide/from16 p0, v6

    .line 209
    .line 210
    add-double v6, v32, v28

    .line 211
    .line 212
    mul-double v26, v26, v18

    .line 213
    .line 214
    mul-double v16, v16, v14

    .line 215
    .line 216
    add-double v16, v16, v26

    .line 217
    .line 218
    move-wide/from16 v26, v8

    .line 219
    .line 220
    add-double v8, v16, p0

    .line 221
    .line 222
    sub-double v16, v12, v18

    .line 223
    .line 224
    div-double v16, v16, v30

    .line 225
    .line 226
    sub-double v28, v10, v14

    .line 227
    .line 228
    div-double v28, v28, v26

    .line 229
    .line 230
    neg-double v12, v12

    .line 231
    sub-double v12, v12, v18

    .line 232
    .line 233
    div-double v12, v12, v30

    .line 234
    .line 235
    neg-double v10, v10

    .line 236
    sub-double/2addr v10, v14

    .line 237
    div-double v10, v10, v26

    .line 238
    .line 239
    mul-double v14, v16, v16

    .line 240
    .line 241
    mul-double v18, v28, v28

    .line 242
    .line 243
    add-double v18, v18, v14

    .line 244
    .line 245
    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->sqrt(D)D

    .line 246
    .line 247
    .line 248
    move-result-wide v14

    .line 249
    cmpg-double v1, v28, v20

    .line 250
    .line 251
    if-gez v1, :cond_6

    .line 252
    .line 253
    move-wide/from16 v26, v22

    .line 254
    .line 255
    goto :goto_1

    .line 256
    :cond_6
    move-wide/from16 v26, v24

    .line 257
    .line 258
    :goto_1
    div-double v14, v16, v14

    .line 259
    .line 260
    invoke-static {v14, v15}, Ljava/lang/Math;->acos(D)D

    .line 261
    .line 262
    .line 263
    move-result-wide v14

    .line 264
    mul-double v14, v14, v26

    .line 265
    .line 266
    mul-double v26, v12, v12

    .line 267
    .line 268
    mul-double v30, v10, v10

    .line 269
    .line 270
    add-double v30, v30, v26

    .line 271
    .line 272
    mul-double v30, v30, v18

    .line 273
    .line 274
    invoke-static/range {v30 .. v31}, Ljava/lang/Math;->sqrt(D)D

    .line 275
    .line 276
    .line 277
    move-result-wide v18

    .line 278
    mul-double v26, v16, v12

    .line 279
    .line 280
    mul-double v30, v28, v10

    .line 281
    .line 282
    add-double v30, v30, v26

    .line 283
    .line 284
    mul-double v16, v16, v10

    .line 285
    .line 286
    mul-double v28, v28, v12

    .line 287
    .line 288
    sub-double v16, v16, v28

    .line 289
    .line 290
    cmpg-double v1, v16, v20

    .line 291
    .line 292
    if-gez v1, :cond_7

    .line 293
    .line 294
    move-wide/from16 v10, v22

    .line 295
    .line 296
    goto :goto_2

    .line 297
    :cond_7
    move-wide/from16 v10, v24

    .line 298
    .line 299
    :goto_2
    div-double v30, v30, v18

    .line 300
    .line 301
    cmpg-double v1, v30, v22

    .line 302
    .line 303
    const-wide v12, 0x400921fb54442d18L    # Math.PI

    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    if-gez v1, :cond_8

    .line 309
    .line 310
    move-wide/from16 v16, v12

    .line 311
    .line 312
    goto :goto_3

    .line 313
    :cond_8
    cmpl-double v1, v30, v24

    .line 314
    .line 315
    if-lez v1, :cond_9

    .line 316
    .line 317
    move-wide/from16 v16, v20

    .line 318
    .line 319
    goto :goto_3

    .line 320
    :cond_9
    invoke-static/range {v30 .. v31}, Ljava/lang/Math;->acos(D)D

    .line 321
    .line 322
    .line 323
    move-result-wide v16

    .line 324
    :goto_3
    mul-double v10, v10, v16

    .line 325
    .line 326
    const-wide v16, 0x401921fb54442d18L    # 6.283185307179586

    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    if-nez p6, :cond_a

    .line 332
    .line 333
    cmpl-double v1, v10, v20

    .line 334
    .line 335
    if-lez v1, :cond_a

    .line 336
    .line 337
    sub-double v10, v10, v16

    .line 338
    .line 339
    goto :goto_4

    .line 340
    :cond_a
    if-eqz p6, :cond_b

    .line 341
    .line 342
    cmpg-double v1, v10, v20

    .line 343
    .line 344
    if-gez v1, :cond_b

    .line 345
    .line 346
    add-double v10, v10, v16

    .line 347
    .line 348
    :cond_b
    :goto_4
    rem-double v10, v10, v16

    .line 349
    .line 350
    rem-double v14, v14, v16

    .line 351
    .line 352
    invoke-static {v10, v11}, Ljava/lang/Math;->abs(D)D

    .line 353
    .line 354
    .line 355
    move-result-wide v16

    .line 356
    mul-double v16, v16, p2

    .line 357
    .line 358
    div-double v16, v16, v12

    .line 359
    .line 360
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->ceil(D)D

    .line 361
    .line 362
    .line 363
    move-result-wide v12

    .line 364
    double-to-int v1, v12

    .line 365
    int-to-double v12, v1

    .line 366
    div-double/2addr v10, v12

    .line 367
    div-double v12, v10, p2

    .line 368
    .line 369
    invoke-static {v12, v13}, Ljava/lang/Math;->sin(D)D

    .line 370
    .line 371
    .line 372
    move-result-wide v16

    .line 373
    const-wide v18, 0x3ff5555555555555L    # 1.3333333333333333

    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    mul-double v16, v16, v18

    .line 379
    .line 380
    invoke-static {v12, v13}, Ljava/lang/Math;->cos(D)D

    .line 381
    .line 382
    .line 383
    move-result-wide v12

    .line 384
    add-double v12, v12, v24

    .line 385
    .line 386
    div-double v16, v16, v12

    .line 387
    .line 388
    mul-int/lit8 v12, v1, 0x6

    .line 389
    .line 390
    new-array v13, v12, [F

    .line 391
    .line 392
    const/16 v18, 0x0

    .line 393
    .line 394
    move-wide/from16 p0, v10

    .line 395
    .line 396
    move/from16 v10, v18

    .line 397
    .line 398
    move v11, v10

    .line 399
    :goto_5
    if-ge v10, v1, :cond_c

    .line 400
    .line 401
    move-wide/from16 p2, v14

    .line 402
    .line 403
    int-to-double v14, v10

    .line 404
    mul-double v14, v14, p0

    .line 405
    .line 406
    add-double v14, v14, p2

    .line 407
    .line 408
    invoke-static {v14, v15}, Ljava/lang/Math;->cos(D)D

    .line 409
    .line 410
    .line 411
    move-result-wide v19

    .line 412
    invoke-static {v14, v15}, Ljava/lang/Math;->sin(D)D

    .line 413
    .line 414
    .line 415
    move-result-wide v21

    .line 416
    add-int/lit8 v23, v11, 0x1

    .line 417
    .line 418
    mul-double v24, v16, v21

    .line 419
    .line 420
    move/from16 v26, v10

    .line 421
    .line 422
    move/from16 p5, v11

    .line 423
    .line 424
    sub-double v10, v19, v24

    .line 425
    .line 426
    double-to-float v10, v10

    .line 427
    aput v10, v13, p5

    .line 428
    .line 429
    add-int/lit8 v11, p5, 0x2

    .line 430
    .line 431
    mul-double v19, v19, v16

    .line 432
    .line 433
    move/from16 p6, v11

    .line 434
    .line 435
    add-double v10, v19, v21

    .line 436
    .line 437
    double-to-float v10, v10

    .line 438
    aput v10, v13, v23

    .line 439
    .line 440
    add-double v14, v14, p0

    .line 441
    .line 442
    invoke-static {v14, v15}, Ljava/lang/Math;->cos(D)D

    .line 443
    .line 444
    .line 445
    move-result-wide v10

    .line 446
    invoke-static {v14, v15}, Ljava/lang/Math;->sin(D)D

    .line 447
    .line 448
    .line 449
    move-result-wide v14

    .line 450
    add-int/lit8 v19, p5, 0x3

    .line 451
    .line 452
    mul-double v20, v16, v14

    .line 453
    .line 454
    move/from16 v22, v1

    .line 455
    .line 456
    add-double v1, v20, v10

    .line 457
    .line 458
    double-to-float v1, v1

    .line 459
    aput v1, v13, p6

    .line 460
    .line 461
    add-int/lit8 v1, p5, 0x4

    .line 462
    .line 463
    mul-double v20, v16, v10

    .line 464
    .line 465
    move/from16 p6, v1

    .line 466
    .line 467
    sub-double v1, v14, v20

    .line 468
    .line 469
    double-to-float v1, v1

    .line 470
    aput v1, v13, v19

    .line 471
    .line 472
    add-int/lit8 v1, p5, 0x5

    .line 473
    .line 474
    double-to-float v2, v10

    .line 475
    aput v2, v13, p6

    .line 476
    .line 477
    add-int/lit8 v11, p5, 0x6

    .line 478
    .line 479
    double-to-float v2, v14

    .line 480
    aput v2, v13, v1

    .line 481
    .line 482
    add-int/lit8 v10, v26, 0x1

    .line 483
    .line 484
    move-wide/from16 v14, p2

    .line 485
    .line 486
    move/from16 v1, v22

    .line 487
    .line 488
    goto :goto_5

    .line 489
    :cond_c
    new-instance v1, Landroid/graphics/Matrix;

    .line 490
    .line 491
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v1, v4, v5}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 495
    .line 496
    .line 497
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 498
    .line 499
    .line 500
    double-to-float v0, v6

    .line 501
    double-to-float v2, v8

    .line 502
    invoke-virtual {v1, v0, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 503
    .line 504
    .line 505
    invoke-virtual {v1, v13}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 506
    .line 507
    .line 508
    add-int/lit8 v0, v12, -0x2

    .line 509
    .line 510
    aput p7, v13, v0

    .line 511
    .line 512
    add-int/lit8 v0, v12, -0x1

    .line 513
    .line 514
    aput v3, v13, v0

    .line 515
    .line 516
    move/from16 v0, v18

    .line 517
    .line 518
    :goto_6
    if-ge v0, v12, :cond_d

    .line 519
    .line 520
    aget v1, v13, v0

    .line 521
    .line 522
    add-int/lit8 v2, v0, 0x1

    .line 523
    .line 524
    aget v2, v13, v2

    .line 525
    .line 526
    add-int/lit8 v3, v0, 0x2

    .line 527
    .line 528
    aget v3, v13, v3

    .line 529
    .line 530
    add-int/lit8 v4, v0, 0x3

    .line 531
    .line 532
    aget v4, v13, v4

    .line 533
    .line 534
    add-int/lit8 v5, v0, 0x4

    .line 535
    .line 536
    aget v5, v13, v5

    .line 537
    .line 538
    add-int/lit8 v6, v0, 0x5

    .line 539
    .line 540
    aget v6, v13, v6

    .line 541
    .line 542
    move-object/from16 p0, p9

    .line 543
    .line 544
    move/from16 p1, v1

    .line 545
    .line 546
    move/from16 p2, v2

    .line 547
    .line 548
    move/from16 p3, v3

    .line 549
    .line 550
    move/from16 p4, v4

    .line 551
    .line 552
    move/from16 p5, v5

    .line 553
    .line 554
    move/from16 p6, v6

    .line 555
    .line 556
    invoke-interface/range {p0 .. p6}, La/qqg0;->c(FFFFFF)V

    .line 557
    .line 558
    .line 559
    add-int/lit8 v0, v0, 0x6

    .line 560
    .line 561
    goto :goto_6

    .line 562
    :cond_d
    :goto_7
    return-void

    .line 563
    :goto_8
    invoke-interface {v0, v2, v3}, La/qqg0;->e(FF)V

    .line 564
    .line 565
    .line 566
    return-void
.end method

.method public static p([II)Z
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_1

    .line 5
    .line 6
    aget v3, p0, v2

    .line 7
    .line 8
    if-ne v3, p1, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    return v1
.end method

.method public static r(Landroid/graphics/Path;)La/gz40;
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {p0, v0, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 8
    .line 9
    .line 10
    new-instance p0, La/gz40;

    .line 11
    .line 12
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 13
    .line 14
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-direct {p0, v1, v2, v3, v0}, La/gz40;-><init>(FFFF)V

    .line 25
    .line 26
    .line 27
    return-object p0
.end method

.method public static t(La/gz40;La/gz40;La/bub0;)Landroid/graphics/Matrix;
    .locals 9

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_5

    .line 7
    .line 8
    iget-object v1, p2, La/bub0;->a:La/aub0;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_5

    .line 13
    .line 14
    :cond_0
    iget v2, p0, La/gz40;->d:F

    .line 15
    .line 16
    iget v3, p1, La/gz40;->d:F

    .line 17
    .line 18
    div-float/2addr v2, v3

    .line 19
    iget v3, p0, La/gz40;->e:F

    .line 20
    .line 21
    iget v4, p1, La/gz40;->e:F

    .line 22
    .line 23
    div-float/2addr v3, v4

    .line 24
    iget v4, p1, La/gz40;->b:F

    .line 25
    .line 26
    neg-float v4, v4

    .line 27
    iget v5, p1, La/gz40;->c:F

    .line 28
    .line 29
    neg-float v5, v5

    .line 30
    sget-object v6, La/bub0;->c:La/bub0;

    .line 31
    .line 32
    invoke-virtual {p2, v6}, La/bub0;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-eqz v6, :cond_1

    .line 37
    .line 38
    iget p1, p0, La/gz40;->b:F

    .line 39
    .line 40
    iget p0, p0, La/gz40;->c:F

    .line 41
    .line 42
    invoke-virtual {v0, p1, p0}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v4, v5}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_1
    iget p2, p2, La/bub0;->b:I

    .line 53
    .line 54
    const/4 v6, 0x2

    .line 55
    if-ne p2, v6, :cond_2

    .line 56
    .line 57
    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    :goto_0
    iget v2, p0, La/gz40;->d:F

    .line 67
    .line 68
    div-float/2addr v2, p2

    .line 69
    iget v3, p0, La/gz40;->e:F

    .line 70
    .line 71
    div-float/2addr v3, p2

    .line 72
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    const/high16 v8, 0x40000000    # 2.0f

    .line 77
    .line 78
    if-eq v7, v6, :cond_4

    .line 79
    .line 80
    const/4 v6, 0x3

    .line 81
    if-eq v7, v6, :cond_3

    .line 82
    .line 83
    const/4 v6, 0x5

    .line 84
    if-eq v7, v6, :cond_4

    .line 85
    .line 86
    const/4 v6, 0x6

    .line 87
    if-eq v7, v6, :cond_3

    .line 88
    .line 89
    const/16 v6, 0x8

    .line 90
    .line 91
    if-eq v7, v6, :cond_4

    .line 92
    .line 93
    const/16 v6, 0x9

    .line 94
    .line 95
    if-eq v7, v6, :cond_3

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_3
    iget v6, p1, La/gz40;->d:F

    .line 99
    .line 100
    sub-float/2addr v6, v2

    .line 101
    :goto_1
    sub-float/2addr v4, v6

    .line 102
    goto :goto_2

    .line 103
    :cond_4
    iget v6, p1, La/gz40;->d:F

    .line 104
    .line 105
    sub-float/2addr v6, v2

    .line 106
    div-float/2addr v6, v8

    .line 107
    goto :goto_1

    .line 108
    :goto_2
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    packed-switch v1, :pswitch_data_0

    .line 113
    .line 114
    .line 115
    goto :goto_4

    .line 116
    :pswitch_0
    iget p1, p1, La/gz40;->e:F

    .line 117
    .line 118
    sub-float/2addr p1, v3

    .line 119
    :goto_3
    sub-float/2addr v5, p1

    .line 120
    goto :goto_4

    .line 121
    :pswitch_1
    iget p1, p1, La/gz40;->e:F

    .line 122
    .line 123
    sub-float/2addr p1, v3

    .line 124
    div-float/2addr p1, v8

    .line 125
    goto :goto_3

    .line 126
    :goto_4
    iget p1, p0, La/gz40;->b:F

    .line 127
    .line 128
    iget p0, p0, La/gz40;->c:F

    .line 129
    .line 130
    invoke-virtual {v0, p1, p0}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, p2, p2}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v4, v5}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 137
    .line 138
    .line 139
    :cond_5
    :goto_5
    return-object v0

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static w(ILjava/lang/Integer;Ljava/lang/String;)Landroid/graphics/Typeface;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x2

    .line 4
    if-ne p0, v2, :cond_0

    .line 5
    .line 6
    move p0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move p0, v0

    .line 9
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/16 v3, 0x1f4

    .line 14
    .line 15
    const/4 v4, 0x3

    .line 16
    if-le p1, v3, :cond_2

    .line 17
    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    move p0, v4

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move p0, v1

    .line 23
    goto :goto_1

    .line 24
    :cond_2
    if-eqz p0, :cond_3

    .line 25
    .line 26
    move p0, v2

    .line 27
    goto :goto_1

    .line 28
    :cond_3
    move p0, v0

    .line 29
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    const/4 v3, -0x1

    .line 37
    sparse-switch p1, :sswitch_data_0

    .line 38
    .line 39
    .line 40
    :goto_2
    move v0, v3

    .line 41
    goto :goto_3

    .line 42
    :sswitch_0
    const-string p1, "cursive"

    .line 43
    .line 44
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-nez p1, :cond_4

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_4
    const/4 v0, 0x4

    .line 52
    goto :goto_3

    .line 53
    :sswitch_1
    const-string p1, "serif"

    .line 54
    .line 55
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-nez p1, :cond_5

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_5
    move v0, v4

    .line 63
    goto :goto_3

    .line 64
    :sswitch_2
    const-string p1, "fantasy"

    .line 65
    .line 66
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-nez p1, :cond_6

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_6
    move v0, v2

    .line 74
    goto :goto_3

    .line 75
    :sswitch_3
    const-string p1, "monospace"

    .line 76
    .line 77
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-nez p1, :cond_7

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_7
    move v0, v1

    .line 85
    goto :goto_3

    .line 86
    :sswitch_4
    const-string p1, "sans-serif"

    .line 87
    .line 88
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-nez p1, :cond_8

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_8
    :goto_3
    packed-switch v0, :pswitch_data_0

    .line 96
    .line 97
    .line 98
    const/4 p0, 0x0

    .line 99
    return-object p0

    .line 100
    :pswitch_0
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 101
    .line 102
    invoke-static {p1, p0}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0

    .line 107
    :pswitch_1
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    .line 108
    .line 109
    invoke-static {p1, p0}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    return-object p0

    .line 114
    :pswitch_2
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 115
    .line 116
    invoke-static {p1, p0}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0

    .line 121
    :pswitch_3
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    .line 122
    .line 123
    invoke-static {p1, p0}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0

    .line 128
    :pswitch_4
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 129
    .line 130
    invoke-static {p1, p0}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    return-object p0

    .line 135
    :sswitch_data_0
    .sparse-switch
        -0x5b97f43d -> :sswitch_4
        -0x5559f3fd -> :sswitch_3
        -0x407a00da -> :sswitch_2
        0x684317d -> :sswitch_1
        0x432c41c5 -> :sswitch_0
    .end sparse-switch

    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static x(FI)I
    .locals 2

    .line 1
    shr-int/lit8 v0, p1, 0x18

    .line 2
    .line 3
    const/16 v1, 0xff

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    int-to-float v0, v0

    .line 7
    mul-float/2addr v0, p0

    .line 8
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-gez p0, :cond_0

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    if-le p0, v1, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move v1, p0

    .line 20
    :goto_0
    shl-int/lit8 p0, v1, 0x18

    .line 21
    .line 22
    const v0, 0xffffff

    .line 23
    .line 24
    .line 25
    and-int/2addr p1, v0

    .line 26
    or-int/2addr p0, p1

    .line 27
    return p0
.end method

.method public static y(ILandroid/content/Context;)Landroid/content/res/ColorStateList;
    .locals 6

    .line 1
    const v0, 0x7f0401d4

    .line 2
    .line 3
    .line 4
    invoke-static {v0, p1}, La/ybq0;->c(ILandroid/content/Context;)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const v1, 0x7f0401cf

    .line 9
    .line 10
    .line 11
    invoke-static {v1, p1}, La/ybq0;->b(ILandroid/content/Context;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    sget-object v1, La/ybq0;->b:[I

    .line 16
    .line 17
    sget-object v2, La/ybq0;->d:[I

    .line 18
    .line 19
    invoke-static {v0, p0}, La/k5d;->c(II)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    sget-object v4, La/ybq0;->c:[I

    .line 24
    .line 25
    invoke-static {v0, p0}, La/k5d;->c(II)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    sget-object v5, La/ybq0;->f:[I

    .line 30
    .line 31
    filled-new-array {v1, v2, v4, v5}, [[I

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    filled-new-array {p1, v3, v0, p0}, [I

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    new-instance p1, Landroid/content/res/ColorStateList;

    .line 40
    .line 41
    invoke-direct {p1, v1, p0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 42
    .line 43
    .line 44
    return-object p1
.end method


# virtual methods
.method public A()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/csg0;

    .line 4
    .line 5
    iget-object p0, p0, La/csg0;->a:La/xqg0;

    .line 6
    .line 7
    iget-object p0, p0, La/xqg0;->t:Ljava/lang/Boolean;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public B(La/crg0;Landroid/graphics/Path;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, La/esg0;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Landroid/graphics/Canvas;

    .line 10
    .line 11
    iget-object v4, v0, La/esg0;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v4, La/csg0;

    .line 14
    .line 15
    iget-object v4, v4, La/csg0;->a:La/xqg0;

    .line 16
    .line 17
    iget-object v4, v4, La/xqg0;->b:La/grg0;

    .line 18
    .line 19
    instance-of v5, v4, La/oqg0;

    .line 20
    .line 21
    if-eqz v5, :cond_1d

    .line 22
    .line 23
    iget-object v5, v0, La/esg0;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v5, La/cyu;

    .line 26
    .line 27
    check-cast v4, La/oqg0;

    .line 28
    .line 29
    iget-object v4, v4, La/oqg0;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v5, v4}, La/cyu;->L(Ljava/lang/String;)La/drg0;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    instance-of v5, v4, La/rqg0;

    .line 36
    .line 37
    if-eqz v5, :cond_1d

    .line 38
    .line 39
    check-cast v4, La/rqg0;

    .line 40
    .line 41
    iget-object v5, v4, La/rqg0;->p:Ljava/lang/Boolean;

    .line 42
    .line 43
    if-eqz v5, :cond_0

    .line 44
    .line 45
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_0

    .line 50
    .line 51
    const/4 v5, 0x1

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const/4 v5, 0x0

    .line 54
    :goto_0
    iget-object v8, v4, La/rqg0;->w:Ljava/lang/String;

    .line 55
    .line 56
    if-eqz v8, :cond_1

    .line 57
    .line 58
    invoke-static {v4, v8}, La/esg0;->I(La/rqg0;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    iget-object v8, v4, La/rqg0;->s:La/jqg0;

    .line 62
    .line 63
    const/4 v9, 0x0

    .line 64
    if-eqz v5, :cond_6

    .line 65
    .line 66
    if-eqz v8, :cond_2

    .line 67
    .line 68
    invoke-virtual {v8, v0}, La/jqg0;->d(La/esg0;)F

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    move v5, v9

    .line 74
    :goto_1
    iget-object v8, v4, La/rqg0;->t:La/jqg0;

    .line 75
    .line 76
    if-eqz v8, :cond_3

    .line 77
    .line 78
    invoke-virtual {v8, v0}, La/jqg0;->e(La/esg0;)F

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    goto :goto_2

    .line 83
    :cond_3
    move v8, v9

    .line 84
    :goto_2
    iget-object v10, v4, La/rqg0;->u:La/jqg0;

    .line 85
    .line 86
    if-eqz v10, :cond_4

    .line 87
    .line 88
    invoke-virtual {v10, v0}, La/jqg0;->d(La/esg0;)F

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    goto :goto_3

    .line 93
    :cond_4
    move v10, v9

    .line 94
    :goto_3
    iget-object v11, v4, La/rqg0;->v:La/jqg0;

    .line 95
    .line 96
    if-eqz v11, :cond_5

    .line 97
    .line 98
    invoke-virtual {v11, v0}, La/jqg0;->e(La/esg0;)F

    .line 99
    .line 100
    .line 101
    move-result v11

    .line 102
    goto :goto_8

    .line 103
    :cond_5
    move v11, v9

    .line 104
    goto :goto_8

    .line 105
    :cond_6
    const/high16 v5, 0x3f800000    # 1.0f

    .line 106
    .line 107
    if-eqz v8, :cond_7

    .line 108
    .line 109
    invoke-virtual {v8, v0, v5}, La/jqg0;->c(La/esg0;F)F

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    goto :goto_4

    .line 114
    :cond_7
    move v8, v9

    .line 115
    :goto_4
    iget-object v10, v4, La/rqg0;->t:La/jqg0;

    .line 116
    .line 117
    if-eqz v10, :cond_8

    .line 118
    .line 119
    invoke-virtual {v10, v0, v5}, La/jqg0;->c(La/esg0;F)F

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    goto :goto_5

    .line 124
    :cond_8
    move v10, v9

    .line 125
    :goto_5
    iget-object v11, v4, La/rqg0;->u:La/jqg0;

    .line 126
    .line 127
    if-eqz v11, :cond_9

    .line 128
    .line 129
    invoke-virtual {v11, v0, v5}, La/jqg0;->c(La/esg0;F)F

    .line 130
    .line 131
    .line 132
    move-result v11

    .line 133
    goto :goto_6

    .line 134
    :cond_9
    move v11, v9

    .line 135
    :goto_6
    iget-object v12, v4, La/rqg0;->v:La/jqg0;

    .line 136
    .line 137
    if-eqz v12, :cond_a

    .line 138
    .line 139
    invoke-virtual {v12, v0, v5}, La/jqg0;->c(La/esg0;F)F

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    goto :goto_7

    .line 144
    :cond_a
    move v5, v9

    .line 145
    :goto_7
    iget-object v12, v1, La/crg0;->h:La/gz40;

    .line 146
    .line 147
    iget v13, v12, La/gz40;->b:F

    .line 148
    .line 149
    iget v14, v12, La/gz40;->d:F

    .line 150
    .line 151
    mul-float/2addr v8, v14

    .line 152
    add-float/2addr v8, v13

    .line 153
    iget v13, v12, La/gz40;->c:F

    .line 154
    .line 155
    iget v12, v12, La/gz40;->e:F

    .line 156
    .line 157
    mul-float/2addr v10, v12

    .line 158
    add-float/2addr v10, v13

    .line 159
    mul-float/2addr v11, v14

    .line 160
    mul-float/2addr v5, v12

    .line 161
    move/from16 v21, v11

    .line 162
    .line 163
    move v11, v5

    .line 164
    move v5, v8

    .line 165
    move v8, v10

    .line 166
    move/from16 v10, v21

    .line 167
    .line 168
    :goto_8
    cmpl-float v12, v10, v9

    .line 169
    .line 170
    if-eqz v12, :cond_1c

    .line 171
    .line 172
    cmpl-float v12, v11, v9

    .line 173
    .line 174
    if-nez v12, :cond_b

    .line 175
    .line 176
    goto/16 :goto_13

    .line 177
    .line 178
    :cond_b
    iget-object v12, v4, La/hrg0;->n:La/bub0;

    .line 179
    .line 180
    if-eqz v12, :cond_c

    .line 181
    .line 182
    goto :goto_9

    .line 183
    :cond_c
    sget-object v12, La/bub0;->d:La/bub0;

    .line 184
    .line 185
    :goto_9
    invoke-virtual {v0}, La/esg0;->D0()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v3, v2}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 189
    .line 190
    .line 191
    new-instance v2, La/csg0;

    .line 192
    .line 193
    invoke-direct {v2}, La/csg0;-><init>()V

    .line 194
    .line 195
    .line 196
    invoke-static {}, La/xqg0;->a()La/xqg0;

    .line 197
    .line 198
    .line 199
    move-result-object v13

    .line 200
    invoke-virtual {v0, v2, v13}, La/esg0;->G0(La/csg0;La/xqg0;)V

    .line 201
    .line 202
    .line 203
    iget-object v13, v2, La/csg0;->a:La/xqg0;

    .line 204
    .line 205
    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 206
    .line 207
    iput-object v14, v13, La/xqg0;->o:Ljava/lang/Boolean;

    .line 208
    .line 209
    invoke-virtual {v0, v4, v2}, La/esg0;->N(La/frg0;La/csg0;)V

    .line 210
    .line 211
    .line 212
    iput-object v2, v0, La/esg0;->c:Ljava/lang/Object;

    .line 213
    .line 214
    iget-object v2, v1, La/crg0;->h:La/gz40;

    .line 215
    .line 216
    iget-object v13, v4, La/rqg0;->r:Landroid/graphics/Matrix;

    .line 217
    .line 218
    if-eqz v13, :cond_12

    .line 219
    .line 220
    invoke-virtual {v3, v13}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 221
    .line 222
    .line 223
    new-instance v13, Landroid/graphics/Matrix;

    .line 224
    .line 225
    invoke-direct {v13}, Landroid/graphics/Matrix;-><init>()V

    .line 226
    .line 227
    .line 228
    iget-object v14, v4, La/rqg0;->r:Landroid/graphics/Matrix;

    .line 229
    .line 230
    invoke-virtual {v14, v13}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 231
    .line 232
    .line 233
    move-result v14

    .line 234
    if-eqz v14, :cond_12

    .line 235
    .line 236
    iget-object v2, v1, La/crg0;->h:La/gz40;

    .line 237
    .line 238
    iget v14, v2, La/gz40;->b:F

    .line 239
    .line 240
    iget v15, v2, La/gz40;->c:F

    .line 241
    .line 242
    invoke-virtual {v2}, La/gz40;->c()F

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    const/16 v16, 0x1

    .line 247
    .line 248
    iget-object v6, v1, La/crg0;->h:La/gz40;

    .line 249
    .line 250
    const/16 v17, 0x0

    .line 251
    .line 252
    iget v7, v6, La/gz40;->c:F

    .line 253
    .line 254
    invoke-virtual {v6}, La/gz40;->c()F

    .line 255
    .line 256
    .line 257
    move-result v6

    .line 258
    iget-object v9, v1, La/crg0;->h:La/gz40;

    .line 259
    .line 260
    invoke-virtual {v9}, La/gz40;->d()F

    .line 261
    .line 262
    .line 263
    move-result v9

    .line 264
    move/from16 p2, v2

    .line 265
    .line 266
    iget-object v2, v1, La/crg0;->h:La/gz40;

    .line 267
    .line 268
    move/from16 v19, v5

    .line 269
    .line 270
    iget v5, v2, La/gz40;->b:F

    .line 271
    .line 272
    invoke-virtual {v2}, La/gz40;->d()F

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    move/from16 v20, v2

    .line 277
    .line 278
    const/16 v2, 0x8

    .line 279
    .line 280
    new-array v2, v2, [F

    .line 281
    .line 282
    aput v14, v2, v17

    .line 283
    .line 284
    aput v15, v2, v16

    .line 285
    .line 286
    const/4 v14, 0x2

    .line 287
    aput p2, v2, v14

    .line 288
    .line 289
    const/4 v15, 0x3

    .line 290
    aput v7, v2, v15

    .line 291
    .line 292
    const/4 v7, 0x4

    .line 293
    aput v6, v2, v7

    .line 294
    .line 295
    const/4 v6, 0x5

    .line 296
    aput v9, v2, v6

    .line 297
    .line 298
    const/4 v6, 0x6

    .line 299
    aput v5, v2, v6

    .line 300
    .line 301
    const/4 v5, 0x7

    .line 302
    aput v20, v2, v5

    .line 303
    .line 304
    invoke-virtual {v13, v2}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 305
    .line 306
    .line 307
    new-instance v5, Landroid/graphics/RectF;

    .line 308
    .line 309
    aget v7, v2, v17

    .line 310
    .line 311
    aget v9, v2, v16

    .line 312
    .line 313
    invoke-direct {v5, v7, v9, v7, v9}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 314
    .line 315
    .line 316
    :goto_a
    if-gt v14, v6, :cond_11

    .line 317
    .line 318
    aget v7, v2, v14

    .line 319
    .line 320
    iget v9, v5, Landroid/graphics/RectF;->left:F

    .line 321
    .line 322
    cmpg-float v9, v7, v9

    .line 323
    .line 324
    if-gez v9, :cond_d

    .line 325
    .line 326
    iput v7, v5, Landroid/graphics/RectF;->left:F

    .line 327
    .line 328
    :cond_d
    iget v9, v5, Landroid/graphics/RectF;->right:F

    .line 329
    .line 330
    cmpl-float v9, v7, v9

    .line 331
    .line 332
    if-lez v9, :cond_e

    .line 333
    .line 334
    iput v7, v5, Landroid/graphics/RectF;->right:F

    .line 335
    .line 336
    :cond_e
    add-int/lit8 v7, v14, 0x1

    .line 337
    .line 338
    aget v7, v2, v7

    .line 339
    .line 340
    iget v9, v5, Landroid/graphics/RectF;->top:F

    .line 341
    .line 342
    cmpg-float v9, v7, v9

    .line 343
    .line 344
    if-gez v9, :cond_f

    .line 345
    .line 346
    iput v7, v5, Landroid/graphics/RectF;->top:F

    .line 347
    .line 348
    :cond_f
    iget v9, v5, Landroid/graphics/RectF;->bottom:F

    .line 349
    .line 350
    cmpl-float v9, v7, v9

    .line 351
    .line 352
    if-lez v9, :cond_10

    .line 353
    .line 354
    iput v7, v5, Landroid/graphics/RectF;->bottom:F

    .line 355
    .line 356
    :cond_10
    add-int/lit8 v14, v14, 0x2

    .line 357
    .line 358
    goto :goto_a

    .line 359
    :cond_11
    new-instance v2, La/gz40;

    .line 360
    .line 361
    iget v6, v5, Landroid/graphics/RectF;->left:F

    .line 362
    .line 363
    iget v7, v5, Landroid/graphics/RectF;->top:F

    .line 364
    .line 365
    iget v9, v5, Landroid/graphics/RectF;->right:F

    .line 366
    .line 367
    sub-float/2addr v9, v6

    .line 368
    iget v5, v5, Landroid/graphics/RectF;->bottom:F

    .line 369
    .line 370
    sub-float/2addr v5, v7

    .line 371
    invoke-direct {v2, v6, v7, v9, v5}, La/gz40;-><init>(FFFF)V

    .line 372
    .line 373
    .line 374
    goto :goto_b

    .line 375
    :cond_12
    move/from16 v19, v5

    .line 376
    .line 377
    const/16 v16, 0x1

    .line 378
    .line 379
    const/16 v17, 0x0

    .line 380
    .line 381
    :goto_b
    iget v5, v2, La/gz40;->b:F

    .line 382
    .line 383
    sub-float v5, v5, v19

    .line 384
    .line 385
    div-float/2addr v5, v10

    .line 386
    float-to-double v5, v5

    .line 387
    invoke-static {v5, v6}, Ljava/lang/Math;->floor(D)D

    .line 388
    .line 389
    .line 390
    move-result-wide v5

    .line 391
    double-to-float v5, v5

    .line 392
    mul-float/2addr v5, v10

    .line 393
    add-float v5, v5, v19

    .line 394
    .line 395
    iget v6, v2, La/gz40;->c:F

    .line 396
    .line 397
    sub-float/2addr v6, v8

    .line 398
    div-float/2addr v6, v11

    .line 399
    float-to-double v6, v6

    .line 400
    invoke-static {v6, v7}, Ljava/lang/Math;->floor(D)D

    .line 401
    .line 402
    .line 403
    move-result-wide v6

    .line 404
    double-to-float v6, v6

    .line 405
    mul-float/2addr v6, v11

    .line 406
    add-float/2addr v6, v8

    .line 407
    invoke-virtual {v2}, La/gz40;->c()F

    .line 408
    .line 409
    .line 410
    move-result v7

    .line 411
    invoke-virtual {v2}, La/gz40;->d()F

    .line 412
    .line 413
    .line 414
    move-result v2

    .line 415
    new-instance v8, La/gz40;

    .line 416
    .line 417
    const/4 v9, 0x0

    .line 418
    invoke-direct {v8, v9, v9, v10, v11}, La/gz40;-><init>(FFFF)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v0}, La/esg0;->q0()Z

    .line 422
    .line 423
    .line 424
    move-result v9

    .line 425
    :goto_c
    cmpg-float v13, v6, v2

    .line 426
    .line 427
    if-gez v13, :cond_1a

    .line 428
    .line 429
    move v13, v5

    .line 430
    :goto_d
    cmpg-float v14, v13, v7

    .line 431
    .line 432
    if-gez v14, :cond_19

    .line 433
    .line 434
    iput v13, v8, La/gz40;->b:F

    .line 435
    .line 436
    iput v6, v8, La/gz40;->c:F

    .line 437
    .line 438
    invoke-virtual {v0}, La/esg0;->D0()V

    .line 439
    .line 440
    .line 441
    iget-object v14, v0, La/esg0;->c:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v14, La/csg0;

    .line 444
    .line 445
    iget-object v14, v14, La/csg0;->a:La/xqg0;

    .line 446
    .line 447
    iget-object v14, v14, La/xqg0;->o:Ljava/lang/Boolean;

    .line 448
    .line 449
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 450
    .line 451
    .line 452
    move-result v14

    .line 453
    if-nez v14, :cond_13

    .line 454
    .line 455
    iget v14, v8, La/gz40;->b:F

    .line 456
    .line 457
    iget v15, v8, La/gz40;->c:F

    .line 458
    .line 459
    move/from16 p2, v2

    .line 460
    .line 461
    iget v2, v8, La/gz40;->d:F

    .line 462
    .line 463
    move/from16 v18, v5

    .line 464
    .line 465
    iget v5, v8, La/gz40;->e:F

    .line 466
    .line 467
    invoke-virtual {v0, v14, v15, v2, v5}, La/esg0;->z0(FFFF)V

    .line 468
    .line 469
    .line 470
    goto :goto_e

    .line 471
    :cond_13
    move/from16 p2, v2

    .line 472
    .line 473
    move/from16 v18, v5

    .line 474
    .line 475
    :goto_e
    iget-object v2, v4, La/jrg0;->o:La/gz40;

    .line 476
    .line 477
    if-eqz v2, :cond_14

    .line 478
    .line 479
    invoke-static {v8, v2, v12}, La/esg0;->t(La/gz40;La/gz40;La/bub0;)Landroid/graphics/Matrix;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    invoke-virtual {v3, v2}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 484
    .line 485
    .line 486
    goto :goto_11

    .line 487
    :cond_14
    iget-object v2, v4, La/rqg0;->q:Ljava/lang/Boolean;

    .line 488
    .line 489
    if-eqz v2, :cond_16

    .line 490
    .line 491
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 492
    .line 493
    .line 494
    move-result v2

    .line 495
    if-eqz v2, :cond_15

    .line 496
    .line 497
    goto :goto_f

    .line 498
    :cond_15
    move/from16 v2, v17

    .line 499
    .line 500
    goto :goto_10

    .line 501
    :cond_16
    :goto_f
    move/from16 v2, v16

    .line 502
    .line 503
    :goto_10
    invoke-virtual {v3, v13, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 504
    .line 505
    .line 506
    if-nez v2, :cond_17

    .line 507
    .line 508
    iget-object v2, v1, La/crg0;->h:La/gz40;

    .line 509
    .line 510
    iget v5, v2, La/gz40;->d:F

    .line 511
    .line 512
    iget v2, v2, La/gz40;->e:F

    .line 513
    .line 514
    invoke-virtual {v3, v5, v2}, Landroid/graphics/Canvas;->scale(FF)V

    .line 515
    .line 516
    .line 517
    :cond_17
    :goto_11
    iget-object v2, v4, La/arg0;->i:Ljava/util/ArrayList;

    .line 518
    .line 519
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 520
    .line 521
    .line 522
    move-result-object v2

    .line 523
    :goto_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 524
    .line 525
    .line 526
    move-result v5

    .line 527
    if-eqz v5, :cond_18

    .line 528
    .line 529
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v5

    .line 533
    check-cast v5, La/frg0;

    .line 534
    .line 535
    invoke-virtual {v0, v5}, La/esg0;->s0(La/frg0;)V

    .line 536
    .line 537
    .line 538
    goto :goto_12

    .line 539
    :cond_18
    invoke-virtual {v0}, La/esg0;->C0()V

    .line 540
    .line 541
    .line 542
    add-float/2addr v13, v10

    .line 543
    move/from16 v2, p2

    .line 544
    .line 545
    move/from16 v5, v18

    .line 546
    .line 547
    goto :goto_d

    .line 548
    :cond_19
    move/from16 p2, v2

    .line 549
    .line 550
    move/from16 v18, v5

    .line 551
    .line 552
    add-float/2addr v6, v11

    .line 553
    goto/16 :goto_c

    .line 554
    .line 555
    :cond_1a
    if-eqz v9, :cond_1b

    .line 556
    .line 557
    iget-object v1, v4, La/crg0;->h:La/gz40;

    .line 558
    .line 559
    invoke-virtual {v0, v1}, La/esg0;->p0(La/gz40;)V

    .line 560
    .line 561
    .line 562
    :cond_1b
    invoke-virtual {v0}, La/esg0;->C0()V

    .line 563
    .line 564
    .line 565
    :cond_1c
    :goto_13
    return-void

    .line 566
    :cond_1d
    iget-object v0, v0, La/esg0;->c:Ljava/lang/Object;

    .line 567
    .line 568
    check-cast v0, La/csg0;

    .line 569
    .line 570
    iget-object v0, v0, La/csg0;->d:Landroid/graphics/Paint;

    .line 571
    .line 572
    invoke-virtual {v3, v2, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 573
    .line 574
    .line 575
    return-void
.end method

.method public C(Landroid/graphics/Path;)V
    .locals 5

    .line 1
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/csg0;

    .line 4
    .line 5
    iget-object v1, v0, La/csg0;->a:La/xqg0;

    .line 6
    .line 7
    iget v1, v1, La/xqg0;->m1:I

    .line 8
    .line 9
    iget-object v2, p0, La/esg0;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Landroid/graphics/Canvas;

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    if-ne v1, v3, :cond_2

    .line 15
    .line 16
    invoke-virtual {v2}, Landroid/graphics/Canvas;->getMatrix()Landroid/graphics/Matrix;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Landroid/graphics/Path;

    .line 21
    .line 22
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;Landroid/graphics/Path;)V

    .line 26
    .line 27
    .line 28
    new-instance p1, Landroid/graphics/Matrix;

    .line 29
    .line 30
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, p1}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, La/esg0;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, La/csg0;

    .line 39
    .line 40
    iget-object p1, p1, La/csg0;->e:Landroid/graphics/Paint;

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance v3, Landroid/graphics/Matrix;

    .line 47
    .line 48
    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 49
    .line 50
    .line 51
    if-eqz p1, :cond_0

    .line 52
    .line 53
    invoke-virtual {p1, v3}, Landroid/graphics/Shader;->getLocalMatrix(Landroid/graphics/Matrix;)Z

    .line 54
    .line 55
    .line 56
    new-instance v4, Landroid/graphics/Matrix;

    .line 57
    .line 58
    invoke-direct {v4, v3}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v4}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 65
    .line 66
    .line 67
    :cond_0
    iget-object p0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p0, La/csg0;

    .line 70
    .line 71
    iget-object p0, p0, La/csg0;->e:Landroid/graphics/Paint;

    .line 72
    .line 73
    invoke-virtual {v2, v1, p0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v0}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    .line 77
    .line 78
    .line 79
    if-eqz p1, :cond_1

    .line 80
    .line 81
    invoke-virtual {p1, v3}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 82
    .line 83
    .line 84
    :cond_1
    return-void

    .line 85
    :cond_2
    iget-object p0, v0, La/csg0;->e:Landroid/graphics/Paint;

    .line 86
    .line 87
    invoke-virtual {v2, p1, p0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public C0()V
    .locals 1

    .line 1
    iget-object v0, p0, La/esg0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Canvas;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/esg0;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/util/Stack;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, La/csg0;

    .line 17
    .line 18
    iput-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 19
    .line 20
    return-void
.end method

.method public D(La/qrg0;La/x2x;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, La/esg0;->A()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_c

    .line 8
    .line 9
    :cond_0
    iget-object p1, p1, La/arg0;->i:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 v0, 0x1

    .line 16
    move v1, v0

    .line 17
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1d

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, La/frg0;

    .line 28
    .line 29
    instance-of v3, v2, La/trg0;

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    check-cast v2, La/trg0;

    .line 35
    .line 36
    iget-object v2, v2, La/trg0;->c:Ljava/lang/String;

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    xor-int/2addr v3, v0

    .line 43
    invoke-virtual {p0, v2, v1, v3}, La/esg0;->E0(Ljava/lang/String;ZZ)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {p2, v1}, La/x2x;->k0(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_b

    .line 51
    .line 52
    :cond_1
    move-object v1, v2

    .line 53
    check-cast v1, La/qrg0;

    .line 54
    .line 55
    invoke-virtual {p2, v1}, La/x2x;->Q(La/qrg0;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_2

    .line 60
    .line 61
    goto/16 :goto_b

    .line 62
    .line 63
    :cond_2
    instance-of v1, v2, La/rrg0;

    .line 64
    .line 65
    const/high16 v3, 0x40000000    # 2.0f

    .line 66
    .line 67
    const/4 v5, 0x2

    .line 68
    const/4 v6, 0x0

    .line 69
    if-eqz v1, :cond_b

    .line 70
    .line 71
    invoke-virtual {p0}, La/esg0;->D0()V

    .line 72
    .line 73
    .line 74
    check-cast v2, La/rrg0;

    .line 75
    .line 76
    iget-object v1, p0, La/esg0;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, La/csg0;

    .line 79
    .line 80
    invoke-virtual {p0, v1, v2}, La/esg0;->H0(La/csg0;La/drg0;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, La/esg0;->A()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_3

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    invoke-virtual {p0}, La/esg0;->J0()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-nez v1, :cond_4

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_4
    iget-object v1, v2, La/frg0;->a:La/cyu;

    .line 98
    .line 99
    iget-object v7, v2, La/rrg0;->n:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {v1, v7}, La/cyu;->L(Ljava/lang/String;)La/drg0;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    if-nez v1, :cond_5

    .line 106
    .line 107
    iget-object v1, v2, La/rrg0;->n:Ljava/lang/String;

    .line 108
    .line 109
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    const-string v2, "TextPath reference \'%s\' not found"

    .line 114
    .line 115
    invoke-static {v2, v1}, La/esg0;->E(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_5
    check-cast v1, La/pqg0;

    .line 120
    .line 121
    new-instance v7, La/yrg0;

    .line 122
    .line 123
    iget-object v8, v1, La/pqg0;->o:La/tyc;

    .line 124
    .line 125
    invoke-direct {v7, v8}, La/yrg0;-><init>(La/tyc;)V

    .line 126
    .line 127
    .line 128
    iget-object v1, v1, La/fqg0;->n:Landroid/graphics/Matrix;

    .line 129
    .line 130
    iget-object v7, v7, La/yrg0;->a:Landroid/graphics/Path;

    .line 131
    .line 132
    if-eqz v1, :cond_6

    .line 133
    .line 134
    invoke-virtual {v7, v1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 135
    .line 136
    .line 137
    :cond_6
    new-instance v1, Landroid/graphics/PathMeasure;

    .line 138
    .line 139
    invoke-direct {v1, v7, v4}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V

    .line 140
    .line 141
    .line 142
    iget-object v8, v2, La/rrg0;->o:La/jqg0;

    .line 143
    .line 144
    if-eqz v8, :cond_7

    .line 145
    .line 146
    invoke-virtual {v1}, Landroid/graphics/PathMeasure;->getLength()F

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    invoke-virtual {v8, p0, v1}, La/jqg0;->c(La/esg0;F)F

    .line 151
    .line 152
    .line 153
    move-result v6

    .line 154
    :cond_7
    invoke-virtual {p0}, La/esg0;->P()I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-eq v1, v0, :cond_9

    .line 159
    .line 160
    invoke-virtual {p0, v2}, La/esg0;->s(La/qrg0;)F

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    if-ne v1, v5, :cond_8

    .line 165
    .line 166
    div-float/2addr v8, v3

    .line 167
    :cond_8
    sub-float/2addr v6, v8

    .line 168
    :cond_9
    iget-object v1, v2, La/rrg0;->p:La/org0;

    .line 169
    .line 170
    invoke-virtual {p0, v1}, La/esg0;->v(La/crg0;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, La/esg0;->q0()Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    new-instance v3, La/zrg0;

    .line 178
    .line 179
    invoke-direct {v3, p0, v7, v6}, La/zrg0;-><init>(La/esg0;Landroid/graphics/Path;F)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0, v2, v3}, La/esg0;->D(La/qrg0;La/x2x;)V

    .line 183
    .line 184
    .line 185
    if-eqz v1, :cond_a

    .line 186
    .line 187
    iget-object v1, v2, La/crg0;->h:La/gz40;

    .line 188
    .line 189
    invoke-virtual {p0, v1}, La/esg0;->p0(La/gz40;)V

    .line 190
    .line 191
    .line 192
    :cond_a
    :goto_1
    invoke-virtual {p0}, La/esg0;->C0()V

    .line 193
    .line 194
    .line 195
    goto/16 :goto_b

    .line 196
    .line 197
    :cond_b
    instance-of v1, v2, La/nrg0;

    .line 198
    .line 199
    if-eqz v1, :cond_19

    .line 200
    .line 201
    invoke-virtual {p0}, La/esg0;->D0()V

    .line 202
    .line 203
    .line 204
    check-cast v2, La/nrg0;

    .line 205
    .line 206
    iget-object v1, p0, La/esg0;->c:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v1, La/csg0;

    .line 209
    .line 210
    invoke-virtual {p0, v1, v2}, La/esg0;->H0(La/csg0;La/drg0;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0}, La/esg0;->A()Z

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    if-eqz v1, :cond_18

    .line 218
    .line 219
    iget-object v1, v2, La/srg0;->n:Ljava/util/ArrayList;

    .line 220
    .line 221
    if-eqz v1, :cond_c

    .line 222
    .line 223
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    if-lez v1, :cond_c

    .line 228
    .line 229
    move v1, v0

    .line 230
    goto :goto_2

    .line 231
    :cond_c
    move v1, v4

    .line 232
    :goto_2
    instance-of v7, p2, La/asg0;

    .line 233
    .line 234
    if-eqz v7, :cond_14

    .line 235
    .line 236
    if-nez v1, :cond_d

    .line 237
    .line 238
    move-object v8, p2

    .line 239
    check-cast v8, La/asg0;

    .line 240
    .line 241
    iget v8, v8, La/asg0;->b:F

    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_d
    iget-object v8, v2, La/srg0;->n:Ljava/util/ArrayList;

    .line 245
    .line 246
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v8

    .line 250
    check-cast v8, La/jqg0;

    .line 251
    .line 252
    invoke-virtual {v8, p0}, La/jqg0;->d(La/esg0;)F

    .line 253
    .line 254
    .line 255
    move-result v8

    .line 256
    :goto_3
    iget-object v9, v2, La/srg0;->o:Ljava/util/ArrayList;

    .line 257
    .line 258
    if-eqz v9, :cond_f

    .line 259
    .line 260
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 261
    .line 262
    .line 263
    move-result v9

    .line 264
    if-nez v9, :cond_e

    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_e
    iget-object v9, v2, La/srg0;->o:Ljava/util/ArrayList;

    .line 268
    .line 269
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v9

    .line 273
    check-cast v9, La/jqg0;

    .line 274
    .line 275
    invoke-virtual {v9, p0}, La/jqg0;->e(La/esg0;)F

    .line 276
    .line 277
    .line 278
    move-result v9

    .line 279
    goto :goto_5

    .line 280
    :cond_f
    :goto_4
    move-object v9, p2

    .line 281
    check-cast v9, La/asg0;

    .line 282
    .line 283
    iget v9, v9, La/asg0;->c:F

    .line 284
    .line 285
    :goto_5
    iget-object v10, v2, La/srg0;->p:Ljava/util/ArrayList;

    .line 286
    .line 287
    if-eqz v10, :cond_11

    .line 288
    .line 289
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 290
    .line 291
    .line 292
    move-result v10

    .line 293
    if-nez v10, :cond_10

    .line 294
    .line 295
    goto :goto_6

    .line 296
    :cond_10
    iget-object v10, v2, La/srg0;->p:Ljava/util/ArrayList;

    .line 297
    .line 298
    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v10

    .line 302
    check-cast v10, La/jqg0;

    .line 303
    .line 304
    invoke-virtual {v10, p0}, La/jqg0;->d(La/esg0;)F

    .line 305
    .line 306
    .line 307
    move-result v10

    .line 308
    goto :goto_7

    .line 309
    :cond_11
    :goto_6
    move v10, v6

    .line 310
    :goto_7
    iget-object v11, v2, La/srg0;->q:Ljava/util/ArrayList;

    .line 311
    .line 312
    if-eqz v11, :cond_13

    .line 313
    .line 314
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 315
    .line 316
    .line 317
    move-result v11

    .line 318
    if-nez v11, :cond_12

    .line 319
    .line 320
    goto :goto_8

    .line 321
    :cond_12
    iget-object v6, v2, La/srg0;->q:Ljava/util/ArrayList;

    .line 322
    .line 323
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v6

    .line 327
    check-cast v6, La/jqg0;

    .line 328
    .line 329
    invoke-virtual {v6, p0}, La/jqg0;->e(La/esg0;)F

    .line 330
    .line 331
    .line 332
    move-result v6

    .line 333
    :cond_13
    :goto_8
    move v12, v8

    .line 334
    move v8, v6

    .line 335
    move v6, v12

    .line 336
    goto :goto_9

    .line 337
    :cond_14
    move v8, v6

    .line 338
    move v9, v8

    .line 339
    move v10, v9

    .line 340
    :goto_9
    if-eqz v1, :cond_16

    .line 341
    .line 342
    invoke-virtual {p0}, La/esg0;->P()I

    .line 343
    .line 344
    .line 345
    move-result v1

    .line 346
    if-eq v1, v0, :cond_16

    .line 347
    .line 348
    invoke-virtual {p0, v2}, La/esg0;->s(La/qrg0;)F

    .line 349
    .line 350
    .line 351
    move-result v11

    .line 352
    if-ne v1, v5, :cond_15

    .line 353
    .line 354
    div-float/2addr v11, v3

    .line 355
    :cond_15
    sub-float/2addr v6, v11

    .line 356
    :cond_16
    iget-object v1, v2, La/nrg0;->r:La/org0;

    .line 357
    .line 358
    invoke-virtual {p0, v1}, La/esg0;->v(La/crg0;)V

    .line 359
    .line 360
    .line 361
    if-eqz v7, :cond_17

    .line 362
    .line 363
    move-object v1, p2

    .line 364
    check-cast v1, La/asg0;

    .line 365
    .line 366
    add-float/2addr v6, v10

    .line 367
    iput v6, v1, La/asg0;->b:F

    .line 368
    .line 369
    add-float/2addr v9, v8

    .line 370
    iput v9, v1, La/asg0;->c:F

    .line 371
    .line 372
    :cond_17
    invoke-virtual {p0}, La/esg0;->q0()Z

    .line 373
    .line 374
    .line 375
    move-result v1

    .line 376
    invoke-virtual {p0, v2, p2}, La/esg0;->D(La/qrg0;La/x2x;)V

    .line 377
    .line 378
    .line 379
    if-eqz v1, :cond_18

    .line 380
    .line 381
    iget-object v1, v2, La/crg0;->h:La/gz40;

    .line 382
    .line 383
    invoke-virtual {p0, v1}, La/esg0;->p0(La/gz40;)V

    .line 384
    .line 385
    .line 386
    :cond_18
    invoke-virtual {p0}, La/esg0;->C0()V

    .line 387
    .line 388
    .line 389
    goto :goto_b

    .line 390
    :cond_19
    instance-of v1, v2, La/mrg0;

    .line 391
    .line 392
    if-eqz v1, :cond_1c

    .line 393
    .line 394
    invoke-virtual {p0}, La/esg0;->D0()V

    .line 395
    .line 396
    .line 397
    move-object v1, v2

    .line 398
    check-cast v1, La/mrg0;

    .line 399
    .line 400
    iget-object v3, p0, La/esg0;->c:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v3, La/csg0;

    .line 403
    .line 404
    invoke-virtual {p0, v3, v1}, La/esg0;->H0(La/csg0;La/drg0;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {p0}, La/esg0;->A()Z

    .line 408
    .line 409
    .line 410
    move-result v3

    .line 411
    if-eqz v3, :cond_1b

    .line 412
    .line 413
    iget-object v3, v1, La/mrg0;->o:La/org0;

    .line 414
    .line 415
    invoke-virtual {p0, v3}, La/esg0;->v(La/crg0;)V

    .line 416
    .line 417
    .line 418
    iget-object v2, v2, La/frg0;->a:La/cyu;

    .line 419
    .line 420
    iget-object v3, v1, La/mrg0;->n:Ljava/lang/String;

    .line 421
    .line 422
    invoke-virtual {v2, v3}, La/cyu;->L(Ljava/lang/String;)La/drg0;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    if-eqz v2, :cond_1a

    .line 427
    .line 428
    instance-of v3, v2, La/qrg0;

    .line 429
    .line 430
    if-eqz v3, :cond_1a

    .line 431
    .line 432
    new-instance v1, Ljava/lang/StringBuilder;

    .line 433
    .line 434
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 435
    .line 436
    .line 437
    check-cast v2, La/qrg0;

    .line 438
    .line 439
    invoke-virtual {p0, v2, v1}, La/esg0;->F(La/qrg0;Ljava/lang/StringBuilder;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 443
    .line 444
    .line 445
    move-result v2

    .line 446
    if-lez v2, :cond_1b

    .line 447
    .line 448
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    invoke-virtual {p2, v1}, La/x2x;->k0(Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    goto :goto_a

    .line 456
    :cond_1a
    iget-object v1, v1, La/mrg0;->n:Ljava/lang/String;

    .line 457
    .line 458
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    const-string v2, "Tref reference \'%s\' not found"

    .line 463
    .line 464
    invoke-static {v2, v1}, La/esg0;->E(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    :cond_1b
    :goto_a
    invoke-virtual {p0}, La/esg0;->C0()V

    .line 468
    .line 469
    .line 470
    :cond_1c
    :goto_b
    move v1, v4

    .line 471
    goto/16 :goto_0

    .line 472
    .line 473
    :cond_1d
    :goto_c
    return-void
.end method

.method public D0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/esg0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Canvas;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/esg0;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/util/Stack;

    .line 11
    .line 12
    iget-object v1, p0, La/esg0;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, La/csg0;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    new-instance v0, La/csg0;

    .line 20
    .line 21
    iget-object v1, p0, La/esg0;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, La/csg0;

    .line 24
    .line 25
    invoke-direct {v0, v1}, La/csg0;-><init>(La/csg0;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 29
    .line 30
    return-void
.end method

.method public E0(Ljava/lang/String;ZZ)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/csg0;

    .line 4
    .line 5
    iget-boolean p0, p0, La/csg0;->h:Z

    .line 6
    .line 7
    const-string v0, " "

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const-string p0, "[\\n\\t]"

    .line 12
    .line 13
    invoke-virtual {p1, p0, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    const-string p0, "\\n"

    .line 19
    .line 20
    const-string v1, ""

    .line 21
    .line 22
    invoke-virtual {p1, p0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string p1, "\\t"

    .line 27
    .line 28
    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    if-eqz p2, :cond_1

    .line 33
    .line 34
    const-string p1, "^\\s+"

    .line 35
    .line 36
    invoke-virtual {p0, p1, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    :cond_1
    if-eqz p3, :cond_2

    .line 41
    .line 42
    const-string p1, "\\s+$"

    .line 43
    .line 44
    invoke-virtual {p0, p1, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    :cond_2
    const-string p1, "\\s{2,}"

    .line 49
    .line 50
    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method

.method public F(La/qrg0;Ljava/lang/StringBuilder;)V
    .locals 4

    .line 1
    iget-object p1, p1, La/arg0;->i:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x1

    .line 8
    move v1, v0

    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, La/frg0;

    .line 20
    .line 21
    instance-of v3, v2, La/qrg0;

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    check-cast v2, La/qrg0;

    .line 26
    .line 27
    invoke-virtual {p0, v2, p2}, La/esg0;->F(La/qrg0;Ljava/lang/StringBuilder;)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    instance-of v3, v2, La/trg0;

    .line 32
    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    check-cast v2, La/trg0;

    .line 36
    .line 37
    iget-object v2, v2, La/trg0;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    xor-int/2addr v3, v0

    .line 44
    invoke-virtual {p0, v2, v1, v3}, La/esg0;->E0(Ljava/lang/String;ZZ)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    :cond_1
    :goto_1
    const/4 v1, 0x0

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    return-void
.end method

.method public F0(La/crg0;)V
    .locals 10

    .line 1
    iget-object v0, p1, La/frg0;->b:La/brg0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_1

    .line 6
    .line 7
    :cond_0
    iget-object v0, p1, La/crg0;->h:La/gz40;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    goto/16 :goto_1

    .line 12
    .line 13
    :cond_1
    new-instance v0, Landroid/graphics/Matrix;

    .line 14
    .line 15
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/esg0;->f:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ljava/util/Stack;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Landroid/graphics/Matrix;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_b

    .line 33
    .line 34
    iget-object v1, p1, La/crg0;->h:La/gz40;

    .line 35
    .line 36
    iget v2, v1, La/gz40;->b:F

    .line 37
    .line 38
    iget v3, v1, La/gz40;->c:F

    .line 39
    .line 40
    invoke-virtual {v1}, La/gz40;->c()F

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    iget-object v4, p1, La/crg0;->h:La/gz40;

    .line 45
    .line 46
    iget v5, v4, La/gz40;->c:F

    .line 47
    .line 48
    invoke-virtual {v4}, La/gz40;->c()F

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    iget-object v6, p1, La/crg0;->h:La/gz40;

    .line 53
    .line 54
    invoke-virtual {v6}, La/gz40;->d()F

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    iget-object p1, p1, La/crg0;->h:La/gz40;

    .line 59
    .line 60
    iget v7, p1, La/gz40;->b:F

    .line 61
    .line 62
    invoke-virtual {p1}, La/gz40;->d()F

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    const/16 v8, 0x8

    .line 67
    .line 68
    new-array v8, v8, [F

    .line 69
    .line 70
    const/4 v9, 0x0

    .line 71
    aput v2, v8, v9

    .line 72
    .line 73
    const/4 v2, 0x1

    .line 74
    aput v3, v8, v2

    .line 75
    .line 76
    const/4 v3, 0x2

    .line 77
    aput v1, v8, v3

    .line 78
    .line 79
    const/4 v1, 0x3

    .line 80
    aput v5, v8, v1

    .line 81
    .line 82
    const/4 v1, 0x4

    .line 83
    aput v4, v8, v1

    .line 84
    .line 85
    const/4 v1, 0x5

    .line 86
    aput v6, v8, v1

    .line 87
    .line 88
    const/4 v1, 0x6

    .line 89
    aput v7, v8, v1

    .line 90
    .line 91
    const/4 v4, 0x7

    .line 92
    aput p1, v8, v4

    .line 93
    .line 94
    iget-object p1, p0, La/esg0;->a:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p1, Landroid/graphics/Canvas;

    .line 97
    .line 98
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getMatrix()Landroid/graphics/Matrix;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v8}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 106
    .line 107
    .line 108
    new-instance p1, Landroid/graphics/RectF;

    .line 109
    .line 110
    aget v0, v8, v9

    .line 111
    .line 112
    aget v2, v8, v2

    .line 113
    .line 114
    invoke-direct {p1, v0, v2, v0, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 115
    .line 116
    .line 117
    :goto_0
    if-gt v3, v1, :cond_6

    .line 118
    .line 119
    aget v0, v8, v3

    .line 120
    .line 121
    iget v2, p1, Landroid/graphics/RectF;->left:F

    .line 122
    .line 123
    cmpg-float v2, v0, v2

    .line 124
    .line 125
    if-gez v2, :cond_2

    .line 126
    .line 127
    iput v0, p1, Landroid/graphics/RectF;->left:F

    .line 128
    .line 129
    :cond_2
    iget v2, p1, Landroid/graphics/RectF;->right:F

    .line 130
    .line 131
    cmpl-float v2, v0, v2

    .line 132
    .line 133
    if-lez v2, :cond_3

    .line 134
    .line 135
    iput v0, p1, Landroid/graphics/RectF;->right:F

    .line 136
    .line 137
    :cond_3
    add-int/lit8 v0, v3, 0x1

    .line 138
    .line 139
    aget v0, v8, v0

    .line 140
    .line 141
    iget v2, p1, Landroid/graphics/RectF;->top:F

    .line 142
    .line 143
    cmpg-float v2, v0, v2

    .line 144
    .line 145
    if-gez v2, :cond_4

    .line 146
    .line 147
    iput v0, p1, Landroid/graphics/RectF;->top:F

    .line 148
    .line 149
    :cond_4
    iget v2, p1, Landroid/graphics/RectF;->bottom:F

    .line 150
    .line 151
    cmpl-float v2, v0, v2

    .line 152
    .line 153
    if-lez v2, :cond_5

    .line 154
    .line 155
    iput v0, p1, Landroid/graphics/RectF;->bottom:F

    .line 156
    .line 157
    :cond_5
    add-int/lit8 v3, v3, 0x2

    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_6
    iget-object p0, p0, La/esg0;->e:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast p0, Ljava/util/Stack;

    .line 163
    .line 164
    invoke-virtual {p0}, Ljava/util/Stack;->peek()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    check-cast p0, La/crg0;

    .line 169
    .line 170
    iget-object v0, p0, La/crg0;->h:La/gz40;

    .line 171
    .line 172
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 173
    .line 174
    iget v2, p1, Landroid/graphics/RectF;->top:F

    .line 175
    .line 176
    if-nez v0, :cond_7

    .line 177
    .line 178
    iget v0, p1, Landroid/graphics/RectF;->right:F

    .line 179
    .line 180
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 181
    .line 182
    new-instance v3, La/gz40;

    .line 183
    .line 184
    sub-float/2addr v0, v1

    .line 185
    sub-float/2addr p1, v2

    .line 186
    invoke-direct {v3, v1, v2, v0, p1}, La/gz40;-><init>(FFFF)V

    .line 187
    .line 188
    .line 189
    iput-object v3, p0, La/crg0;->h:La/gz40;

    .line 190
    .line 191
    return-void

    .line 192
    :cond_7
    iget p0, p1, Landroid/graphics/RectF;->right:F

    .line 193
    .line 194
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 195
    .line 196
    sub-float/2addr p0, v1

    .line 197
    sub-float/2addr p1, v2

    .line 198
    iget v3, v0, La/gz40;->b:F

    .line 199
    .line 200
    cmpg-float v3, v1, v3

    .line 201
    .line 202
    if-gez v3, :cond_8

    .line 203
    .line 204
    iput v1, v0, La/gz40;->b:F

    .line 205
    .line 206
    :cond_8
    iget v3, v0, La/gz40;->c:F

    .line 207
    .line 208
    cmpg-float v3, v2, v3

    .line 209
    .line 210
    if-gez v3, :cond_9

    .line 211
    .line 212
    iput v2, v0, La/gz40;->c:F

    .line 213
    .line 214
    :cond_9
    add-float v3, v1, p0

    .line 215
    .line 216
    invoke-virtual {v0}, La/gz40;->c()F

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    cmpl-float v3, v3, v4

    .line 221
    .line 222
    if-lez v3, :cond_a

    .line 223
    .line 224
    add-float/2addr v1, p0

    .line 225
    iget p0, v0, La/gz40;->b:F

    .line 226
    .line 227
    sub-float/2addr v1, p0

    .line 228
    iput v1, v0, La/gz40;->d:F

    .line 229
    .line 230
    :cond_a
    add-float p0, v2, p1

    .line 231
    .line 232
    invoke-virtual {v0}, La/gz40;->d()F

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    cmpl-float p0, p0, v1

    .line 237
    .line 238
    if-lez p0, :cond_b

    .line 239
    .line 240
    add-float/2addr v2, p1

    .line 241
    iget p0, v0, La/gz40;->c:F

    .line 242
    .line 243
    sub-float/2addr v2, p0

    .line 244
    iput v2, v0, La/gz40;->e:F

    .line 245
    .line 246
    :cond_b
    :goto_1
    return-void
.end method

.method public G0(La/csg0;La/xqg0;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-wide/16 v3, 0x1000

    .line 8
    .line 9
    invoke-static {v2, v3, v4}, La/esg0;->b0(La/xqg0;J)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    iget-object v3, v1, La/csg0;->a:La/xqg0;

    .line 16
    .line 17
    iget-object v4, v2, La/xqg0;->k:La/aqg0;

    .line 18
    .line 19
    iput-object v4, v3, La/xqg0;->k:La/aqg0;

    .line 20
    .line 21
    :cond_0
    const-wide/16 v3, 0x800

    .line 22
    .line 23
    invoke-static {v2, v3, v4}, La/esg0;->b0(La/xqg0;J)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    iget-object v3, v1, La/csg0;->a:La/xqg0;

    .line 30
    .line 31
    iget-object v4, v2, La/xqg0;->j:Ljava/lang/Float;

    .line 32
    .line 33
    iput-object v4, v3, La/xqg0;->j:Ljava/lang/Float;

    .line 34
    .line 35
    :cond_1
    const-wide/16 v3, 0x1

    .line 36
    .line 37
    invoke-static {v2, v3, v4}, La/esg0;->b0(La/xqg0;J)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    sget-object v4, La/aqg0;->c:La/aqg0;

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v6, 0x1

    .line 45
    if-eqz v3, :cond_3

    .line 46
    .line 47
    iget-object v3, v1, La/csg0;->a:La/xqg0;

    .line 48
    .line 49
    iget-object v7, v2, La/xqg0;->b:La/grg0;

    .line 50
    .line 51
    iput-object v7, v3, La/xqg0;->b:La/grg0;

    .line 52
    .line 53
    iget-object v3, v2, La/xqg0;->b:La/grg0;

    .line 54
    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    if-eq v3, v4, :cond_2

    .line 58
    .line 59
    move v3, v6

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move v3, v5

    .line 62
    :goto_0
    iput-boolean v3, v1, La/csg0;->b:Z

    .line 63
    .line 64
    :cond_3
    const-wide/16 v7, 0x4

    .line 65
    .line 66
    invoke-static {v2, v7, v8}, La/esg0;->b0(La/xqg0;J)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_4

    .line 71
    .line 72
    iget-object v3, v1, La/csg0;->a:La/xqg0;

    .line 73
    .line 74
    iget-object v7, v2, La/xqg0;->c:Ljava/lang/Float;

    .line 75
    .line 76
    iput-object v7, v3, La/xqg0;->c:Ljava/lang/Float;

    .line 77
    .line 78
    :cond_4
    const-wide/16 v7, 0x1805

    .line 79
    .line 80
    invoke-static {v2, v7, v8}, La/esg0;->b0(La/xqg0;J)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_5

    .line 85
    .line 86
    iget-object v3, v1, La/csg0;->a:La/xqg0;

    .line 87
    .line 88
    iget-object v3, v3, La/xqg0;->b:La/grg0;

    .line 89
    .line 90
    invoke-static {v1, v6, v3}, La/esg0;->A0(La/csg0;ZLa/grg0;)V

    .line 91
    .line 92
    .line 93
    :cond_5
    const-wide/16 v7, 0x2

    .line 94
    .line 95
    invoke-static {v2, v7, v8}, La/esg0;->b0(La/xqg0;J)Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_6

    .line 100
    .line 101
    iget-object v3, v1, La/csg0;->a:La/xqg0;

    .line 102
    .line 103
    iget v7, v2, La/xqg0;->Z:I

    .line 104
    .line 105
    iput v7, v3, La/xqg0;->Z:I

    .line 106
    .line 107
    :cond_6
    const-wide/16 v7, 0x8

    .line 108
    .line 109
    invoke-static {v2, v7, v8}, La/esg0;->b0(La/xqg0;J)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-eqz v3, :cond_8

    .line 114
    .line 115
    iget-object v3, v1, La/csg0;->a:La/xqg0;

    .line 116
    .line 117
    iget-object v7, v2, La/xqg0;->d:La/grg0;

    .line 118
    .line 119
    iput-object v7, v3, La/xqg0;->d:La/grg0;

    .line 120
    .line 121
    iget-object v3, v2, La/xqg0;->d:La/grg0;

    .line 122
    .line 123
    if-eqz v3, :cond_7

    .line 124
    .line 125
    if-eq v3, v4, :cond_7

    .line 126
    .line 127
    move v3, v6

    .line 128
    goto :goto_1

    .line 129
    :cond_7
    move v3, v5

    .line 130
    :goto_1
    iput-boolean v3, v1, La/csg0;->c:Z

    .line 131
    .line 132
    :cond_8
    const-wide/16 v3, 0x10

    .line 133
    .line 134
    invoke-static {v2, v3, v4}, La/esg0;->b0(La/xqg0;J)Z

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    if-eqz v3, :cond_9

    .line 139
    .line 140
    iget-object v3, v1, La/csg0;->a:La/xqg0;

    .line 141
    .line 142
    iget-object v4, v2, La/xqg0;->e:Ljava/lang/Float;

    .line 143
    .line 144
    iput-object v4, v3, La/xqg0;->e:Ljava/lang/Float;

    .line 145
    .line 146
    :cond_9
    const-wide/16 v3, 0x1818

    .line 147
    .line 148
    invoke-static {v2, v3, v4}, La/esg0;->b0(La/xqg0;J)Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-eqz v3, :cond_a

    .line 153
    .line 154
    iget-object v3, v1, La/csg0;->a:La/xqg0;

    .line 155
    .line 156
    iget-object v3, v3, La/xqg0;->d:La/grg0;

    .line 157
    .line 158
    invoke-static {v1, v5, v3}, La/esg0;->A0(La/csg0;ZLa/grg0;)V

    .line 159
    .line 160
    .line 161
    :cond_a
    const-wide v3, 0x800000000L

    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    invoke-static {v2, v3, v4}, La/esg0;->b0(La/xqg0;J)Z

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    if-eqz v3, :cond_b

    .line 171
    .line 172
    iget-object v3, v1, La/csg0;->a:La/xqg0;

    .line 173
    .line 174
    iget v4, v2, La/xqg0;->m1:I

    .line 175
    .line 176
    iput v4, v3, La/xqg0;->m1:I

    .line 177
    .line 178
    :cond_b
    const-wide/16 v3, 0x20

    .line 179
    .line 180
    invoke-static {v2, v3, v4}, La/esg0;->b0(La/xqg0;J)Z

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-eqz v3, :cond_c

    .line 185
    .line 186
    iget-object v3, v1, La/csg0;->a:La/xqg0;

    .line 187
    .line 188
    iget-object v4, v2, La/xqg0;->f:La/jqg0;

    .line 189
    .line 190
    iput-object v4, v3, La/xqg0;->f:La/jqg0;

    .line 191
    .line 192
    iget-object v3, v1, La/csg0;->e:Landroid/graphics/Paint;

    .line 193
    .line 194
    invoke-virtual {v4, v0}, La/jqg0;->b(La/esg0;)F

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 199
    .line 200
    .line 201
    :cond_c
    const-wide/16 v3, 0x40

    .line 202
    .line 203
    invoke-static {v2, v3, v4}, La/esg0;->b0(La/xqg0;J)Z

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    const/4 v4, 0x2

    .line 208
    if-eqz v3, :cond_10

    .line 209
    .line 210
    iget-object v3, v1, La/csg0;->a:La/xqg0;

    .line 211
    .line 212
    iget-object v7, v1, La/csg0;->e:Landroid/graphics/Paint;

    .line 213
    .line 214
    iget v8, v2, La/xqg0;->f1:I

    .line 215
    .line 216
    iput v8, v3, La/xqg0;->f1:I

    .line 217
    .line 218
    iget v3, v2, La/xqg0;->f1:I

    .line 219
    .line 220
    invoke-static {v3}, La/hne;->E(I)I

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    if-eqz v3, :cond_f

    .line 225
    .line 226
    if-eq v3, v6, :cond_e

    .line 227
    .line 228
    if-eq v3, v4, :cond_d

    .line 229
    .line 230
    goto :goto_2

    .line 231
    :cond_d
    sget-object v3, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    .line 232
    .line 233
    invoke-virtual {v7, v3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 234
    .line 235
    .line 236
    goto :goto_2

    .line 237
    :cond_e
    sget-object v3, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 238
    .line 239
    invoke-virtual {v7, v3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 240
    .line 241
    .line 242
    goto :goto_2

    .line 243
    :cond_f
    sget-object v3, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    .line 244
    .line 245
    invoke-virtual {v7, v3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 246
    .line 247
    .line 248
    :cond_10
    :goto_2
    const-wide/16 v7, 0x80

    .line 249
    .line 250
    invoke-static {v2, v7, v8}, La/esg0;->b0(La/xqg0;J)Z

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    if-eqz v3, :cond_14

    .line 255
    .line 256
    iget-object v3, v1, La/csg0;->a:La/xqg0;

    .line 257
    .line 258
    iget-object v7, v1, La/csg0;->e:Landroid/graphics/Paint;

    .line 259
    .line 260
    iget v8, v2, La/xqg0;->g1:I

    .line 261
    .line 262
    iput v8, v3, La/xqg0;->g1:I

    .line 263
    .line 264
    iget v3, v2, La/xqg0;->g1:I

    .line 265
    .line 266
    invoke-static {v3}, La/hne;->E(I)I

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    if-eqz v3, :cond_13

    .line 271
    .line 272
    if-eq v3, v6, :cond_12

    .line 273
    .line 274
    if-eq v3, v4, :cond_11

    .line 275
    .line 276
    goto :goto_3

    .line 277
    :cond_11
    sget-object v3, Landroid/graphics/Paint$Join;->BEVEL:Landroid/graphics/Paint$Join;

    .line 278
    .line 279
    invoke-virtual {v7, v3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 280
    .line 281
    .line 282
    goto :goto_3

    .line 283
    :cond_12
    sget-object v3, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 284
    .line 285
    invoke-virtual {v7, v3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 286
    .line 287
    .line 288
    goto :goto_3

    .line 289
    :cond_13
    sget-object v3, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    .line 290
    .line 291
    invoke-virtual {v7, v3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 292
    .line 293
    .line 294
    :cond_14
    :goto_3
    const-wide/16 v7, 0x100

    .line 295
    .line 296
    invoke-static {v2, v7, v8}, La/esg0;->b0(La/xqg0;J)Z

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    if-eqz v3, :cond_15

    .line 301
    .line 302
    iget-object v3, v1, La/csg0;->a:La/xqg0;

    .line 303
    .line 304
    iget-object v7, v2, La/xqg0;->g:Ljava/lang/Float;

    .line 305
    .line 306
    iput-object v7, v3, La/xqg0;->g:Ljava/lang/Float;

    .line 307
    .line 308
    iget-object v3, v1, La/csg0;->e:Landroid/graphics/Paint;

    .line 309
    .line 310
    iget-object v7, v2, La/xqg0;->g:Ljava/lang/Float;

    .line 311
    .line 312
    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    .line 313
    .line 314
    .line 315
    move-result v7

    .line 316
    invoke-virtual {v3, v7}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 317
    .line 318
    .line 319
    :cond_15
    const-wide/16 v7, 0x200

    .line 320
    .line 321
    invoke-static {v2, v7, v8}, La/esg0;->b0(La/xqg0;J)Z

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    if-eqz v3, :cond_16

    .line 326
    .line 327
    iget-object v3, v1, La/csg0;->a:La/xqg0;

    .line 328
    .line 329
    iget-object v7, v2, La/xqg0;->h:[La/jqg0;

    .line 330
    .line 331
    iput-object v7, v3, La/xqg0;->h:[La/jqg0;

    .line 332
    .line 333
    :cond_16
    const-wide/16 v7, 0x400

    .line 334
    .line 335
    invoke-static {v2, v7, v8}, La/esg0;->b0(La/xqg0;J)Z

    .line 336
    .line 337
    .line 338
    move-result v3

    .line 339
    if-eqz v3, :cond_17

    .line 340
    .line 341
    iget-object v3, v1, La/csg0;->a:La/xqg0;

    .line 342
    .line 343
    iget-object v7, v2, La/xqg0;->i:La/jqg0;

    .line 344
    .line 345
    iput-object v7, v3, La/xqg0;->i:La/jqg0;

    .line 346
    .line 347
    :cond_17
    const-wide/16 v7, 0x600

    .line 348
    .line 349
    invoke-static {v2, v7, v8}, La/esg0;->b0(La/xqg0;J)Z

    .line 350
    .line 351
    .line 352
    move-result v3

    .line 353
    const/4 v7, 0x0

    .line 354
    if-eqz v3, :cond_1d

    .line 355
    .line 356
    iget-object v3, v1, La/csg0;->a:La/xqg0;

    .line 357
    .line 358
    iget-object v8, v1, La/csg0;->e:Landroid/graphics/Paint;

    .line 359
    .line 360
    iget-object v9, v3, La/xqg0;->h:[La/jqg0;

    .line 361
    .line 362
    if-nez v9, :cond_18

    .line 363
    .line 364
    invoke-virtual {v8, v7}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 365
    .line 366
    .line 367
    goto :goto_6

    .line 368
    :cond_18
    array-length v9, v9

    .line 369
    rem-int/lit8 v10, v9, 0x2

    .line 370
    .line 371
    if-nez v10, :cond_19

    .line 372
    .line 373
    move v10, v9

    .line 374
    goto :goto_4

    .line 375
    :cond_19
    mul-int/lit8 v10, v9, 0x2

    .line 376
    .line 377
    :goto_4
    new-array v11, v10, [F

    .line 378
    .line 379
    const/4 v12, 0x0

    .line 380
    move v13, v5

    .line 381
    move v14, v12

    .line 382
    :goto_5
    if-ge v13, v10, :cond_1a

    .line 383
    .line 384
    iget-object v15, v3, La/xqg0;->h:[La/jqg0;

    .line 385
    .line 386
    rem-int v16, v13, v9

    .line 387
    .line 388
    aget-object v15, v15, v16

    .line 389
    .line 390
    invoke-virtual {v15, v0}, La/jqg0;->b(La/esg0;)F

    .line 391
    .line 392
    .line 393
    move-result v15

    .line 394
    aput v15, v11, v13

    .line 395
    .line 396
    add-float/2addr v14, v15

    .line 397
    add-int/lit8 v13, v13, 0x1

    .line 398
    .line 399
    goto :goto_5

    .line 400
    :cond_1a
    cmpl-float v9, v14, v12

    .line 401
    .line 402
    if-nez v9, :cond_1b

    .line 403
    .line 404
    invoke-virtual {v8, v7}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 405
    .line 406
    .line 407
    goto :goto_6

    .line 408
    :cond_1b
    iget-object v3, v3, La/xqg0;->i:La/jqg0;

    .line 409
    .line 410
    invoke-virtual {v3, v0}, La/jqg0;->b(La/esg0;)F

    .line 411
    .line 412
    .line 413
    move-result v3

    .line 414
    cmpg-float v9, v3, v12

    .line 415
    .line 416
    if-gez v9, :cond_1c

    .line 417
    .line 418
    rem-float/2addr v3, v14

    .line 419
    add-float/2addr v3, v14

    .line 420
    :cond_1c
    new-instance v9, Landroid/graphics/DashPathEffect;

    .line 421
    .line 422
    invoke-direct {v9, v11, v3}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 426
    .line 427
    .line 428
    :cond_1d
    :goto_6
    const-wide/16 v8, 0x4000

    .line 429
    .line 430
    invoke-static {v2, v8, v9}, La/esg0;->b0(La/xqg0;J)Z

    .line 431
    .line 432
    .line 433
    move-result v3

    .line 434
    if-eqz v3, :cond_1e

    .line 435
    .line 436
    iget-object v3, v0, La/esg0;->c:Ljava/lang/Object;

    .line 437
    .line 438
    check-cast v3, La/csg0;

    .line 439
    .line 440
    iget-object v3, v3, La/csg0;->d:Landroid/graphics/Paint;

    .line 441
    .line 442
    invoke-virtual {v3}, Landroid/graphics/Paint;->getTextSize()F

    .line 443
    .line 444
    .line 445
    move-result v3

    .line 446
    iget-object v8, v1, La/csg0;->a:La/xqg0;

    .line 447
    .line 448
    iget-object v9, v2, La/xqg0;->m:La/jqg0;

    .line 449
    .line 450
    iput-object v9, v8, La/xqg0;->m:La/jqg0;

    .line 451
    .line 452
    iget-object v8, v1, La/csg0;->d:Landroid/graphics/Paint;

    .line 453
    .line 454
    iget-object v9, v2, La/xqg0;->m:La/jqg0;

    .line 455
    .line 456
    invoke-virtual {v9, v0, v3}, La/jqg0;->c(La/esg0;F)F

    .line 457
    .line 458
    .line 459
    move-result v9

    .line 460
    invoke-virtual {v8, v9}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 461
    .line 462
    .line 463
    iget-object v8, v1, La/csg0;->e:Landroid/graphics/Paint;

    .line 464
    .line 465
    iget-object v9, v2, La/xqg0;->m:La/jqg0;

    .line 466
    .line 467
    invoke-virtual {v9, v0, v3}, La/jqg0;->c(La/esg0;F)F

    .line 468
    .line 469
    .line 470
    move-result v3

    .line 471
    invoke-virtual {v8, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 472
    .line 473
    .line 474
    :cond_1e
    const-wide/16 v8, 0x2000

    .line 475
    .line 476
    invoke-static {v2, v8, v9}, La/esg0;->b0(La/xqg0;J)Z

    .line 477
    .line 478
    .line 479
    move-result v3

    .line 480
    if-eqz v3, :cond_1f

    .line 481
    .line 482
    iget-object v3, v1, La/csg0;->a:La/xqg0;

    .line 483
    .line 484
    iget-object v8, v2, La/xqg0;->l:Ljava/util/ArrayList;

    .line 485
    .line 486
    iput-object v8, v3, La/xqg0;->l:Ljava/util/ArrayList;

    .line 487
    .line 488
    :cond_1f
    const-wide/32 v8, 0x8000

    .line 489
    .line 490
    .line 491
    invoke-static {v2, v8, v9}, La/esg0;->b0(La/xqg0;J)Z

    .line 492
    .line 493
    .line 494
    move-result v3

    .line 495
    if-eqz v3, :cond_22

    .line 496
    .line 497
    iget-object v3, v2, La/xqg0;->n:Ljava/lang/Integer;

    .line 498
    .line 499
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 500
    .line 501
    .line 502
    move-result v3

    .line 503
    const/4 v8, -0x1

    .line 504
    const/16 v9, 0x64

    .line 505
    .line 506
    if-ne v3, v8, :cond_20

    .line 507
    .line 508
    iget-object v3, v1, La/csg0;->a:La/xqg0;

    .line 509
    .line 510
    iget-object v3, v3, La/xqg0;->n:Ljava/lang/Integer;

    .line 511
    .line 512
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 513
    .line 514
    .line 515
    move-result v3

    .line 516
    if-le v3, v9, :cond_20

    .line 517
    .line 518
    iget-object v3, v1, La/csg0;->a:La/xqg0;

    .line 519
    .line 520
    iget-object v8, v3, La/xqg0;->n:Ljava/lang/Integer;

    .line 521
    .line 522
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 523
    .line 524
    .line 525
    move-result v8

    .line 526
    sub-int/2addr v8, v9

    .line 527
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 528
    .line 529
    .line 530
    move-result-object v8

    .line 531
    iput-object v8, v3, La/xqg0;->n:Ljava/lang/Integer;

    .line 532
    .line 533
    goto :goto_7

    .line 534
    :cond_20
    iget-object v3, v2, La/xqg0;->n:Ljava/lang/Integer;

    .line 535
    .line 536
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 537
    .line 538
    .line 539
    move-result v3

    .line 540
    if-ne v3, v6, :cond_21

    .line 541
    .line 542
    iget-object v3, v1, La/csg0;->a:La/xqg0;

    .line 543
    .line 544
    iget-object v3, v3, La/xqg0;->n:Ljava/lang/Integer;

    .line 545
    .line 546
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 547
    .line 548
    .line 549
    move-result v3

    .line 550
    const/16 v8, 0x384

    .line 551
    .line 552
    if-ge v3, v8, :cond_21

    .line 553
    .line 554
    iget-object v3, v1, La/csg0;->a:La/xqg0;

    .line 555
    .line 556
    iget-object v8, v3, La/xqg0;->n:Ljava/lang/Integer;

    .line 557
    .line 558
    invoke-static {v9, v8}, La/kng0;->e(ILjava/lang/Integer;)Ljava/lang/Integer;

    .line 559
    .line 560
    .line 561
    move-result-object v8

    .line 562
    iput-object v8, v3, La/xqg0;->n:Ljava/lang/Integer;

    .line 563
    .line 564
    goto :goto_7

    .line 565
    :cond_21
    iget-object v3, v1, La/csg0;->a:La/xqg0;

    .line 566
    .line 567
    iget-object v8, v2, La/xqg0;->n:Ljava/lang/Integer;

    .line 568
    .line 569
    iput-object v8, v3, La/xqg0;->n:Ljava/lang/Integer;

    .line 570
    .line 571
    :cond_22
    :goto_7
    const-wide/32 v8, 0x10000

    .line 572
    .line 573
    .line 574
    invoke-static {v2, v8, v9}, La/esg0;->b0(La/xqg0;J)Z

    .line 575
    .line 576
    .line 577
    move-result v3

    .line 578
    if-eqz v3, :cond_23

    .line 579
    .line 580
    iget-object v3, v1, La/csg0;->a:La/xqg0;

    .line 581
    .line 582
    iget v8, v2, La/xqg0;->h1:I

    .line 583
    .line 584
    iput v8, v3, La/xqg0;->h1:I

    .line 585
    .line 586
    :cond_23
    const-wide/32 v8, 0x1a000

    .line 587
    .line 588
    .line 589
    invoke-static {v2, v8, v9}, La/esg0;->b0(La/xqg0;J)Z

    .line 590
    .line 591
    .line 592
    move-result v3

    .line 593
    if-eqz v3, :cond_27

    .line 594
    .line 595
    iget-object v3, v1, La/csg0;->a:La/xqg0;

    .line 596
    .line 597
    iget-object v8, v3, La/xqg0;->l:Ljava/util/ArrayList;

    .line 598
    .line 599
    if-eqz v8, :cond_25

    .line 600
    .line 601
    iget-object v0, v0, La/esg0;->b:Ljava/lang/Object;

    .line 602
    .line 603
    check-cast v0, La/cyu;

    .line 604
    .line 605
    if-eqz v0, :cond_25

    .line 606
    .line 607
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    :cond_24
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 612
    .line 613
    .line 614
    move-result v8

    .line 615
    if-eqz v8, :cond_25

    .line 616
    .line 617
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v7

    .line 621
    check-cast v7, Ljava/lang/String;

    .line 622
    .line 623
    iget-object v8, v3, La/xqg0;->n:Ljava/lang/Integer;

    .line 624
    .line 625
    iget v9, v3, La/xqg0;->h1:I

    .line 626
    .line 627
    invoke-static {v9, v8, v7}, La/esg0;->w(ILjava/lang/Integer;Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 628
    .line 629
    .line 630
    move-result-object v7

    .line 631
    if-eqz v7, :cond_24

    .line 632
    .line 633
    :cond_25
    if-nez v7, :cond_26

    .line 634
    .line 635
    iget-object v0, v3, La/xqg0;->n:Ljava/lang/Integer;

    .line 636
    .line 637
    iget v3, v3, La/xqg0;->h1:I

    .line 638
    .line 639
    const-string v7, "serif"

    .line 640
    .line 641
    invoke-static {v3, v0, v7}, La/esg0;->w(ILjava/lang/Integer;Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 642
    .line 643
    .line 644
    move-result-object v7

    .line 645
    :cond_26
    iget-object v0, v1, La/csg0;->d:Landroid/graphics/Paint;

    .line 646
    .line 647
    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 648
    .line 649
    .line 650
    iget-object v0, v1, La/csg0;->e:Landroid/graphics/Paint;

    .line 651
    .line 652
    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 653
    .line 654
    .line 655
    :cond_27
    const-wide/32 v7, 0x20000

    .line 656
    .line 657
    .line 658
    invoke-static {v2, v7, v8}, La/esg0;->b0(La/xqg0;J)Z

    .line 659
    .line 660
    .line 661
    move-result v0

    .line 662
    if-eqz v0, :cond_2c

    .line 663
    .line 664
    iget-object v0, v1, La/csg0;->a:La/xqg0;

    .line 665
    .line 666
    iget-object v3, v1, La/csg0;->e:Landroid/graphics/Paint;

    .line 667
    .line 668
    iget-object v7, v1, La/csg0;->d:Landroid/graphics/Paint;

    .line 669
    .line 670
    iget v8, v2, La/xqg0;->i1:I

    .line 671
    .line 672
    iput v8, v0, La/xqg0;->i1:I

    .line 673
    .line 674
    iget v0, v2, La/xqg0;->i1:I

    .line 675
    .line 676
    const/4 v8, 0x4

    .line 677
    if-ne v0, v8, :cond_28

    .line 678
    .line 679
    move v0, v6

    .line 680
    goto :goto_8

    .line 681
    :cond_28
    move v0, v5

    .line 682
    :goto_8
    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setStrikeThruText(Z)V

    .line 683
    .line 684
    .line 685
    iget v0, v2, La/xqg0;->i1:I

    .line 686
    .line 687
    if-ne v0, v4, :cond_29

    .line 688
    .line 689
    move v0, v6

    .line 690
    goto :goto_9

    .line 691
    :cond_29
    move v0, v5

    .line 692
    :goto_9
    invoke-virtual {v7, v0}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    .line 693
    .line 694
    .line 695
    iget v0, v2, La/xqg0;->i1:I

    .line 696
    .line 697
    if-ne v0, v8, :cond_2a

    .line 698
    .line 699
    move v0, v6

    .line 700
    goto :goto_a

    .line 701
    :cond_2a
    move v0, v5

    .line 702
    :goto_a
    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setStrikeThruText(Z)V

    .line 703
    .line 704
    .line 705
    iget v0, v2, La/xqg0;->i1:I

    .line 706
    .line 707
    if-ne v0, v4, :cond_2b

    .line 708
    .line 709
    move v5, v6

    .line 710
    :cond_2b
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    .line 711
    .line 712
    .line 713
    :cond_2c
    const-wide v3, 0x1000000000L

    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    invoke-static {v2, v3, v4}, La/esg0;->b0(La/xqg0;J)Z

    .line 719
    .line 720
    .line 721
    move-result v0

    .line 722
    if-eqz v0, :cond_2d

    .line 723
    .line 724
    iget-object v0, v1, La/csg0;->a:La/xqg0;

    .line 725
    .line 726
    iget v3, v2, La/xqg0;->j1:I

    .line 727
    .line 728
    iput v3, v0, La/xqg0;->j1:I

    .line 729
    .line 730
    :cond_2d
    const-wide/32 v3, 0x40000

    .line 731
    .line 732
    .line 733
    invoke-static {v2, v3, v4}, La/esg0;->b0(La/xqg0;J)Z

    .line 734
    .line 735
    .line 736
    move-result v0

    .line 737
    if-eqz v0, :cond_2e

    .line 738
    .line 739
    iget-object v0, v1, La/csg0;->a:La/xqg0;

    .line 740
    .line 741
    iget v3, v2, La/xqg0;->k1:I

    .line 742
    .line 743
    iput v3, v0, La/xqg0;->k1:I

    .line 744
    .line 745
    :cond_2e
    const-wide/32 v3, 0x80000

    .line 746
    .line 747
    .line 748
    invoke-static {v2, v3, v4}, La/esg0;->b0(La/xqg0;J)Z

    .line 749
    .line 750
    .line 751
    move-result v0

    .line 752
    if-eqz v0, :cond_2f

    .line 753
    .line 754
    iget-object v0, v1, La/csg0;->a:La/xqg0;

    .line 755
    .line 756
    iget-object v3, v2, La/xqg0;->o:Ljava/lang/Boolean;

    .line 757
    .line 758
    iput-object v3, v0, La/xqg0;->o:Ljava/lang/Boolean;

    .line 759
    .line 760
    :cond_2f
    const-wide/32 v3, 0x200000

    .line 761
    .line 762
    .line 763
    invoke-static {v2, v3, v4}, La/esg0;->b0(La/xqg0;J)Z

    .line 764
    .line 765
    .line 766
    move-result v0

    .line 767
    if-eqz v0, :cond_30

    .line 768
    .line 769
    iget-object v0, v1, La/csg0;->a:La/xqg0;

    .line 770
    .line 771
    iget-object v3, v2, La/xqg0;->q:Ljava/lang/String;

    .line 772
    .line 773
    iput-object v3, v0, La/xqg0;->q:Ljava/lang/String;

    .line 774
    .line 775
    :cond_30
    const-wide/32 v3, 0x400000

    .line 776
    .line 777
    .line 778
    invoke-static {v2, v3, v4}, La/esg0;->b0(La/xqg0;J)Z

    .line 779
    .line 780
    .line 781
    move-result v0

    .line 782
    if-eqz v0, :cond_31

    .line 783
    .line 784
    iget-object v0, v1, La/csg0;->a:La/xqg0;

    .line 785
    .line 786
    iget-object v3, v2, La/xqg0;->r:Ljava/lang/String;

    .line 787
    .line 788
    iput-object v3, v0, La/xqg0;->r:Ljava/lang/String;

    .line 789
    .line 790
    :cond_31
    const-wide/32 v3, 0x800000

    .line 791
    .line 792
    .line 793
    invoke-static {v2, v3, v4}, La/esg0;->b0(La/xqg0;J)Z

    .line 794
    .line 795
    .line 796
    move-result v0

    .line 797
    if-eqz v0, :cond_32

    .line 798
    .line 799
    iget-object v0, v1, La/csg0;->a:La/xqg0;

    .line 800
    .line 801
    iget-object v3, v2, La/xqg0;->s:Ljava/lang/String;

    .line 802
    .line 803
    iput-object v3, v0, La/xqg0;->s:Ljava/lang/String;

    .line 804
    .line 805
    :cond_32
    const-wide/32 v3, 0x1000000

    .line 806
    .line 807
    .line 808
    invoke-static {v2, v3, v4}, La/esg0;->b0(La/xqg0;J)Z

    .line 809
    .line 810
    .line 811
    move-result v0

    .line 812
    if-eqz v0, :cond_33

    .line 813
    .line 814
    iget-object v0, v1, La/csg0;->a:La/xqg0;

    .line 815
    .line 816
    iget-object v3, v2, La/xqg0;->t:Ljava/lang/Boolean;

    .line 817
    .line 818
    iput-object v3, v0, La/xqg0;->t:Ljava/lang/Boolean;

    .line 819
    .line 820
    :cond_33
    const-wide/32 v3, 0x2000000

    .line 821
    .line 822
    .line 823
    invoke-static {v2, v3, v4}, La/esg0;->b0(La/xqg0;J)Z

    .line 824
    .line 825
    .line 826
    move-result v0

    .line 827
    if-eqz v0, :cond_34

    .line 828
    .line 829
    iget-object v0, v1, La/csg0;->a:La/xqg0;

    .line 830
    .line 831
    iget-object v3, v2, La/xqg0;->u:Ljava/lang/Boolean;

    .line 832
    .line 833
    iput-object v3, v0, La/xqg0;->u:Ljava/lang/Boolean;

    .line 834
    .line 835
    :cond_34
    const-wide/32 v3, 0x100000

    .line 836
    .line 837
    .line 838
    invoke-static {v2, v3, v4}, La/esg0;->b0(La/xqg0;J)Z

    .line 839
    .line 840
    .line 841
    move-result v0

    .line 842
    if-eqz v0, :cond_35

    .line 843
    .line 844
    iget-object v0, v1, La/csg0;->a:La/xqg0;

    .line 845
    .line 846
    iget-object v3, v2, La/xqg0;->p:La/n660;

    .line 847
    .line 848
    iput-object v3, v0, La/xqg0;->p:La/n660;

    .line 849
    .line 850
    :cond_35
    const-wide/32 v3, 0x10000000

    .line 851
    .line 852
    .line 853
    invoke-static {v2, v3, v4}, La/esg0;->b0(La/xqg0;J)Z

    .line 854
    .line 855
    .line 856
    move-result v0

    .line 857
    if-eqz v0, :cond_36

    .line 858
    .line 859
    iget-object v0, v1, La/csg0;->a:La/xqg0;

    .line 860
    .line 861
    iget-object v3, v2, La/xqg0;->x:Ljava/lang/String;

    .line 862
    .line 863
    iput-object v3, v0, La/xqg0;->x:Ljava/lang/String;

    .line 864
    .line 865
    :cond_36
    const-wide/32 v3, 0x20000000

    .line 866
    .line 867
    .line 868
    invoke-static {v2, v3, v4}, La/esg0;->b0(La/xqg0;J)Z

    .line 869
    .line 870
    .line 871
    move-result v0

    .line 872
    if-eqz v0, :cond_37

    .line 873
    .line 874
    iget-object v0, v1, La/csg0;->a:La/xqg0;

    .line 875
    .line 876
    iget v3, v2, La/xqg0;->l1:I

    .line 877
    .line 878
    iput v3, v0, La/xqg0;->l1:I

    .line 879
    .line 880
    :cond_37
    const-wide/32 v3, 0x40000000

    .line 881
    .line 882
    .line 883
    invoke-static {v2, v3, v4}, La/esg0;->b0(La/xqg0;J)Z

    .line 884
    .line 885
    .line 886
    move-result v0

    .line 887
    if-eqz v0, :cond_38

    .line 888
    .line 889
    iget-object v0, v1, La/csg0;->a:La/xqg0;

    .line 890
    .line 891
    iget-object v3, v2, La/xqg0;->y:Ljava/lang/String;

    .line 892
    .line 893
    iput-object v3, v0, La/xqg0;->y:Ljava/lang/String;

    .line 894
    .line 895
    :cond_38
    const-wide/32 v3, 0x4000000

    .line 896
    .line 897
    .line 898
    invoke-static {v2, v3, v4}, La/esg0;->b0(La/xqg0;J)Z

    .line 899
    .line 900
    .line 901
    move-result v0

    .line 902
    if-eqz v0, :cond_39

    .line 903
    .line 904
    iget-object v0, v1, La/csg0;->a:La/xqg0;

    .line 905
    .line 906
    iget-object v3, v2, La/xqg0;->v:La/grg0;

    .line 907
    .line 908
    iput-object v3, v0, La/xqg0;->v:La/grg0;

    .line 909
    .line 910
    :cond_39
    const-wide/32 v3, 0x8000000

    .line 911
    .line 912
    .line 913
    invoke-static {v2, v3, v4}, La/esg0;->b0(La/xqg0;J)Z

    .line 914
    .line 915
    .line 916
    move-result v0

    .line 917
    if-eqz v0, :cond_3a

    .line 918
    .line 919
    iget-object v0, v1, La/csg0;->a:La/xqg0;

    .line 920
    .line 921
    iget-object v3, v2, La/xqg0;->w:Ljava/lang/Float;

    .line 922
    .line 923
    iput-object v3, v0, La/xqg0;->w:Ljava/lang/Float;

    .line 924
    .line 925
    :cond_3a
    const-wide v3, 0x200000000L

    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    invoke-static {v2, v3, v4}, La/esg0;->b0(La/xqg0;J)Z

    .line 931
    .line 932
    .line 933
    move-result v0

    .line 934
    if-eqz v0, :cond_3b

    .line 935
    .line 936
    iget-object v0, v1, La/csg0;->a:La/xqg0;

    .line 937
    .line 938
    iget-object v3, v2, La/xqg0;->B:La/grg0;

    .line 939
    .line 940
    iput-object v3, v0, La/xqg0;->B:La/grg0;

    .line 941
    .line 942
    :cond_3b
    const-wide v3, 0x400000000L

    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    invoke-static {v2, v3, v4}, La/esg0;->b0(La/xqg0;J)Z

    .line 948
    .line 949
    .line 950
    move-result v0

    .line 951
    if-eqz v0, :cond_3c

    .line 952
    .line 953
    iget-object v0, v1, La/csg0;->a:La/xqg0;

    .line 954
    .line 955
    iget-object v3, v2, La/xqg0;->Y:Ljava/lang/Float;

    .line 956
    .line 957
    iput-object v3, v0, La/xqg0;->Y:Ljava/lang/Float;

    .line 958
    .line 959
    :cond_3c
    const-wide v3, 0x2000000000L

    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    invoke-static {v2, v3, v4}, La/esg0;->b0(La/xqg0;J)Z

    .line 965
    .line 966
    .line 967
    move-result v0

    .line 968
    if-eqz v0, :cond_3d

    .line 969
    .line 970
    iget-object v0, v1, La/csg0;->a:La/xqg0;

    .line 971
    .line 972
    iget v1, v2, La/xqg0;->n1:I

    .line 973
    .line 974
    iput v1, v0, La/xqg0;->n1:I

    .line 975
    .line 976
    :cond_3d
    return-void
.end method

.method public H0(La/csg0;La/drg0;)V
    .locals 5

    .line 1
    iget-object v0, p2, La/frg0;->b:La/brg0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iget-object v2, p1, La/csg0;->a:La/xqg0;

    .line 10
    .line 11
    const/high16 v3, 0x3f800000    # 1.0f

    .line 12
    .line 13
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 18
    .line 19
    iput-object v4, v2, La/xqg0;->t:Ljava/lang/Boolean;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 25
    .line 26
    :goto_1
    iput-object v4, v2, La/xqg0;->o:Ljava/lang/Boolean;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iput-object v0, v2, La/xqg0;->p:La/n660;

    .line 30
    .line 31
    iput-object v0, v2, La/xqg0;->x:Ljava/lang/String;

    .line 32
    .line 33
    iput-object v3, v2, La/xqg0;->j:Ljava/lang/Float;

    .line 34
    .line 35
    sget-object v4, La/aqg0;->b:La/aqg0;

    .line 36
    .line 37
    iput-object v4, v2, La/xqg0;->v:La/grg0;

    .line 38
    .line 39
    iput-object v3, v2, La/xqg0;->w:Ljava/lang/Float;

    .line 40
    .line 41
    iput-object v0, v2, La/xqg0;->y:Ljava/lang/String;

    .line 42
    .line 43
    iput-object v0, v2, La/xqg0;->z:La/grg0;

    .line 44
    .line 45
    iput-object v3, v2, La/xqg0;->A:Ljava/lang/Float;

    .line 46
    .line 47
    iput-object v0, v2, La/xqg0;->B:La/grg0;

    .line 48
    .line 49
    iput-object v3, v2, La/xqg0;->Y:Ljava/lang/Float;

    .line 50
    .line 51
    iput v1, v2, La/xqg0;->m1:I

    .line 52
    .line 53
    iget-object v0, p2, La/drg0;->e:La/xqg0;

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    invoke-virtual {p0, p1, v0}, La/esg0;->G0(La/csg0;La/xqg0;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    iget-object v0, p0, La/esg0;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, La/cyu;

    .line 63
    .line 64
    iget-object v0, v0, La/cyu;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, La/bi9;

    .line 67
    .line 68
    iget-object v0, v0, La/bi9;->b:Ljava/util/ArrayList;

    .line 69
    .line 70
    if-eqz v0, :cond_5

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_3
    iget-object v0, p0, La/esg0;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, La/cyu;

    .line 82
    .line 83
    iget-object v0, v0, La/cyu;->b:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, La/bi9;

    .line 86
    .line 87
    iget-object v0, v0, La/bi9;->b:Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_5

    .line 98
    .line 99
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, La/ai9;

    .line 104
    .line 105
    iget-object v2, v1, La/ai9;->a:La/ci9;

    .line 106
    .line 107
    invoke-static {v2, p2}, La/u3u0;->m(La/ci9;La/drg0;)Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_4

    .line 112
    .line 113
    iget-object v1, v1, La/ai9;->b:La/xqg0;

    .line 114
    .line 115
    invoke-virtual {p0, p1, v1}, La/esg0;->G0(La/csg0;La/xqg0;)V

    .line 116
    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_5
    :goto_3
    iget-object p2, p2, La/drg0;->f:La/xqg0;

    .line 120
    .line 121
    if-eqz p2, :cond_6

    .line 122
    .line 123
    invoke-virtual {p0, p1, p2}, La/esg0;->G0(La/csg0;La/xqg0;)V

    .line 124
    .line 125
    .line 126
    :cond_6
    return-void
.end method

.method public I0()V
    .locals 3

    .line 1
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/csg0;

    .line 4
    .line 5
    iget-object v0, v0, La/csg0;->a:La/xqg0;

    .line 6
    .line 7
    iget-object v1, v0, La/xqg0;->B:La/grg0;

    .line 8
    .line 9
    instance-of v2, v1, La/aqg0;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    check-cast v1, La/aqg0;

    .line 14
    .line 15
    iget v1, v1, La/aqg0;->a:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    instance-of v1, v1, La/bqg0;

    .line 19
    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    iget-object v1, v0, La/xqg0;->k:La/aqg0;

    .line 23
    .line 24
    iget v1, v1, La/aqg0;->a:I

    .line 25
    .line 26
    :goto_0
    iget-object v0, v0, La/xqg0;->Y:Ljava/lang/Float;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {v0, v1}, La/esg0;->x(FI)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    :cond_1
    iget-object p0, p0, La/esg0;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Landroid/graphics/Canvas;

    .line 41
    .line 42
    invoke-virtual {p0, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 43
    .line 44
    .line 45
    :cond_2
    return-void
.end method

.method public J()La/ali;
    .locals 6

    .line 1
    new-instance v0, La/ali;

    .line 2
    .line 3
    iget-object v1, p0, La/esg0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/btt0;

    .line 6
    .line 7
    iget-object v2, p0, La/esg0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, La/cad;

    .line 10
    .line 11
    iget-object v2, v2, La/cad;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, La/psc;

    .line 14
    .line 15
    invoke-virtual {v2}, La/psc;->h()La/mne;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ulk;

    .line 23
    .line 24
    iget-object v4, p0, La/esg0;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v4, La/vwb0;

    .line 27
    .line 28
    const/4 v5, 0x1

    .line 29
    invoke-direct {v3, v4, v5}, La/ulk;-><init>(La/vwb0;B)V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, La/esg0;->d:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, La/gii0;

    .line 35
    .line 36
    invoke-direct {v0, v1, v2, v3, p0}, La/ali;-><init>(La/btt0;La/mne;La/ulk;La/gii0;)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method public J0()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/csg0;

    .line 4
    .line 5
    iget-object p0, p0, La/csg0;->a:La/xqg0;

    .line 6
    .line 7
    iget-object p0, p0, La/xqg0;->u:Ljava/lang/Boolean;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public K(La/v0;La/er30;ZZLjava/lang/Boolean;Z)Ljava/util/List;
    .locals 8

    .line 1
    iget-object v0, p0, La/esg0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v6, v0

    .line 4
    check-cast v6, La/yox;

    .line 5
    .line 6
    iget-object v0, p0, La/esg0;->f:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v7, v0

    .line 9
    check-cast v7, La/vd40;

    .line 10
    .line 11
    move-object v1, p1

    .line 12
    move v2, p3

    .line 13
    move v3, p4

    .line 14
    move-object v4, p5

    .line 15
    move v5, p6

    .line 16
    invoke-static/range {v1 .. v7}, La/b34;->i0(La/v0;ZZLjava/lang/Boolean;ZLa/yox;La/vd40;)La/jre0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p1, :cond_2

    .line 21
    .line 22
    instance-of p1, v1, La/p4d0;

    .line 23
    .line 24
    const/4 p3, 0x0

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    move-object p1, v1

    .line 28
    check-cast p1, La/p4d0;

    .line 29
    .line 30
    iget-object p1, p1, La/v0;->d:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, La/gmk0;

    .line 33
    .line 34
    instance-of p4, p1, La/ory;

    .line 35
    .line 36
    if-eqz p4, :cond_0

    .line 37
    .line 38
    check-cast p1, La/ory;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move-object p1, p3

    .line 42
    :goto_0
    if-eqz p1, :cond_1

    .line 43
    .line 44
    iget-object p1, p1, La/ory;->a:La/jre0;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object p1, p3

    .line 48
    :cond_2
    :goto_1
    if-nez p1, :cond_3

    .line 49
    .line 50
    sget-object p0, La/iun;->a:La/iun;

    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_3
    iget-object p0, p0, La/esg0;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, La/zt00;

    .line 56
    .line 57
    invoke-virtual {p0, p1}, La/zt00;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, La/h93;

    .line 62
    .line 63
    iget-object p0, p0, La/h93;->a:Ljava/util/HashMap;

    .line 64
    .line 65
    invoke-virtual {p0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    check-cast p0, Ljava/util/List;

    .line 70
    .line 71
    if-nez p0, :cond_4

    .line 72
    .line 73
    sget-object p0, La/iun;->a:La/iun;

    .line 74
    .line 75
    :cond_4
    return-object p0
.end method

.method public M(La/frg0;)La/csg0;
    .locals 2

    .line 1
    new-instance v0, La/csg0;

    .line 2
    .line 3
    invoke-direct {v0}, La/csg0;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, La/xqg0;->a()La/xqg0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {p0, v0, v1}, La/esg0;->G0(La/csg0;La/xqg0;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1, v0}, La/esg0;->N(La/frg0;La/csg0;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public N(La/frg0;La/csg0;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    instance-of v1, p1, La/drg0;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    move-object v2, p1

    .line 12
    check-cast v2, La/drg0;

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object p1, p1, La/frg0;->b:La/brg0;

    .line 18
    .line 19
    if-nez p1, :cond_2

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, La/drg0;

    .line 36
    .line 37
    invoke-virtual {p0, p2, v0}, La/esg0;->H0(La/csg0;La/drg0;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    iget-object p0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, La/csg0;

    .line 44
    .line 45
    iget-object p1, p0, La/csg0;->g:La/gz40;

    .line 46
    .line 47
    iput-object p1, p2, La/csg0;->g:La/gz40;

    .line 48
    .line 49
    iget-object p0, p0, La/csg0;->f:La/gz40;

    .line 50
    .line 51
    iput-object p0, p2, La/csg0;->f:La/gz40;

    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    check-cast p1, La/frg0;

    .line 55
    .line 56
    goto :goto_0
.end method

.method public O()La/pmi;
    .locals 4

    .line 1
    new-instance v0, La/pmi;

    .line 2
    .line 3
    new-instance v1, La/wti;

    .line 4
    .line 5
    iget-object v2, p0, La/esg0;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/gii0;

    .line 8
    .line 9
    const/16 v3, 0xf

    .line 10
    .line 11
    invoke-direct {v1, v2, v3}, La/wti;-><init>(La/gii0;B)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, La/esg0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, La/xio;

    .line 17
    .line 18
    iget-object v3, p0, La/esg0;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, La/btt0;

    .line 21
    .line 22
    iget-object p0, p0, La/esg0;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, La/knf0;

    .line 25
    .line 26
    invoke-direct {v0, v1, v2, v3, p0}, La/pmi;-><init>(La/wti;La/xio;La/btt0;La/knf0;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public P()I
    .locals 3

    .line 1
    iget-object p0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/csg0;

    .line 4
    .line 5
    iget-object p0, p0, La/csg0;->a:La/xqg0;

    .line 6
    .line 7
    iget v0, p0, La/xqg0;->j1:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_2

    .line 11
    .line 12
    iget v0, p0, La/xqg0;->k1:I

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    if-ne v0, v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    if-ne v0, v1, :cond_1

    .line 19
    .line 20
    const/4 p0, 0x3

    .line 21
    return p0

    .line 22
    :cond_1
    return v1

    .line 23
    :cond_2
    :goto_0
    iget p0, p0, La/xqg0;->k1:I

    .line 24
    .line 25
    return p0
.end method

.method public Q()La/mii0;
    .locals 4

    .line 1
    new-instance v0, La/mii0;

    .line 2
    .line 3
    iget-object v1, p0, La/esg0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/krv0;

    .line 6
    .line 7
    new-instance v2, La/psc;

    .line 8
    .line 9
    iget-object v3, p0, La/esg0;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, La/azj0;

    .line 12
    .line 13
    invoke-direct {v2, v3}, La/psc;-><init>(La/azj0;)V

    .line 14
    .line 15
    .line 16
    iget-object v3, p0, La/esg0;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, La/mne;

    .line 19
    .line 20
    iget-object p0, p0, La/esg0;->e:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, La/hk3;

    .line 23
    .line 24
    invoke-direct {v0, v1, v2, v3, p0}, La/mii0;-><init>(La/krv0;La/psc;La/mne;La/hk3;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public R(ZZLjava/lang/String;ZLjava/lang/String;ILa/zje;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p7

    .line 4
    .line 5
    iget-object v2, v0, La/esg0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/us3;

    .line 8
    .line 9
    instance-of v3, v1, La/km3;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    move-object v3, v1

    .line 14
    check-cast v3, La/km3;

    .line 15
    .line 16
    iget v4, v3, La/km3;->p:I

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
    iput v4, v3, La/km3;->p:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v3, La/km3;

    .line 29
    .line 30
    invoke-direct {v3, v0, v1}, La/km3;-><init>(La/esg0;La/zje;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v1, v3, La/km3;->n:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v4, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v5, v3, La/km3;->p:I

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    const/4 v7, 0x2

    .line 41
    const/4 v8, 0x1

    .line 42
    const/4 v9, 0x0

    .line 43
    if-eqz v5, :cond_3

    .line 44
    .line 45
    if-eq v5, v8, :cond_2

    .line 46
    .line 47
    if-ne v5, v7, :cond_1

    .line 48
    .line 49
    iget-boolean v4, v3, La/km3;->l:Z

    .line 50
    .line 51
    iget v5, v3, La/km3;->m:I

    .line 52
    .line 53
    iget-boolean v7, v3, La/km3;->k:Z

    .line 54
    .line 55
    iget-boolean v10, v3, La/km3;->j:Z

    .line 56
    .line 57
    iget-boolean v3, v3, La/km3;->i:Z

    .line 58
    .line 59
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto/16 :goto_4

    .line 63
    .line 64
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-object v9

    .line 70
    :cond_2
    iget-boolean v5, v3, La/km3;->l:Z

    .line 71
    .line 72
    iget v10, v3, La/km3;->m:I

    .line 73
    .line 74
    iget-boolean v11, v3, La/km3;->k:Z

    .line 75
    .line 76
    iget-boolean v12, v3, La/km3;->j:Z

    .line 77
    .line 78
    iget-boolean v13, v3, La/km3;->i:Z

    .line 79
    .line 80
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    move/from16 v20, v13

    .line 84
    .line 85
    move v13, v10

    .line 86
    move/from16 v10, v20

    .line 87
    .line 88
    move/from16 v20, v12

    .line 89
    .line 90
    move v12, v11

    .line 91
    move/from16 v11, v20

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    new-instance v1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    move-object/from16 v5, p5

    .line 106
    .line 107
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v5, "/releases_android/1xbet/ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    .line 111
    .line 112
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->length()I

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-nez v5, :cond_5

    .line 124
    .line 125
    iget-object v5, v0, La/esg0;->b:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v5, La/yk50;

    .line 128
    .line 129
    move/from16 v10, p1

    .line 130
    .line 131
    iput-boolean v10, v3, La/km3;->i:Z

    .line 132
    .line 133
    move/from16 v11, p2

    .line 134
    .line 135
    iput-boolean v11, v3, La/km3;->j:Z

    .line 136
    .line 137
    move/from16 v12, p4

    .line 138
    .line 139
    iput-boolean v12, v3, La/km3;->k:Z

    .line 140
    .line 141
    move/from16 v13, p6

    .line 142
    .line 143
    iput v13, v3, La/km3;->m:I

    .line 144
    .line 145
    iput-boolean v6, v3, La/km3;->l:Z

    .line 146
    .line 147
    iput v8, v3, La/km3;->p:I

    .line 148
    .line 149
    iget-object v5, v5, La/yk50;->b:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v5, La/zm;

    .line 152
    .line 153
    invoke-virtual {v5}, La/zm;->invoke()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    check-cast v5, La/lm3;

    .line 158
    .line 159
    invoke-interface {v5, v1, v3}, La/lm3;->a(Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    if-ne v1, v4, :cond_4

    .line 164
    .line 165
    goto :goto_3

    .line 166
    :cond_4
    move v5, v6

    .line 167
    :goto_1
    check-cast v1, Lokhttp3/ResponseBody;

    .line 168
    .line 169
    invoke-virtual {v1}, Lokhttp3/ResponseBody;->k()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    goto :goto_2

    .line 174
    :cond_5
    move/from16 v10, p1

    .line 175
    .line 176
    move/from16 v11, p2

    .line 177
    .line 178
    move/from16 v12, p4

    .line 179
    .line 180
    move/from16 v13, p6

    .line 181
    .line 182
    move-object/from16 v1, p3

    .line 183
    .line 184
    move v5, v6

    .line 185
    :goto_2
    iget-object v14, v0, La/esg0;->d:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v14, La/z8w0;

    .line 188
    .line 189
    iput-boolean v10, v3, La/km3;->i:Z

    .line 190
    .line 191
    iput-boolean v11, v3, La/km3;->j:Z

    .line 192
    .line 193
    iput-boolean v12, v3, La/km3;->k:Z

    .line 194
    .line 195
    iput v13, v3, La/km3;->m:I

    .line 196
    .line 197
    iput-boolean v5, v3, La/km3;->l:Z

    .line 198
    .line 199
    iput v7, v3, La/km3;->p:I

    .line 200
    .line 201
    invoke-virtual {v14, v3, v1, v6}, La/z8w0;->d(La/zje;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    if-ne v1, v4, :cond_6

    .line 206
    .line 207
    :goto_3
    return-object v4

    .line 208
    :cond_6
    move v4, v5

    .line 209
    move v3, v10

    .line 210
    move v10, v11

    .line 211
    move v7, v12

    .line 212
    move v5, v13

    .line 213
    :goto_4
    check-cast v1, Ljava/lang/String;

    .line 214
    .line 215
    iget-object v0, v0, La/esg0;->a:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v0, La/vby;

    .line 218
    .line 219
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    sget-object v11, La/tsf0;->Companion:La/ssf0;

    .line 223
    .line 224
    invoke-virtual {v11}, La/ssf0;->serializer()La/jiy;

    .line 225
    .line 226
    .line 227
    move-result-object v11

    .line 228
    check-cast v11, La/jiy;

    .line 229
    .line 230
    invoke-virtual {v0, v11, v1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    check-cast v0, La/tsf0;

    .line 235
    .line 236
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    iget-object v0, v0, La/tsf0;->b:La/acu0;

    .line 240
    .line 241
    const-string v1, ""

    .line 242
    .line 243
    const-string v11, "0.0.0"

    .line 244
    .line 245
    if-eqz v0, :cond_14

    .line 246
    .line 247
    iget-object v12, v0, La/acu0;->b:Ljava/lang/String;

    .line 248
    .line 249
    if-eqz v12, :cond_7

    .line 250
    .line 251
    invoke-static {v12}, La/cy2;->D(Ljava/lang/String;)La/go3;

    .line 252
    .line 253
    .line 254
    move-result-object v12

    .line 255
    goto :goto_5

    .line 256
    :cond_7
    invoke-static {v11}, La/cy2;->D(Ljava/lang/String;)La/go3;

    .line 257
    .line 258
    .line 259
    move-result-object v12

    .line 260
    :goto_5
    iget-object v13, v0, La/acu0;->a:Ljava/lang/String;

    .line 261
    .line 262
    if-eqz v13, :cond_8

    .line 263
    .line 264
    invoke-static {v13}, La/cy2;->D(Ljava/lang/String;)La/go3;

    .line 265
    .line 266
    .line 267
    move-result-object v13

    .line 268
    goto :goto_6

    .line 269
    :cond_8
    invoke-static {v11}, La/cy2;->D(Ljava/lang/String;)La/go3;

    .line 270
    .line 271
    .line 272
    move-result-object v13

    .line 273
    :goto_6
    iget-object v14, v0, La/acu0;->c:Ljava/lang/String;

    .line 274
    .line 275
    if-nez v14, :cond_9

    .line 276
    .line 277
    move-object v14, v1

    .line 278
    :cond_9
    iget-object v15, v0, La/acu0;->d:Ljava/util/List;

    .line 279
    .line 280
    if-nez v15, :cond_a

    .line 281
    .line 282
    sget-object v15, La/iun;->a:La/iun;

    .line 283
    .line 284
    :cond_a
    move/from16 p7, v8

    .line 285
    .line 286
    new-instance v8, Ljava/util/ArrayList;

    .line 287
    .line 288
    const/16 v9, 0xa

    .line 289
    .line 290
    invoke-static {v15, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 291
    .line 292
    .line 293
    move-result v6

    .line 294
    invoke-direct {v8, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 295
    .line 296
    .line 297
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 298
    .line 299
    .line 300
    move-result-object v6

    .line 301
    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 302
    .line 303
    .line 304
    move-result v15

    .line 305
    if-eqz v15, :cond_b

    .line 306
    .line 307
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v15

    .line 311
    check-cast v15, Ljava/lang/String;

    .line 312
    .line 313
    invoke-static {v15}, La/cy2;->D(Ljava/lang/String;)La/go3;

    .line 314
    .line 315
    .line 316
    move-result-object v15

    .line 317
    invoke-virtual {v8, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    goto :goto_7

    .line 321
    :cond_b
    iget-object v0, v0, La/acu0;->e:Ljava/util/List;

    .line 322
    .line 323
    if-eqz v0, :cond_13

    .line 324
    .line 325
    new-instance v6, Ljava/util/ArrayList;

    .line 326
    .line 327
    invoke-static {v0, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 328
    .line 329
    .line 330
    move-result v15

    .line 331
    invoke-direct {v6, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 332
    .line 333
    .line 334
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 339
    .line 340
    .line 341
    move-result v15

    .line 342
    if-eqz v15, :cond_12

    .line 343
    .line 344
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v15

    .line 348
    check-cast v15, La/lo2;

    .line 349
    .line 350
    iget-object v9, v15, La/lo2;->a:Ljava/util/List;

    .line 351
    .line 352
    if-nez v9, :cond_c

    .line 353
    .line 354
    sget-object v9, La/iun;->a:La/iun;

    .line 355
    .line 356
    :cond_c
    move-object/from16 v16, v0

    .line 357
    .line 358
    iget-object v0, v15, La/lo2;->b:Ljava/lang/String;

    .line 359
    .line 360
    if-eqz v0, :cond_d

    .line 361
    .line 362
    invoke-static {v0}, La/cy2;->D(Ljava/lang/String;)La/go3;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    move-object/from16 p3, v0

    .line 367
    .line 368
    goto :goto_9

    .line 369
    :cond_d
    move-object/from16 p3, v12

    .line 370
    .line 371
    :goto_9
    iget-object v0, v15, La/lo2;->c:Ljava/lang/String;

    .line 372
    .line 373
    if-nez v0, :cond_e

    .line 374
    .line 375
    move-object/from16 p4, v1

    .line 376
    .line 377
    goto :goto_a

    .line 378
    :cond_e
    move-object/from16 p4, v0

    .line 379
    .line 380
    :goto_a
    iget-object v0, v15, La/lo2;->d:Ljava/util/List;

    .line 381
    .line 382
    if-nez v0, :cond_f

    .line 383
    .line 384
    sget-object v0, La/iun;->a:La/iun;

    .line 385
    .line 386
    :cond_f
    move-object/from16 v17, v2

    .line 387
    .line 388
    new-instance v2, Ljava/util/ArrayList;

    .line 389
    .line 390
    move/from16 v18, v3

    .line 391
    .line 392
    move/from16 v19, v4

    .line 393
    .line 394
    const/16 v3, 0xa

    .line 395
    .line 396
    invoke-static {v0, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 397
    .line 398
    .line 399
    move-result v4

    .line 400
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 401
    .line 402
    .line 403
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 408
    .line 409
    .line 410
    move-result v4

    .line 411
    if-eqz v4, :cond_10

    .line 412
    .line 413
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v4

    .line 417
    check-cast v4, Ljava/lang/String;

    .line 418
    .line 419
    invoke-static {v4}, La/cy2;->D(Ljava/lang/String;)La/go3;

    .line 420
    .line 421
    .line 422
    move-result-object v4

    .line 423
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    goto :goto_b

    .line 427
    :cond_10
    iget-object v0, v15, La/lo2;->e:Ljava/lang/String;

    .line 428
    .line 429
    if-eqz v0, :cond_11

    .line 430
    .line 431
    invoke-static {v0}, La/cy2;->D(Ljava/lang/String;)La/go3;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    goto :goto_c

    .line 436
    :cond_11
    move-object v0, v13

    .line 437
    :goto_c
    new-instance v4, La/io2;

    .line 438
    .line 439
    move-object/from16 p6, v0

    .line 440
    .line 441
    move-object/from16 p5, v2

    .line 442
    .line 443
    move-object/from16 p1, v4

    .line 444
    .line 445
    move-object/from16 p2, v9

    .line 446
    .line 447
    invoke-direct/range {p1 .. p6}, La/io2;-><init>(Ljava/util/List;La/go3;Ljava/lang/String;Ljava/util/ArrayList;La/go3;)V

    .line 448
    .line 449
    .line 450
    move-object/from16 v0, p1

    .line 451
    .line 452
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move v9, v3

    .line 456
    move-object/from16 v0, v16

    .line 457
    .line 458
    move-object/from16 v2, v17

    .line 459
    .line 460
    move/from16 v3, v18

    .line 461
    .line 462
    move/from16 v4, v19

    .line 463
    .line 464
    goto :goto_8

    .line 465
    :cond_12
    move-object/from16 v17, v2

    .line 466
    .line 467
    move/from16 v18, v3

    .line 468
    .line 469
    move/from16 v19, v4

    .line 470
    .line 471
    goto :goto_d

    .line 472
    :cond_13
    move-object/from16 v17, v2

    .line 473
    .line 474
    move/from16 v18, v3

    .line 475
    .line 476
    move/from16 v19, v4

    .line 477
    .line 478
    sget-object v6, La/iun;->a:La/iun;

    .line 479
    .line 480
    :goto_d
    new-instance v0, La/usf0;

    .line 481
    .line 482
    move-object/from16 p0, v0

    .line 483
    .line 484
    move-object/from16 p5, v6

    .line 485
    .line 486
    move-object/from16 p4, v8

    .line 487
    .line 488
    move-object/from16 p2, v12

    .line 489
    .line 490
    move-object/from16 p1, v13

    .line 491
    .line 492
    move-object/from16 p3, v14

    .line 493
    .line 494
    invoke-direct/range {p0 .. p5}, La/usf0;-><init>(La/go3;La/go3;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 495
    .line 496
    .line 497
    goto :goto_e

    .line 498
    :cond_14
    move-object/from16 v17, v2

    .line 499
    .line 500
    move/from16 v18, v3

    .line 501
    .line 502
    move/from16 v19, v4

    .line 503
    .line 504
    move/from16 p7, v8

    .line 505
    .line 506
    new-instance v0, La/usf0;

    .line 507
    .line 508
    invoke-static {v11}, La/cy2;->D(Ljava/lang/String;)La/go3;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    invoke-static {v11}, La/cy2;->D(Ljava/lang/String;)La/go3;

    .line 513
    .line 514
    .line 515
    move-result-object v3

    .line 516
    const-string v4, ""

    .line 517
    .line 518
    sget-object v6, La/iun;->a:La/iun;

    .line 519
    .line 520
    move-object v8, v6

    .line 521
    move-object/from16 p0, v0

    .line 522
    .line 523
    move-object/from16 p1, v2

    .line 524
    .line 525
    move-object/from16 p2, v3

    .line 526
    .line 527
    move-object/from16 p3, v4

    .line 528
    .line 529
    move-object/from16 p4, v6

    .line 530
    .line 531
    move-object/from16 p5, v8

    .line 532
    .line 533
    invoke-direct/range {p0 .. p5}, La/usf0;-><init>(La/go3;La/go3;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 534
    .line 535
    .line 536
    :goto_e
    invoke-virtual/range {v17 .. v17}, La/us3;->c()La/go3;

    .line 537
    .line 538
    .line 539
    move-result-object v2

    .line 540
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    iget-object v3, v0, La/usf0;->e:Ljava/util/List;

    .line 544
    .line 545
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 546
    .line 547
    .line 548
    move-result-object v3

    .line 549
    :cond_15
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 550
    .line 551
    .line 552
    move-result v4

    .line 553
    if-eqz v4, :cond_16

    .line 554
    .line 555
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v4

    .line 559
    move-object v6, v4

    .line 560
    check-cast v6, La/io2;

    .line 561
    .line 562
    iget-object v8, v6, La/io2;->a:Ljava/util/List;

    .line 563
    .line 564
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 565
    .line 566
    .line 567
    move-result-object v9

    .line 568
    invoke-interface {v8, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 569
    .line 570
    .line 571
    move-result v8

    .line 572
    if-eqz v8, :cond_15

    .line 573
    .line 574
    iget-object v6, v6, La/io2;->c:Ljava/lang/String;

    .line 575
    .line 576
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 577
    .line 578
    .line 579
    move-result v6

    .line 580
    if-lez v6, :cond_15

    .line 581
    .line 582
    goto :goto_f

    .line 583
    :cond_16
    const/4 v4, 0x0

    .line 584
    :goto_f
    check-cast v4, La/io2;

    .line 585
    .line 586
    if-eqz v4, :cond_17

    .line 587
    .line 588
    iget-object v3, v4, La/io2;->b:La/go3;

    .line 589
    .line 590
    goto :goto_10

    .line 591
    :cond_17
    iget-object v3, v0, La/usf0;->b:La/go3;

    .line 592
    .line 593
    :goto_10
    if-eqz v4, :cond_18

    .line 594
    .line 595
    iget-object v5, v4, La/io2;->d:Ljava/util/ArrayList;

    .line 596
    .line 597
    goto :goto_11

    .line 598
    :cond_18
    iget-object v5, v0, La/usf0;->d:Ljava/util/List;

    .line 599
    .line 600
    :goto_11
    if-eqz v4, :cond_1a

    .line 601
    .line 602
    iget-object v6, v4, La/io2;->c:Ljava/lang/String;

    .line 603
    .line 604
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 605
    .line 606
    .line 607
    move-result v8

    .line 608
    if-lez v8, :cond_19

    .line 609
    .line 610
    move-object v9, v6

    .line 611
    goto :goto_12

    .line 612
    :cond_19
    const/4 v9, 0x0

    .line 613
    :goto_12
    if-nez v9, :cond_1b

    .line 614
    .line 615
    :cond_1a
    iget-object v9, v0, La/usf0;->c:Ljava/lang/String;

    .line 616
    .line 617
    :cond_1b
    if-eqz v4, :cond_1c

    .line 618
    .line 619
    iget-object v0, v4, La/io2;->e:La/go3;

    .line 620
    .line 621
    goto :goto_13

    .line 622
    :cond_1c
    iget-object v0, v0, La/usf0;->a:La/go3;

    .line 623
    .line 624
    :goto_13
    if-nez v19, :cond_1e

    .line 625
    .line 626
    invoke-interface {v5, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 627
    .line 628
    .line 629
    move-result v6

    .line 630
    if-eqz v6, :cond_1e

    .line 631
    .line 632
    invoke-interface {v5, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 633
    .line 634
    .line 635
    move-result v5

    .line 636
    if-nez v5, :cond_1e

    .line 637
    .line 638
    if-eqz v4, :cond_1d

    .line 639
    .line 640
    invoke-virtual {v2, v3}, La/go3;->a(La/go3;)I

    .line 641
    .line 642
    .line 643
    move-result v4

    .line 644
    if-gez v4, :cond_1e

    .line 645
    .line 646
    :cond_1d
    move/from16 v4, p7

    .line 647
    .line 648
    goto :goto_14

    .line 649
    :cond_1e
    const/4 v4, 0x0

    .line 650
    :goto_14
    invoke-virtual {v2, v0}, La/go3;->a(La/go3;)I

    .line 651
    .line 652
    .line 653
    move-result v5

    .line 654
    if-gez v5, :cond_1f

    .line 655
    .line 656
    invoke-virtual {v3, v0}, La/go3;->a(La/go3;)I

    .line 657
    .line 658
    .line 659
    move-result v0

    .line 660
    if-ltz v0, :cond_1f

    .line 661
    .line 662
    move/from16 v0, p7

    .line 663
    .line 664
    goto :goto_15

    .line 665
    :cond_1f
    const/4 v0, 0x0

    .line 666
    :goto_15
    iget v5, v2, La/go3;->a:I

    .line 667
    .line 668
    iget v6, v3, La/go3;->a:I

    .line 669
    .line 670
    iget v8, v3, La/go3;->b:I

    .line 671
    .line 672
    if-lt v5, v6, :cond_21

    .line 673
    .line 674
    if-eqz v10, :cond_20

    .line 675
    .line 676
    iget v2, v2, La/go3;->b:I

    .line 677
    .line 678
    if-ge v2, v8, :cond_20

    .line 679
    .line 680
    if-ne v5, v6, :cond_20

    .line 681
    .line 682
    goto :goto_16

    .line 683
    :cond_20
    const/4 v2, 0x0

    .line 684
    goto :goto_17

    .line 685
    :cond_21
    :goto_16
    move/from16 v2, p7

    .line 686
    .line 687
    :goto_17
    if-nez v7, :cond_23

    .line 688
    .line 689
    if-nez v4, :cond_23

    .line 690
    .line 691
    if-eqz v0, :cond_22

    .line 692
    .line 693
    goto :goto_18

    .line 694
    :cond_22
    const/4 v0, 0x0

    .line 695
    goto :goto_19

    .line 696
    :cond_23
    :goto_18
    move/from16 v0, p7

    .line 697
    .line 698
    :goto_19
    if-eqz v7, :cond_24

    .line 699
    .line 700
    new-instance v4, La/go3;

    .line 701
    .line 702
    iget v3, v3, La/go3;->c:I

    .line 703
    .line 704
    add-int/lit8 v3, v3, 0x1

    .line 705
    .line 706
    invoke-direct {v4, v6, v8, v3}, La/go3;-><init>(III)V

    .line 707
    .line 708
    .line 709
    move-object v3, v4

    .line 710
    :cond_24
    if-nez v0, :cond_26

    .line 711
    .line 712
    if-nez v2, :cond_26

    .line 713
    .line 714
    if-eqz v18, :cond_25

    .line 715
    .line 716
    goto :goto_1a

    .line 717
    :cond_25
    new-instance v0, La/gm3;

    .line 718
    .line 719
    const/4 v2, 0x0

    .line 720
    invoke-direct {v0, v1, v2, v11}, La/gm3;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    .line 721
    .line 722
    .line 723
    return-object v0

    .line 724
    :cond_26
    :goto_1a
    new-instance v1, La/gm3;

    .line 725
    .line 726
    invoke-virtual {v3}, La/go3;->toString()Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v2

    .line 730
    invoke-direct {v1, v9, v0, v2}, La/gm3;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    .line 731
    .line 732
    .line 733
    return-object v1
.end method

.method public S()La/bbw0;
    .locals 7

    .line 1
    new-instance v0, La/bbw0;

    .line 2
    .line 3
    new-instance v1, La/kki;

    .line 4
    .line 5
    iget-object v2, p0, La/esg0;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/rkc0;

    .line 8
    .line 9
    iget-object v3, p0, La/esg0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, La/fhj;

    .line 12
    .line 13
    iget-object v4, p0, La/esg0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, La/ntu;

    .line 16
    .line 17
    iget-object v5, p0, La/esg0;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v5, La/iqt;

    .line 20
    .line 21
    iget-object p0, p0, La/esg0;->e:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v6, p0

    .line 24
    check-cast v6, La/wtt;

    .line 25
    .line 26
    invoke-direct/range {v1 .. v6}, La/kki;-><init>(La/rkc0;La/fhj;La/ntu;La/iqt;La/wtt;)V

    .line 27
    .line 28
    .line 29
    new-instance p0, La/uxs0;

    .line 30
    .line 31
    const/16 v2, 0xc

    .line 32
    .line 33
    invoke-direct {p0, v2}, La/uxs0;-><init>(B)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, v1, p0}, La/bbw0;-><init>(La/kki;La/uxs0;)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method public U()I
    .locals 2

    .line 1
    invoke-static {}, La/ofm0;->m()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/esg0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, La/ibe0;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    const-string v1, "The ImageReader is not initialized."

    .line 14
    .line 15
    invoke-static {v1, v0}, La/z1x;->y(Ljava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, La/esg0;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, La/ibe0;

    .line 21
    .line 22
    iget-object v0, p0, La/ibe0;->c:Ljava/lang/Object;

    .line 23
    .line 24
    monitor-enter v0

    .line 25
    :try_start_0
    iget-object v1, p0, La/ibe0;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, La/e1x;

    .line 28
    .line 29
    invoke-interface {v1}, La/e1x;->G()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    iget p0, p0, La/ibe0;->a:I

    .line 34
    .line 35
    sub-int/2addr v1, p0

    .line 36
    monitor-exit v0

    .line 37
    return v1

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    throw p0
.end method

.method public W(ILandroid/content/Context;)Landroid/content/res/ColorStateList;
    .locals 7

    .line 1
    const v0, 0x7f0801c5

    .line 2
    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    const p0, 0x7f060015

    .line 7
    .line 8
    .line 9
    invoke-static {p0, p2}, La/jiq0;->n0(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const v0, 0x7f0801f3

    .line 15
    .line 16
    .line 17
    if-ne p1, v0, :cond_1

    .line 18
    .line 19
    const p0, 0x7f060018

    .line 20
    .line 21
    .line 22
    invoke-static {p0, p2}, La/jiq0;->n0(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_1
    const v0, 0x7f0801f2

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    if-ne p1, v0, :cond_3

    .line 32
    .line 33
    const/4 p0, 0x3

    .line 34
    new-array p1, p0, [[I

    .line 35
    .line 36
    new-array p0, p0, [I

    .line 37
    .line 38
    const v0, 0x7f040209

    .line 39
    .line 40
    .line 41
    invoke-static {v0, p2}, La/ybq0;->d(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const/4 v3, 0x2

    .line 46
    const v4, 0x7f0401d3

    .line 47
    .line 48
    .line 49
    const/4 v5, 0x1

    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    invoke-virtual {v2}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_2

    .line 57
    .line 58
    sget-object v0, La/ybq0;->b:[I

    .line 59
    .line 60
    aput-object v0, p1, v1

    .line 61
    .line 62
    invoke-virtual {v2, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    aput v0, p0, v1

    .line 67
    .line 68
    sget-object v0, La/ybq0;->e:[I

    .line 69
    .line 70
    aput-object v0, p1, v5

    .line 71
    .line 72
    invoke-static {v4, p2}, La/ybq0;->c(ILandroid/content/Context;)I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    aput p2, p0, v5

    .line 77
    .line 78
    sget-object p2, La/ybq0;->f:[I

    .line 79
    .line 80
    aput-object p2, p1, v3

    .line 81
    .line 82
    invoke-virtual {v2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    aput p2, p0, v3

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    sget-object v2, La/ybq0;->b:[I

    .line 90
    .line 91
    aput-object v2, p1, v1

    .line 92
    .line 93
    invoke-static {v0, p2}, La/ybq0;->b(ILandroid/content/Context;)I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    aput v2, p0, v1

    .line 98
    .line 99
    sget-object v1, La/ybq0;->e:[I

    .line 100
    .line 101
    aput-object v1, p1, v5

    .line 102
    .line 103
    invoke-static {v4, p2}, La/ybq0;->c(ILandroid/content/Context;)I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    aput v1, p0, v5

    .line 108
    .line 109
    sget-object v1, La/ybq0;->f:[I

    .line 110
    .line 111
    aput-object v1, p1, v3

    .line 112
    .line 113
    invoke-static {v0, p2}, La/ybq0;->c(ILandroid/content/Context;)I

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    aput p2, p0, v3

    .line 118
    .line 119
    :goto_0
    new-instance p2, Landroid/content/res/ColorStateList;

    .line 120
    .line 121
    invoke-direct {p2, p1, p0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 122
    .line 123
    .line 124
    return-object p2

    .line 125
    :cond_3
    const v0, 0x7f0801b9

    .line 126
    .line 127
    .line 128
    if-ne p1, v0, :cond_4

    .line 129
    .line 130
    const p0, 0x7f0401cf

    .line 131
    .line 132
    .line 133
    invoke-static {p0, p2}, La/ybq0;->c(ILandroid/content/Context;)I

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    invoke-static {p0, p2}, La/esg0;->y(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0

    .line 142
    :cond_4
    const v0, 0x7f0801b3

    .line 143
    .line 144
    .line 145
    if-ne p1, v0, :cond_5

    .line 146
    .line 147
    invoke-static {v1, p2}, La/esg0;->y(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    return-object p0

    .line 152
    :cond_5
    const v0, 0x7f0801b8

    .line 153
    .line 154
    .line 155
    if-ne p1, v0, :cond_6

    .line 156
    .line 157
    const p0, 0x7f0401cd

    .line 158
    .line 159
    .line 160
    invoke-static {p0, p2}, La/ybq0;->c(ILandroid/content/Context;)I

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    invoke-static {p0, p2}, La/esg0;->y(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    return-object p0

    .line 169
    :cond_6
    const v0, 0x7f0801ee

    .line 170
    .line 171
    .line 172
    if-eq p1, v0, :cond_c

    .line 173
    .line 174
    const v0, 0x7f0801ef

    .line 175
    .line 176
    .line 177
    if-ne p1, v0, :cond_7

    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_7
    iget-object v0, p0, La/esg0;->b:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v0, [I

    .line 183
    .line 184
    invoke-static {v0, p1}, La/esg0;->p([II)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-eqz v0, :cond_8

    .line 189
    .line 190
    const p0, 0x7f0401d5

    .line 191
    .line 192
    .line 193
    invoke-static {p0, p2}, La/ybq0;->d(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    return-object p0

    .line 198
    :cond_8
    iget-object v0, p0, La/esg0;->e:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v0, [I

    .line 201
    .line 202
    invoke-static {v0, p1}, La/esg0;->p([II)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_9

    .line 207
    .line 208
    const p0, 0x7f060014

    .line 209
    .line 210
    .line 211
    invoke-static {p0, p2}, La/jiq0;->n0(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    return-object p0

    .line 216
    :cond_9
    iget-object p0, p0, La/esg0;->f:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast p0, [I

    .line 219
    .line 220
    invoke-static {p0, p1}, La/esg0;->p([II)Z

    .line 221
    .line 222
    .line 223
    move-result p0

    .line 224
    if-eqz p0, :cond_a

    .line 225
    .line 226
    const p0, 0x7f060013

    .line 227
    .line 228
    .line 229
    invoke-static {p0, p2}, La/jiq0;->n0(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    return-object p0

    .line 234
    :cond_a
    const p0, 0x7f0801eb

    .line 235
    .line 236
    .line 237
    if-ne p1, p0, :cond_b

    .line 238
    .line 239
    const p0, 0x7f060016

    .line 240
    .line 241
    .line 242
    invoke-static {p0, p2}, La/jiq0;->n0(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    return-object p0

    .line 247
    :cond_b
    const/4 p0, 0x0

    .line 248
    return-object p0

    .line 249
    :cond_c
    :goto_1
    const p0, 0x7f060017

    .line 250
    .line 251
    .line 252
    invoke-static {p0, p2}, La/jiq0;->n0(ILandroid/content/Context;)Landroid/content/res/ColorStateList;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    return-object p0
.end method

.method public X(JLa/zje;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, La/oqc;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/oqc;

    .line 11
    .line 12
    iget v3, v2, La/oqc;->l:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/oqc;->l:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/oqc;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/oqc;-><init>(La/esg0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/oqc;->j:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/oqc;->l:I

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x3

    .line 37
    const/4 v7, 0x2

    .line 38
    const/4 v8, 0x1

    .line 39
    if-eqz v4, :cond_4

    .line 40
    .line 41
    if-eq v4, v8, :cond_3

    .line 42
    .line 43
    if-eq v4, v7, :cond_2

    .line 44
    .line 45
    if-ne v4, v6, :cond_1

    .line 46
    .line 47
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_9

    .line 51
    .line 52
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v5

    .line 58
    :cond_2
    iget-wide v4, v2, La/oqc;->i:J

    .line 59
    .line 60
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_7

    .line 64
    .line 65
    :cond_3
    iget-wide v4, v2, La/oqc;->i:J

    .line 66
    .line 67
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    move-object v1, v3

    .line 71
    goto/16 :goto_5

    .line 72
    .line 73
    :cond_4
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object v1, v0, La/esg0;->a:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, La/tdl0;

    .line 79
    .line 80
    iget-object v4, v1, La/tdl0;->d:La/jym0;

    .line 81
    .line 82
    iget-object v4, v4, La/jym0;->a:La/p7m0;

    .line 83
    .line 84
    :goto_1
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    move-object v10, v9

    .line 89
    check-cast v10, Ljava/util/List;

    .line 90
    .line 91
    invoke-virtual {v4, v9, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v9

    .line 95
    if-eqz v9, :cond_c

    .line 96
    .line 97
    iget-object v9, v1, La/tdl0;->c:La/k3h0;

    .line 98
    .line 99
    iget-object v10, v9, La/k3h0;->b:La/p7m0;

    .line 100
    .line 101
    :goto_2
    invoke-virtual {v10}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    move-object v11, v4

    .line 106
    check-cast v11, La/bg30;

    .line 107
    .line 108
    invoke-virtual {v10, v4, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-eqz v4, :cond_b

    .line 113
    .line 114
    const-wide/16 v10, -0x1

    .line 115
    .line 116
    iput-wide v10, v9, La/k3h0;->a:J

    .line 117
    .line 118
    iget-object v1, v1, La/tdl0;->m:La/yr20;

    .line 119
    .line 120
    iget-object v4, v1, La/yr20;->a:La/p7m0;

    .line 121
    .line 122
    :goto_3
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    move-object v9, v1

    .line 127
    check-cast v9, Ljava/util/List;

    .line 128
    .line 129
    invoke-virtual {v4, v1, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-eqz v1, :cond_a

    .line 134
    .line 135
    iget-object v1, v0, La/esg0;->b:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v1, La/kym0;

    .line 138
    .line 139
    new-instance v9, La/tvm0;

    .line 140
    .line 141
    const/4 v15, 0x1

    .line 142
    const/4 v10, 0x0

    .line 143
    move-wide/from16 v13, p1

    .line 144
    .line 145
    move-wide/from16 v11, p1

    .line 146
    .line 147
    invoke-direct/range {v9 .. v15}, La/tvm0;-><init>(Ljava/lang/String;JJI)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    iget-object v1, v1, La/kym0;->b:La/yvf;

    .line 154
    .line 155
    invoke-virtual {v1, v9}, La/yvf;->b(La/xvm0;)V

    .line 156
    .line 157
    .line 158
    iget-object v1, v0, La/esg0;->c:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v1, La/p530;

    .line 161
    .line 162
    iput-wide v11, v2, La/oqc;->i:J

    .line 163
    .line 164
    iput v8, v2, La/oqc;->l:I

    .line 165
    .line 166
    iget-object v1, v1, La/p530;->a:La/m530;

    .line 167
    .line 168
    invoke-virtual {v1, v2}, La/m530;->a(La/zje;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    sget-object v4, La/wne;->a:La/wne;

    .line 173
    .line 174
    if-ne v1, v4, :cond_5

    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_5
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    :goto_4
    if-ne v1, v3, :cond_6

    .line 180
    .line 181
    goto :goto_8

    .line 182
    :cond_6
    move-object v1, v4

    .line 183
    move-wide v4, v11

    .line 184
    :goto_5
    iget-object v8, v0, La/esg0;->d:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v8, La/rr20;

    .line 187
    .line 188
    iput-wide v4, v2, La/oqc;->i:J

    .line 189
    .line 190
    iput v7, v2, La/oqc;->l:I

    .line 191
    .line 192
    iget-object v7, v8, La/rr20;->a:La/x2b;

    .line 193
    .line 194
    invoke-virtual {v7, v2}, La/x2b;->a(La/zje;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v7

    .line 198
    if-ne v7, v1, :cond_7

    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_7
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 202
    .line 203
    :goto_6
    if-ne v7, v3, :cond_8

    .line 204
    .line 205
    goto :goto_8

    .line 206
    :cond_8
    :goto_7
    iget-object v1, v0, La/esg0;->e:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v1, La/bl6;

    .line 209
    .line 210
    iput-wide v4, v2, La/oqc;->i:J

    .line 211
    .line 212
    iput v6, v2, La/oqc;->l:I

    .line 213
    .line 214
    invoke-virtual {v1}, La/bl6;->a()Lkotlin/Unit;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    if-ne v1, v3, :cond_9

    .line 219
    .line 220
    :goto_8
    return-object v3

    .line 221
    :cond_9
    :goto_9
    iget-object v0, v0, La/esg0;->f:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v0, La/w5s;

    .line 224
    .line 225
    sget-object v1, La/p5s;->a:La/p5s;

    .line 226
    .line 227
    invoke-virtual {v0, v1}, La/w5s;->a(La/u5s;)V

    .line 228
    .line 229
    .line 230
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 231
    .line 232
    return-object v0

    .line 233
    :cond_a
    move-wide/from16 v11, p1

    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_b
    move-wide/from16 v11, p1

    .line 237
    .line 238
    goto/16 :goto_2

    .line 239
    .line 240
    :cond_c
    move-wide/from16 v11, p1

    .line 241
    .line 242
    goto/16 :goto_1
.end method

.method public Y(La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, La/wpc;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/wpc;

    .line 7
    .line 8
    iget v1, v0, La/wpc;->k:I

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
    iput v1, v0, La/wpc;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/wpc;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/wpc;-><init>(La/esg0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/wpc;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/wpc;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v6, :cond_3

    .line 38
    .line 39
    if-eq v2, v5, :cond_2

    .line 40
    .line 41
    if-ne v2, v4, :cond_1

    .line 42
    .line 43
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_4

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, La/esg0;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, La/jtj;

    .line 67
    .line 68
    iput v6, v0, La/wpc;->k:I

    .line 69
    .line 70
    invoke-virtual {p1, v0}, La/jtj;->k(La/zje;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-ne p1, v1, :cond_5

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_5
    :goto_1
    iget-object p1, p0, La/esg0;->c:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p1, La/mpc;

    .line 80
    .line 81
    iget-object p1, p1, La/mpc;->a:La/g45;

    .line 82
    .line 83
    iget-object p1, p1, La/g45;->a:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p1, La/lye;

    .line 86
    .line 87
    iget-object v2, p1, La/lye;->e:Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 90
    .line 91
    .line 92
    iget-object p1, p1, La/lye;->f:Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 95
    .line 96
    .line 97
    iget-object p1, p0, La/esg0;->b:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p1, La/j9c;

    .line 100
    .line 101
    iget-object p1, p1, La/j9c;->a:La/g45;

    .line 102
    .line 103
    iget-object p1, p1, La/g45;->a:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p1, La/lye;

    .line 106
    .line 107
    iput-object v3, p1, La/lye;->g:Ljava/lang/Integer;

    .line 108
    .line 109
    iget-object p1, p0, La/esg0;->e:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast p1, La/vit0;

    .line 112
    .line 113
    sget-object v2, La/q4f;->b:La/q4f;

    .line 114
    .line 115
    iput v5, v0, La/wpc;->k:I

    .line 116
    .line 117
    invoke-virtual {p1, v2, v0}, La/vit0;->g(La/q4f;La/zje;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    if-ne p1, v1, :cond_6

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_6
    :goto_2
    iget-object p1, p0, La/esg0;->d:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast p1, La/ipc;

    .line 127
    .line 128
    iput v4, v0, La/wpc;->k:I

    .line 129
    .line 130
    invoke-virtual {p1, v0}, La/ipc;->b(La/zje;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    if-ne p1, v1, :cond_7

    .line 135
    .line 136
    :goto_3
    return-object v1

    .line 137
    :cond_7
    :goto_4
    iget-object p0, p0, La/esg0;->f:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast p0, La/ni9;

    .line 140
    .line 141
    invoke-virtual {p0}, La/ni9;->b()V

    .line 142
    .line 143
    .line 144
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    return-object p0
.end method

.method public Z(Z)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/esg0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/dzt;

    .line 6
    .line 7
    iget-object v1, v1, La/dzt;->a:La/v6j0;

    .line 8
    .line 9
    iget-object v2, v0, La/esg0;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, La/pru;

    .line 12
    .line 13
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-boolean v2, v2, La/sff0;->o0:Z

    .line 18
    .line 19
    if-eqz v2, :cond_a

    .line 20
    .line 21
    iget-object v2, v0, La/esg0;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, La/gqt;

    .line 24
    .line 25
    invoke-virtual {v2}, La/gqt;->a()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_a

    .line 30
    .line 31
    invoke-virtual {v1}, La/v6j0;->a()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    const-wide/16 v4, 0x3e8

    .line 36
    .line 37
    mul-long v9, v2, v4

    .line 38
    .line 39
    iget-object v2, v0, La/esg0;->d:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v2, La/gqt;

    .line 42
    .line 43
    iget-object v2, v2, La/gqt;->a:La/gst0;

    .line 44
    .line 45
    invoke-virtual {v2}, La/gst0;->c()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v1}, La/v6j0;->a()J

    .line 50
    .line 51
    .line 52
    move-result-wide v6

    .line 53
    const-wide/16 v11, 0xb4

    .line 54
    .line 55
    add-long/2addr v6, v11

    .line 56
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 57
    .line 58
    .line 59
    move-result-wide v11

    .line 60
    div-long/2addr v11, v4

    .line 61
    cmp-long v1, v6, v11

    .line 62
    .line 63
    if-gez v1, :cond_0

    .line 64
    .line 65
    goto/16 :goto_0

    .line 66
    .line 67
    :cond_0
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_2

    .line 72
    .line 73
    if-nez p1, :cond_2

    .line 74
    .line 75
    iget-object v0, v0, La/esg0;->e:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, La/w5z;

    .line 78
    .line 79
    iget-object v1, v0, La/w5z;->a:Ljava/lang/Object;

    .line 80
    .line 81
    move-object v13, v1

    .line 82
    check-cast v13, La/on4;

    .line 83
    .line 84
    iget-object v1, v0, La/w5z;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v1, La/ik4;

    .line 87
    .line 88
    iget-object v2, v0, La/w5z;->d:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v2, La/rrc;

    .line 91
    .line 92
    iget-object v3, v2, La/rrc;->b:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v3, La/tgk;

    .line 95
    .line 96
    new-instance v11, La/b0c0;

    .line 97
    .line 98
    const/16 v17, 0x0

    .line 99
    .line 100
    const/16 v18, 0x18

    .line 101
    .line 102
    const/4 v12, 0x0

    .line 103
    const-class v14, La/on4;

    .line 104
    .line 105
    const-string v15, "canScheduleExactAlarms"

    .line 106
    .line 107
    const-string v16, "canScheduleExactAlarms()Z"

    .line 108
    .line 109
    invoke-direct/range {v11 .. v18}, La/b0c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 110
    .line 111
    .line 112
    new-instance v4, La/zt;

    .line 113
    .line 114
    const/16 v5, 0x9

    .line 115
    .line 116
    invoke-direct {v4, v0, v9, v10, v5}, La/zt;-><init>(Ljava/lang/Object;JB)V

    .line 117
    .line 118
    .line 119
    invoke-static {v11, v4}, La/nkb;->G(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-eqz v4, :cond_1

    .line 124
    .line 125
    iget-object v2, v13, La/on4;->a:La/ln4;

    .line 126
    .line 127
    iget-object v2, v2, La/ln4;->a:La/us00;

    .line 128
    .line 129
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    new-instance v4, Landroid/content/ComponentName;

    .line 134
    .line 135
    const-class v5, Lorg/xplatform/authreminder/impl/CheckAuthReminderBroadcastReceiver;

    .line 136
    .line 137
    invoke-direct {v4, v2, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 138
    .line 139
    .line 140
    const/4 v2, 0x1

    .line 141
    invoke-virtual {v3, v4, v2, v2}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 142
    .line 143
    .line 144
    iget-object v1, v1, La/ik4;->a:La/s1p;

    .line 145
    .line 146
    const-wide/16 v2, 0xbf8

    .line 147
    .line 148
    sget-object v4, La/xun;->a:La/xun;

    .line 149
    .line 150
    invoke-virtual {v1, v4, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 151
    .line 152
    .line 153
    iget-object v0, v0, La/w5z;->e:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, La/nr;

    .line 156
    .line 157
    iget-object v0, v0, La/nr;->b:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, La/kt2;

    .line 160
    .line 161
    const-string v1, "auth_notifications_scheduled"

    .line 162
    .line 163
    invoke-interface {v0, v1}, La/kt2;->c(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :cond_1
    invoke-virtual {v2}, La/rrc;->H()I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 175
    .line 176
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-static {}, La/tgk;->c()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-virtual {v1, v0, v2}, La/ik4;->a(ILjava/lang/String;)V

    .line 187
    .line 188
    .line 189
    return-void

    .line 190
    :cond_2
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    if-eqz v3, :cond_4

    .line 204
    .line 205
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    move-object v4, v3

    .line 210
    check-cast v4, La/mn4;

    .line 211
    .line 212
    iget-boolean v4, v4, La/mn4;->b:Z

    .line 213
    .line 214
    if-nez v4, :cond_3

    .line 215
    .line 216
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    goto :goto_1

    .line 220
    :cond_4
    new-instance v7, Ljava/util/ArrayList;

    .line 221
    .line 222
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    :cond_5
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    if-eqz v2, :cond_8

    .line 234
    .line 235
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    check-cast v2, La/mn4;

    .line 240
    .line 241
    invoke-static {}, La/fzs0;->values()[La/fzs0;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    array-length v4, v3

    .line 246
    const/4 v5, 0x0

    .line 247
    :goto_3
    if-ge v5, v4, :cond_7

    .line 248
    .line 249
    aget-object v6, v3, v5

    .line 250
    .line 251
    invoke-virtual {v6}, La/fzs0;->b()I

    .line 252
    .line 253
    .line 254
    move-result v8

    .line 255
    iget v11, v2, La/mn4;->a:I

    .line 256
    .line 257
    if-ne v8, v11, :cond_6

    .line 258
    .line 259
    goto :goto_4

    .line 260
    :cond_6
    add-int/lit8 v5, v5, 0x1

    .line 261
    .line 262
    goto :goto_3

    .line 263
    :cond_7
    const/4 v6, 0x0

    .line 264
    :goto_4
    if-eqz v6, :cond_5

    .line 265
    .line 266
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    goto :goto_2

    .line 270
    :cond_8
    iget-object v0, v0, La/esg0;->f:Ljava/lang/Object;

    .line 271
    .line 272
    move-object v8, v0

    .line 273
    check-cast v8, La/c5c;

    .line 274
    .line 275
    iget-object v0, v8, La/c5c;->b:La/rrc;

    .line 276
    .line 277
    iget-object v1, v0, La/rrc;->b:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v1, La/tgk;

    .line 280
    .line 281
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    if-eqz v2, :cond_9

    .line 286
    .line 287
    goto :goto_5

    .line 288
    :cond_9
    new-instance v11, La/pw4;

    .line 289
    .line 290
    iget-object v13, v8, La/c5c;->a:La/on4;

    .line 291
    .line 292
    const/16 v17, 0x0

    .line 293
    .line 294
    const/16 v18, 0x11

    .line 295
    .line 296
    const/4 v12, 0x0

    .line 297
    const-class v14, La/on4;

    .line 298
    .line 299
    const-string v15, "canScheduleExactAlarms"

    .line 300
    .line 301
    const-string v16, "canScheduleExactAlarms()Z"

    .line 302
    .line 303
    invoke-direct/range {v11 .. v18}, La/pw4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 304
    .line 305
    .line 306
    move-object v2, v11

    .line 307
    new-instance v6, La/pe1;

    .line 308
    .line 309
    const/4 v11, 0x2

    .line 310
    invoke-direct/range {v6 .. v11}, La/pe1;-><init>(Ljava/lang/Object;Ljava/lang/Object;JB)V

    .line 311
    .line 312
    .line 313
    invoke-static {v2, v6}, La/nkb;->G(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Z

    .line 314
    .line 315
    .line 316
    move-result v2

    .line 317
    if-nez v2, :cond_a

    .line 318
    .line 319
    iget-object v2, v8, La/c5c;->c:La/ik4;

    .line 320
    .line 321
    invoke-virtual {v0}, La/rrc;->H()I

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    sget-object v3, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 329
    .line 330
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    invoke-static {}, La/tgk;->c()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    invoke-virtual {v2, v0, v1}, La/ik4;->a(ILjava/lang/String;)V

    .line 341
    .line 342
    .line 343
    :cond_a
    :goto_5
    return-void
.end method

.method public a(La/v0;La/d3d0;)Ljava/util/List;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/v0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, La/h950;

    .line 7
    .line 8
    iget p2, p2, La/d3d0;->d:I

    .line 9
    .line 10
    invoke-interface {v0, p2}, La/h950;->getString(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    move-object v0, p1

    .line 15
    check-cast v0, La/p4d0;

    .line 16
    .line 17
    iget-object v0, v0, La/p4d0;->g:La/qlc;

    .line 18
    .line 19
    invoke-virtual {v0}, La/qlc;->b()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, La/ulc;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v3, La/er30;

    .line 31
    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/16 p2, 0x23

    .line 38
    .line 39
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-direct {v3, p2}, La/er30;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    const/16 v6, 0x3c

    .line 54
    .line 55
    const/4 v4, 0x0

    .line 56
    move-object v1, p0

    .line 57
    move-object v2, p1

    .line 58
    invoke-static/range {v1 .. v6}, La/esg0;->L(La/esg0;La/v0;La/er30;Ljava/lang/Boolean;ZI)Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method

.method public a0(La/qlc;)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, La/qlc;->e()La/qlc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {p1}, La/qlc;->f()La/g950;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, La/g950;->b()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v2, "Container"

    .line 17
    .line 18
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    iget-object v0, p0, La/esg0;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, La/yox;

    .line 28
    .line 29
    iget-object p0, p0, La/esg0;->f:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, La/vd40;

    .line 32
    .line 33
    invoke-static {v0, p1, p0}, La/c9x;->u(La/yox;La/qlc;La/vd40;)La/jre0;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-eqz p0, :cond_3

    .line 38
    .line 39
    sget-object p1, La/kxk0;->a:Ljava/util/LinkedHashSet;

    .line 40
    .line 41
    new-instance p1, La/hie0;

    .line 42
    .line 43
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, La/jre0;->a:Ljava/lang/Class;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    array-length v0, p0

    .line 56
    move v2, v1

    .line 57
    :goto_0
    const/4 v3, 0x1

    .line 58
    if-ge v2, v0, :cond_2

    .line 59
    .line 60
    aget-object v4, p0, v2

    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {v4}, La/azw;->F(Ljava/lang/annotation/Annotation;)La/sgy;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-static {v5}, La/azw;->G(La/sgy;)Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-static {v5}, La/bqe0;->a(Ljava/lang/Class;)La/qlc;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    new-instance v6, La/zpe0;

    .line 78
    .line 79
    invoke-direct {v6, v4}, La/zpe0;-><init>(Ljava/lang/annotation/Annotation;)V

    .line 80
    .line 81
    .line 82
    sget-object v4, La/aey;->b:La/qlc;

    .line 83
    .line 84
    invoke-virtual {v5, v4}, La/qlc;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-eqz v4, :cond_1

    .line 89
    .line 90
    iput-boolean v3, p1, La/hie0;->a:Z

    .line 91
    .line 92
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_2
    iget-boolean p0, p1, La/hie0;->a:Z

    .line 96
    .line 97
    if-eqz p0, :cond_3

    .line 98
    .line 99
    return v3

    .line 100
    :cond_3
    :goto_1
    return v1
.end method

.method public b(La/p4d0;)Ljava/util/List;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/p4d0;->e:La/s2d0;

    .line 5
    .line 6
    iget v0, v0, La/s2d0;->d:I

    .line 7
    .line 8
    sget-object v1, La/njq;->c:La/kjq;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    sget-object p0, La/iun;->a:La/iun;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    iget-object v0, p1, La/v0;->d:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, La/gmk0;

    .line 26
    .line 27
    instance-of v1, v0, La/ory;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    check-cast v0, La/ory;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object v0, v2

    .line 36
    :goto_0
    if-eqz v0, :cond_2

    .line 37
    .line 38
    iget-object v0, v0, La/ory;->a:La/jre0;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move-object v0, v2

    .line 42
    :goto_1
    if-eqz v0, :cond_5

    .line 43
    .line 44
    new-instance p1, Ljava/util/ArrayList;

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 48
    .line 49
    .line 50
    iget-object v0, v0, La/jre0;->a:Ljava/lang/Class;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    array-length v1, v0

    .line 60
    const/4 v2, 0x0

    .line 61
    :goto_2
    if-ge v2, v1, :cond_4

    .line 62
    .line 63
    aget-object v3, v0, v2

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-static {v3}, La/azw;->F(Ljava/lang/annotation/Annotation;)La/sgy;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-static {v4}, La/azw;->G(La/sgy;)Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-static {v4}, La/bqe0;->a(Ljava/lang/Class;)La/qlc;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    new-instance v6, La/zpe0;

    .line 81
    .line 82
    invoke-direct {v6, v3}, La/zpe0;-><init>(Ljava/lang/annotation/Annotation;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v5, v6, p1}, La/esg0;->d0(La/qlc;La/zpe0;Ljava/util/List;)La/xzp;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    if-eqz v5, :cond_3

    .line 90
    .line 91
    invoke-static {v5, v3, v4}, La/gfx;->O(La/lry;Ljava/lang/annotation/Annotation;Ljava/lang/Class;)V

    .line 92
    .line 93
    .line 94
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_4
    return-object p1

    .line 98
    :cond_5
    iget-object p0, p1, La/p4d0;->g:La/qlc;

    .line 99
    .line 100
    invoke-virtual {p0}, La/qlc;->a()La/swq;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    const-string p1, "Class for loading annotations is not found: "

    .line 105
    .line 106
    invoke-static {p0, p1}, La/e9d0;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-object v2
.end method

.method public c(La/v0;La/p3d0;La/wsy;)Ljava/lang/Object;
    .locals 6

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
    const/4 v3, 0x2

    .line 11
    sget-object v5, La/x0;->c:La/x0;

    .line 12
    .line 13
    move-object v0, p0

    .line 14
    move-object v1, p1

    .line 15
    move-object v2, p2

    .line 16
    move-object v4, p3

    .line 17
    invoke-virtual/range {v0 .. v5}, La/esg0;->e0(La/v0;La/p3d0;ILa/wsy;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public c0(La/qlc;La/gmk0;Ljava/util/List;)La/xzp;
    .locals 8

    .line 1
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/zm40;

    .line 4
    .line 5
    iget-object v1, p0, La/esg0;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/n660;

    .line 8
    .line 9
    invoke-static {v0, p1, v1}, La/obb;->X(La/ym40;La/qlc;La/n660;)La/wm40;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    new-instance v2, La/xzp;

    .line 14
    .line 15
    move-object v3, p0

    .line 16
    move-object v5, p1

    .line 17
    move-object v7, p2

    .line 18
    move-object v6, p3

    .line 19
    invoke-direct/range {v2 .. v7}, La/xzp;-><init>(La/esg0;La/wm40;La/qlc;Ljava/util/List;La/gmk0;)V

    .line 20
    .line 21
    .line 22
    return-object v2
.end method

.method public d(La/v0;La/z3;I)Ljava/util/List;
    .locals 1

    .line 1
    if-eqz p3, :cond_2

    .line 2
    .line 3
    instance-of v0, p2, La/i3d0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move-object v0, p2

    .line 8
    check-cast v0, La/i3d0;

    .line 9
    .line 10
    iget-object v0, v0, La/i3d0;->o:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    instance-of v0, p2, La/p3d0;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    move-object v0, p2

    .line 22
    check-cast v0, La/p3d0;

    .line 23
    .line 24
    iget-object v0, v0, La/p3d0;->o:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v0, 0x0

    .line 32
    :goto_0
    invoke-virtual {p0, p1, p2, p3, v0}, La/esg0;->f0(La/v0;La/z3;II)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_2
    const/4 p0, 0x0

    .line 38
    throw p0
.end method

.method public d0(La/qlc;La/zpe0;Ljava/util/List;)La/xzp;
    .locals 1

    .line 1
    sget-object v0, La/kxk0;->a:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return-object p0

    .line 11
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, La/esg0;->c0(La/qlc;La/gmk0;Ljava/util/List;)La/xzp;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public e(La/v0;La/p3d0;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p2, La/p3d0;->d:I

    .line 5
    .line 6
    sget-object v1, La/njq;->c:La/kjq;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    sget-object p0, La/iun;->a:La/iun;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    sget-object v0, La/z0;->c:La/z0;

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2, v0}, La/esg0;->g0(La/v0;La/p3d0;La/z0;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    :goto_0
    return-object p0
.end method

.method public e0(La/v0;La/p3d0;ILa/wsy;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, La/njq;->E:La/kjq;

    .line 2
    .line 3
    iget v1, p2, La/p3d0;->d:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v5

    .line 9
    invoke-static {p2}, La/egy;->d(La/p3d0;)Z

    .line 10
    .line 11
    .line 12
    move-result v6

    .line 13
    iget-object v0, p0, La/esg0;->a:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v7, v0

    .line 16
    check-cast v7, La/yox;

    .line 17
    .line 18
    iget-object v0, p0, La/esg0;->f:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v8, v0

    .line 21
    check-cast v8, La/vd40;

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    const/4 v4, 0x1

    .line 25
    move-object v2, p1

    .line 26
    invoke-static/range {v2 .. v8}, La/b34;->i0(La/v0;ZZLjava/lang/Boolean;ZLa/yox;La/vd40;)La/jre0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/4 v0, 0x0

    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    instance-of p1, v2, La/p4d0;

    .line 34
    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    move-object p1, v2

    .line 38
    check-cast p1, La/p4d0;

    .line 39
    .line 40
    iget-object p1, p1, La/v0;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, La/gmk0;

    .line 43
    .line 44
    instance-of v1, p1, La/ory;

    .line 45
    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    check-cast p1, La/ory;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move-object p1, v0

    .line 52
    :goto_0
    if-eqz p1, :cond_1

    .line 53
    .line 54
    iget-object p1, p1, La/ory;->a:La/jre0;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    move-object p1, v0

    .line 58
    :cond_2
    :goto_1
    if-nez p1, :cond_3

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    iget-object v1, p1, La/jre0;->b:La/cry;

    .line 62
    .line 63
    iget-object v1, v1, La/cry;->d:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, La/vd40;

    .line 66
    .line 67
    sget-object v3, La/jfk;->e:La/vd40;

    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget v4, v3, La/e28;->b:I

    .line 73
    .line 74
    iget v5, v3, La/e28;->c:I

    .line 75
    .line 76
    iget v3, v3, La/e28;->d:I

    .line 77
    .line 78
    invoke-virtual {v1, v4, v5, v3}, La/e28;->a(III)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    iget-object v3, v2, La/v0;->b:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v3, La/h950;

    .line 85
    .line 86
    iget-object v2, v2, La/v0;->c:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v2, La/roi0;

    .line 89
    .line 90
    invoke-static {p2, v3, v2, p3, v1}, La/esg0;->T(La/z3;La/h950;La/roi0;IZ)La/er30;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    if-nez p2, :cond_4

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_4
    iget-object p0, p0, La/esg0;->b:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p0, La/zt00;

    .line 100
    .line 101
    invoke-virtual {p0, p1}, La/zt00;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-interface {p5, p0, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    if-nez p0, :cond_5

    .line 110
    .line 111
    :goto_2
    return-object v0

    .line 112
    :cond_5
    invoke-static {p4}, La/nft0;->a(La/wsy;)Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-eqz p1, :cond_9

    .line 117
    .line 118
    check-cast p0, La/r2e;

    .line 119
    .line 120
    instance-of p1, p0, La/rg9;

    .line 121
    .line 122
    if-eqz p1, :cond_6

    .line 123
    .line 124
    new-instance p1, La/u1t0;

    .line 125
    .line 126
    check-cast p0, La/rg9;

    .line 127
    .line 128
    iget-object p0, p0, La/r2e;->a:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast p0, Ljava/lang/Number;

    .line 131
    .line 132
    invoke-virtual {p0}, Ljava/lang/Number;->byteValue()B

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    invoke-direct {p1, p0}, La/u1t0;-><init>(B)V

    .line 137
    .line 138
    .line 139
    return-object p1

    .line 140
    :cond_6
    instance-of p1, p0, La/bsj0;

    .line 141
    .line 142
    if-eqz p1, :cond_7

    .line 143
    .line 144
    new-instance p1, La/u1t0;

    .line 145
    .line 146
    check-cast p0, La/bsj0;

    .line 147
    .line 148
    iget-object p0, p0, La/r2e;->a:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast p0, Ljava/lang/Number;

    .line 151
    .line 152
    invoke-virtual {p0}, Ljava/lang/Number;->shortValue()S

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    invoke-direct {p1, p0}, La/u1t0;-><init>(S)V

    .line 157
    .line 158
    .line 159
    return-object p1

    .line 160
    :cond_7
    instance-of p1, p0, La/vkx;

    .line 161
    .line 162
    if-eqz p1, :cond_8

    .line 163
    .line 164
    new-instance p1, La/u1t0;

    .line 165
    .line 166
    check-cast p0, La/vkx;

    .line 167
    .line 168
    iget-object p0, p0, La/r2e;->a:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast p0, Ljava/lang/Number;

    .line 171
    .line 172
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    invoke-direct {p1, p0}, La/u1t0;-><init>(I)V

    .line 177
    .line 178
    .line 179
    return-object p1

    .line 180
    :cond_8
    instance-of p1, p0, La/x710;

    .line 181
    .line 182
    if-eqz p1, :cond_9

    .line 183
    .line 184
    new-instance p1, La/u1t0;

    .line 185
    .line 186
    check-cast p0, La/x710;

    .line 187
    .line 188
    iget-object p0, p0, La/r2e;->a:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast p0, Ljava/lang/Number;

    .line 191
    .line 192
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 193
    .line 194
    .line 195
    move-result-wide p2

    .line 196
    invoke-direct {p1, p2, p3}, La/u1t0;-><init>(J)V

    .line 197
    .line 198
    .line 199
    return-object p1

    .line 200
    :cond_9
    return-object p0
.end method

.method public f(La/f4d0;La/h950;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p1, p1, La/f4d0;->k:Ljava/util/List;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    const/16 v1, 0xa

    .line 15
    .line 16
    invoke-static {p1, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, La/p2d0;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object v2, p0, La/esg0;->e:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, La/ehf0;

    .line 45
    .line 46
    invoke-virtual {v2, v1, p2}, La/ehf0;->d(La/p2d0;La/h950;)La/u83;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    return-object v0
.end method

.method public f0(La/v0;La/z3;II)Ljava/util/List;
    .locals 6

    .line 1
    iget-object v0, p1, La/v0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/h950;

    .line 4
    .line 5
    iget-object v1, p1, La/v0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/roi0;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-static {p2, v0, v1, p3, v2}, La/esg0;->T(La/z3;La/h950;La/roi0;IZ)La/er30;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    sget-object p0, La/iun;->a:La/iun;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance v2, La/er30;

    .line 20
    .line 21
    new-instance p3, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    iget-object p2, p2, La/er30;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-direct {p3, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/16 p2, 0x40

    .line 29
    .line 30
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-direct {v2, p2}, La/er30;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    const/16 v5, 0x3c

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    move-object v0, p0

    .line 48
    move-object v1, p1

    .line 49
    invoke-static/range {v0 .. v5}, La/esg0;->L(La/esg0;La/v0;La/er30;Ljava/lang/Boolean;ZI)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method

.method public g(La/a4d0;La/h950;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p1, p1, La/a4d0;->r:Ljava/util/List;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    const/16 v1, 0xa

    .line 15
    .line 16
    invoke-static {p1, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, La/p2d0;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object v2, p0, La/esg0;->e:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, La/ehf0;

    .line 45
    .line 46
    invoke-virtual {v2, v1, p2}, La/ehf0;->d(La/p2d0;La/h950;)La/u83;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    return-object v0
.end method

.method public g0(La/v0;La/p3d0;La/z0;)Ljava/util/List;
    .locals 10

    .line 1
    iget-object v0, p1, La/v0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/roi0;

    .line 4
    .line 5
    sget-object v1, La/njq;->E:La/kjq;

    .line 6
    .line 7
    iget v2, p2, La/p3d0;->d:I

    .line 8
    .line 9
    invoke-virtual {v1, v2}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    invoke-static {p2}, La/egy;->d(La/p3d0;)Z

    .line 14
    .line 15
    .line 16
    move-result v7

    .line 17
    sget-object v1, La/z0;->a:La/z0;

    .line 18
    .line 19
    iget-object v2, p1, La/v0;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, La/h950;

    .line 22
    .line 23
    if-ne p3, v1, :cond_1

    .line 24
    .line 25
    const/16 p3, 0x28

    .line 26
    .line 27
    invoke-static {p2, v2, v0, p3}, La/hp4;->G(La/p3d0;La/h950;La/roi0;I)La/er30;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    if-nez v5, :cond_0

    .line 32
    .line 33
    sget-object p0, La/iun;->a:La/iun;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_0
    const/16 v8, 0x8

    .line 37
    .line 38
    move-object v3, p0

    .line 39
    move-object v4, p1

    .line 40
    invoke-static/range {v3 .. v8}, La/esg0;->L(La/esg0;La/v0;La/er30;Ljava/lang/Boolean;ZI)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_1
    move-object v3, p0

    .line 46
    move-object v4, p1

    .line 47
    const/16 p0, 0x30

    .line 48
    .line 49
    invoke-static {p2, v2, v0, p0}, La/hp4;->G(La/p3d0;La/h950;La/roi0;I)La/er30;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    if-nez v5, :cond_2

    .line 54
    .line 55
    sget-object p0, La/iun;->a:La/iun;

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_2
    iget-object p0, v5, La/er30;->a:Ljava/lang/String;

    .line 59
    .line 60
    const-string p1, "$delegate"

    .line 61
    .line 62
    const/4 p2, 0x0

    .line 63
    invoke-static {p0, p1, p2}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    sget-object p1, La/z0;->c:La/z0;

    .line 68
    .line 69
    if-ne p3, p1, :cond_3

    .line 70
    .line 71
    const/4 p2, 0x1

    .line 72
    :cond_3
    if-eq p0, p2, :cond_4

    .line 73
    .line 74
    sget-object p0, La/iun;->a:La/iun;

    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_4
    move-object v8, v6

    .line 78
    const/4 v6, 0x1

    .line 79
    move v9, v7

    .line 80
    const/4 v7, 0x1

    .line 81
    invoke-virtual/range {v3 .. v9}, La/esg0;->K(La/v0;La/er30;ZZLjava/lang/Boolean;Z)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0
.end method

.method public h(La/o1x;La/hhn0;)V
    .locals 0

    .line 1
    iget-object p1, p0, La/esg0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iget-object p2, p2, La/hhn0;->a:La/dyw;

    .line 6
    .line 7
    iget-object p0, p0, La/esg0;->f:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroid/content/Context;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {p2, p0}, La/c3x;->q(La/dyw;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public h0(La/ypg0;)Landroid/graphics/Path;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, La/ypg0;->o:La/jqg0;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {v2, v0}, La/jqg0;->d(La/esg0;)F

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    move v9, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v9, v3

    .line 17
    :goto_0
    iget-object v2, v1, La/ypg0;->p:La/jqg0;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v2, v0}, La/jqg0;->e(La/esg0;)F

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    :cond_1
    move/from16 v16, v3

    .line 26
    .line 27
    iget-object v2, v1, La/ypg0;->q:La/jqg0;

    .line 28
    .line 29
    invoke-virtual {v2, v0}, La/jqg0;->b(La/esg0;)F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    sub-float v2, v9, v0

    .line 34
    .line 35
    sub-float v8, v16, v0

    .line 36
    .line 37
    add-float v5, v9, v0

    .line 38
    .line 39
    add-float v3, v16, v0

    .line 40
    .line 41
    iget-object v4, v1, La/crg0;->h:La/gz40;

    .line 42
    .line 43
    if-nez v4, :cond_2

    .line 44
    .line 45
    new-instance v4, La/gz40;

    .line 46
    .line 47
    const/high16 v6, 0x40000000    # 2.0f

    .line 48
    .line 49
    mul-float/2addr v6, v0

    .line 50
    invoke-direct {v4, v2, v8, v6, v6}, La/gz40;-><init>(FFFF)V

    .line 51
    .line 52
    .line 53
    iput-object v4, v1, La/crg0;->h:La/gz40;

    .line 54
    .line 55
    :cond_2
    const v1, 0x3f0d6289

    .line 56
    .line 57
    .line 58
    mul-float/2addr v0, v1

    .line 59
    new-instance v4, Landroid/graphics/Path;

    .line 60
    .line 61
    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, v9, v8}, Landroid/graphics/Path;->moveTo(FF)V

    .line 65
    .line 66
    .line 67
    add-float v7, v9, v0

    .line 68
    .line 69
    sub-float v14, v16, v0

    .line 70
    .line 71
    move v15, v5

    .line 72
    move-object v10, v4

    .line 73
    move v13, v5

    .line 74
    move v11, v7

    .line 75
    move v12, v8

    .line 76
    invoke-virtual/range {v10 .. v16}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 77
    .line 78
    .line 79
    move v1, v12

    .line 80
    move/from16 v17, v14

    .line 81
    .line 82
    add-float v14, v16, v0

    .line 83
    .line 84
    move v10, v3

    .line 85
    move v8, v3

    .line 86
    move v6, v14

    .line 87
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 88
    .line 89
    .line 90
    sub-float v7, v9, v0

    .line 91
    .line 92
    move v15, v2

    .line 93
    move v13, v2

    .line 94
    move-object v10, v4

    .line 95
    move v11, v7

    .line 96
    move v12, v8

    .line 97
    invoke-virtual/range {v10 .. v16}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 98
    .line 99
    .line 100
    move v5, v13

    .line 101
    move v10, v1

    .line 102
    move v8, v1

    .line 103
    move/from16 v6, v17

    .line 104
    .line 105
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4}, Landroid/graphics/Path;->close()V

    .line 109
    .line 110
    .line 111
    return-object v4
.end method

.method public i(La/v0;La/p3d0;La/wsy;)Ljava/lang/Object;
    .locals 6

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
    const/4 v3, 0x3

    .line 11
    sget-object v5, La/x0;->b:La/x0;

    .line 12
    .line 13
    move-object v0, p0

    .line 14
    move-object v1, p1

    .line 15
    move-object v2, p2

    .line 16
    move-object v4, p3

    .line 17
    invoke-virtual/range {v0 .. v5}, La/esg0;->e0(La/v0;La/p3d0;ILa/wsy;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public i0(La/dqg0;)Landroid/graphics/Path;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, La/dqg0;->o:La/jqg0;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {v2, v0}, La/jqg0;->d(La/esg0;)F

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    move v9, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v9, v3

    .line 17
    :goto_0
    iget-object v2, v1, La/dqg0;->p:La/jqg0;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v2, v0}, La/jqg0;->e(La/esg0;)F

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    :cond_1
    move/from16 v16, v3

    .line 26
    .line 27
    iget-object v2, v1, La/dqg0;->q:La/jqg0;

    .line 28
    .line 29
    invoke-virtual {v2, v0}, La/jqg0;->d(La/esg0;)F

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    iget-object v3, v1, La/dqg0;->r:La/jqg0;

    .line 34
    .line 35
    invoke-virtual {v3, v0}, La/jqg0;->e(La/esg0;)F

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    sub-float v3, v9, v2

    .line 40
    .line 41
    sub-float v8, v16, v0

    .line 42
    .line 43
    add-float v5, v9, v2

    .line 44
    .line 45
    add-float v4, v16, v0

    .line 46
    .line 47
    iget-object v6, v1, La/crg0;->h:La/gz40;

    .line 48
    .line 49
    if-nez v6, :cond_2

    .line 50
    .line 51
    new-instance v6, La/gz40;

    .line 52
    .line 53
    const/high16 v7, 0x40000000    # 2.0f

    .line 54
    .line 55
    mul-float v10, v2, v7

    .line 56
    .line 57
    mul-float/2addr v7, v0

    .line 58
    invoke-direct {v6, v3, v8, v10, v7}, La/gz40;-><init>(FFFF)V

    .line 59
    .line 60
    .line 61
    iput-object v6, v1, La/crg0;->h:La/gz40;

    .line 62
    .line 63
    :cond_2
    const v1, 0x3f0d6289

    .line 64
    .line 65
    .line 66
    mul-float/2addr v2, v1

    .line 67
    mul-float/2addr v0, v1

    .line 68
    new-instance v10, Landroid/graphics/Path;

    .line 69
    .line 70
    invoke-direct {v10}, Landroid/graphics/Path;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v10, v9, v8}, Landroid/graphics/Path;->moveTo(FF)V

    .line 74
    .line 75
    .line 76
    add-float v7, v9, v2

    .line 77
    .line 78
    sub-float v14, v16, v0

    .line 79
    .line 80
    move v15, v5

    .line 81
    move v13, v5

    .line 82
    move v11, v7

    .line 83
    move v12, v8

    .line 84
    invoke-virtual/range {v10 .. v16}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 85
    .line 86
    .line 87
    move v1, v12

    .line 88
    move/from16 v17, v14

    .line 89
    .line 90
    add-float v14, v16, v0

    .line 91
    .line 92
    move v8, v4

    .line 93
    move-object v4, v10

    .line 94
    move v10, v8

    .line 95
    move v6, v14

    .line 96
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 97
    .line 98
    .line 99
    sub-float v7, v9, v2

    .line 100
    .line 101
    move v15, v3

    .line 102
    move v13, v3

    .line 103
    move-object v10, v4

    .line 104
    move v11, v7

    .line 105
    move v12, v8

    .line 106
    invoke-virtual/range {v10 .. v16}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 107
    .line 108
    .line 109
    move v5, v13

    .line 110
    move v10, v1

    .line 111
    move v8, v1

    .line 112
    move/from16 v6, v17

    .line 113
    .line 114
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v4}, Landroid/graphics/Path;->close()V

    .line 118
    .line 119
    .line 120
    return-object v4
.end method

.method public j(La/v0;La/p3d0;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p2, La/p3d0;->d:I

    .line 5
    .line 6
    sget-object v1, La/njq;->c:La/kjq;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    sget-object p0, La/iun;->a:La/iun;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    sget-object v0, La/z0;->b:La/z0;

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2, v0}, La/esg0;->g0(La/v0;La/p3d0;La/z0;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    :goto_0
    return-object p0
.end method

.method public k(La/o1x;La/r1o;)V
    .locals 0

    .line 1
    iget-object p1, p0, La/esg0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iget-object p2, p2, La/r1o;->c:Ljava/lang/Throwable;

    .line 6
    .line 7
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, La/esg0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Ljava/lang/Integer;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iget-object p2, p0, La/esg0;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p2, Landroid/content/Context;

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    iget-object p0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 33
    .line 34
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method

.method public k0(La/uqg0;)Landroid/graphics/Path;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v1, La/uqg0;->s:La/jqg0;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    iget-object v4, v1, La/uqg0;->t:La/jqg0;

    .line 11
    .line 12
    if-nez v4, :cond_0

    .line 13
    .line 14
    move v2, v3

    .line 15
    :goto_0
    move v4, v2

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    iget-object v4, v1, La/uqg0;->t:La/jqg0;

    .line 18
    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v4, v0}, La/jqg0;->e(La/esg0;)F

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    if-nez v4, :cond_2

    .line 27
    .line 28
    invoke-virtual {v2, v0}, La/jqg0;->d(La/esg0;)F

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    invoke-virtual {v2, v0}, La/jqg0;->d(La/esg0;)F

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    iget-object v4, v1, La/uqg0;->t:La/jqg0;

    .line 38
    .line 39
    invoke-virtual {v4, v0}, La/jqg0;->e(La/esg0;)F

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    :goto_1
    iget-object v5, v1, La/uqg0;->q:La/jqg0;

    .line 44
    .line 45
    invoke-virtual {v5, v0}, La/jqg0;->d(La/esg0;)F

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    const/high16 v6, 0x40000000    # 2.0f

    .line 50
    .line 51
    div-float/2addr v5, v6

    .line 52
    invoke-static {v2, v5}, Ljava/lang/Math;->min(FF)F

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    iget-object v5, v1, La/uqg0;->r:La/jqg0;

    .line 57
    .line 58
    invoke-virtual {v5, v0}, La/jqg0;->e(La/esg0;)F

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    div-float/2addr v5, v6

    .line 63
    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    iget-object v5, v1, La/uqg0;->o:La/jqg0;

    .line 68
    .line 69
    if-eqz v5, :cond_3

    .line 70
    .line 71
    invoke-virtual {v5, v0}, La/jqg0;->d(La/esg0;)F

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    move v7, v5

    .line 76
    goto :goto_2

    .line 77
    :cond_3
    move v7, v3

    .line 78
    :goto_2
    iget-object v5, v1, La/uqg0;->p:La/jqg0;

    .line 79
    .line 80
    if-eqz v5, :cond_4

    .line 81
    .line 82
    invoke-virtual {v5, v0}, La/jqg0;->e(La/esg0;)F

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    move v10, v5

    .line 87
    goto :goto_3

    .line 88
    :cond_4
    move v10, v3

    .line 89
    :goto_3
    iget-object v5, v1, La/uqg0;->q:La/jqg0;

    .line 90
    .line 91
    invoke-virtual {v5, v0}, La/jqg0;->d(La/esg0;)F

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    iget-object v6, v1, La/uqg0;->r:La/jqg0;

    .line 96
    .line 97
    invoke-virtual {v6, v0}, La/jqg0;->e(La/esg0;)F

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    iget-object v6, v1, La/crg0;->h:La/gz40;

    .line 102
    .line 103
    if-nez v6, :cond_5

    .line 104
    .line 105
    new-instance v6, La/gz40;

    .line 106
    .line 107
    invoke-direct {v6, v7, v10, v5, v0}, La/gz40;-><init>(FFFF)V

    .line 108
    .line 109
    .line 110
    iput-object v6, v1, La/crg0;->h:La/gz40;

    .line 111
    .line 112
    :cond_5
    add-float/2addr v5, v7

    .line 113
    add-float v15, v10, v0

    .line 114
    .line 115
    new-instance v6, Landroid/graphics/Path;

    .line 116
    .line 117
    invoke-direct {v6}, Landroid/graphics/Path;-><init>()V

    .line 118
    .line 119
    .line 120
    cmpl-float v0, v2, v3

    .line 121
    .line 122
    if-eqz v0, :cond_6

    .line 123
    .line 124
    cmpl-float v0, v4, v3

    .line 125
    .line 126
    if-nez v0, :cond_7

    .line 127
    .line 128
    :cond_6
    move v11, v5

    .line 129
    goto :goto_4

    .line 130
    :cond_7
    const v0, 0x3f0d6289

    .line 131
    .line 132
    .line 133
    mul-float v1, v2, v0

    .line 134
    .line 135
    mul-float/2addr v0, v4

    .line 136
    add-float v14, v10, v4

    .line 137
    .line 138
    invoke-virtual {v6, v7, v14}, Landroid/graphics/Path;->moveTo(FF)V

    .line 139
    .line 140
    .line 141
    sub-float v8, v14, v0

    .line 142
    .line 143
    add-float v11, v7, v2

    .line 144
    .line 145
    sub-float v9, v11, v1

    .line 146
    .line 147
    move v12, v10

    .line 148
    invoke-virtual/range {v6 .. v12}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 149
    .line 150
    .line 151
    move/from16 v18, v9

    .line 152
    .line 153
    move v3, v11

    .line 154
    sub-float v2, v5, v2

    .line 155
    .line 156
    invoke-virtual {v6, v2, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 157
    .line 158
    .line 159
    add-float v9, v2, v1

    .line 160
    .line 161
    move v13, v5

    .line 162
    move v11, v5

    .line 163
    move v12, v8

    .line 164
    move-object v8, v6

    .line 165
    invoke-virtual/range {v8 .. v14}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 166
    .line 167
    .line 168
    move v1, v14

    .line 169
    move v14, v9

    .line 170
    sub-float v4, v15, v4

    .line 171
    .line 172
    invoke-virtual {v6, v11, v4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 173
    .line 174
    .line 175
    add-float v10, v4, v0

    .line 176
    .line 177
    move/from16 v17, v15

    .line 178
    .line 179
    move/from16 v16, v2

    .line 180
    .line 181
    move v13, v10

    .line 182
    move v12, v11

    .line 183
    move-object v11, v6

    .line 184
    invoke-virtual/range {v11 .. v17}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v6, v3, v15}, Landroid/graphics/Path;->lineTo(FF)V

    .line 188
    .line 189
    .line 190
    move v11, v7

    .line 191
    move v12, v4

    .line 192
    move v9, v7

    .line 193
    move v8, v15

    .line 194
    move/from16 v7, v18

    .line 195
    .line 196
    invoke-virtual/range {v6 .. v12}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 197
    .line 198
    .line 199
    move v7, v9

    .line 200
    invoke-virtual {v6, v7, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 201
    .line 202
    .line 203
    goto :goto_5

    .line 204
    :goto_4
    invoke-virtual {v6, v7, v10}, Landroid/graphics/Path;->moveTo(FF)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v6, v11, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v6, v11, v15}, Landroid/graphics/Path;->lineTo(FF)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v6, v7, v15}, Landroid/graphics/Path;->lineTo(FF)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v6, v7, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 217
    .line 218
    .line 219
    :goto_5
    invoke-virtual {v6}, Landroid/graphics/Path;->close()V

    .line 220
    .line 221
    .line 222
    return-object v6
.end method

.method public l(La/v0;La/z3;I)Ljava/util/List;
    .locals 9

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p3, :cond_a

    .line 5
    .line 6
    instance-of v0, p2, La/v2d0;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x2

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    move-object v0, p2

    .line 13
    check-cast v0, La/v2d0;

    .line 14
    .line 15
    iget v0, v0, La/v2d0;->d:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    instance-of v0, p2, La/i3d0;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    move-object v0, p2

    .line 23
    check-cast v0, La/i3d0;

    .line 24
    .line 25
    iget v0, v0, La/i3d0;->d:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    instance-of v0, p2, La/p3d0;

    .line 29
    .line 30
    if-eqz v0, :cond_6

    .line 31
    .line 32
    move-object v0, p2

    .line 33
    check-cast v0, La/p3d0;

    .line 34
    .line 35
    invoke-static {p3}, La/hne;->E(I)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eq v3, v2, :cond_4

    .line 40
    .line 41
    const/4 v4, 0x3

    .line 42
    if-eq v3, v4, :cond_2

    .line 43
    .line 44
    iget v0, v0, La/p3d0;->d:I

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    iget v3, v0, La/p3d0;->c:I

    .line 48
    .line 49
    const/16 v4, 0x200

    .line 50
    .line 51
    and-int/2addr v3, v4

    .line 52
    if-ne v3, v4, :cond_3

    .line 53
    .line 54
    iget v0, v0, La/p3d0;->r:I

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    iget v0, v0, La/p3d0;->d:I

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_4
    iget v3, v0, La/p3d0;->c:I

    .line 61
    .line 62
    const/16 v4, 0x100

    .line 63
    .line 64
    and-int/2addr v3, v4

    .line 65
    if-ne v3, v4, :cond_5

    .line 66
    .line 67
    iget v0, v0, La/p3d0;->q:I

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_5
    iget v0, v0, La/p3d0;->d:I

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_6
    move v0, v1

    .line 74
    :goto_0
    sget-object v3, La/njq;->c:La/kjq;

    .line 75
    .line 76
    invoke-virtual {v3, v0}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_7

    .line 85
    .line 86
    sget-object p0, La/iun;->a:La/iun;

    .line 87
    .line 88
    return-object p0

    .line 89
    :cond_7
    if-ne p3, v2, :cond_8

    .line 90
    .line 91
    check-cast p2, La/p3d0;

    .line 92
    .line 93
    sget-object p3, La/z0;->a:La/z0;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2, p3}, La/esg0;->g0(La/v0;La/p3d0;La/z0;)Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    :cond_8
    iget-object v0, p1, La/v0;->b:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, La/h950;

    .line 103
    .line 104
    iget-object v2, p1, La/v0;->c:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v2, La/roi0;

    .line 107
    .line 108
    invoke-static {p2, v0, v2, p3, v1}, La/esg0;->T(La/z3;La/h950;La/roi0;IZ)La/er30;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    if-nez v5, :cond_9

    .line 113
    .line 114
    sget-object p0, La/iun;->a:La/iun;

    .line 115
    .line 116
    return-object p0

    .line 117
    :cond_9
    const/4 v7, 0x0

    .line 118
    const/16 v8, 0x3c

    .line 119
    .line 120
    const/4 v6, 0x0

    .line 121
    move-object v3, p0

    .line 122
    move-object v4, p1

    .line 123
    invoke-static/range {v3 .. v8}, La/esg0;->L(La/esg0;La/v0;La/er30;Ljava/lang/Boolean;ZI)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0

    .line 128
    :cond_a
    const/4 p0, 0x0

    .line 129
    throw p0
.end method

.method public l0(La/jqg0;La/jqg0;La/jqg0;La/jqg0;)La/gz40;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1, p0}, La/jqg0;->d(La/esg0;)F

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move p1, v0

    .line 10
    :goto_0
    if-eqz p2, :cond_1

    .line 11
    .line 12
    invoke-virtual {p2, p0}, La/jqg0;->e(La/esg0;)F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    :cond_1
    iget-object p2, p0, La/esg0;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p2, La/csg0;

    .line 19
    .line 20
    iget-object v1, p2, La/csg0;->g:La/gz40;

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    iget-object v1, p2, La/csg0;->f:La/gz40;

    .line 26
    .line 27
    :goto_1
    if-eqz p3, :cond_3

    .line 28
    .line 29
    invoke-virtual {p3, p0}, La/jqg0;->d(La/esg0;)F

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    goto :goto_2

    .line 34
    :cond_3
    iget p2, v1, La/gz40;->d:F

    .line 35
    .line 36
    :goto_2
    if-eqz p4, :cond_4

    .line 37
    .line 38
    invoke-virtual {p4, p0}, La/jqg0;->e(La/esg0;)F

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    goto :goto_3

    .line 43
    :cond_4
    iget p0, v1, La/gz40;->e:F

    .line 44
    .line 45
    :goto_3
    new-instance p3, La/gz40;

    .line 46
    .line 47
    invoke-direct {p3, p1, v0, p2, p0}, La/gz40;-><init>(FFFF)V

    .line 48
    .line 49
    .line 50
    return-object p3
.end method

.method public m(La/v0;La/z3;IILa/i4d0;)Ljava/util/List;
    .locals 1

    .line 1
    if-eqz p3, :cond_2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    iget p5, p5, La/i4d0;->d:I

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p5, 0x0

    .line 9
    :goto_0
    sget-object v0, La/njq;->c:La/kjq;

    .line 10
    .line 11
    invoke-virtual {v0, p5}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object p5

    .line 15
    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result p5

    .line 19
    if-nez p5, :cond_1

    .line 20
    .line 21
    sget-object p0, La/iun;->a:La/iun;

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, La/esg0;->f0(La/v0;La/z3;II)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    :goto_1
    return-object p0

    .line 29
    :cond_2
    const/4 p0, 0x0

    .line 30
    throw p0
.end method

.method public m0(La/crg0;Z)Landroid/graphics/Path;
    .locals 10

    .line 1
    iget-object v0, p0, La/esg0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Stack;

    .line 4
    .line 5
    iget-object v1, p0, La/esg0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/csg0;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    new-instance v0, La/csg0;

    .line 13
    .line 14
    iget-object v1, p0, La/esg0;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, La/csg0;

    .line 17
    .line 18
    invoke-direct {v0, v1}, La/csg0;-><init>(La/csg0;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-virtual {p0, v0, p1}, La/esg0;->H0(La/csg0;La/drg0;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, La/esg0;->A()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v1, 0x0

    .line 31
    if-eqz v0, :cond_22

    .line 32
    .line 33
    invoke-virtual {p0}, La/esg0;->J0()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    goto/16 :goto_d

    .line 40
    .line 41
    :cond_0
    instance-of v0, p1, La/urg0;

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    if-eqz v0, :cond_6

    .line 45
    .line 46
    if-nez p2, :cond_1

    .line 47
    .line 48
    const-string p2, "<use> elements inside a <clipPath> cannot reference another <use>"

    .line 49
    .line 50
    new-array v0, v2, [Ljava/lang/Object;

    .line 51
    .line 52
    invoke-static {p2, v0}, La/esg0;->E(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    move-object p2, p1

    .line 56
    check-cast p2, La/urg0;

    .line 57
    .line 58
    iget-object v0, p1, La/frg0;->a:La/cyu;

    .line 59
    .line 60
    iget-object v3, p2, La/urg0;->o:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v0, v3}, La/cyu;->L(Ljava/lang/String;)La/drg0;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-nez v0, :cond_2

    .line 67
    .line 68
    iget-object p1, p2, La/urg0;->o:Ljava/lang/String;

    .line 69
    .line 70
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const-string p2, "Use reference \'%s\' not found"

    .line 75
    .line 76
    invoke-static {p2, p1}, La/esg0;->E(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, La/esg0;->d:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p1, Ljava/util/Stack;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, La/csg0;

    .line 88
    .line 89
    iput-object p1, p0, La/esg0;->c:Ljava/lang/Object;

    .line 90
    .line 91
    return-object v1

    .line 92
    :cond_2
    instance-of v3, v0, La/crg0;

    .line 93
    .line 94
    if-nez v3, :cond_3

    .line 95
    .line 96
    iget-object p1, p0, La/esg0;->d:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p1, Ljava/util/Stack;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    check-cast p1, La/csg0;

    .line 105
    .line 106
    iput-object p1, p0, La/esg0;->c:Ljava/lang/Object;

    .line 107
    .line 108
    return-object v1

    .line 109
    :cond_3
    check-cast v0, La/crg0;

    .line 110
    .line 111
    invoke-virtual {p0, v0, v2}, La/esg0;->m0(La/crg0;Z)Landroid/graphics/Path;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    if-nez v0, :cond_4

    .line 116
    .line 117
    goto/16 :goto_1

    .line 118
    .line 119
    :cond_4
    iget-object v1, p2, La/crg0;->h:La/gz40;

    .line 120
    .line 121
    if-nez v1, :cond_5

    .line 122
    .line 123
    invoke-static {v0}, La/esg0;->r(Landroid/graphics/Path;)La/gz40;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    iput-object v1, p2, La/crg0;->h:La/gz40;

    .line 128
    .line 129
    :cond_5
    iget-object p2, p2, La/gqg0;->n:Landroid/graphics/Matrix;

    .line 130
    .line 131
    if-eqz p2, :cond_1f

    .line 132
    .line 133
    invoke-virtual {v0, p2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 134
    .line 135
    .line 136
    goto/16 :goto_c

    .line 137
    .line 138
    :cond_6
    instance-of p2, p1, La/fqg0;

    .line 139
    .line 140
    const/4 v0, 0x2

    .line 141
    if-eqz p2, :cond_11

    .line 142
    .line 143
    move-object p2, p1

    .line 144
    check-cast p2, La/fqg0;

    .line 145
    .line 146
    instance-of v2, p1, La/pqg0;

    .line 147
    .line 148
    if-eqz v2, :cond_8

    .line 149
    .line 150
    move-object v2, p1

    .line 151
    check-cast v2, La/pqg0;

    .line 152
    .line 153
    new-instance v3, La/yrg0;

    .line 154
    .line 155
    iget-object v2, v2, La/pqg0;->o:La/tyc;

    .line 156
    .line 157
    invoke-direct {v3, v2}, La/yrg0;-><init>(La/tyc;)V

    .line 158
    .line 159
    .line 160
    iget-object v2, p1, La/crg0;->h:La/gz40;

    .line 161
    .line 162
    iget-object v3, v3, La/yrg0;->a:Landroid/graphics/Path;

    .line 163
    .line 164
    if-nez v2, :cond_7

    .line 165
    .line 166
    invoke-static {v3}, La/esg0;->r(Landroid/graphics/Path;)La/gz40;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    iput-object v2, p1, La/crg0;->h:La/gz40;

    .line 171
    .line 172
    :cond_7
    move-object v2, v3

    .line 173
    goto :goto_0

    .line 174
    :cond_8
    instance-of v2, p1, La/uqg0;

    .line 175
    .line 176
    if-eqz v2, :cond_9

    .line 177
    .line 178
    move-object v2, p1

    .line 179
    check-cast v2, La/uqg0;

    .line 180
    .line 181
    invoke-virtual {p0, v2}, La/esg0;->k0(La/uqg0;)Landroid/graphics/Path;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    goto :goto_0

    .line 186
    :cond_9
    instance-of v2, p1, La/ypg0;

    .line 187
    .line 188
    if-eqz v2, :cond_a

    .line 189
    .line 190
    move-object v2, p1

    .line 191
    check-cast v2, La/ypg0;

    .line 192
    .line 193
    invoke-virtual {p0, v2}, La/esg0;->h0(La/ypg0;)Landroid/graphics/Path;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    goto :goto_0

    .line 198
    :cond_a
    instance-of v2, p1, La/dqg0;

    .line 199
    .line 200
    if-eqz v2, :cond_b

    .line 201
    .line 202
    move-object v2, p1

    .line 203
    check-cast v2, La/dqg0;

    .line 204
    .line 205
    invoke-virtual {p0, v2}, La/esg0;->i0(La/dqg0;)Landroid/graphics/Path;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    goto :goto_0

    .line 210
    :cond_b
    instance-of v2, p1, La/sqg0;

    .line 211
    .line 212
    if-eqz v2, :cond_c

    .line 213
    .line 214
    move-object v2, p1

    .line 215
    check-cast v2, La/sqg0;

    .line 216
    .line 217
    invoke-static {v2}, La/esg0;->j0(La/sqg0;)Landroid/graphics/Path;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    goto :goto_0

    .line 222
    :cond_c
    move-object v2, v1

    .line 223
    :goto_0
    if-nez v2, :cond_d

    .line 224
    .line 225
    :goto_1
    return-object v1

    .line 226
    :cond_d
    iget-object v1, p2, La/crg0;->h:La/gz40;

    .line 227
    .line 228
    if-nez v1, :cond_e

    .line 229
    .line 230
    invoke-static {v2}, La/esg0;->r(Landroid/graphics/Path;)La/gz40;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    iput-object v1, p2, La/crg0;->h:La/gz40;

    .line 235
    .line 236
    :cond_e
    iget-object p2, p2, La/fqg0;->n:Landroid/graphics/Matrix;

    .line 237
    .line 238
    if-eqz p2, :cond_f

    .line 239
    .line 240
    invoke-virtual {v2, p2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 241
    .line 242
    .line 243
    :cond_f
    iget-object p2, p0, La/esg0;->c:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast p2, La/csg0;

    .line 246
    .line 247
    iget-object p2, p2, La/csg0;->a:La/xqg0;

    .line 248
    .line 249
    iget p2, p2, La/xqg0;->l1:I

    .line 250
    .line 251
    if-eqz p2, :cond_10

    .line 252
    .line 253
    if-ne p2, v0, :cond_10

    .line 254
    .line 255
    sget-object p2, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_10
    sget-object p2, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 259
    .line 260
    :goto_2
    invoke-virtual {v2, p2}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 261
    .line 262
    .line 263
    :goto_3
    move-object v0, v2

    .line 264
    goto/16 :goto_c

    .line 265
    .line 266
    :cond_11
    instance-of p2, p1, La/org0;

    .line 267
    .line 268
    if-eqz p2, :cond_21

    .line 269
    .line 270
    move-object p2, p1

    .line 271
    check-cast p2, La/org0;

    .line 272
    .line 273
    iget-object v1, p2, La/srg0;->n:Ljava/util/ArrayList;

    .line 274
    .line 275
    const/4 v3, 0x0

    .line 276
    if-eqz v1, :cond_13

    .line 277
    .line 278
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 279
    .line 280
    .line 281
    move-result v1

    .line 282
    if-nez v1, :cond_12

    .line 283
    .line 284
    goto :goto_4

    .line 285
    :cond_12
    iget-object v1, p2, La/srg0;->n:Ljava/util/ArrayList;

    .line 286
    .line 287
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    check-cast v1, La/jqg0;

    .line 292
    .line 293
    invoke-virtual {v1, p0}, La/jqg0;->d(La/esg0;)F

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    goto :goto_5

    .line 298
    :cond_13
    :goto_4
    move v1, v3

    .line 299
    :goto_5
    iget-object v4, p2, La/srg0;->o:Ljava/util/ArrayList;

    .line 300
    .line 301
    if-eqz v4, :cond_15

    .line 302
    .line 303
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    if-nez v4, :cond_14

    .line 308
    .line 309
    goto :goto_6

    .line 310
    :cond_14
    iget-object v4, p2, La/srg0;->o:Ljava/util/ArrayList;

    .line 311
    .line 312
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    check-cast v4, La/jqg0;

    .line 317
    .line 318
    invoke-virtual {v4, p0}, La/jqg0;->e(La/esg0;)F

    .line 319
    .line 320
    .line 321
    move-result v4

    .line 322
    goto :goto_7

    .line 323
    :cond_15
    :goto_6
    move v4, v3

    .line 324
    :goto_7
    iget-object v5, p2, La/srg0;->p:Ljava/util/ArrayList;

    .line 325
    .line 326
    if-eqz v5, :cond_17

    .line 327
    .line 328
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    if-nez v5, :cond_16

    .line 333
    .line 334
    goto :goto_8

    .line 335
    :cond_16
    iget-object v5, p2, La/srg0;->p:Ljava/util/ArrayList;

    .line 336
    .line 337
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v5

    .line 341
    check-cast v5, La/jqg0;

    .line 342
    .line 343
    invoke-virtual {v5, p0}, La/jqg0;->d(La/esg0;)F

    .line 344
    .line 345
    .line 346
    move-result v5

    .line 347
    goto :goto_9

    .line 348
    :cond_17
    :goto_8
    move v5, v3

    .line 349
    :goto_9
    iget-object v6, p2, La/srg0;->q:Ljava/util/ArrayList;

    .line 350
    .line 351
    if-eqz v6, :cond_19

    .line 352
    .line 353
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 354
    .line 355
    .line 356
    move-result v6

    .line 357
    if-nez v6, :cond_18

    .line 358
    .line 359
    goto :goto_a

    .line 360
    :cond_18
    iget-object v3, p2, La/srg0;->q:Ljava/util/ArrayList;

    .line 361
    .line 362
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    check-cast v2, La/jqg0;

    .line 367
    .line 368
    invoke-virtual {v2, p0}, La/jqg0;->e(La/esg0;)F

    .line 369
    .line 370
    .line 371
    move-result v3

    .line 372
    :cond_19
    :goto_a
    iget-object v2, p0, La/esg0;->c:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v2, La/csg0;

    .line 375
    .line 376
    iget-object v2, v2, La/csg0;->a:La/xqg0;

    .line 377
    .line 378
    iget v2, v2, La/xqg0;->k1:I

    .line 379
    .line 380
    const/4 v6, 0x1

    .line 381
    if-eq v2, v6, :cond_1b

    .line 382
    .line 383
    invoke-virtual {p0, p2}, La/esg0;->s(La/qrg0;)F

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    iget-object v6, p0, La/esg0;->c:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v6, La/csg0;

    .line 390
    .line 391
    iget-object v6, v6, La/csg0;->a:La/xqg0;

    .line 392
    .line 393
    iget v6, v6, La/xqg0;->k1:I

    .line 394
    .line 395
    if-ne v6, v0, :cond_1a

    .line 396
    .line 397
    const/high16 v6, 0x40000000    # 2.0f

    .line 398
    .line 399
    div-float/2addr v2, v6

    .line 400
    :cond_1a
    sub-float/2addr v1, v2

    .line 401
    :cond_1b
    iget-object v2, p2, La/crg0;->h:La/gz40;

    .line 402
    .line 403
    if-nez v2, :cond_1c

    .line 404
    .line 405
    new-instance v2, La/bsg0;

    .line 406
    .line 407
    invoke-direct {v2, p0, v1, v4}, La/bsg0;-><init>(La/esg0;FF)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {p0, p2, v2}, La/esg0;->D(La/qrg0;La/x2x;)V

    .line 411
    .line 412
    .line 413
    new-instance v6, La/gz40;

    .line 414
    .line 415
    iget-object v2, v2, La/bsg0;->f:Ljava/lang/Object;

    .line 416
    .line 417
    move-object v7, v2

    .line 418
    check-cast v7, Landroid/graphics/RectF;

    .line 419
    .line 420
    iget v8, v7, Landroid/graphics/RectF;->left:F

    .line 421
    .line 422
    iget v9, v7, Landroid/graphics/RectF;->top:F

    .line 423
    .line 424
    invoke-virtual {v7}, Landroid/graphics/RectF;->width()F

    .line 425
    .line 426
    .line 427
    move-result v7

    .line 428
    check-cast v2, Landroid/graphics/RectF;

    .line 429
    .line 430
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 431
    .line 432
    .line 433
    move-result v2

    .line 434
    invoke-direct {v6, v8, v9, v7, v2}, La/gz40;-><init>(FFFF)V

    .line 435
    .line 436
    .line 437
    iput-object v6, p2, La/crg0;->h:La/gz40;

    .line 438
    .line 439
    :cond_1c
    new-instance v2, Landroid/graphics/Path;

    .line 440
    .line 441
    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    .line 442
    .line 443
    .line 444
    new-instance v6, La/bsg0;

    .line 445
    .line 446
    add-float/2addr v1, v5

    .line 447
    add-float/2addr v4, v3

    .line 448
    invoke-direct {v6, p0, v1, v4, v2}, La/bsg0;-><init>(La/esg0;FFLandroid/graphics/Path;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {p0, p2, v6}, La/esg0;->D(La/qrg0;La/x2x;)V

    .line 452
    .line 453
    .line 454
    iget-object p2, p2, La/org0;->r:Landroid/graphics/Matrix;

    .line 455
    .line 456
    if-eqz p2, :cond_1d

    .line 457
    .line 458
    invoke-virtual {v2, p2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 459
    .line 460
    .line 461
    :cond_1d
    iget-object p2, p0, La/esg0;->c:Ljava/lang/Object;

    .line 462
    .line 463
    check-cast p2, La/csg0;

    .line 464
    .line 465
    iget-object p2, p2, La/csg0;->a:La/xqg0;

    .line 466
    .line 467
    iget p2, p2, La/xqg0;->l1:I

    .line 468
    .line 469
    if-eqz p2, :cond_1e

    .line 470
    .line 471
    if-ne p2, v0, :cond_1e

    .line 472
    .line 473
    sget-object p2, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 474
    .line 475
    goto :goto_b

    .line 476
    :cond_1e
    sget-object p2, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 477
    .line 478
    :goto_b
    invoke-virtual {v2, p2}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 479
    .line 480
    .line 481
    goto/16 :goto_3

    .line 482
    .line 483
    :cond_1f
    :goto_c
    iget-object p2, p0, La/esg0;->c:Ljava/lang/Object;

    .line 484
    .line 485
    check-cast p2, La/csg0;

    .line 486
    .line 487
    iget-object p2, p2, La/csg0;->a:La/xqg0;

    .line 488
    .line 489
    iget-object p2, p2, La/xqg0;->x:Ljava/lang/String;

    .line 490
    .line 491
    if-eqz p2, :cond_20

    .line 492
    .line 493
    iget-object p2, p1, La/crg0;->h:La/gz40;

    .line 494
    .line 495
    invoke-virtual {p0, p1, p2}, La/esg0;->q(La/crg0;La/gz40;)Landroid/graphics/Path;

    .line 496
    .line 497
    .line 498
    move-result-object p1

    .line 499
    if-eqz p1, :cond_20

    .line 500
    .line 501
    sget-object p2, Landroid/graphics/Path$Op;->INTERSECT:Landroid/graphics/Path$Op;

    .line 502
    .line 503
    invoke-virtual {v0, p1, p2}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 504
    .line 505
    .line 506
    :cond_20
    iget-object p1, p0, La/esg0;->d:Ljava/lang/Object;

    .line 507
    .line 508
    check-cast p1, Ljava/util/Stack;

    .line 509
    .line 510
    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object p1

    .line 514
    check-cast p1, La/csg0;

    .line 515
    .line 516
    iput-object p1, p0, La/esg0;->c:Ljava/lang/Object;

    .line 517
    .line 518
    return-object v0

    .line 519
    :cond_21
    invoke-virtual {p1}, La/frg0;->n()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object p0

    .line 523
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object p0

    .line 527
    const-string p1, "Invalid %s element found in clipPath definition"

    .line 528
    .line 529
    invoke-static {p1, p0}, La/esg0;->E(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 530
    .line 531
    .line 532
    return-object v1

    .line 533
    :cond_22
    :goto_d
    iget-object p1, p0, La/esg0;->d:Ljava/lang/Object;

    .line 534
    .line 535
    check-cast p1, Ljava/util/Stack;

    .line 536
    .line 537
    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object p1

    .line 541
    check-cast p1, La/csg0;

    .line 542
    .line 543
    iput-object p1, p0, La/esg0;->c:Ljava/lang/Object;

    .line 544
    .line 545
    return-object v1
.end method

.method public n0(La/b1x;)V
    .locals 4

    .line 1
    invoke-static {}, La/ofm0;->m()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/esg0;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, La/dzb0;

    .line 7
    .line 8
    const-string v1, "CaptureNode"

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance p0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v0, "Discarding ImageProxy which was inadvertently acquired: "

    .line 15
    .line 16
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {v1, p0}, La/l8x;->E0(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    invoke-interface {p1}, La/b1x;->K0()La/f0x;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0}, La/f0x;->f()La/eoo0;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v2, p0, La/esg0;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, La/dzb0;

    .line 44
    .line 45
    iget-object v2, v2, La/dzb0;->h:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v3, v0, La/eoo0;->a:Landroid/util/ArrayMap;

    .line 48
    .line 49
    invoke-virtual {v3, v2}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Ljava/lang/Integer;

    .line 54
    .line 55
    if-nez v2, :cond_1

    .line 56
    .line 57
    new-instance v2, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string v3, "Discarding ImageProxy which was acquired for another request, mCurrentRequest id = "

    .line 60
    .line 61
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-object p0, p0, La/esg0;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p0, La/dzb0;

    .line 67
    .line 68
    iget p0, p0, La/dzb0;->a:I

    .line 69
    .line 70
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p0, ", ImageProxy tagBundle keys = "

    .line 74
    .line 75
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object p0, v0, La/eoo0;->a:Landroid/util/ArrayMap;

    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/util/ArrayMap;->keySet()Ljava/util/Set;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {v1, p0}, La/l8x;->E0(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_1
    invoke-static {}, La/ofm0;->m()V

    .line 99
    .line 100
    .line 101
    iget-object v0, p0, La/esg0;->d:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, La/r45;

    .line 104
    .line 105
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    iget-object v0, v0, La/r45;->a:La/gjn;

    .line 109
    .line 110
    iget-object v1, p0, La/esg0;->a:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v1, La/dzb0;

    .line 113
    .line 114
    new-instance v2, La/s45;

    .line 115
    .line 116
    invoke-direct {v2, v1, p1}, La/s45;-><init>(La/dzb0;La/b1x;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v2}, La/gjn;->accept(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    iget-object v0, p0, La/esg0;->a:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, La/dzb0;

    .line 125
    .line 126
    iget-object v1, p0, La/esg0;->e:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v1, La/r15;

    .line 129
    .line 130
    const/4 v2, 0x1

    .line 131
    if-eqz v1, :cond_2

    .line 132
    .line 133
    iget-object v1, v1, La/r15;->h:Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-le v1, v2, :cond_2

    .line 140
    .line 141
    move v1, v2

    .line 142
    goto :goto_0

    .line 143
    :cond_2
    const/4 v1, 0x0

    .line 144
    :goto_0
    if-eqz v1, :cond_3

    .line 145
    .line 146
    iget-object v3, p0, La/esg0;->a:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v3, La/dzb0;

    .line 149
    .line 150
    if-eqz v3, :cond_3

    .line 151
    .line 152
    iget-object v3, v3, La/dzb0;->b:La/o55;

    .line 153
    .line 154
    invoke-interface {p1}, La/b1x;->getFormat()I

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    invoke-virtual {v3, p1}, La/o55;->b(I)V

    .line 159
    .line 160
    .line 161
    :cond_3
    const/4 p1, 0x0

    .line 162
    if-eqz v1, :cond_4

    .line 163
    .line 164
    iget-object v1, p0, La/esg0;->a:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v1, La/dzb0;

    .line 167
    .line 168
    if-eqz v1, :cond_5

    .line 169
    .line 170
    iget-object v1, v1, La/dzb0;->b:La/o55;

    .line 171
    .line 172
    invoke-virtual {v1}, La/o55;->a()Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    if-eqz v1, :cond_5

    .line 177
    .line 178
    :cond_4
    iput-object p1, p0, La/esg0;->a:Ljava/lang/Object;

    .line 179
    .line 180
    :cond_5
    new-instance p0, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    const-string v1, "onImageCaptured: request ID = "

    .line 183
    .line 184
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    iget v1, v0, La/dzb0;->a:I

    .line 188
    .line 189
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    const-string v1, "ProcessingRequest"

    .line 197
    .line 198
    invoke-static {v1, p0}, La/l8x;->e0(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    iget p0, v0, La/dzb0;->k:I

    .line 202
    .line 203
    const/4 v1, -0x1

    .line 204
    if-eq p0, v1, :cond_6

    .line 205
    .line 206
    const/16 p0, 0x64

    .line 207
    .line 208
    invoke-virtual {v0, p0}, La/dzb0;->a(I)V

    .line 209
    .line 210
    .line 211
    :cond_6
    iget-object p0, v0, La/dzb0;->g:La/snf0;

    .line 212
    .line 213
    invoke-static {}, La/ofm0;->m()V

    .line 214
    .line 215
    .line 216
    iget-boolean v0, p0, La/snf0;->g:Z

    .line 217
    .line 218
    if-eqz v0, :cond_7

    .line 219
    .line 220
    return-void

    .line 221
    :cond_7
    iget-boolean v0, p0, La/snf0;->h:Z

    .line 222
    .line 223
    if-nez v0, :cond_9

    .line 224
    .line 225
    invoke-static {}, La/ofm0;->m()V

    .line 226
    .line 227
    .line 228
    iget-boolean v0, p0, La/snf0;->g:Z

    .line 229
    .line 230
    if-nez v0, :cond_9

    .line 231
    .line 232
    iget-boolean v0, p0, La/snf0;->h:Z

    .line 233
    .line 234
    if-eqz v0, :cond_8

    .line 235
    .line 236
    goto :goto_1

    .line 237
    :cond_8
    iput-boolean v2, p0, La/snf0;->h:Z

    .line 238
    .line 239
    :cond_9
    :goto_1
    iget-object p0, p0, La/snf0;->e:La/tu9;

    .line 240
    .line 241
    invoke-virtual {p0, p1}, La/tu9;->b(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    return-void
.end method

.method public o(La/v0;La/z3;IILa/i4d0;)Ljava/util/List;
    .locals 6

    .line 1
    if-eqz p3, :cond_1

    .line 2
    .line 3
    iget p5, p5, La/i4d0;->d:I

    .line 4
    .line 5
    new-instance v0, La/y0;

    .line 6
    .line 7
    move-object v1, p0

    .line 8
    move-object v2, p1

    .line 9
    move-object v3, p2

    .line 10
    move v4, p3

    .line 11
    move v5, p4

    .line 12
    invoke-direct/range {v0 .. v5}, La/y0;-><init>(La/esg0;La/v0;La/z3;II)V

    .line 13
    .line 14
    .line 15
    sget-object p0, La/njq;->c:La/kjq;

    .line 16
    .line 17
    invoke-virtual {p0, p5}, La/kjq;->k(I)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-nez p0, :cond_0

    .line 26
    .line 27
    sget-object p0, La/iun;->a:La/iun;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Ljava/util/List;

    .line 35
    .line 36
    :goto_0
    return-object p0

    .line 37
    :cond_1
    const/4 p0, 0x0

    .line 38
    throw p0
.end method

.method public o0(La/dzb0;)V
    .locals 4

    .line 1
    invoke-static {}, La/ofm0;->m()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/dzb0;->i:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    move v0, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v1

    .line 17
    :goto_0
    const-string v3, "only one capture stage is supported."

    .line 18
    .line 19
    invoke-static {v3, v0}, La/z1x;->y(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, La/esg0;->U()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-lez v0, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v2, v1

    .line 30
    :goto_1
    const-string v0, "Too many acquire images. Close image to be able to process next."

    .line 31
    .line 32
    invoke-static {v0, v2}, La/z1x;->y(Ljava/lang/String;Z)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, La/esg0;->a:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v0, p1, La/dzb0;->j:La/ig00;

    .line 38
    .line 39
    new-instance v2, La/yzn0;

    .line 40
    .line 41
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p0, v2, La/yzn0;->b:Ljava/lang/Object;

    .line 45
    .line 46
    iput-object p1, v2, La/yzn0;->a:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-static {}, La/bnk;->a()La/bnk;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    new-instance p1, La/mfr;

    .line 53
    .line 54
    invoke-direct {p1, v0, v2, v1}, La/mfr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v0, p1, p0}, La/ig00;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public p0(La/gz40;)V
    .locals 7

    .line 1
    iget-object v0, p0, La/esg0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Canvas;

    .line 4
    .line 5
    iget-object v1, p0, La/esg0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/csg0;

    .line 8
    .line 9
    iget-object v1, v1, La/csg0;->a:La/xqg0;

    .line 10
    .line 11
    iget-object v1, v1, La/xqg0;->y:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    new-instance v1, Landroid/graphics/Paint;

    .line 16
    .line 17
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v2, Landroid/graphics/PorterDuffXfermode;

    .line 21
    .line 22
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    .line 23
    .line 24
    invoke-direct {v2, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 28
    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    const/16 v4, 0x1f

    .line 32
    .line 33
    invoke-virtual {v0, v2, v1, v4}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I

    .line 34
    .line 35
    .line 36
    new-instance v1, Landroid/graphics/Paint;

    .line 37
    .line 38
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 39
    .line 40
    .line 41
    new-instance v5, Landroid/graphics/ColorMatrix;

    .line 42
    .line 43
    const/16 v6, 0x14

    .line 44
    .line 45
    new-array v6, v6, [F

    .line 46
    .line 47
    fill-array-data v6, :array_0

    .line 48
    .line 49
    .line 50
    invoke-direct {v5, v6}, Landroid/graphics/ColorMatrix;-><init>([F)V

    .line 51
    .line 52
    .line 53
    new-instance v6, Landroid/graphics/ColorMatrixColorFilter;

    .line 54
    .line 55
    invoke-direct {v6, v5}, Landroid/graphics/ColorMatrixColorFilter;-><init>(Landroid/graphics/ColorMatrix;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v6}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v2, v1, v4}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I

    .line 62
    .line 63
    .line 64
    iget-object v1, p0, La/esg0;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v1, La/cyu;

    .line 67
    .line 68
    iget-object v5, p0, La/esg0;->c:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v5, La/csg0;

    .line 71
    .line 72
    iget-object v5, v5, La/csg0;->a:La/xqg0;

    .line 73
    .line 74
    iget-object v5, v5, La/xqg0;->y:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v1, v5}, La/cyu;->L(Ljava/lang/String;)La/drg0;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    check-cast v1, La/mqg0;

    .line 81
    .line 82
    invoke-virtual {p0, v1, p1}, La/esg0;->w0(La/mqg0;La/gz40;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V

    .line 86
    .line 87
    .line 88
    new-instance v5, Landroid/graphics/Paint;

    .line 89
    .line 90
    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    .line 91
    .line 92
    .line 93
    new-instance v6, Landroid/graphics/PorterDuffXfermode;

    .line 94
    .line 95
    invoke-direct {v6, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v2, v5, v4}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, v1, p1}, La/esg0;->w0(La/mqg0;La/gz40;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V

    .line 111
    .line 112
    .line 113
    :cond_0
    invoke-virtual {p0}, La/esg0;->C0()V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x3e59ce07    # 0.2127f
        0x3f3710cb    # 0.7151f
        0x3d93dd98    # 0.0722f
        0x0
        0x0
    .end array-data
.end method

.method public q(La/crg0;La/gz40;)Landroid/graphics/Path;
    .locals 5

    .line 1
    iget-object p1, p1, La/frg0;->a:La/cyu;

    .line 2
    .line 3
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/csg0;

    .line 6
    .line 7
    iget-object v0, v0, La/csg0;->a:La/xqg0;

    .line 8
    .line 9
    iget-object v0, v0, La/xqg0;->x:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, La/cyu;->L(Ljava/lang/String;)La/drg0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, La/csg0;

    .line 20
    .line 21
    iget-object p0, p0, La/csg0;->a:La/xqg0;

    .line 22
    .line 23
    iget-object p0, p0, La/xqg0;->x:Ljava/lang/String;

    .line 24
    .line 25
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string p1, "ClipPath reference \'%s\' not found"

    .line 30
    .line 31
    invoke-static {p1, p0}, La/esg0;->E(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return-object p0

    .line 36
    :cond_0
    check-cast p1, La/zpg0;

    .line 37
    .line 38
    iget-object v0, p0, La/esg0;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Ljava/util/Stack;

    .line 41
    .line 42
    iget-object v1, p0, La/esg0;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, La/csg0;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, p1}, La/esg0;->M(La/frg0;)La/csg0;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 54
    .line 55
    iget-object v0, p1, La/zpg0;->o:Ljava/lang/Boolean;

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    const/4 v0, 0x0

    .line 68
    goto :goto_1

    .line 69
    :cond_2
    :goto_0
    move v0, v1

    .line 70
    :goto_1
    new-instance v2, Landroid/graphics/Matrix;

    .line 71
    .line 72
    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    .line 73
    .line 74
    .line 75
    if-nez v0, :cond_3

    .line 76
    .line 77
    iget v0, p2, La/gz40;->b:F

    .line 78
    .line 79
    iget v3, p2, La/gz40;->c:F

    .line 80
    .line 81
    invoke-virtual {v2, v0, v3}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 82
    .line 83
    .line 84
    iget v0, p2, La/gz40;->d:F

    .line 85
    .line 86
    iget p2, p2, La/gz40;->e:F

    .line 87
    .line 88
    invoke-virtual {v2, v0, p2}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 89
    .line 90
    .line 91
    :cond_3
    iget-object p2, p1, La/gqg0;->n:Landroid/graphics/Matrix;

    .line 92
    .line 93
    if-eqz p2, :cond_4

    .line 94
    .line 95
    invoke-virtual {v2, p2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 96
    .line 97
    .line 98
    :cond_4
    new-instance p2, Landroid/graphics/Path;

    .line 99
    .line 100
    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    .line 101
    .line 102
    .line 103
    iget-object v0, p1, La/arg0;->i:Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    :cond_5
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-eqz v3, :cond_7

    .line 114
    .line 115
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    check-cast v3, La/frg0;

    .line 120
    .line 121
    instance-of v4, v3, La/crg0;

    .line 122
    .line 123
    if-nez v4, :cond_6

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_6
    check-cast v3, La/crg0;

    .line 127
    .line 128
    invoke-virtual {p0, v3, v1}, La/esg0;->m0(La/crg0;Z)Landroid/graphics/Path;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    if-eqz v3, :cond_5

    .line 133
    .line 134
    sget-object v4, Landroid/graphics/Path$Op;->UNION:Landroid/graphics/Path$Op;

    .line 135
    .line 136
    invoke-virtual {p2, v3, v4}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_7
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v0, La/csg0;

    .line 143
    .line 144
    iget-object v0, v0, La/csg0;->a:La/xqg0;

    .line 145
    .line 146
    iget-object v0, v0, La/xqg0;->x:Ljava/lang/String;

    .line 147
    .line 148
    if-eqz v0, :cond_9

    .line 149
    .line 150
    iget-object v0, p1, La/crg0;->h:La/gz40;

    .line 151
    .line 152
    if-nez v0, :cond_8

    .line 153
    .line 154
    invoke-static {p2}, La/esg0;->r(Landroid/graphics/Path;)La/gz40;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    iput-object v0, p1, La/crg0;->h:La/gz40;

    .line 159
    .line 160
    :cond_8
    invoke-virtual {p0, p1, v0}, La/esg0;->q(La/crg0;La/gz40;)Landroid/graphics/Path;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    if-eqz p1, :cond_9

    .line 165
    .line 166
    sget-object v0, Landroid/graphics/Path$Op;->INTERSECT:Landroid/graphics/Path$Op;

    .line 167
    .line 168
    invoke-virtual {p2, p1, v0}, Landroid/graphics/Path;->op(Landroid/graphics/Path;Landroid/graphics/Path$Op;)Z

    .line 169
    .line 170
    .line 171
    :cond_9
    invoke-virtual {p2, v2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 172
    .line 173
    .line 174
    iget-object p1, p0, La/esg0;->d:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast p1, Ljava/util/Stack;

    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    check-cast p1, La/csg0;

    .line 183
    .line 184
    iput-object p1, p0, La/esg0;->c:Ljava/lang/Object;

    .line 185
    .line 186
    return-object p2
.end method

.method public q0()Z
    .locals 4

    .line 1
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/csg0;

    .line 4
    .line 5
    iget-object v0, v0, La/csg0;->a:La/xqg0;

    .line 6
    .line 7
    iget-object v0, v0, La/xqg0;->j:Ljava/lang/Float;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/high16 v1, 0x3f800000    # 1.0f

    .line 14
    .line 15
    cmpg-float v0, v0, v1

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-ltz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, La/csg0;

    .line 23
    .line 24
    iget-object v0, v0, La/csg0;->a:La/xqg0;

    .line 25
    .line 26
    iget-object v0, v0, La/xqg0;->y:Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return v1

    .line 32
    :cond_1
    :goto_0
    iget-object v0, p0, La/esg0;->a:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Landroid/graphics/Canvas;

    .line 35
    .line 36
    iget-object v2, p0, La/esg0;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, La/csg0;

    .line 39
    .line 40
    iget-object v2, v2, La/csg0;->a:La/xqg0;

    .line 41
    .line 42
    iget-object v2, v2, La/xqg0;->j:Ljava/lang/Float;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    const/high16 v3, 0x43800000    # 256.0f

    .line 49
    .line 50
    mul-float/2addr v2, v3

    .line 51
    float-to-int v2, v2

    .line 52
    if-gez v2, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    const/16 v1, 0xff

    .line 56
    .line 57
    if-le v2, v1, :cond_3

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    move v1, v2

    .line 61
    :goto_1
    const/16 v2, 0x1f

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-virtual {v0, v3, v1, v2}, Landroid/graphics/Canvas;->saveLayerAlpha(Landroid/graphics/RectF;II)I

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, La/esg0;->d:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Ljava/util/Stack;

    .line 70
    .line 71
    iget-object v1, p0, La/esg0;->c:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, La/csg0;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    new-instance v0, La/csg0;

    .line 79
    .line 80
    iget-object v1, p0, La/esg0;->c:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v1, La/csg0;

    .line 83
    .line 84
    invoke-direct {v0, v1}, La/csg0;-><init>(La/csg0;)V

    .line 85
    .line 86
    .line 87
    iput-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 88
    .line 89
    iget-object v0, v0, La/csg0;->a:La/xqg0;

    .line 90
    .line 91
    iget-object v0, v0, La/xqg0;->y:Ljava/lang/String;

    .line 92
    .line 93
    const/4 v1, 0x1

    .line 94
    if-eqz v0, :cond_5

    .line 95
    .line 96
    iget-object v2, p0, La/esg0;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v2, La/cyu;

    .line 99
    .line 100
    invoke-virtual {v2, v0}, La/cyu;->L(Ljava/lang/String;)La/drg0;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    if-eqz v0, :cond_4

    .line 105
    .line 106
    instance-of v0, v0, La/mqg0;

    .line 107
    .line 108
    if-nez v0, :cond_5

    .line 109
    .line 110
    :cond_4
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, La/csg0;

    .line 113
    .line 114
    iget-object v0, v0, La/csg0;->a:La/xqg0;

    .line 115
    .line 116
    iget-object v0, v0, La/xqg0;->y:Ljava/lang/String;

    .line 117
    .line 118
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    const-string v2, "Mask reference \'%s\' not found"

    .line 123
    .line 124
    invoke-static {v2, v0}, La/esg0;->E(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    iget-object p0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast p0, La/csg0;

    .line 130
    .line 131
    iget-object p0, p0, La/csg0;->a:La/xqg0;

    .line 132
    .line 133
    iput-object v3, p0, La/xqg0;->y:Ljava/lang/String;

    .line 134
    .line 135
    :cond_5
    return v1
.end method

.method public r0(La/yqg0;La/gz40;La/gz40;La/bub0;)V
    .locals 3

    .line 1
    iget v0, p2, La/gz40;->d:F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpl-float v0, v0, v1

    .line 5
    .line 6
    if-eqz v0, :cond_7

    .line 7
    .line 8
    iget v0, p2, La/gz40;->e:F

    .line 9
    .line 10
    cmpl-float v0, v0, v1

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto/16 :goto_2

    .line 15
    .line 16
    :cond_0
    if-nez p4, :cond_2

    .line 17
    .line 18
    iget-object p4, p1, La/hrg0;->n:La/bub0;

    .line 19
    .line 20
    if-eqz p4, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    sget-object p4, La/bub0;->d:La/bub0;

    .line 24
    .line 25
    :cond_2
    :goto_0
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, La/csg0;

    .line 28
    .line 29
    invoke-virtual {p0, v0, p1}, La/esg0;->H0(La/csg0;La/drg0;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, La/esg0;->A()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_3
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, La/csg0;

    .line 42
    .line 43
    iput-object p2, v0, La/csg0;->f:La/gz40;

    .line 44
    .line 45
    iget-object p2, v0, La/csg0;->a:La/xqg0;

    .line 46
    .line 47
    iget-object p2, p2, La/xqg0;->o:Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-nez p2, :cond_4

    .line 54
    .line 55
    iget-object p2, p0, La/esg0;->c:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p2, La/csg0;

    .line 58
    .line 59
    iget-object p2, p2, La/csg0;->f:La/gz40;

    .line 60
    .line 61
    iget v0, p2, La/gz40;->b:F

    .line 62
    .line 63
    iget v1, p2, La/gz40;->c:F

    .line 64
    .line 65
    iget v2, p2, La/gz40;->d:F

    .line 66
    .line 67
    iget p2, p2, La/gz40;->e:F

    .line 68
    .line 69
    invoke-virtual {p0, v0, v1, v2, p2}, La/esg0;->z0(FFFF)V

    .line 70
    .line 71
    .line 72
    :cond_4
    iget-object p2, p0, La/esg0;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p2, La/csg0;

    .line 75
    .line 76
    iget-object p2, p2, La/csg0;->f:La/gz40;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/esg0;->u(La/crg0;La/gz40;)V

    .line 79
    .line 80
    .line 81
    iget-object p2, p0, La/esg0;->a:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p2, Landroid/graphics/Canvas;

    .line 84
    .line 85
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, La/csg0;

    .line 88
    .line 89
    if-eqz p3, :cond_5

    .line 90
    .line 91
    iget-object v0, v0, La/csg0;->f:La/gz40;

    .line 92
    .line 93
    invoke-static {v0, p3, p4}, La/esg0;->t(La/gz40;La/gz40;La/bub0;)Landroid/graphics/Matrix;

    .line 94
    .line 95
    .line 96
    move-result-object p3

    .line 97
    invoke-virtual {p2, p3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 98
    .line 99
    .line 100
    iget-object p2, p0, La/esg0;->c:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p2, La/csg0;

    .line 103
    .line 104
    iget-object p3, p1, La/jrg0;->o:La/gz40;

    .line 105
    .line 106
    iput-object p3, p2, La/csg0;->g:La/gz40;

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_5
    iget-object p3, v0, La/csg0;->f:La/gz40;

    .line 110
    .line 111
    iget p4, p3, La/gz40;->b:F

    .line 112
    .line 113
    iget p3, p3, La/gz40;->c:F

    .line 114
    .line 115
    invoke-virtual {p2, p4, p3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 116
    .line 117
    .line 118
    :goto_1
    invoke-virtual {p0}, La/esg0;->q0()Z

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    invoke-virtual {p0}, La/esg0;->I0()V

    .line 123
    .line 124
    .line 125
    const/4 p3, 0x1

    .line 126
    invoke-virtual {p0, p1, p3}, La/esg0;->t0(La/brg0;Z)V

    .line 127
    .line 128
    .line 129
    if-eqz p2, :cond_6

    .line 130
    .line 131
    iget-object p2, p1, La/crg0;->h:La/gz40;

    .line 132
    .line 133
    invoke-virtual {p0, p2}, La/esg0;->p0(La/gz40;)V

    .line 134
    .line 135
    .line 136
    :cond_6
    invoke-virtual {p0, p1}, La/esg0;->F0(La/crg0;)V

    .line 137
    .line 138
    .line 139
    :cond_7
    :goto_2
    return-void
.end method

.method public s(La/qrg0;)F
    .locals 1

    .line 1
    new-instance v0, La/dsg0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, La/dsg0;-><init>(La/esg0;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, La/esg0;->D(La/qrg0;La/x2x;)V

    .line 7
    .line 8
    .line 9
    iget p0, v0, La/dsg0;->b:F

    .line 10
    .line 11
    return p0
.end method

.method public s0(La/frg0;)V
    .locals 13

    .line 1
    instance-of v0, p1, La/nqg0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, La/esg0;->D0()V

    .line 7
    .line 8
    .line 9
    instance-of v0, p1, La/drg0;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    move-object v0, p1

    .line 15
    check-cast v0, La/drg0;

    .line 16
    .line 17
    iget-object v0, v0, La/drg0;->d:Ljava/lang/Boolean;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-object v1, p0, La/esg0;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, La/csg0;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iput-boolean v0, v1, La/csg0;->h:Z

    .line 30
    .line 31
    :cond_2
    :goto_0
    instance-of v0, p1, La/yqg0;

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    check-cast p1, La/yqg0;

    .line 36
    .line 37
    iget-object v0, p1, La/yqg0;->p:La/jqg0;

    .line 38
    .line 39
    iget-object v1, p1, La/yqg0;->q:La/jqg0;

    .line 40
    .line 41
    iget-object v2, p1, La/yqg0;->r:La/jqg0;

    .line 42
    .line 43
    iget-object v3, p1, La/yqg0;->s:La/jqg0;

    .line 44
    .line 45
    invoke-virtual {p0, v0, v1, v2, v3}, La/esg0;->l0(La/jqg0;La/jqg0;La/jqg0;La/jqg0;)La/gz40;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v1, p1, La/jrg0;->o:La/gz40;

    .line 50
    .line 51
    iget-object v2, p1, La/hrg0;->n:La/bub0;

    .line 52
    .line 53
    invoke-virtual {p0, p1, v0, v1, v2}, La/esg0;->r0(La/yqg0;La/gz40;La/gz40;La/bub0;)V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_1d

    .line 57
    .line 58
    :cond_3
    instance-of v0, p1, La/urg0;

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    const/4 v2, 0x1

    .line 62
    const/4 v3, 0x0

    .line 63
    if-eqz v0, :cond_16

    .line 64
    .line 65
    check-cast p1, La/urg0;

    .line 66
    .line 67
    iget-object v0, p0, La/esg0;->a:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Landroid/graphics/Canvas;

    .line 70
    .line 71
    iget-object v4, p1, La/urg0;->r:La/jqg0;

    .line 72
    .line 73
    if-eqz v4, :cond_4

    .line 74
    .line 75
    invoke-virtual {v4}, La/jqg0;->g()Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-nez v4, :cond_7f

    .line 80
    .line 81
    :cond_4
    iget-object v4, p1, La/urg0;->s:La/jqg0;

    .line 82
    .line 83
    if-eqz v4, :cond_5

    .line 84
    .line 85
    invoke-virtual {v4}, La/jqg0;->g()Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-eqz v4, :cond_5

    .line 90
    .line 91
    goto/16 :goto_1d

    .line 92
    .line 93
    :cond_5
    iget-object v4, p0, La/esg0;->c:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v4, La/csg0;

    .line 96
    .line 97
    invoke-virtual {p0, v4, p1}, La/esg0;->H0(La/csg0;La/drg0;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, La/esg0;->A()Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-nez v4, :cond_6

    .line 105
    .line 106
    goto/16 :goto_1d

    .line 107
    .line 108
    :cond_6
    iget-object v4, p1, La/frg0;->a:La/cyu;

    .line 109
    .line 110
    iget-object v5, p1, La/urg0;->o:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v4, v5}, La/cyu;->L(Ljava/lang/String;)La/drg0;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    if-nez v4, :cond_7

    .line 117
    .line 118
    const-string v0, "Use reference \'%s\' not found"

    .line 119
    .line 120
    iget-object p1, p1, La/urg0;->o:Ljava/lang/String;

    .line 121
    .line 122
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-static {v0, p1}, La/esg0;->E(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    goto/16 :goto_1d

    .line 130
    .line 131
    :cond_7
    iget-object v5, p1, La/gqg0;->n:Landroid/graphics/Matrix;

    .line 132
    .line 133
    if-eqz v5, :cond_8

    .line 134
    .line 135
    invoke-virtual {v0, v5}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 136
    .line 137
    .line 138
    :cond_8
    iget-object v5, p1, La/urg0;->p:La/jqg0;

    .line 139
    .line 140
    if-eqz v5, :cond_9

    .line 141
    .line 142
    invoke-virtual {v5, p0}, La/jqg0;->d(La/esg0;)F

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    goto :goto_1

    .line 147
    :cond_9
    move v5, v3

    .line 148
    :goto_1
    iget-object v6, p1, La/urg0;->q:La/jqg0;

    .line 149
    .line 150
    if-eqz v6, :cond_a

    .line 151
    .line 152
    invoke-virtual {v6, p0}, La/jqg0;->e(La/esg0;)F

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    goto :goto_2

    .line 157
    :cond_a
    move v6, v3

    .line 158
    :goto_2
    invoke-virtual {v0, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 159
    .line 160
    .line 161
    iget-object v5, p1, La/crg0;->h:La/gz40;

    .line 162
    .line 163
    invoke-virtual {p0, p1, v5}, La/esg0;->u(La/crg0;La/gz40;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0}, La/esg0;->q0()Z

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    iget-object v6, p0, La/esg0;->e:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v6, Ljava/util/Stack;

    .line 173
    .line 174
    invoke-virtual {v6, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    iget-object v6, p0, La/esg0;->f:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v6, Ljava/util/Stack;

    .line 180
    .line 181
    iget-object v7, p0, La/esg0;->a:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v7, Landroid/graphics/Canvas;

    .line 184
    .line 185
    invoke-virtual {v7}, Landroid/graphics/Canvas;->getMatrix()Landroid/graphics/Matrix;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    invoke-virtual {v6, v7}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    instance-of v6, v4, La/yqg0;

    .line 193
    .line 194
    if-eqz v6, :cond_b

    .line 195
    .line 196
    check-cast v4, La/yqg0;

    .line 197
    .line 198
    iget-object v0, p1, La/urg0;->r:La/jqg0;

    .line 199
    .line 200
    iget-object v2, p1, La/urg0;->s:La/jqg0;

    .line 201
    .line 202
    invoke-virtual {p0, v1, v1, v0, v2}, La/esg0;->l0(La/jqg0;La/jqg0;La/jqg0;La/jqg0;)La/gz40;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {p0}, La/esg0;->D0()V

    .line 207
    .line 208
    .line 209
    iget-object v1, v4, La/jrg0;->o:La/gz40;

    .line 210
    .line 211
    iget-object v2, v4, La/hrg0;->n:La/bub0;

    .line 212
    .line 213
    invoke-virtual {p0, v4, v0, v1, v2}, La/esg0;->r0(La/yqg0;La/gz40;La/gz40;La/bub0;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p0}, La/esg0;->C0()V

    .line 217
    .line 218
    .line 219
    goto/16 :goto_8

    .line 220
    .line 221
    :cond_b
    instance-of v6, v4, La/lrg0;

    .line 222
    .line 223
    if-eqz v6, :cond_14

    .line 224
    .line 225
    iget-object v6, p1, La/urg0;->r:La/jqg0;

    .line 226
    .line 227
    const/16 v7, 0x9

    .line 228
    .line 229
    const/high16 v8, 0x42c80000    # 100.0f

    .line 230
    .line 231
    if-eqz v6, :cond_c

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_c
    new-instance v6, La/jqg0;

    .line 235
    .line 236
    invoke-direct {v6, v8, v7}, La/jqg0;-><init>(FI)V

    .line 237
    .line 238
    .line 239
    :goto_3
    iget-object v9, p1, La/urg0;->s:La/jqg0;

    .line 240
    .line 241
    if-eqz v9, :cond_d

    .line 242
    .line 243
    goto :goto_4

    .line 244
    :cond_d
    new-instance v9, La/jqg0;

    .line 245
    .line 246
    invoke-direct {v9, v8, v7}, La/jqg0;-><init>(FI)V

    .line 247
    .line 248
    .line 249
    :goto_4
    invoke-virtual {p0, v1, v1, v6, v9}, La/esg0;->l0(La/jqg0;La/jqg0;La/jqg0;La/jqg0;)La/gz40;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    invoke-virtual {p0}, La/esg0;->D0()V

    .line 254
    .line 255
    .line 256
    check-cast v4, La/lrg0;

    .line 257
    .line 258
    iget v6, v1, La/gz40;->d:F

    .line 259
    .line 260
    cmpl-float v6, v6, v3

    .line 261
    .line 262
    if-eqz v6, :cond_13

    .line 263
    .line 264
    iget v6, v1, La/gz40;->e:F

    .line 265
    .line 266
    cmpl-float v3, v6, v3

    .line 267
    .line 268
    if-nez v3, :cond_e

    .line 269
    .line 270
    goto :goto_7

    .line 271
    :cond_e
    iget-object v3, v4, La/hrg0;->n:La/bub0;

    .line 272
    .line 273
    if-eqz v3, :cond_f

    .line 274
    .line 275
    goto :goto_5

    .line 276
    :cond_f
    sget-object v3, La/bub0;->d:La/bub0;

    .line 277
    .line 278
    :goto_5
    iget-object v6, p0, La/esg0;->c:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v6, La/csg0;

    .line 281
    .line 282
    invoke-virtual {p0, v6, v4}, La/esg0;->H0(La/csg0;La/drg0;)V

    .line 283
    .line 284
    .line 285
    iget-object v6, p0, La/esg0;->c:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v6, La/csg0;

    .line 288
    .line 289
    iput-object v1, v6, La/csg0;->f:La/gz40;

    .line 290
    .line 291
    iget-object v1, v6, La/csg0;->a:La/xqg0;

    .line 292
    .line 293
    iget-object v1, v1, La/xqg0;->o:Ljava/lang/Boolean;

    .line 294
    .line 295
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 296
    .line 297
    .line 298
    move-result v1

    .line 299
    if-nez v1, :cond_10

    .line 300
    .line 301
    iget-object v1, p0, La/esg0;->c:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v1, La/csg0;

    .line 304
    .line 305
    iget-object v1, v1, La/csg0;->f:La/gz40;

    .line 306
    .line 307
    iget v6, v1, La/gz40;->b:F

    .line 308
    .line 309
    iget v7, v1, La/gz40;->c:F

    .line 310
    .line 311
    iget v8, v1, La/gz40;->d:F

    .line 312
    .line 313
    iget v1, v1, La/gz40;->e:F

    .line 314
    .line 315
    invoke-virtual {p0, v6, v7, v8, v1}, La/esg0;->z0(FFFF)V

    .line 316
    .line 317
    .line 318
    :cond_10
    iget-object v1, v4, La/jrg0;->o:La/gz40;

    .line 319
    .line 320
    iget-object v6, p0, La/esg0;->c:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast v6, La/csg0;

    .line 323
    .line 324
    if-eqz v1, :cond_11

    .line 325
    .line 326
    iget-object v6, v6, La/csg0;->f:La/gz40;

    .line 327
    .line 328
    invoke-static {v6, v1, v3}, La/esg0;->t(La/gz40;La/gz40;La/bub0;)Landroid/graphics/Matrix;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 333
    .line 334
    .line 335
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v0, La/csg0;

    .line 338
    .line 339
    iget-object v1, v4, La/jrg0;->o:La/gz40;

    .line 340
    .line 341
    iput-object v1, v0, La/csg0;->g:La/gz40;

    .line 342
    .line 343
    goto :goto_6

    .line 344
    :cond_11
    iget-object v1, v6, La/csg0;->f:La/gz40;

    .line 345
    .line 346
    iget v3, v1, La/gz40;->b:F

    .line 347
    .line 348
    iget v1, v1, La/gz40;->c:F

    .line 349
    .line 350
    invoke-virtual {v0, v3, v1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 351
    .line 352
    .line 353
    :goto_6
    invoke-virtual {p0}, La/esg0;->q0()Z

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    invoke-virtual {p0, v4, v2}, La/esg0;->t0(La/brg0;Z)V

    .line 358
    .line 359
    .line 360
    if-eqz v0, :cond_12

    .line 361
    .line 362
    iget-object v0, v4, La/crg0;->h:La/gz40;

    .line 363
    .line 364
    invoke-virtual {p0, v0}, La/esg0;->p0(La/gz40;)V

    .line 365
    .line 366
    .line 367
    :cond_12
    invoke-virtual {p0, v4}, La/esg0;->F0(La/crg0;)V

    .line 368
    .line 369
    .line 370
    :cond_13
    :goto_7
    invoke-virtual {p0}, La/esg0;->C0()V

    .line 371
    .line 372
    .line 373
    goto :goto_8

    .line 374
    :cond_14
    invoke-virtual {p0, v4}, La/esg0;->s0(La/frg0;)V

    .line 375
    .line 376
    .line 377
    :goto_8
    iget-object v0, p0, La/esg0;->e:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v0, Ljava/util/Stack;

    .line 380
    .line 381
    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    iget-object v0, p0, La/esg0;->f:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast v0, Ljava/util/Stack;

    .line 387
    .line 388
    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    if-eqz v5, :cond_15

    .line 392
    .line 393
    iget-object v0, p1, La/crg0;->h:La/gz40;

    .line 394
    .line 395
    invoke-virtual {p0, v0}, La/esg0;->p0(La/gz40;)V

    .line 396
    .line 397
    .line 398
    :cond_15
    invoke-virtual {p0, p1}, La/esg0;->F0(La/crg0;)V

    .line 399
    .line 400
    .line 401
    goto/16 :goto_1d

    .line 402
    .line 403
    :cond_16
    instance-of v0, p1, La/krg0;

    .line 404
    .line 405
    if-eqz v0, :cond_23

    .line 406
    .line 407
    check-cast p1, La/krg0;

    .line 408
    .line 409
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v0, La/csg0;

    .line 412
    .line 413
    invoke-virtual {p0, v0, p1}, La/esg0;->H0(La/csg0;La/drg0;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {p0}, La/esg0;->A()Z

    .line 417
    .line 418
    .line 419
    move-result v0

    .line 420
    if-nez v0, :cond_17

    .line 421
    .line 422
    goto/16 :goto_1d

    .line 423
    .line 424
    :cond_17
    iget-object v0, p1, La/gqg0;->n:Landroid/graphics/Matrix;

    .line 425
    .line 426
    if-eqz v0, :cond_18

    .line 427
    .line 428
    iget-object v1, p0, La/esg0;->a:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v1, Landroid/graphics/Canvas;

    .line 431
    .line 432
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 433
    .line 434
    .line 435
    :cond_18
    iget-object v0, p1, La/crg0;->h:La/gz40;

    .line 436
    .line 437
    invoke-virtual {p0, p1, v0}, La/esg0;->u(La/crg0;La/gz40;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {p0}, La/esg0;->q0()Z

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    iget-object v2, p1, La/arg0;->i:Ljava/util/ArrayList;

    .line 453
    .line 454
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    :cond_19
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 459
    .line 460
    .line 461
    move-result v3

    .line 462
    if-eqz v3, :cond_21

    .line 463
    .line 464
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v3

    .line 468
    check-cast v3, La/frg0;

    .line 469
    .line 470
    instance-of v4, v3, La/zqg0;

    .line 471
    .line 472
    if-nez v4, :cond_1a

    .line 473
    .line 474
    goto :goto_9

    .line 475
    :cond_1a
    move-object v4, v3

    .line 476
    check-cast v4, La/zqg0;

    .line 477
    .line 478
    invoke-interface {v4}, La/zqg0;->b()Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v5

    .line 482
    if-eqz v5, :cond_1b

    .line 483
    .line 484
    goto :goto_9

    .line 485
    :cond_1b
    invoke-interface {v4}, La/zqg0;->a()Ljava/util/Set;

    .line 486
    .line 487
    .line 488
    move-result-object v5

    .line 489
    if-eqz v5, :cond_1c

    .line 490
    .line 491
    invoke-interface {v5}, Ljava/util/Set;->isEmpty()Z

    .line 492
    .line 493
    .line 494
    move-result v6

    .line 495
    if-nez v6, :cond_19

    .line 496
    .line 497
    invoke-interface {v5, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    move-result v5

    .line 501
    if-nez v5, :cond_1c

    .line 502
    .line 503
    goto :goto_9

    .line 504
    :cond_1c
    invoke-interface {v4}, La/zqg0;->e()Ljava/util/Set;

    .line 505
    .line 506
    .line 507
    move-result-object v5

    .line 508
    if-eqz v5, :cond_1e

    .line 509
    .line 510
    sget-object v6, La/esg0;->g:Ljava/util/HashSet;

    .line 511
    .line 512
    if-nez v6, :cond_1d

    .line 513
    .line 514
    const-class v6, La/esg0;

    .line 515
    .line 516
    monitor-enter v6

    .line 517
    :try_start_0
    new-instance v7, Ljava/util/HashSet;

    .line 518
    .line 519
    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 520
    .line 521
    .line 522
    sput-object v7, La/esg0;->g:Ljava/util/HashSet;

    .line 523
    .line 524
    const-string v8, "Structure"

    .line 525
    .line 526
    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    sget-object v7, La/esg0;->g:Ljava/util/HashSet;

    .line 530
    .line 531
    const-string v8, "BasicStructure"

    .line 532
    .line 533
    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 534
    .line 535
    .line 536
    sget-object v7, La/esg0;->g:Ljava/util/HashSet;

    .line 537
    .line 538
    const-string v8, "ConditionalProcessing"

    .line 539
    .line 540
    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    sget-object v7, La/esg0;->g:Ljava/util/HashSet;

    .line 544
    .line 545
    const-string v8, "Image"

    .line 546
    .line 547
    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    sget-object v7, La/esg0;->g:Ljava/util/HashSet;

    .line 551
    .line 552
    const-string v8, "Style"

    .line 553
    .line 554
    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    sget-object v7, La/esg0;->g:Ljava/util/HashSet;

    .line 558
    .line 559
    const-string v8, "ViewportAttribute"

    .line 560
    .line 561
    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 562
    .line 563
    .line 564
    sget-object v7, La/esg0;->g:Ljava/util/HashSet;

    .line 565
    .line 566
    const-string v8, "Shape"

    .line 567
    .line 568
    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 569
    .line 570
    .line 571
    sget-object v7, La/esg0;->g:Ljava/util/HashSet;

    .line 572
    .line 573
    const-string v8, "BasicText"

    .line 574
    .line 575
    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    sget-object v7, La/esg0;->g:Ljava/util/HashSet;

    .line 579
    .line 580
    const-string v8, "PaintAttribute"

    .line 581
    .line 582
    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 583
    .line 584
    .line 585
    sget-object v7, La/esg0;->g:Ljava/util/HashSet;

    .line 586
    .line 587
    const-string v8, "BasicPaintAttribute"

    .line 588
    .line 589
    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    sget-object v7, La/esg0;->g:Ljava/util/HashSet;

    .line 593
    .line 594
    const-string v8, "OpacityAttribute"

    .line 595
    .line 596
    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 597
    .line 598
    .line 599
    sget-object v7, La/esg0;->g:Ljava/util/HashSet;

    .line 600
    .line 601
    const-string v8, "BasicGraphicsAttribute"

    .line 602
    .line 603
    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 604
    .line 605
    .line 606
    sget-object v7, La/esg0;->g:Ljava/util/HashSet;

    .line 607
    .line 608
    const-string v8, "Marker"

    .line 609
    .line 610
    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 611
    .line 612
    .line 613
    sget-object v7, La/esg0;->g:Ljava/util/HashSet;

    .line 614
    .line 615
    const-string v8, "Gradient"

    .line 616
    .line 617
    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 618
    .line 619
    .line 620
    sget-object v7, La/esg0;->g:Ljava/util/HashSet;

    .line 621
    .line 622
    const-string v8, "Pattern"

    .line 623
    .line 624
    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 625
    .line 626
    .line 627
    sget-object v7, La/esg0;->g:Ljava/util/HashSet;

    .line 628
    .line 629
    const-string v8, "Clip"

    .line 630
    .line 631
    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 632
    .line 633
    .line 634
    sget-object v7, La/esg0;->g:Ljava/util/HashSet;

    .line 635
    .line 636
    const-string v8, "BasicClip"

    .line 637
    .line 638
    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 639
    .line 640
    .line 641
    sget-object v7, La/esg0;->g:Ljava/util/HashSet;

    .line 642
    .line 643
    const-string v8, "Mask"

    .line 644
    .line 645
    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 646
    .line 647
    .line 648
    sget-object v7, La/esg0;->g:Ljava/util/HashSet;

    .line 649
    .line 650
    const-string v8, "View"

    .line 651
    .line 652
    invoke-virtual {v7, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 653
    .line 654
    .line 655
    monitor-exit v6

    .line 656
    goto :goto_a

    .line 657
    :catchall_0
    move-exception p0

    .line 658
    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 659
    throw p0

    .line 660
    :cond_1d
    :goto_a
    invoke-interface {v5}, Ljava/util/Set;->isEmpty()Z

    .line 661
    .line 662
    .line 663
    move-result v6

    .line 664
    if-nez v6, :cond_19

    .line 665
    .line 666
    sget-object v6, La/esg0;->g:Ljava/util/HashSet;

    .line 667
    .line 668
    invoke-virtual {v6, v5}, Ljava/util/AbstractCollection;->containsAll(Ljava/util/Collection;)Z

    .line 669
    .line 670
    .line 671
    move-result v5

    .line 672
    if-nez v5, :cond_1e

    .line 673
    .line 674
    goto/16 :goto_9

    .line 675
    .line 676
    :cond_1e
    invoke-interface {v4}, La/zqg0;->l()Ljava/util/Set;

    .line 677
    .line 678
    .line 679
    move-result-object v5

    .line 680
    if-eqz v5, :cond_1f

    .line 681
    .line 682
    invoke-interface {v5}, Ljava/util/Set;->isEmpty()Z

    .line 683
    .line 684
    .line 685
    goto/16 :goto_9

    .line 686
    .line 687
    :cond_1f
    invoke-interface {v4}, La/zqg0;->m()Ljava/util/Set;

    .line 688
    .line 689
    .line 690
    move-result-object v4

    .line 691
    if-eqz v4, :cond_20

    .line 692
    .line 693
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    .line 694
    .line 695
    .line 696
    goto/16 :goto_9

    .line 697
    .line 698
    :cond_20
    invoke-virtual {p0, v3}, La/esg0;->s0(La/frg0;)V

    .line 699
    .line 700
    .line 701
    :cond_21
    if-eqz v0, :cond_22

    .line 702
    .line 703
    iget-object v0, p1, La/crg0;->h:La/gz40;

    .line 704
    .line 705
    invoke-virtual {p0, v0}, La/esg0;->p0(La/gz40;)V

    .line 706
    .line 707
    .line 708
    :cond_22
    invoke-virtual {p0, p1}, La/esg0;->F0(La/crg0;)V

    .line 709
    .line 710
    .line 711
    goto/16 :goto_1d

    .line 712
    .line 713
    :cond_23
    instance-of v0, p1, La/gqg0;

    .line 714
    .line 715
    if-eqz v0, :cond_27

    .line 716
    .line 717
    check-cast p1, La/gqg0;

    .line 718
    .line 719
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 720
    .line 721
    check-cast v0, La/csg0;

    .line 722
    .line 723
    invoke-virtual {p0, v0, p1}, La/esg0;->H0(La/csg0;La/drg0;)V

    .line 724
    .line 725
    .line 726
    invoke-virtual {p0}, La/esg0;->A()Z

    .line 727
    .line 728
    .line 729
    move-result v0

    .line 730
    if-nez v0, :cond_24

    .line 731
    .line 732
    goto/16 :goto_1d

    .line 733
    .line 734
    :cond_24
    iget-object v0, p1, La/gqg0;->n:Landroid/graphics/Matrix;

    .line 735
    .line 736
    if-eqz v0, :cond_25

    .line 737
    .line 738
    iget-object v1, p0, La/esg0;->a:Ljava/lang/Object;

    .line 739
    .line 740
    check-cast v1, Landroid/graphics/Canvas;

    .line 741
    .line 742
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 743
    .line 744
    .line 745
    :cond_25
    iget-object v0, p1, La/crg0;->h:La/gz40;

    .line 746
    .line 747
    invoke-virtual {p0, p1, v0}, La/esg0;->u(La/crg0;La/gz40;)V

    .line 748
    .line 749
    .line 750
    invoke-virtual {p0}, La/esg0;->q0()Z

    .line 751
    .line 752
    .line 753
    move-result v0

    .line 754
    invoke-virtual {p0, p1, v2}, La/esg0;->t0(La/brg0;Z)V

    .line 755
    .line 756
    .line 757
    if-eqz v0, :cond_26

    .line 758
    .line 759
    iget-object v0, p1, La/crg0;->h:La/gz40;

    .line 760
    .line 761
    invoke-virtual {p0, v0}, La/esg0;->p0(La/gz40;)V

    .line 762
    .line 763
    .line 764
    :cond_26
    invoke-virtual {p0, p1}, La/esg0;->F0(La/crg0;)V

    .line 765
    .line 766
    .line 767
    goto/16 :goto_1d

    .line 768
    .line 769
    :cond_27
    instance-of v0, p1, La/iqg0;

    .line 770
    .line 771
    const/4 v4, 0x0

    .line 772
    const/4 v5, 0x2

    .line 773
    if-eqz v0, :cond_37

    .line 774
    .line 775
    check-cast p1, La/iqg0;

    .line 776
    .line 777
    iget-object v0, p0, La/esg0;->a:Ljava/lang/Object;

    .line 778
    .line 779
    check-cast v0, Landroid/graphics/Canvas;

    .line 780
    .line 781
    iget-object v6, p1, La/iqg0;->r:La/jqg0;

    .line 782
    .line 783
    if-eqz v6, :cond_7f

    .line 784
    .line 785
    invoke-virtual {v6}, La/jqg0;->g()Z

    .line 786
    .line 787
    .line 788
    move-result v6

    .line 789
    if-nez v6, :cond_7f

    .line 790
    .line 791
    iget-object v6, p1, La/iqg0;->s:La/jqg0;

    .line 792
    .line 793
    if-eqz v6, :cond_7f

    .line 794
    .line 795
    invoke-virtual {v6}, La/jqg0;->g()Z

    .line 796
    .line 797
    .line 798
    move-result v6

    .line 799
    if-eqz v6, :cond_28

    .line 800
    .line 801
    goto/16 :goto_1d

    .line 802
    .line 803
    :cond_28
    iget-object v6, p1, La/iqg0;->o:Ljava/lang/String;

    .line 804
    .line 805
    if-nez v6, :cond_29

    .line 806
    .line 807
    goto/16 :goto_1d

    .line 808
    .line 809
    :cond_29
    iget-object v7, p1, La/hrg0;->n:La/bub0;

    .line 810
    .line 811
    if-eqz v7, :cond_2a

    .line 812
    .line 813
    goto :goto_b

    .line 814
    :cond_2a
    sget-object v7, La/bub0;->d:La/bub0;

    .line 815
    .line 816
    :goto_b
    const-string v8, "data:"

    .line 817
    .line 818
    invoke-virtual {v6, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 819
    .line 820
    .line 821
    move-result v8

    .line 822
    if-nez v8, :cond_2b

    .line 823
    .line 824
    goto :goto_c

    .line 825
    :cond_2b
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 826
    .line 827
    .line 828
    move-result v8

    .line 829
    const/16 v9, 0xe

    .line 830
    .line 831
    if-ge v8, v9, :cond_2c

    .line 832
    .line 833
    goto :goto_c

    .line 834
    :cond_2c
    const/16 v8, 0x2c

    .line 835
    .line 836
    invoke-virtual {v6, v8}, Ljava/lang/String;->indexOf(I)I

    .line 837
    .line 838
    .line 839
    move-result v8

    .line 840
    const/16 v9, 0xc

    .line 841
    .line 842
    if-ge v8, v9, :cond_2d

    .line 843
    .line 844
    goto :goto_c

    .line 845
    :cond_2d
    const-string v9, ";base64"

    .line 846
    .line 847
    add-int/lit8 v10, v8, -0x7

    .line 848
    .line 849
    invoke-virtual {v6, v10, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 850
    .line 851
    .line 852
    move-result-object v10

    .line 853
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 854
    .line 855
    .line 856
    move-result v9

    .line 857
    if-nez v9, :cond_2e

    .line 858
    .line 859
    goto :goto_c

    .line 860
    :cond_2e
    add-int/2addr v8, v2

    .line 861
    :try_start_2
    invoke-virtual {v6, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 862
    .line 863
    .line 864
    move-result-object v2

    .line 865
    invoke-static {v2, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 866
    .line 867
    .line 868
    move-result-object v2

    .line 869
    array-length v6, v2

    .line 870
    invoke-static {v2, v4, v6}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 871
    .line 872
    .line 873
    move-result-object v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 874
    goto :goto_c

    .line 875
    :catch_0
    move-exception v2

    .line 876
    const-string v6, "SVGAndroidRenderer"

    .line 877
    .line 878
    const-string v8, "Could not decode bad Data URL"

    .line 879
    .line 880
    invoke-static {v6, v8, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 881
    .line 882
    .line 883
    :goto_c
    if-nez v1, :cond_2f

    .line 884
    .line 885
    goto/16 :goto_1d

    .line 886
    .line 887
    :cond_2f
    new-instance v2, La/gz40;

    .line 888
    .line 889
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 890
    .line 891
    .line 892
    move-result v6

    .line 893
    int-to-float v6, v6

    .line 894
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 895
    .line 896
    .line 897
    move-result v8

    .line 898
    int-to-float v8, v8

    .line 899
    invoke-direct {v2, v3, v3, v6, v8}, La/gz40;-><init>(FFFF)V

    .line 900
    .line 901
    .line 902
    iget-object v6, p0, La/esg0;->c:Ljava/lang/Object;

    .line 903
    .line 904
    check-cast v6, La/csg0;

    .line 905
    .line 906
    invoke-virtual {p0, v6, p1}, La/esg0;->H0(La/csg0;La/drg0;)V

    .line 907
    .line 908
    .line 909
    invoke-virtual {p0}, La/esg0;->A()Z

    .line 910
    .line 911
    .line 912
    move-result v6

    .line 913
    if-nez v6, :cond_30

    .line 914
    .line 915
    goto/16 :goto_1d

    .line 916
    .line 917
    :cond_30
    invoke-virtual {p0}, La/esg0;->J0()Z

    .line 918
    .line 919
    .line 920
    move-result v6

    .line 921
    if-nez v6, :cond_31

    .line 922
    .line 923
    goto/16 :goto_1d

    .line 924
    .line 925
    :cond_31
    iget-object v6, p1, La/iqg0;->t:Landroid/graphics/Matrix;

    .line 926
    .line 927
    if-eqz v6, :cond_32

    .line 928
    .line 929
    invoke-virtual {v0, v6}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 930
    .line 931
    .line 932
    :cond_32
    iget-object v6, p1, La/iqg0;->p:La/jqg0;

    .line 933
    .line 934
    if-eqz v6, :cond_33

    .line 935
    .line 936
    invoke-virtual {v6, p0}, La/jqg0;->d(La/esg0;)F

    .line 937
    .line 938
    .line 939
    move-result v6

    .line 940
    goto :goto_d

    .line 941
    :cond_33
    move v6, v3

    .line 942
    :goto_d
    iget-object v8, p1, La/iqg0;->q:La/jqg0;

    .line 943
    .line 944
    if-eqz v8, :cond_34

    .line 945
    .line 946
    invoke-virtual {v8, p0}, La/jqg0;->e(La/esg0;)F

    .line 947
    .line 948
    .line 949
    move-result v8

    .line 950
    goto :goto_e

    .line 951
    :cond_34
    move v8, v3

    .line 952
    :goto_e
    iget-object v9, p1, La/iqg0;->r:La/jqg0;

    .line 953
    .line 954
    invoke-virtual {v9, p0}, La/jqg0;->d(La/esg0;)F

    .line 955
    .line 956
    .line 957
    move-result v9

    .line 958
    iget-object v10, p1, La/iqg0;->s:La/jqg0;

    .line 959
    .line 960
    invoke-virtual {v10, p0}, La/jqg0;->d(La/esg0;)F

    .line 961
    .line 962
    .line 963
    move-result v10

    .line 964
    iget-object v11, p0, La/esg0;->c:Ljava/lang/Object;

    .line 965
    .line 966
    check-cast v11, La/csg0;

    .line 967
    .line 968
    new-instance v12, La/gz40;

    .line 969
    .line 970
    invoke-direct {v12, v6, v8, v9, v10}, La/gz40;-><init>(FFFF)V

    .line 971
    .line 972
    .line 973
    iput-object v12, v11, La/csg0;->f:La/gz40;

    .line 974
    .line 975
    iget-object v6, v11, La/csg0;->a:La/xqg0;

    .line 976
    .line 977
    iget-object v6, v6, La/xqg0;->o:Ljava/lang/Boolean;

    .line 978
    .line 979
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 980
    .line 981
    .line 982
    move-result v6

    .line 983
    if-nez v6, :cond_35

    .line 984
    .line 985
    iget-object v6, p0, La/esg0;->c:Ljava/lang/Object;

    .line 986
    .line 987
    check-cast v6, La/csg0;

    .line 988
    .line 989
    iget-object v6, v6, La/csg0;->f:La/gz40;

    .line 990
    .line 991
    iget v8, v6, La/gz40;->b:F

    .line 992
    .line 993
    iget v9, v6, La/gz40;->c:F

    .line 994
    .line 995
    iget v10, v6, La/gz40;->d:F

    .line 996
    .line 997
    iget v6, v6, La/gz40;->e:F

    .line 998
    .line 999
    invoke-virtual {p0, v8, v9, v10, v6}, La/esg0;->z0(FFFF)V

    .line 1000
    .line 1001
    .line 1002
    :cond_35
    iget-object v6, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1003
    .line 1004
    check-cast v6, La/csg0;

    .line 1005
    .line 1006
    iget-object v6, v6, La/csg0;->f:La/gz40;

    .line 1007
    .line 1008
    iput-object v6, p1, La/crg0;->h:La/gz40;

    .line 1009
    .line 1010
    invoke-virtual {p0, p1}, La/esg0;->F0(La/crg0;)V

    .line 1011
    .line 1012
    .line 1013
    iget-object v6, p1, La/crg0;->h:La/gz40;

    .line 1014
    .line 1015
    invoke-virtual {p0, p1, v6}, La/esg0;->u(La/crg0;La/gz40;)V

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual {p0}, La/esg0;->q0()Z

    .line 1019
    .line 1020
    .line 1021
    move-result v6

    .line 1022
    invoke-virtual {p0}, La/esg0;->I0()V

    .line 1023
    .line 1024
    .line 1025
    invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I

    .line 1026
    .line 1027
    .line 1028
    iget-object v8, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1029
    .line 1030
    check-cast v8, La/csg0;

    .line 1031
    .line 1032
    iget-object v8, v8, La/csg0;->f:La/gz40;

    .line 1033
    .line 1034
    invoke-static {v8, v2, v7}, La/esg0;->t(La/gz40;La/gz40;La/bub0;)Landroid/graphics/Matrix;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v2

    .line 1038
    invoke-virtual {v0, v2}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 1039
    .line 1040
    .line 1041
    new-instance v2, Landroid/graphics/Paint;

    .line 1042
    .line 1043
    iget-object v7, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1044
    .line 1045
    check-cast v7, La/csg0;

    .line 1046
    .line 1047
    iget-object v7, v7, La/csg0;->a:La/xqg0;

    .line 1048
    .line 1049
    iget v7, v7, La/xqg0;->n1:I

    .line 1050
    .line 1051
    const/4 v8, 0x3

    .line 1052
    if-ne v7, v8, :cond_36

    .line 1053
    .line 1054
    goto :goto_f

    .line 1055
    :cond_36
    move v4, v5

    .line 1056
    :goto_f
    invoke-direct {v2, v4}, Landroid/graphics/Paint;-><init>(I)V

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v0, v1, v3, v3, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V

    .line 1063
    .line 1064
    .line 1065
    if-eqz v6, :cond_7f

    .line 1066
    .line 1067
    iget-object p1, p1, La/crg0;->h:La/gz40;

    .line 1068
    .line 1069
    invoke-virtual {p0, p1}, La/esg0;->p0(La/gz40;)V

    .line 1070
    .line 1071
    .line 1072
    goto/16 :goto_1d

    .line 1073
    .line 1074
    :cond_37
    instance-of v0, p1, La/pqg0;

    .line 1075
    .line 1076
    if-eqz v0, :cond_41

    .line 1077
    .line 1078
    check-cast p1, La/pqg0;

    .line 1079
    .line 1080
    iget-object v0, p1, La/pqg0;->o:La/tyc;

    .line 1081
    .line 1082
    if-nez v0, :cond_38

    .line 1083
    .line 1084
    goto/16 :goto_1d

    .line 1085
    .line 1086
    :cond_38
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1087
    .line 1088
    check-cast v0, La/csg0;

    .line 1089
    .line 1090
    invoke-virtual {p0, v0, p1}, La/esg0;->H0(La/csg0;La/drg0;)V

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {p0}, La/esg0;->A()Z

    .line 1094
    .line 1095
    .line 1096
    move-result v0

    .line 1097
    if-nez v0, :cond_39

    .line 1098
    .line 1099
    goto/16 :goto_1d

    .line 1100
    .line 1101
    :cond_39
    invoke-virtual {p0}, La/esg0;->J0()Z

    .line 1102
    .line 1103
    .line 1104
    move-result v0

    .line 1105
    if-nez v0, :cond_3a

    .line 1106
    .line 1107
    goto/16 :goto_1d

    .line 1108
    .line 1109
    :cond_3a
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1110
    .line 1111
    check-cast v0, La/csg0;

    .line 1112
    .line 1113
    iget-boolean v1, v0, La/csg0;->c:Z

    .line 1114
    .line 1115
    if-nez v1, :cond_3b

    .line 1116
    .line 1117
    iget-boolean v0, v0, La/csg0;->b:Z

    .line 1118
    .line 1119
    if-nez v0, :cond_3b

    .line 1120
    .line 1121
    goto/16 :goto_1d

    .line 1122
    .line 1123
    :cond_3b
    iget-object v0, p1, La/fqg0;->n:Landroid/graphics/Matrix;

    .line 1124
    .line 1125
    if-eqz v0, :cond_3c

    .line 1126
    .line 1127
    iget-object v1, p0, La/esg0;->a:Ljava/lang/Object;

    .line 1128
    .line 1129
    check-cast v1, Landroid/graphics/Canvas;

    .line 1130
    .line 1131
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 1132
    .line 1133
    .line 1134
    :cond_3c
    new-instance v0, La/yrg0;

    .line 1135
    .line 1136
    iget-object v1, p1, La/pqg0;->o:La/tyc;

    .line 1137
    .line 1138
    invoke-direct {v0, v1}, La/yrg0;-><init>(La/tyc;)V

    .line 1139
    .line 1140
    .line 1141
    iget-object v0, v0, La/yrg0;->a:Landroid/graphics/Path;

    .line 1142
    .line 1143
    iget-object v1, p1, La/crg0;->h:La/gz40;

    .line 1144
    .line 1145
    if-nez v1, :cond_3d

    .line 1146
    .line 1147
    invoke-static {v0}, La/esg0;->r(Landroid/graphics/Path;)La/gz40;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v1

    .line 1151
    iput-object v1, p1, La/crg0;->h:La/gz40;

    .line 1152
    .line 1153
    :cond_3d
    invoke-virtual {p0, p1}, La/esg0;->F0(La/crg0;)V

    .line 1154
    .line 1155
    .line 1156
    invoke-virtual {p0, p1}, La/esg0;->v(La/crg0;)V

    .line 1157
    .line 1158
    .line 1159
    iget-object v1, p1, La/crg0;->h:La/gz40;

    .line 1160
    .line 1161
    invoke-virtual {p0, p1, v1}, La/esg0;->u(La/crg0;La/gz40;)V

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {p0}, La/esg0;->q0()Z

    .line 1165
    .line 1166
    .line 1167
    move-result v1

    .line 1168
    iget-object v2, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1169
    .line 1170
    check-cast v2, La/csg0;

    .line 1171
    .line 1172
    iget-boolean v3, v2, La/csg0;->b:Z

    .line 1173
    .line 1174
    if-eqz v3, :cond_3f

    .line 1175
    .line 1176
    iget-object v2, v2, La/csg0;->a:La/xqg0;

    .line 1177
    .line 1178
    iget v2, v2, La/xqg0;->Z:I

    .line 1179
    .line 1180
    if-eqz v2, :cond_3e

    .line 1181
    .line 1182
    if-ne v2, v5, :cond_3e

    .line 1183
    .line 1184
    sget-object v2, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 1185
    .line 1186
    goto :goto_10

    .line 1187
    :cond_3e
    sget-object v2, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 1188
    .line 1189
    :goto_10
    invoke-virtual {v0, v2}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 1190
    .line 1191
    .line 1192
    invoke-virtual {p0, p1, v0}, La/esg0;->B(La/crg0;Landroid/graphics/Path;)V

    .line 1193
    .line 1194
    .line 1195
    :cond_3f
    iget-object v2, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1196
    .line 1197
    check-cast v2, La/csg0;

    .line 1198
    .line 1199
    iget-boolean v2, v2, La/csg0;->c:Z

    .line 1200
    .line 1201
    if-eqz v2, :cond_40

    .line 1202
    .line 1203
    invoke-virtual {p0, v0}, La/esg0;->C(Landroid/graphics/Path;)V

    .line 1204
    .line 1205
    .line 1206
    :cond_40
    invoke-virtual {p0, p1}, La/esg0;->v0(La/fqg0;)V

    .line 1207
    .line 1208
    .line 1209
    if-eqz v1, :cond_7f

    .line 1210
    .line 1211
    iget-object p1, p1, La/crg0;->h:La/gz40;

    .line 1212
    .line 1213
    invoke-virtual {p0, p1}, La/esg0;->p0(La/gz40;)V

    .line 1214
    .line 1215
    .line 1216
    goto/16 :goto_1d

    .line 1217
    .line 1218
    :cond_41
    instance-of v0, p1, La/uqg0;

    .line 1219
    .line 1220
    if-eqz v0, :cond_48

    .line 1221
    .line 1222
    check-cast p1, La/uqg0;

    .line 1223
    .line 1224
    iget-object v0, p1, La/uqg0;->q:La/jqg0;

    .line 1225
    .line 1226
    if-eqz v0, :cond_7f

    .line 1227
    .line 1228
    iget-object v1, p1, La/uqg0;->r:La/jqg0;

    .line 1229
    .line 1230
    if-eqz v1, :cond_7f

    .line 1231
    .line 1232
    invoke-virtual {v0}, La/jqg0;->g()Z

    .line 1233
    .line 1234
    .line 1235
    move-result v0

    .line 1236
    if-nez v0, :cond_7f

    .line 1237
    .line 1238
    iget-object v0, p1, La/uqg0;->r:La/jqg0;

    .line 1239
    .line 1240
    invoke-virtual {v0}, La/jqg0;->g()Z

    .line 1241
    .line 1242
    .line 1243
    move-result v0

    .line 1244
    if-eqz v0, :cond_42

    .line 1245
    .line 1246
    goto/16 :goto_1d

    .line 1247
    .line 1248
    :cond_42
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1249
    .line 1250
    check-cast v0, La/csg0;

    .line 1251
    .line 1252
    invoke-virtual {p0, v0, p1}, La/esg0;->H0(La/csg0;La/drg0;)V

    .line 1253
    .line 1254
    .line 1255
    invoke-virtual {p0}, La/esg0;->A()Z

    .line 1256
    .line 1257
    .line 1258
    move-result v0

    .line 1259
    if-nez v0, :cond_43

    .line 1260
    .line 1261
    goto/16 :goto_1d

    .line 1262
    .line 1263
    :cond_43
    invoke-virtual {p0}, La/esg0;->J0()Z

    .line 1264
    .line 1265
    .line 1266
    move-result v0

    .line 1267
    if-nez v0, :cond_44

    .line 1268
    .line 1269
    goto/16 :goto_1d

    .line 1270
    .line 1271
    :cond_44
    iget-object v0, p1, La/fqg0;->n:Landroid/graphics/Matrix;

    .line 1272
    .line 1273
    if-eqz v0, :cond_45

    .line 1274
    .line 1275
    iget-object v1, p0, La/esg0;->a:Ljava/lang/Object;

    .line 1276
    .line 1277
    check-cast v1, Landroid/graphics/Canvas;

    .line 1278
    .line 1279
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 1280
    .line 1281
    .line 1282
    :cond_45
    invoke-virtual {p0, p1}, La/esg0;->k0(La/uqg0;)Landroid/graphics/Path;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v0

    .line 1286
    invoke-virtual {p0, p1}, La/esg0;->F0(La/crg0;)V

    .line 1287
    .line 1288
    .line 1289
    invoke-virtual {p0, p1}, La/esg0;->v(La/crg0;)V

    .line 1290
    .line 1291
    .line 1292
    iget-object v1, p1, La/crg0;->h:La/gz40;

    .line 1293
    .line 1294
    invoke-virtual {p0, p1, v1}, La/esg0;->u(La/crg0;La/gz40;)V

    .line 1295
    .line 1296
    .line 1297
    invoke-virtual {p0}, La/esg0;->q0()Z

    .line 1298
    .line 1299
    .line 1300
    move-result v1

    .line 1301
    iget-object v2, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1302
    .line 1303
    check-cast v2, La/csg0;

    .line 1304
    .line 1305
    iget-boolean v2, v2, La/csg0;->b:Z

    .line 1306
    .line 1307
    if-eqz v2, :cond_46

    .line 1308
    .line 1309
    invoke-virtual {p0, p1, v0}, La/esg0;->B(La/crg0;Landroid/graphics/Path;)V

    .line 1310
    .line 1311
    .line 1312
    :cond_46
    iget-object v2, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1313
    .line 1314
    check-cast v2, La/csg0;

    .line 1315
    .line 1316
    iget-boolean v2, v2, La/csg0;->c:Z

    .line 1317
    .line 1318
    if-eqz v2, :cond_47

    .line 1319
    .line 1320
    invoke-virtual {p0, v0}, La/esg0;->C(Landroid/graphics/Path;)V

    .line 1321
    .line 1322
    .line 1323
    :cond_47
    if-eqz v1, :cond_7f

    .line 1324
    .line 1325
    iget-object p1, p1, La/crg0;->h:La/gz40;

    .line 1326
    .line 1327
    invoke-virtual {p0, p1}, La/esg0;->p0(La/gz40;)V

    .line 1328
    .line 1329
    .line 1330
    goto/16 :goto_1d

    .line 1331
    .line 1332
    :cond_48
    instance-of v0, p1, La/ypg0;

    .line 1333
    .line 1334
    if-eqz v0, :cond_4f

    .line 1335
    .line 1336
    check-cast p1, La/ypg0;

    .line 1337
    .line 1338
    iget-object v0, p1, La/ypg0;->q:La/jqg0;

    .line 1339
    .line 1340
    if-eqz v0, :cond_7f

    .line 1341
    .line 1342
    invoke-virtual {v0}, La/jqg0;->g()Z

    .line 1343
    .line 1344
    .line 1345
    move-result v0

    .line 1346
    if-eqz v0, :cond_49

    .line 1347
    .line 1348
    goto/16 :goto_1d

    .line 1349
    .line 1350
    :cond_49
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1351
    .line 1352
    check-cast v0, La/csg0;

    .line 1353
    .line 1354
    invoke-virtual {p0, v0, p1}, La/esg0;->H0(La/csg0;La/drg0;)V

    .line 1355
    .line 1356
    .line 1357
    invoke-virtual {p0}, La/esg0;->A()Z

    .line 1358
    .line 1359
    .line 1360
    move-result v0

    .line 1361
    if-nez v0, :cond_4a

    .line 1362
    .line 1363
    goto/16 :goto_1d

    .line 1364
    .line 1365
    :cond_4a
    invoke-virtual {p0}, La/esg0;->J0()Z

    .line 1366
    .line 1367
    .line 1368
    move-result v0

    .line 1369
    if-nez v0, :cond_4b

    .line 1370
    .line 1371
    goto/16 :goto_1d

    .line 1372
    .line 1373
    :cond_4b
    iget-object v0, p1, La/fqg0;->n:Landroid/graphics/Matrix;

    .line 1374
    .line 1375
    if-eqz v0, :cond_4c

    .line 1376
    .line 1377
    iget-object v1, p0, La/esg0;->a:Ljava/lang/Object;

    .line 1378
    .line 1379
    check-cast v1, Landroid/graphics/Canvas;

    .line 1380
    .line 1381
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 1382
    .line 1383
    .line 1384
    :cond_4c
    invoke-virtual {p0, p1}, La/esg0;->h0(La/ypg0;)Landroid/graphics/Path;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v0

    .line 1388
    invoke-virtual {p0, p1}, La/esg0;->F0(La/crg0;)V

    .line 1389
    .line 1390
    .line 1391
    invoke-virtual {p0, p1}, La/esg0;->v(La/crg0;)V

    .line 1392
    .line 1393
    .line 1394
    iget-object v1, p1, La/crg0;->h:La/gz40;

    .line 1395
    .line 1396
    invoke-virtual {p0, p1, v1}, La/esg0;->u(La/crg0;La/gz40;)V

    .line 1397
    .line 1398
    .line 1399
    invoke-virtual {p0}, La/esg0;->q0()Z

    .line 1400
    .line 1401
    .line 1402
    move-result v1

    .line 1403
    iget-object v2, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1404
    .line 1405
    check-cast v2, La/csg0;

    .line 1406
    .line 1407
    iget-boolean v2, v2, La/csg0;->b:Z

    .line 1408
    .line 1409
    if-eqz v2, :cond_4d

    .line 1410
    .line 1411
    invoke-virtual {p0, p1, v0}, La/esg0;->B(La/crg0;Landroid/graphics/Path;)V

    .line 1412
    .line 1413
    .line 1414
    :cond_4d
    iget-object v2, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1415
    .line 1416
    check-cast v2, La/csg0;

    .line 1417
    .line 1418
    iget-boolean v2, v2, La/csg0;->c:Z

    .line 1419
    .line 1420
    if-eqz v2, :cond_4e

    .line 1421
    .line 1422
    invoke-virtual {p0, v0}, La/esg0;->C(Landroid/graphics/Path;)V

    .line 1423
    .line 1424
    .line 1425
    :cond_4e
    if-eqz v1, :cond_7f

    .line 1426
    .line 1427
    iget-object p1, p1, La/crg0;->h:La/gz40;

    .line 1428
    .line 1429
    invoke-virtual {p0, p1}, La/esg0;->p0(La/gz40;)V

    .line 1430
    .line 1431
    .line 1432
    goto/16 :goto_1d

    .line 1433
    .line 1434
    :cond_4f
    instance-of v0, p1, La/dqg0;

    .line 1435
    .line 1436
    if-eqz v0, :cond_56

    .line 1437
    .line 1438
    check-cast p1, La/dqg0;

    .line 1439
    .line 1440
    iget-object v0, p1, La/dqg0;->q:La/jqg0;

    .line 1441
    .line 1442
    if-eqz v0, :cond_7f

    .line 1443
    .line 1444
    iget-object v1, p1, La/dqg0;->r:La/jqg0;

    .line 1445
    .line 1446
    if-eqz v1, :cond_7f

    .line 1447
    .line 1448
    invoke-virtual {v0}, La/jqg0;->g()Z

    .line 1449
    .line 1450
    .line 1451
    move-result v0

    .line 1452
    if-nez v0, :cond_7f

    .line 1453
    .line 1454
    iget-object v0, p1, La/dqg0;->r:La/jqg0;

    .line 1455
    .line 1456
    invoke-virtual {v0}, La/jqg0;->g()Z

    .line 1457
    .line 1458
    .line 1459
    move-result v0

    .line 1460
    if-eqz v0, :cond_50

    .line 1461
    .line 1462
    goto/16 :goto_1d

    .line 1463
    .line 1464
    :cond_50
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1465
    .line 1466
    check-cast v0, La/csg0;

    .line 1467
    .line 1468
    invoke-virtual {p0, v0, p1}, La/esg0;->H0(La/csg0;La/drg0;)V

    .line 1469
    .line 1470
    .line 1471
    invoke-virtual {p0}, La/esg0;->A()Z

    .line 1472
    .line 1473
    .line 1474
    move-result v0

    .line 1475
    if-nez v0, :cond_51

    .line 1476
    .line 1477
    goto/16 :goto_1d

    .line 1478
    .line 1479
    :cond_51
    invoke-virtual {p0}, La/esg0;->J0()Z

    .line 1480
    .line 1481
    .line 1482
    move-result v0

    .line 1483
    if-nez v0, :cond_52

    .line 1484
    .line 1485
    goto/16 :goto_1d

    .line 1486
    .line 1487
    :cond_52
    iget-object v0, p1, La/fqg0;->n:Landroid/graphics/Matrix;

    .line 1488
    .line 1489
    if-eqz v0, :cond_53

    .line 1490
    .line 1491
    iget-object v1, p0, La/esg0;->a:Ljava/lang/Object;

    .line 1492
    .line 1493
    check-cast v1, Landroid/graphics/Canvas;

    .line 1494
    .line 1495
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 1496
    .line 1497
    .line 1498
    :cond_53
    invoke-virtual {p0, p1}, La/esg0;->i0(La/dqg0;)Landroid/graphics/Path;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v0

    .line 1502
    invoke-virtual {p0, p1}, La/esg0;->F0(La/crg0;)V

    .line 1503
    .line 1504
    .line 1505
    invoke-virtual {p0, p1}, La/esg0;->v(La/crg0;)V

    .line 1506
    .line 1507
    .line 1508
    iget-object v1, p1, La/crg0;->h:La/gz40;

    .line 1509
    .line 1510
    invoke-virtual {p0, p1, v1}, La/esg0;->u(La/crg0;La/gz40;)V

    .line 1511
    .line 1512
    .line 1513
    invoke-virtual {p0}, La/esg0;->q0()Z

    .line 1514
    .line 1515
    .line 1516
    move-result v1

    .line 1517
    iget-object v2, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1518
    .line 1519
    check-cast v2, La/csg0;

    .line 1520
    .line 1521
    iget-boolean v2, v2, La/csg0;->b:Z

    .line 1522
    .line 1523
    if-eqz v2, :cond_54

    .line 1524
    .line 1525
    invoke-virtual {p0, p1, v0}, La/esg0;->B(La/crg0;Landroid/graphics/Path;)V

    .line 1526
    .line 1527
    .line 1528
    :cond_54
    iget-object v2, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1529
    .line 1530
    check-cast v2, La/csg0;

    .line 1531
    .line 1532
    iget-boolean v2, v2, La/csg0;->c:Z

    .line 1533
    .line 1534
    if-eqz v2, :cond_55

    .line 1535
    .line 1536
    invoke-virtual {p0, v0}, La/esg0;->C(Landroid/graphics/Path;)V

    .line 1537
    .line 1538
    .line 1539
    :cond_55
    if-eqz v1, :cond_7f

    .line 1540
    .line 1541
    iget-object p1, p1, La/crg0;->h:La/gz40;

    .line 1542
    .line 1543
    invoke-virtual {p0, p1}, La/esg0;->p0(La/gz40;)V

    .line 1544
    .line 1545
    .line 1546
    goto/16 :goto_1d

    .line 1547
    .line 1548
    :cond_56
    instance-of v0, p1, La/kqg0;

    .line 1549
    .line 1550
    if-eqz v0, :cond_60

    .line 1551
    .line 1552
    check-cast p1, La/kqg0;

    .line 1553
    .line 1554
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1555
    .line 1556
    check-cast v0, La/csg0;

    .line 1557
    .line 1558
    invoke-virtual {p0, v0, p1}, La/esg0;->H0(La/csg0;La/drg0;)V

    .line 1559
    .line 1560
    .line 1561
    invoke-virtual {p0}, La/esg0;->A()Z

    .line 1562
    .line 1563
    .line 1564
    move-result v0

    .line 1565
    if-nez v0, :cond_57

    .line 1566
    .line 1567
    goto/16 :goto_1d

    .line 1568
    .line 1569
    :cond_57
    invoke-virtual {p0}, La/esg0;->J0()Z

    .line 1570
    .line 1571
    .line 1572
    move-result v0

    .line 1573
    if-nez v0, :cond_58

    .line 1574
    .line 1575
    goto/16 :goto_1d

    .line 1576
    .line 1577
    :cond_58
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1578
    .line 1579
    check-cast v0, La/csg0;

    .line 1580
    .line 1581
    iget-boolean v0, v0, La/csg0;->c:Z

    .line 1582
    .line 1583
    if-nez v0, :cond_59

    .line 1584
    .line 1585
    goto/16 :goto_1d

    .line 1586
    .line 1587
    :cond_59
    iget-object v0, p1, La/fqg0;->n:Landroid/graphics/Matrix;

    .line 1588
    .line 1589
    if-eqz v0, :cond_5a

    .line 1590
    .line 1591
    iget-object v1, p0, La/esg0;->a:Ljava/lang/Object;

    .line 1592
    .line 1593
    check-cast v1, Landroid/graphics/Canvas;

    .line 1594
    .line 1595
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 1596
    .line 1597
    .line 1598
    :cond_5a
    iget-object v0, p1, La/kqg0;->o:La/jqg0;

    .line 1599
    .line 1600
    if-nez v0, :cond_5b

    .line 1601
    .line 1602
    move v0, v3

    .line 1603
    goto :goto_11

    .line 1604
    :cond_5b
    invoke-virtual {v0, p0}, La/jqg0;->d(La/esg0;)F

    .line 1605
    .line 1606
    .line 1607
    move-result v0

    .line 1608
    :goto_11
    iget-object v1, p1, La/kqg0;->p:La/jqg0;

    .line 1609
    .line 1610
    if-nez v1, :cond_5c

    .line 1611
    .line 1612
    move v1, v3

    .line 1613
    goto :goto_12

    .line 1614
    :cond_5c
    invoke-virtual {v1, p0}, La/jqg0;->e(La/esg0;)F

    .line 1615
    .line 1616
    .line 1617
    move-result v1

    .line 1618
    :goto_12
    iget-object v2, p1, La/kqg0;->q:La/jqg0;

    .line 1619
    .line 1620
    if-nez v2, :cond_5d

    .line 1621
    .line 1622
    move v2, v3

    .line 1623
    goto :goto_13

    .line 1624
    :cond_5d
    invoke-virtual {v2, p0}, La/jqg0;->d(La/esg0;)F

    .line 1625
    .line 1626
    .line 1627
    move-result v2

    .line 1628
    :goto_13
    iget-object v4, p1, La/kqg0;->r:La/jqg0;

    .line 1629
    .line 1630
    if-nez v4, :cond_5e

    .line 1631
    .line 1632
    goto :goto_14

    .line 1633
    :cond_5e
    invoke-virtual {v4, p0}, La/jqg0;->e(La/esg0;)F

    .line 1634
    .line 1635
    .line 1636
    move-result v3

    .line 1637
    :goto_14
    iget-object v4, p1, La/crg0;->h:La/gz40;

    .line 1638
    .line 1639
    if-nez v4, :cond_5f

    .line 1640
    .line 1641
    new-instance v4, La/gz40;

    .line 1642
    .line 1643
    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    .line 1644
    .line 1645
    .line 1646
    move-result v5

    .line 1647
    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    .line 1648
    .line 1649
    .line 1650
    move-result v6

    .line 1651
    sub-float v7, v2, v0

    .line 1652
    .line 1653
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 1654
    .line 1655
    .line 1656
    move-result v7

    .line 1657
    sub-float v8, v3, v1

    .line 1658
    .line 1659
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 1660
    .line 1661
    .line 1662
    move-result v8

    .line 1663
    invoke-direct {v4, v5, v6, v7, v8}, La/gz40;-><init>(FFFF)V

    .line 1664
    .line 1665
    .line 1666
    iput-object v4, p1, La/crg0;->h:La/gz40;

    .line 1667
    .line 1668
    :cond_5f
    new-instance v4, Landroid/graphics/Path;

    .line 1669
    .line 1670
    invoke-direct {v4}, Landroid/graphics/Path;-><init>()V

    .line 1671
    .line 1672
    .line 1673
    invoke-virtual {v4, v0, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 1674
    .line 1675
    .line 1676
    invoke-virtual {v4, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1677
    .line 1678
    .line 1679
    invoke-virtual {p0, p1}, La/esg0;->F0(La/crg0;)V

    .line 1680
    .line 1681
    .line 1682
    invoke-virtual {p0, p1}, La/esg0;->v(La/crg0;)V

    .line 1683
    .line 1684
    .line 1685
    iget-object v0, p1, La/crg0;->h:La/gz40;

    .line 1686
    .line 1687
    invoke-virtual {p0, p1, v0}, La/esg0;->u(La/crg0;La/gz40;)V

    .line 1688
    .line 1689
    .line 1690
    invoke-virtual {p0}, La/esg0;->q0()Z

    .line 1691
    .line 1692
    .line 1693
    move-result v0

    .line 1694
    invoke-virtual {p0, v4}, La/esg0;->C(Landroid/graphics/Path;)V

    .line 1695
    .line 1696
    .line 1697
    invoke-virtual {p0, p1}, La/esg0;->v0(La/fqg0;)V

    .line 1698
    .line 1699
    .line 1700
    if-eqz v0, :cond_7f

    .line 1701
    .line 1702
    iget-object p1, p1, La/crg0;->h:La/gz40;

    .line 1703
    .line 1704
    invoke-virtual {p0, p1}, La/esg0;->p0(La/gz40;)V

    .line 1705
    .line 1706
    .line 1707
    goto/16 :goto_1d

    .line 1708
    .line 1709
    :cond_60
    instance-of v0, p1, La/tqg0;

    .line 1710
    .line 1711
    if-eqz v0, :cond_68

    .line 1712
    .line 1713
    check-cast p1, La/tqg0;

    .line 1714
    .line 1715
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1716
    .line 1717
    check-cast v0, La/csg0;

    .line 1718
    .line 1719
    invoke-virtual {p0, v0, p1}, La/esg0;->H0(La/csg0;La/drg0;)V

    .line 1720
    .line 1721
    .line 1722
    invoke-virtual {p0}, La/esg0;->A()Z

    .line 1723
    .line 1724
    .line 1725
    move-result v0

    .line 1726
    if-nez v0, :cond_61

    .line 1727
    .line 1728
    goto/16 :goto_1d

    .line 1729
    .line 1730
    :cond_61
    invoke-virtual {p0}, La/esg0;->J0()Z

    .line 1731
    .line 1732
    .line 1733
    move-result v0

    .line 1734
    if-nez v0, :cond_62

    .line 1735
    .line 1736
    goto/16 :goto_1d

    .line 1737
    .line 1738
    :cond_62
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1739
    .line 1740
    check-cast v0, La/csg0;

    .line 1741
    .line 1742
    iget-boolean v1, v0, La/csg0;->c:Z

    .line 1743
    .line 1744
    if-nez v1, :cond_63

    .line 1745
    .line 1746
    iget-boolean v0, v0, La/csg0;->b:Z

    .line 1747
    .line 1748
    if-nez v0, :cond_63

    .line 1749
    .line 1750
    goto/16 :goto_1d

    .line 1751
    .line 1752
    :cond_63
    iget-object v0, p1, La/fqg0;->n:Landroid/graphics/Matrix;

    .line 1753
    .line 1754
    if-eqz v0, :cond_64

    .line 1755
    .line 1756
    iget-object v1, p0, La/esg0;->a:Ljava/lang/Object;

    .line 1757
    .line 1758
    check-cast v1, Landroid/graphics/Canvas;

    .line 1759
    .line 1760
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 1761
    .line 1762
    .line 1763
    :cond_64
    iget-object v0, p1, La/sqg0;->o:[F

    .line 1764
    .line 1765
    array-length v0, v0

    .line 1766
    if-ge v0, v5, :cond_65

    .line 1767
    .line 1768
    goto/16 :goto_1d

    .line 1769
    .line 1770
    :cond_65
    invoke-static {p1}, La/esg0;->j0(La/sqg0;)Landroid/graphics/Path;

    .line 1771
    .line 1772
    .line 1773
    move-result-object v0

    .line 1774
    invoke-virtual {p0, p1}, La/esg0;->F0(La/crg0;)V

    .line 1775
    .line 1776
    .line 1777
    invoke-virtual {p0, p1}, La/esg0;->v(La/crg0;)V

    .line 1778
    .line 1779
    .line 1780
    iget-object v1, p1, La/crg0;->h:La/gz40;

    .line 1781
    .line 1782
    invoke-virtual {p0, p1, v1}, La/esg0;->u(La/crg0;La/gz40;)V

    .line 1783
    .line 1784
    .line 1785
    invoke-virtual {p0}, La/esg0;->q0()Z

    .line 1786
    .line 1787
    .line 1788
    move-result v1

    .line 1789
    iget-object v2, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1790
    .line 1791
    check-cast v2, La/csg0;

    .line 1792
    .line 1793
    iget-boolean v2, v2, La/csg0;->b:Z

    .line 1794
    .line 1795
    if-eqz v2, :cond_66

    .line 1796
    .line 1797
    invoke-virtual {p0, p1, v0}, La/esg0;->B(La/crg0;Landroid/graphics/Path;)V

    .line 1798
    .line 1799
    .line 1800
    :cond_66
    iget-object v2, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1801
    .line 1802
    check-cast v2, La/csg0;

    .line 1803
    .line 1804
    iget-boolean v2, v2, La/csg0;->c:Z

    .line 1805
    .line 1806
    if-eqz v2, :cond_67

    .line 1807
    .line 1808
    invoke-virtual {p0, v0}, La/esg0;->C(Landroid/graphics/Path;)V

    .line 1809
    .line 1810
    .line 1811
    :cond_67
    invoke-virtual {p0, p1}, La/esg0;->v0(La/fqg0;)V

    .line 1812
    .line 1813
    .line 1814
    if-eqz v1, :cond_7f

    .line 1815
    .line 1816
    iget-object p1, p1, La/crg0;->h:La/gz40;

    .line 1817
    .line 1818
    invoke-virtual {p0, p1}, La/esg0;->p0(La/gz40;)V

    .line 1819
    .line 1820
    .line 1821
    goto/16 :goto_1d

    .line 1822
    .line 1823
    :cond_68
    instance-of v0, p1, La/sqg0;

    .line 1824
    .line 1825
    if-eqz v0, :cond_71

    .line 1826
    .line 1827
    check-cast p1, La/sqg0;

    .line 1828
    .line 1829
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1830
    .line 1831
    check-cast v0, La/csg0;

    .line 1832
    .line 1833
    invoke-virtual {p0, v0, p1}, La/esg0;->H0(La/csg0;La/drg0;)V

    .line 1834
    .line 1835
    .line 1836
    invoke-virtual {p0}, La/esg0;->A()Z

    .line 1837
    .line 1838
    .line 1839
    move-result v0

    .line 1840
    if-nez v0, :cond_69

    .line 1841
    .line 1842
    goto/16 :goto_1d

    .line 1843
    .line 1844
    :cond_69
    invoke-virtual {p0}, La/esg0;->J0()Z

    .line 1845
    .line 1846
    .line 1847
    move-result v0

    .line 1848
    if-nez v0, :cond_6a

    .line 1849
    .line 1850
    goto/16 :goto_1d

    .line 1851
    .line 1852
    :cond_6a
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1853
    .line 1854
    check-cast v0, La/csg0;

    .line 1855
    .line 1856
    iget-boolean v1, v0, La/csg0;->c:Z

    .line 1857
    .line 1858
    if-nez v1, :cond_6b

    .line 1859
    .line 1860
    iget-boolean v0, v0, La/csg0;->b:Z

    .line 1861
    .line 1862
    if-nez v0, :cond_6b

    .line 1863
    .line 1864
    goto/16 :goto_1d

    .line 1865
    .line 1866
    :cond_6b
    iget-object v0, p1, La/fqg0;->n:Landroid/graphics/Matrix;

    .line 1867
    .line 1868
    if-eqz v0, :cond_6c

    .line 1869
    .line 1870
    iget-object v1, p0, La/esg0;->a:Ljava/lang/Object;

    .line 1871
    .line 1872
    check-cast v1, Landroid/graphics/Canvas;

    .line 1873
    .line 1874
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 1875
    .line 1876
    .line 1877
    :cond_6c
    iget-object v0, p1, La/sqg0;->o:[F

    .line 1878
    .line 1879
    array-length v0, v0

    .line 1880
    if-ge v0, v5, :cond_6d

    .line 1881
    .line 1882
    goto/16 :goto_1d

    .line 1883
    .line 1884
    :cond_6d
    invoke-static {p1}, La/esg0;->j0(La/sqg0;)Landroid/graphics/Path;

    .line 1885
    .line 1886
    .line 1887
    move-result-object v0

    .line 1888
    invoke-virtual {p0, p1}, La/esg0;->F0(La/crg0;)V

    .line 1889
    .line 1890
    .line 1891
    iget-object v1, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1892
    .line 1893
    check-cast v1, La/csg0;

    .line 1894
    .line 1895
    iget-object v1, v1, La/csg0;->a:La/xqg0;

    .line 1896
    .line 1897
    iget v1, v1, La/xqg0;->Z:I

    .line 1898
    .line 1899
    if-eqz v1, :cond_6e

    .line 1900
    .line 1901
    if-ne v1, v5, :cond_6e

    .line 1902
    .line 1903
    sget-object v1, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 1904
    .line 1905
    goto :goto_15

    .line 1906
    :cond_6e
    sget-object v1, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    .line 1907
    .line 1908
    :goto_15
    invoke-virtual {v0, v1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 1909
    .line 1910
    .line 1911
    invoke-virtual {p0, p1}, La/esg0;->v(La/crg0;)V

    .line 1912
    .line 1913
    .line 1914
    iget-object v1, p1, La/crg0;->h:La/gz40;

    .line 1915
    .line 1916
    invoke-virtual {p0, p1, v1}, La/esg0;->u(La/crg0;La/gz40;)V

    .line 1917
    .line 1918
    .line 1919
    invoke-virtual {p0}, La/esg0;->q0()Z

    .line 1920
    .line 1921
    .line 1922
    move-result v1

    .line 1923
    iget-object v2, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1924
    .line 1925
    check-cast v2, La/csg0;

    .line 1926
    .line 1927
    iget-boolean v2, v2, La/csg0;->b:Z

    .line 1928
    .line 1929
    if-eqz v2, :cond_6f

    .line 1930
    .line 1931
    invoke-virtual {p0, p1, v0}, La/esg0;->B(La/crg0;Landroid/graphics/Path;)V

    .line 1932
    .line 1933
    .line 1934
    :cond_6f
    iget-object v2, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1935
    .line 1936
    check-cast v2, La/csg0;

    .line 1937
    .line 1938
    iget-boolean v2, v2, La/csg0;->c:Z

    .line 1939
    .line 1940
    if-eqz v2, :cond_70

    .line 1941
    .line 1942
    invoke-virtual {p0, v0}, La/esg0;->C(Landroid/graphics/Path;)V

    .line 1943
    .line 1944
    .line 1945
    :cond_70
    invoke-virtual {p0, p1}, La/esg0;->v0(La/fqg0;)V

    .line 1946
    .line 1947
    .line 1948
    if-eqz v1, :cond_7f

    .line 1949
    .line 1950
    iget-object p1, p1, La/crg0;->h:La/gz40;

    .line 1951
    .line 1952
    invoke-virtual {p0, p1}, La/esg0;->p0(La/gz40;)V

    .line 1953
    .line 1954
    .line 1955
    goto/16 :goto_1d

    .line 1956
    .line 1957
    :cond_71
    instance-of v0, p1, La/org0;

    .line 1958
    .line 1959
    if-eqz v0, :cond_7f

    .line 1960
    .line 1961
    check-cast p1, La/org0;

    .line 1962
    .line 1963
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 1964
    .line 1965
    check-cast v0, La/csg0;

    .line 1966
    .line 1967
    invoke-virtual {p0, v0, p1}, La/esg0;->H0(La/csg0;La/drg0;)V

    .line 1968
    .line 1969
    .line 1970
    invoke-virtual {p0}, La/esg0;->A()Z

    .line 1971
    .line 1972
    .line 1973
    move-result v0

    .line 1974
    if-nez v0, :cond_72

    .line 1975
    .line 1976
    goto/16 :goto_1d

    .line 1977
    .line 1978
    :cond_72
    iget-object v0, p1, La/org0;->r:Landroid/graphics/Matrix;

    .line 1979
    .line 1980
    if-eqz v0, :cond_73

    .line 1981
    .line 1982
    iget-object v1, p0, La/esg0;->a:Ljava/lang/Object;

    .line 1983
    .line 1984
    check-cast v1, Landroid/graphics/Canvas;

    .line 1985
    .line 1986
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 1987
    .line 1988
    .line 1989
    :cond_73
    iget-object v0, p1, La/srg0;->n:Ljava/util/ArrayList;

    .line 1990
    .line 1991
    if-eqz v0, :cond_75

    .line 1992
    .line 1993
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1994
    .line 1995
    .line 1996
    move-result v0

    .line 1997
    if-nez v0, :cond_74

    .line 1998
    .line 1999
    goto :goto_16

    .line 2000
    :cond_74
    iget-object v0, p1, La/srg0;->n:Ljava/util/ArrayList;

    .line 2001
    .line 2002
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2003
    .line 2004
    .line 2005
    move-result-object v0

    .line 2006
    check-cast v0, La/jqg0;

    .line 2007
    .line 2008
    invoke-virtual {v0, p0}, La/jqg0;->d(La/esg0;)F

    .line 2009
    .line 2010
    .line 2011
    move-result v0

    .line 2012
    goto :goto_17

    .line 2013
    :cond_75
    :goto_16
    move v0, v3

    .line 2014
    :goto_17
    iget-object v1, p1, La/srg0;->o:Ljava/util/ArrayList;

    .line 2015
    .line 2016
    if-eqz v1, :cond_77

    .line 2017
    .line 2018
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 2019
    .line 2020
    .line 2021
    move-result v1

    .line 2022
    if-nez v1, :cond_76

    .line 2023
    .line 2024
    goto :goto_18

    .line 2025
    :cond_76
    iget-object v1, p1, La/srg0;->o:Ljava/util/ArrayList;

    .line 2026
    .line 2027
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2028
    .line 2029
    .line 2030
    move-result-object v1

    .line 2031
    check-cast v1, La/jqg0;

    .line 2032
    .line 2033
    invoke-virtual {v1, p0}, La/jqg0;->e(La/esg0;)F

    .line 2034
    .line 2035
    .line 2036
    move-result v1

    .line 2037
    goto :goto_19

    .line 2038
    :cond_77
    :goto_18
    move v1, v3

    .line 2039
    :goto_19
    iget-object v6, p1, La/srg0;->p:Ljava/util/ArrayList;

    .line 2040
    .line 2041
    if-eqz v6, :cond_79

    .line 2042
    .line 2043
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 2044
    .line 2045
    .line 2046
    move-result v6

    .line 2047
    if-nez v6, :cond_78

    .line 2048
    .line 2049
    goto :goto_1a

    .line 2050
    :cond_78
    iget-object v6, p1, La/srg0;->p:Ljava/util/ArrayList;

    .line 2051
    .line 2052
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2053
    .line 2054
    .line 2055
    move-result-object v6

    .line 2056
    check-cast v6, La/jqg0;

    .line 2057
    .line 2058
    invoke-virtual {v6, p0}, La/jqg0;->d(La/esg0;)F

    .line 2059
    .line 2060
    .line 2061
    move-result v6

    .line 2062
    goto :goto_1b

    .line 2063
    :cond_79
    :goto_1a
    move v6, v3

    .line 2064
    :goto_1b
    iget-object v7, p1, La/srg0;->q:Ljava/util/ArrayList;

    .line 2065
    .line 2066
    if-eqz v7, :cond_7b

    .line 2067
    .line 2068
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 2069
    .line 2070
    .line 2071
    move-result v7

    .line 2072
    if-nez v7, :cond_7a

    .line 2073
    .line 2074
    goto :goto_1c

    .line 2075
    :cond_7a
    iget-object v3, p1, La/srg0;->q:Ljava/util/ArrayList;

    .line 2076
    .line 2077
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2078
    .line 2079
    .line 2080
    move-result-object v3

    .line 2081
    check-cast v3, La/jqg0;

    .line 2082
    .line 2083
    invoke-virtual {v3, p0}, La/jqg0;->e(La/esg0;)F

    .line 2084
    .line 2085
    .line 2086
    move-result v3

    .line 2087
    :cond_7b
    :goto_1c
    invoke-virtual {p0}, La/esg0;->P()I

    .line 2088
    .line 2089
    .line 2090
    move-result v4

    .line 2091
    if-eq v4, v2, :cond_7d

    .line 2092
    .line 2093
    invoke-virtual {p0, p1}, La/esg0;->s(La/qrg0;)F

    .line 2094
    .line 2095
    .line 2096
    move-result v2

    .line 2097
    if-ne v4, v5, :cond_7c

    .line 2098
    .line 2099
    const/high16 v4, 0x40000000    # 2.0f

    .line 2100
    .line 2101
    div-float/2addr v2, v4

    .line 2102
    :cond_7c
    sub-float/2addr v0, v2

    .line 2103
    :cond_7d
    iget-object v2, p1, La/crg0;->h:La/gz40;

    .line 2104
    .line 2105
    if-nez v2, :cond_7e

    .line 2106
    .line 2107
    new-instance v2, La/bsg0;

    .line 2108
    .line 2109
    invoke-direct {v2, p0, v0, v1}, La/bsg0;-><init>(La/esg0;FF)V

    .line 2110
    .line 2111
    .line 2112
    invoke-virtual {p0, p1, v2}, La/esg0;->D(La/qrg0;La/x2x;)V

    .line 2113
    .line 2114
    .line 2115
    new-instance v4, La/gz40;

    .line 2116
    .line 2117
    iget-object v5, v2, La/bsg0;->f:Ljava/lang/Object;

    .line 2118
    .line 2119
    check-cast v5, Landroid/graphics/RectF;

    .line 2120
    .line 2121
    iget v7, v5, Landroid/graphics/RectF;->left:F

    .line 2122
    .line 2123
    iget v8, v5, Landroid/graphics/RectF;->top:F

    .line 2124
    .line 2125
    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    .line 2126
    .line 2127
    .line 2128
    move-result v5

    .line 2129
    iget-object v2, v2, La/bsg0;->f:Ljava/lang/Object;

    .line 2130
    .line 2131
    check-cast v2, Landroid/graphics/RectF;

    .line 2132
    .line 2133
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 2134
    .line 2135
    .line 2136
    move-result v2

    .line 2137
    invoke-direct {v4, v7, v8, v5, v2}, La/gz40;-><init>(FFFF)V

    .line 2138
    .line 2139
    .line 2140
    iput-object v4, p1, La/crg0;->h:La/gz40;

    .line 2141
    .line 2142
    :cond_7e
    invoke-virtual {p0, p1}, La/esg0;->F0(La/crg0;)V

    .line 2143
    .line 2144
    .line 2145
    invoke-virtual {p0, p1}, La/esg0;->v(La/crg0;)V

    .line 2146
    .line 2147
    .line 2148
    iget-object v2, p1, La/crg0;->h:La/gz40;

    .line 2149
    .line 2150
    invoke-virtual {p0, p1, v2}, La/esg0;->u(La/crg0;La/gz40;)V

    .line 2151
    .line 2152
    .line 2153
    invoke-virtual {p0}, La/esg0;->q0()Z

    .line 2154
    .line 2155
    .line 2156
    move-result v2

    .line 2157
    new-instance v4, La/asg0;

    .line 2158
    .line 2159
    add-float/2addr v0, v6

    .line 2160
    add-float/2addr v1, v3

    .line 2161
    invoke-direct {v4, p0, v0, v1}, La/asg0;-><init>(La/esg0;FF)V

    .line 2162
    .line 2163
    .line 2164
    invoke-virtual {p0, p1, v4}, La/esg0;->D(La/qrg0;La/x2x;)V

    .line 2165
    .line 2166
    .line 2167
    if-eqz v2, :cond_7f

    .line 2168
    .line 2169
    iget-object p1, p1, La/crg0;->h:La/gz40;

    .line 2170
    .line 2171
    invoke-virtual {p0, p1}, La/esg0;->p0(La/gz40;)V

    .line 2172
    .line 2173
    .line 2174
    :cond_7f
    :goto_1d
    invoke-virtual {p0}, La/esg0;->C0()V

    .line 2175
    .line 2176
    .line 2177
    return-void
.end method

.method public t0(La/brg0;Z)V
    .locals 2

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, La/esg0;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/Stack;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/esg0;->f:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ljava/util/Stack;

    .line 13
    .line 14
    iget-object v1, p0, La/esg0;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Landroid/graphics/Canvas;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/graphics/Canvas;->getMatrix()Landroid/graphics/Matrix;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-interface {p1}, La/brg0;->getChildren()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, La/frg0;

    .line 44
    .line 45
    invoke-virtual {p0, v0}, La/esg0;->s0(La/frg0;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    if-eqz p2, :cond_2

    .line 50
    .line 51
    iget-object p1, p0, La/esg0;->e:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, Ljava/util/Stack;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    iget-object p0, p0, La/esg0;->f:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p0, Ljava/util/Stack;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    :cond_2
    return-void
.end method

.method public u(La/crg0;La/gz40;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/csg0;

    .line 4
    .line 5
    iget-object v0, v0, La/csg0;->a:La/xqg0;

    .line 6
    .line 7
    iget-object v0, v0, La/xqg0;->x:Ljava/lang/String;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0, p1, p2}, La/esg0;->q(La/crg0;La/gz40;)Landroid/graphics/Path;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    iget-object p0, p0, La/esg0;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Landroid/graphics/Canvas;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 23
    .line 24
    .line 25
    :cond_1
    :goto_0
    return-void
.end method

.method public u0(La/lqg0;La/xrg0;)V
    .locals 12

    .line 1
    iget-object v0, p0, La/esg0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Canvas;

    .line 4
    .line 5
    invoke-virtual {p0}, La/esg0;->D0()V

    .line 6
    .line 7
    .line 8
    iget-object v1, p1, La/lqg0;->u:Ljava/lang/Float;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    iget v1, p2, La/xrg0;->c:F

    .line 24
    .line 25
    cmpl-float v3, v1, v2

    .line 26
    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    iget v3, p2, La/xrg0;->d:F

    .line 30
    .line 31
    cmpl-float v3, v3, v2

    .line 32
    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    :cond_0
    iget v3, p2, La/xrg0;->d:F

    .line 36
    .line 37
    float-to-double v3, v3

    .line 38
    float-to-double v5, v1

    .line 39
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->atan2(DD)D

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    invoke-static {v3, v4}, Ljava/lang/Math;->toDegrees(D)D

    .line 44
    .line 45
    .line 46
    move-result-wide v3

    .line 47
    double-to-float v1, v3

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget-object v1, p1, La/lqg0;->u:Ljava/lang/Float;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    move v1, v2

    .line 57
    :goto_0
    iget-boolean v3, p1, La/lqg0;->p:Z

    .line 58
    .line 59
    if-eqz v3, :cond_3

    .line 60
    .line 61
    const/high16 v3, 0x3f800000    # 1.0f

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    iget-object v3, p0, La/esg0;->c:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v3, La/csg0;

    .line 67
    .line 68
    iget-object v3, v3, La/csg0;->a:La/xqg0;

    .line 69
    .line 70
    iget-object v3, v3, La/xqg0;->f:La/jqg0;

    .line 71
    .line 72
    invoke-virtual {v3}, La/jqg0;->a()F

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    :goto_1
    invoke-virtual {p0, p1}, La/esg0;->M(La/frg0;)La/csg0;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    iput-object v4, p0, La/esg0;->c:Ljava/lang/Object;

    .line 81
    .line 82
    new-instance v4, Landroid/graphics/Matrix;

    .line 83
    .line 84
    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    .line 85
    .line 86
    .line 87
    iget v5, p2, La/xrg0;->a:F

    .line 88
    .line 89
    iget p2, p2, La/xrg0;->b:F

    .line 90
    .line 91
    invoke-virtual {v4, v5, p2}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v1}, Landroid/graphics/Matrix;->preRotate(F)Z

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4, v3, v3}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 98
    .line 99
    .line 100
    iget-object p2, p1, La/lqg0;->q:La/jqg0;

    .line 101
    .line 102
    if-eqz p2, :cond_4

    .line 103
    .line 104
    invoke-virtual {p2, p0}, La/jqg0;->d(La/esg0;)F

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    goto :goto_2

    .line 109
    :cond_4
    move p2, v2

    .line 110
    :goto_2
    iget-object v1, p1, La/lqg0;->r:La/jqg0;

    .line 111
    .line 112
    if-eqz v1, :cond_5

    .line 113
    .line 114
    invoke-virtual {v1, p0}, La/jqg0;->e(La/esg0;)F

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    goto :goto_3

    .line 119
    :cond_5
    move v1, v2

    .line 120
    :goto_3
    iget-object v3, p1, La/lqg0;->s:La/jqg0;

    .line 121
    .line 122
    const/high16 v5, 0x40400000    # 3.0f

    .line 123
    .line 124
    if-eqz v3, :cond_6

    .line 125
    .line 126
    invoke-virtual {v3, p0}, La/jqg0;->d(La/esg0;)F

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    goto :goto_4

    .line 131
    :cond_6
    move v3, v5

    .line 132
    :goto_4
    iget-object v6, p1, La/lqg0;->t:La/jqg0;

    .line 133
    .line 134
    if-eqz v6, :cond_7

    .line 135
    .line 136
    invoke-virtual {v6, p0}, La/jqg0;->e(La/esg0;)F

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    :cond_7
    iget-object v6, p1, La/jrg0;->o:La/gz40;

    .line 141
    .line 142
    if-eqz v6, :cond_e

    .line 143
    .line 144
    iget v7, v6, La/gz40;->d:F

    .line 145
    .line 146
    div-float v7, v3, v7

    .line 147
    .line 148
    iget v6, v6, La/gz40;->e:F

    .line 149
    .line 150
    div-float v6, v5, v6

    .line 151
    .line 152
    iget-object v8, p1, La/hrg0;->n:La/bub0;

    .line 153
    .line 154
    if-eqz v8, :cond_8

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_8
    sget-object v8, La/bub0;->d:La/bub0;

    .line 158
    .line 159
    :goto_5
    sget-object v9, La/bub0;->c:La/bub0;

    .line 160
    .line 161
    invoke-virtual {v8, v9}, La/bub0;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v9

    .line 165
    iget-object v10, v8, La/bub0;->a:La/aub0;

    .line 166
    .line 167
    const/4 v11, 0x2

    .line 168
    if-nez v9, :cond_a

    .line 169
    .line 170
    iget v8, v8, La/bub0;->b:I

    .line 171
    .line 172
    if-ne v8, v11, :cond_9

    .line 173
    .line 174
    invoke-static {v7, v6}, Ljava/lang/Math;->max(FF)F

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    :goto_6
    move v7, v6

    .line 179
    goto :goto_7

    .line 180
    :cond_9
    invoke-static {v7, v6}, Ljava/lang/Math;->min(FF)F

    .line 181
    .line 182
    .line 183
    move-result v6

    .line 184
    goto :goto_6

    .line 185
    :goto_7
    move v6, v7

    .line 186
    :cond_a
    neg-float p2, p2

    .line 187
    mul-float/2addr p2, v7

    .line 188
    neg-float v1, v1

    .line 189
    mul-float/2addr v1, v6

    .line 190
    invoke-virtual {v4, p2, v1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0, v4}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 194
    .line 195
    .line 196
    iget-object p2, p1, La/jrg0;->o:La/gz40;

    .line 197
    .line 198
    iget v1, p2, La/gz40;->d:F

    .line 199
    .line 200
    mul-float/2addr v1, v7

    .line 201
    iget p2, p2, La/gz40;->e:F

    .line 202
    .line 203
    mul-float/2addr p2, v6

    .line 204
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 205
    .line 206
    .line 207
    move-result v8

    .line 208
    const/high16 v9, 0x40000000    # 2.0f

    .line 209
    .line 210
    if-eq v8, v11, :cond_c

    .line 211
    .line 212
    const/4 v11, 0x3

    .line 213
    if-eq v8, v11, :cond_b

    .line 214
    .line 215
    const/4 v11, 0x5

    .line 216
    if-eq v8, v11, :cond_c

    .line 217
    .line 218
    const/4 v11, 0x6

    .line 219
    if-eq v8, v11, :cond_b

    .line 220
    .line 221
    const/16 v11, 0x8

    .line 222
    .line 223
    if-eq v8, v11, :cond_c

    .line 224
    .line 225
    const/16 v11, 0x9

    .line 226
    .line 227
    if-eq v8, v11, :cond_b

    .line 228
    .line 229
    move v1, v2

    .line 230
    goto :goto_9

    .line 231
    :cond_b
    sub-float v1, v3, v1

    .line 232
    .line 233
    :goto_8
    sub-float v1, v2, v1

    .line 234
    .line 235
    goto :goto_9

    .line 236
    :cond_c
    sub-float v1, v3, v1

    .line 237
    .line 238
    div-float/2addr v1, v9

    .line 239
    goto :goto_8

    .line 240
    :goto_9
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 241
    .line 242
    .line 243
    move-result v8

    .line 244
    packed-switch v8, :pswitch_data_0

    .line 245
    .line 246
    .line 247
    goto :goto_b

    .line 248
    :pswitch_0
    sub-float p2, v5, p2

    .line 249
    .line 250
    :goto_a
    sub-float/2addr v2, p2

    .line 251
    goto :goto_b

    .line 252
    :pswitch_1
    sub-float p2, v5, p2

    .line 253
    .line 254
    div-float/2addr p2, v9

    .line 255
    goto :goto_a

    .line 256
    :goto_b
    iget-object p2, p0, La/esg0;->c:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast p2, La/csg0;

    .line 259
    .line 260
    iget-object p2, p2, La/csg0;->a:La/xqg0;

    .line 261
    .line 262
    iget-object p2, p2, La/xqg0;->o:Ljava/lang/Boolean;

    .line 263
    .line 264
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 265
    .line 266
    .line 267
    move-result p2

    .line 268
    if-nez p2, :cond_d

    .line 269
    .line 270
    invoke-virtual {p0, v1, v2, v3, v5}, La/esg0;->z0(FFFF)V

    .line 271
    .line 272
    .line 273
    :cond_d
    invoke-virtual {v4}, Landroid/graphics/Matrix;->reset()V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v4, v7, v6}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0, v4}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 280
    .line 281
    .line 282
    goto :goto_c

    .line 283
    :cond_e
    neg-float p2, p2

    .line 284
    neg-float v1, v1

    .line 285
    invoke-virtual {v4, p2, v1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 286
    .line 287
    .line 288
    invoke-virtual {v0, v4}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 289
    .line 290
    .line 291
    iget-object p2, p0, La/esg0;->c:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast p2, La/csg0;

    .line 294
    .line 295
    iget-object p2, p2, La/csg0;->a:La/xqg0;

    .line 296
    .line 297
    iget-object p2, p2, La/xqg0;->o:Ljava/lang/Boolean;

    .line 298
    .line 299
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 300
    .line 301
    .line 302
    move-result p2

    .line 303
    if-nez p2, :cond_f

    .line 304
    .line 305
    invoke-virtual {p0, v2, v2, v3, v5}, La/esg0;->z0(FFFF)V

    .line 306
    .line 307
    .line 308
    :cond_f
    :goto_c
    invoke-virtual {p0}, La/esg0;->q0()Z

    .line 309
    .line 310
    .line 311
    move-result p2

    .line 312
    const/4 v0, 0x0

    .line 313
    invoke-virtual {p0, p1, v0}, La/esg0;->t0(La/brg0;Z)V

    .line 314
    .line 315
    .line 316
    if-eqz p2, :cond_10

    .line 317
    .line 318
    iget-object p1, p1, La/crg0;->h:La/gz40;

    .line 319
    .line 320
    invoke-virtual {p0, p1}, La/esg0;->p0(La/gz40;)V

    .line 321
    .line 322
    .line 323
    :cond_10
    invoke-virtual {p0}, La/esg0;->C0()V

    .line 324
    .line 325
    .line 326
    return-void

    .line 327
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public v(La/crg0;)V
    .locals 3

    .line 1
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/csg0;

    .line 4
    .line 5
    iget-object v0, v0, La/csg0;->a:La/xqg0;

    .line 6
    .line 7
    iget-object v0, v0, La/xqg0;->b:La/grg0;

    .line 8
    .line 9
    instance-of v1, v0, La/oqg0;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-object v1, p1, La/crg0;->h:La/gz40;

    .line 14
    .line 15
    check-cast v0, La/oqg0;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {p0, v2, v1, v0}, La/esg0;->z(ZLa/gz40;La/oqg0;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, La/csg0;

    .line 24
    .line 25
    iget-object v0, v0, La/csg0;->a:La/xqg0;

    .line 26
    .line 27
    iget-object v0, v0, La/xqg0;->d:La/grg0;

    .line 28
    .line 29
    instance-of v1, v0, La/oqg0;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    iget-object p1, p1, La/crg0;->h:La/gz40;

    .line 34
    .line 35
    check-cast v0, La/oqg0;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-virtual {p0, v1, p1, v0}, La/esg0;->z(ZLa/gz40;La/oqg0;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public v0(La/fqg0;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, La/esg0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/csg0;

    .line 8
    .line 9
    iget-object v2, v2, La/csg0;->a:La/xqg0;

    .line 10
    .line 11
    iget-object v3, v2, La/xqg0;->q:Ljava/lang/String;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    iget-object v4, v2, La/xqg0;->r:Ljava/lang/String;

    .line 16
    .line 17
    if-nez v4, :cond_0

    .line 18
    .line 19
    iget-object v2, v2, La/xqg0;->s:Ljava/lang/String;

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    goto/16 :goto_c

    .line 24
    .line 25
    :cond_0
    const-string v2, "Marker reference \'%s\' not found"

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    iget-object v5, v1, La/frg0;->a:La/cyu;

    .line 31
    .line 32
    invoke-virtual {v5, v3}, La/cyu;->L(Ljava/lang/String;)La/drg0;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    check-cast v3, La/lqg0;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object v3, v0, La/esg0;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, La/csg0;

    .line 44
    .line 45
    iget-object v3, v3, La/csg0;->a:La/xqg0;

    .line 46
    .line 47
    iget-object v3, v3, La/xqg0;->q:Ljava/lang/String;

    .line 48
    .line 49
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-static {v2, v3}, La/esg0;->E(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    move-object v3, v4

    .line 57
    :goto_0
    iget-object v5, v0, La/esg0;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v5, La/csg0;

    .line 60
    .line 61
    iget-object v5, v5, La/csg0;->a:La/xqg0;

    .line 62
    .line 63
    iget-object v5, v5, La/xqg0;->r:Ljava/lang/String;

    .line 64
    .line 65
    if-eqz v5, :cond_4

    .line 66
    .line 67
    iget-object v6, v1, La/frg0;->a:La/cyu;

    .line 68
    .line 69
    invoke-virtual {v6, v5}, La/cyu;->L(Ljava/lang/String;)La/drg0;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    if-eqz v5, :cond_3

    .line 74
    .line 75
    check-cast v5, La/lqg0;

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    iget-object v5, v0, La/esg0;->c:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v5, La/csg0;

    .line 81
    .line 82
    iget-object v5, v5, La/csg0;->a:La/xqg0;

    .line 83
    .line 84
    iget-object v5, v5, La/xqg0;->r:Ljava/lang/String;

    .line 85
    .line 86
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-static {v2, v5}, La/esg0;->E(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    move-object v5, v4

    .line 94
    :goto_1
    iget-object v6, v0, La/esg0;->c:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v6, La/csg0;

    .line 97
    .line 98
    iget-object v6, v6, La/csg0;->a:La/xqg0;

    .line 99
    .line 100
    iget-object v6, v6, La/xqg0;->s:Ljava/lang/String;

    .line 101
    .line 102
    if-eqz v6, :cond_6

    .line 103
    .line 104
    iget-object v7, v1, La/frg0;->a:La/cyu;

    .line 105
    .line 106
    invoke-virtual {v7, v6}, La/cyu;->L(Ljava/lang/String;)La/drg0;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    if-eqz v6, :cond_5

    .line 111
    .line 112
    check-cast v6, La/lqg0;

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_5
    iget-object v6, v0, La/esg0;->c:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v6, La/csg0;

    .line 118
    .line 119
    iget-object v6, v6, La/csg0;->a:La/xqg0;

    .line 120
    .line 121
    iget-object v6, v6, La/xqg0;->s:Ljava/lang/String;

    .line 122
    .line 123
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    invoke-static {v2, v6}, La/esg0;->E(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    :cond_6
    move-object v6, v4

    .line 131
    :goto_2
    instance-of v2, v1, La/pqg0;

    .line 132
    .line 133
    const/4 v7, 0x0

    .line 134
    const/4 v8, 0x2

    .line 135
    const/4 v9, 0x0

    .line 136
    if-eqz v2, :cond_7

    .line 137
    .line 138
    new-instance v2, La/wrg0;

    .line 139
    .line 140
    check-cast v1, La/pqg0;

    .line 141
    .line 142
    iget-object v1, v1, La/pqg0;->o:La/tyc;

    .line 143
    .line 144
    invoke-direct {v2, v0, v1}, La/wrg0;-><init>(La/esg0;La/tyc;)V

    .line 145
    .line 146
    .line 147
    iget-object v1, v2, La/wrg0;->a:Ljava/util/ArrayList;

    .line 148
    .line 149
    move/from16 v17, v9

    .line 150
    .line 151
    const/16 v16, 0x1

    .line 152
    .line 153
    goto/16 :goto_9

    .line 154
    .line 155
    :cond_7
    instance-of v2, v1, La/kqg0;

    .line 156
    .line 157
    if-eqz v2, :cond_c

    .line 158
    .line 159
    check-cast v1, La/kqg0;

    .line 160
    .line 161
    iget-object v2, v1, La/kqg0;->o:La/jqg0;

    .line 162
    .line 163
    if-eqz v2, :cond_8

    .line 164
    .line 165
    invoke-virtual {v2, v0}, La/jqg0;->d(La/esg0;)F

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    goto :goto_3

    .line 170
    :cond_8
    move v2, v9

    .line 171
    :goto_3
    iget-object v11, v1, La/kqg0;->p:La/jqg0;

    .line 172
    .line 173
    if-eqz v11, :cond_9

    .line 174
    .line 175
    invoke-virtual {v11, v0}, La/jqg0;->e(La/esg0;)F

    .line 176
    .line 177
    .line 178
    move-result v11

    .line 179
    goto :goto_4

    .line 180
    :cond_9
    move v11, v9

    .line 181
    :goto_4
    iget-object v12, v1, La/kqg0;->q:La/jqg0;

    .line 182
    .line 183
    if-eqz v12, :cond_a

    .line 184
    .line 185
    invoke-virtual {v12, v0}, La/jqg0;->d(La/esg0;)F

    .line 186
    .line 187
    .line 188
    move-result v12

    .line 189
    goto :goto_5

    .line 190
    :cond_a
    move v12, v9

    .line 191
    :goto_5
    iget-object v1, v1, La/kqg0;->r:La/jqg0;

    .line 192
    .line 193
    if-eqz v1, :cond_b

    .line 194
    .line 195
    invoke-virtual {v1, v0}, La/jqg0;->e(La/esg0;)F

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    goto :goto_6

    .line 200
    :cond_b
    move v1, v9

    .line 201
    :goto_6
    new-instance v13, Ljava/util/ArrayList;

    .line 202
    .line 203
    invoke-direct {v13, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 204
    .line 205
    .line 206
    new-instance v14, La/xrg0;

    .line 207
    .line 208
    sub-float v15, v12, v2

    .line 209
    .line 210
    const/16 v16, 0x1

    .line 211
    .line 212
    sub-float v10, v1, v11

    .line 213
    .line 214
    invoke-direct {v14, v2, v11, v15, v10}, La/xrg0;-><init>(FFFF)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    new-instance v2, La/xrg0;

    .line 221
    .line 222
    invoke-direct {v2, v12, v1, v15, v10}, La/xrg0;-><init>(FFFF)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move/from16 v17, v9

    .line 229
    .line 230
    move-object v1, v13

    .line 231
    goto/16 :goto_9

    .line 232
    .line 233
    :cond_c
    const/16 v16, 0x1

    .line 234
    .line 235
    check-cast v1, La/sqg0;

    .line 236
    .line 237
    iget-object v2, v1, La/sqg0;->o:[F

    .line 238
    .line 239
    array-length v2, v2

    .line 240
    if-ge v2, v8, :cond_d

    .line 241
    .line 242
    move-object v1, v4

    .line 243
    move/from16 v17, v9

    .line 244
    .line 245
    goto/16 :goto_9

    .line 246
    .line 247
    :cond_d
    new-instance v10, Ljava/util/ArrayList;

    .line 248
    .line 249
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 250
    .line 251
    .line 252
    new-instance v11, La/xrg0;

    .line 253
    .line 254
    iget-object v12, v1, La/sqg0;->o:[F

    .line 255
    .line 256
    aget v13, v12, v7

    .line 257
    .line 258
    aget v12, v12, v16

    .line 259
    .line 260
    invoke-direct {v11, v13, v12, v9, v9}, La/xrg0;-><init>(FFFF)V

    .line 261
    .line 262
    .line 263
    move v12, v8

    .line 264
    move v13, v9

    .line 265
    move v14, v13

    .line 266
    :goto_7
    iget v15, v11, La/xrg0;->b:F

    .line 267
    .line 268
    move/from16 v17, v9

    .line 269
    .line 270
    iget v9, v11, La/xrg0;->a:F

    .line 271
    .line 272
    if-ge v12, v2, :cond_e

    .line 273
    .line 274
    iget-object v13, v1, La/sqg0;->o:[F

    .line 275
    .line 276
    aget v14, v13, v12

    .line 277
    .line 278
    add-int/lit8 v18, v12, 0x1

    .line 279
    .line 280
    aget v13, v13, v18

    .line 281
    .line 282
    invoke-virtual {v11, v14, v13}, La/xrg0;->a(FF)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    new-instance v11, La/xrg0;

    .line 289
    .line 290
    sub-float v9, v14, v9

    .line 291
    .line 292
    sub-float v15, v13, v15

    .line 293
    .line 294
    invoke-direct {v11, v14, v13, v9, v15}, La/xrg0;-><init>(FFFF)V

    .line 295
    .line 296
    .line 297
    add-int/lit8 v12, v12, 0x2

    .line 298
    .line 299
    move v9, v14

    .line 300
    move v14, v13

    .line 301
    move v13, v9

    .line 302
    move/from16 v9, v17

    .line 303
    .line 304
    goto :goto_7

    .line 305
    :cond_e
    instance-of v2, v1, La/tqg0;

    .line 306
    .line 307
    if-eqz v2, :cond_10

    .line 308
    .line 309
    iget-object v1, v1, La/sqg0;->o:[F

    .line 310
    .line 311
    aget v2, v1, v7

    .line 312
    .line 313
    cmpl-float v12, v13, v2

    .line 314
    .line 315
    if-eqz v12, :cond_f

    .line 316
    .line 317
    aget v1, v1, v16

    .line 318
    .line 319
    cmpl-float v12, v14, v1

    .line 320
    .line 321
    if-eqz v12, :cond_f

    .line 322
    .line 323
    invoke-virtual {v11, v2, v1}, La/xrg0;->a(FF)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    new-instance v11, La/xrg0;

    .line 330
    .line 331
    sub-float v9, v2, v9

    .line 332
    .line 333
    sub-float v12, v1, v15

    .line 334
    .line 335
    invoke-direct {v11, v2, v1, v9, v12}, La/xrg0;-><init>(FFFF)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    check-cast v1, La/xrg0;

    .line 343
    .line 344
    invoke-virtual {v11, v1}, La/xrg0;->b(La/xrg0;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    invoke-virtual {v10, v7, v11}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    :cond_f
    :goto_8
    move-object v1, v10

    .line 354
    goto :goto_9

    .line 355
    :cond_10
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    goto :goto_8

    .line 359
    :goto_9
    if-nez v1, :cond_11

    .line 360
    .line 361
    goto/16 :goto_c

    .line 362
    .line 363
    :cond_11
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 364
    .line 365
    .line 366
    move-result v2

    .line 367
    if-nez v2, :cond_12

    .line 368
    .line 369
    goto/16 :goto_c

    .line 370
    .line 371
    :cond_12
    iget-object v9, v0, La/esg0;->c:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v9, La/csg0;

    .line 374
    .line 375
    iget-object v9, v9, La/csg0;->a:La/xqg0;

    .line 376
    .line 377
    iput-object v4, v9, La/xqg0;->s:Ljava/lang/String;

    .line 378
    .line 379
    iput-object v4, v9, La/xqg0;->r:Ljava/lang/String;

    .line 380
    .line 381
    iput-object v4, v9, La/xqg0;->q:Ljava/lang/String;

    .line 382
    .line 383
    if-eqz v3, :cond_13

    .line 384
    .line 385
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v4

    .line 389
    check-cast v4, La/xrg0;

    .line 390
    .line 391
    invoke-virtual {v0, v3, v4}, La/esg0;->u0(La/lqg0;La/xrg0;)V

    .line 392
    .line 393
    .line 394
    :cond_13
    if-eqz v5, :cond_18

    .line 395
    .line 396
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 397
    .line 398
    .line 399
    move-result v3

    .line 400
    if-le v3, v8, :cond_18

    .line 401
    .line 402
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v3

    .line 406
    check-cast v3, La/xrg0;

    .line 407
    .line 408
    move/from16 v4, v16

    .line 409
    .line 410
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v7

    .line 414
    check-cast v7, La/xrg0;

    .line 415
    .line 416
    move-object v4, v3

    .line 417
    move-object v3, v7

    .line 418
    const/4 v7, 0x1

    .line 419
    :goto_a
    add-int/lit8 v8, v2, -0x1

    .line 420
    .line 421
    if-ge v7, v8, :cond_18

    .line 422
    .line 423
    add-int/lit8 v7, v7, 0x1

    .line 424
    .line 425
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v8

    .line 429
    check-cast v8, La/xrg0;

    .line 430
    .line 431
    iget-boolean v9, v3, La/xrg0;->e:Z

    .line 432
    .line 433
    if-eqz v9, :cond_17

    .line 434
    .line 435
    iget v9, v3, La/xrg0;->c:F

    .line 436
    .line 437
    iget v10, v3, La/xrg0;->d:F

    .line 438
    .line 439
    iget v11, v3, La/xrg0;->a:F

    .line 440
    .line 441
    iget v12, v4, La/xrg0;->a:F

    .line 442
    .line 443
    sub-float v12, v11, v12

    .line 444
    .line 445
    iget v13, v3, La/xrg0;->b:F

    .line 446
    .line 447
    iget v4, v4, La/xrg0;->b:F

    .line 448
    .line 449
    sub-float v4, v13, v4

    .line 450
    .line 451
    mul-float/2addr v12, v9

    .line 452
    mul-float/2addr v4, v10

    .line 453
    add-float/2addr v4, v12

    .line 454
    cmpl-float v12, v4, v17

    .line 455
    .line 456
    if-nez v12, :cond_14

    .line 457
    .line 458
    iget v4, v8, La/xrg0;->a:F

    .line 459
    .line 460
    sub-float/2addr v4, v11

    .line 461
    iget v11, v8, La/xrg0;->b:F

    .line 462
    .line 463
    sub-float/2addr v11, v13

    .line 464
    mul-float/2addr v4, v9

    .line 465
    mul-float/2addr v11, v10

    .line 466
    add-float/2addr v4, v11

    .line 467
    :cond_14
    cmpl-float v4, v4, v17

    .line 468
    .line 469
    if-lez v4, :cond_15

    .line 470
    .line 471
    goto :goto_b

    .line 472
    :cond_15
    if-nez v4, :cond_16

    .line 473
    .line 474
    cmpl-float v4, v9, v17

    .line 475
    .line 476
    if-gtz v4, :cond_17

    .line 477
    .line 478
    cmpl-float v4, v10, v17

    .line 479
    .line 480
    if-ltz v4, :cond_16

    .line 481
    .line 482
    goto :goto_b

    .line 483
    :cond_16
    neg-float v4, v9

    .line 484
    iput v4, v3, La/xrg0;->c:F

    .line 485
    .line 486
    neg-float v4, v10

    .line 487
    iput v4, v3, La/xrg0;->d:F

    .line 488
    .line 489
    :cond_17
    :goto_b
    invoke-virtual {v0, v5, v3}, La/esg0;->u0(La/lqg0;La/xrg0;)V

    .line 490
    .line 491
    .line 492
    move-object v4, v3

    .line 493
    move-object v3, v8

    .line 494
    goto :goto_a

    .line 495
    :cond_18
    if-eqz v6, :cond_19

    .line 496
    .line 497
    const/16 v16, 0x1

    .line 498
    .line 499
    add-int/lit8 v2, v2, -0x1

    .line 500
    .line 501
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    check-cast v1, La/xrg0;

    .line 506
    .line 507
    invoke-virtual {v0, v6, v1}, La/esg0;->u0(La/lqg0;La/xrg0;)V

    .line 508
    .line 509
    .line 510
    :cond_19
    :goto_c
    return-void
.end method

.method public w0(La/mqg0;La/gz40;)V
    .locals 5

    .line 1
    iget-object v0, p0, La/esg0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Canvas;

    .line 4
    .line 5
    iget-object v1, p1, La/mqg0;->n:Ljava/lang/Boolean;

    .line 6
    .line 7
    const/high16 v2, 0x3f800000    # 1.0f

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    iget-object v1, p1, La/mqg0;->p:La/jqg0;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1, p0}, La/jqg0;->d(La/esg0;)F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget v1, p2, La/gz40;->d:F

    .line 27
    .line 28
    :goto_0
    iget-object v3, p1, La/mqg0;->q:La/jqg0;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {v3, p0}, La/jqg0;->e(La/esg0;)F

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    goto :goto_2

    .line 37
    :cond_1
    iget v3, p2, La/gz40;->e:F

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    iget-object v1, p1, La/mqg0;->p:La/jqg0;

    .line 41
    .line 42
    const v3, 0x3f99999a    # 1.2f

    .line 43
    .line 44
    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    invoke-virtual {v1, p0, v2}, La/jqg0;->c(La/esg0;F)F

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    goto :goto_1

    .line 52
    :cond_3
    move v1, v3

    .line 53
    :goto_1
    iget-object v4, p1, La/mqg0;->q:La/jqg0;

    .line 54
    .line 55
    if-eqz v4, :cond_4

    .line 56
    .line 57
    invoke-virtual {v4, p0, v2}, La/jqg0;->c(La/esg0;F)F

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    :cond_4
    iget v4, p2, La/gz40;->d:F

    .line 62
    .line 63
    mul-float/2addr v1, v4

    .line 64
    iget v4, p2, La/gz40;->e:F

    .line 65
    .line 66
    mul-float/2addr v3, v4

    .line 67
    :goto_2
    const/4 v4, 0x0

    .line 68
    cmpl-float v1, v1, v4

    .line 69
    .line 70
    if-eqz v1, :cond_9

    .line 71
    .line 72
    cmpl-float v1, v3, v4

    .line 73
    .line 74
    if-nez v1, :cond_5

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :cond_5
    invoke-virtual {p0}, La/esg0;->D0()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, p1}, La/esg0;->M(La/frg0;)La/csg0;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    iput-object v1, p0, La/esg0;->c:Ljava/lang/Object;

    .line 85
    .line 86
    iget-object v1, v1, La/csg0;->a:La/xqg0;

    .line 87
    .line 88
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    iput-object v2, v1, La/xqg0;->j:Ljava/lang/Float;

    .line 93
    .line 94
    invoke-virtual {p0}, La/esg0;->q0()Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I

    .line 99
    .line 100
    .line 101
    iget-object v2, p1, La/mqg0;->o:Ljava/lang/Boolean;

    .line 102
    .line 103
    if-eqz v2, :cond_7

    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_6

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_6
    iget v2, p2, La/gz40;->b:F

    .line 113
    .line 114
    iget v3, p2, La/gz40;->c:F

    .line 115
    .line 116
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 117
    .line 118
    .line 119
    iget v2, p2, La/gz40;->d:F

    .line 120
    .line 121
    iget v3, p2, La/gz40;->e:F

    .line 122
    .line 123
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Canvas;->scale(FF)V

    .line 124
    .line 125
    .line 126
    :cond_7
    :goto_3
    const/4 v2, 0x0

    .line 127
    invoke-virtual {p0, p1, v2}, La/esg0;->t0(La/brg0;Z)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V

    .line 131
    .line 132
    .line 133
    if-eqz v1, :cond_8

    .line 134
    .line 135
    invoke-virtual {p0, p2}, La/esg0;->p0(La/gz40;)V

    .line 136
    .line 137
    .line 138
    :cond_8
    invoke-virtual {p0}, La/esg0;->C0()V

    .line 139
    .line 140
    .line 141
    :cond_9
    :goto_4
    return-void
.end method

.method public x0(La/n55;)V
    .locals 4

    .line 1
    invoke-static {}, La/ofm0;->m()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/esg0;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/dzb0;

    .line 7
    .line 8
    if-eqz p0, :cond_3

    .line 9
    .line 10
    iget v0, p0, La/dzb0;->a:I

    .line 11
    .line 12
    iget v1, p1, La/n55;->a:I

    .line 13
    .line 14
    if-ne v0, v1, :cond_3

    .line 15
    .line 16
    iget-object p1, p1, La/n55;->b:La/ozw;

    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v2, "onCaptureFailure: request ID = "

    .line 21
    .line 22
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "ProcessingRequest"

    .line 33
    .line 34
    invoke-static {v1, v0, p1}, La/l8x;->F0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, La/dzb0;->g:La/snf0;

    .line 38
    .line 39
    iget-object v0, p0, La/snf0;->a:La/o55;

    .line 40
    .line 41
    invoke-static {}, La/ofm0;->m()V

    .line 42
    .line 43
    .line 44
    iget-boolean v1, p0, La/snf0;->g:Z

    .line 45
    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    invoke-static {}, La/ofm0;->m()V

    .line 50
    .line 51
    .line 52
    iget v1, v0, La/o55;->a:I

    .line 53
    .line 54
    if-lez v1, :cond_1

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    sub-int/2addr v1, v2

    .line 58
    iput v1, v0, La/o55;->a:I

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    const/4 v2, 0x0

    .line 62
    :goto_0
    if-nez v2, :cond_2

    .line 63
    .line 64
    invoke-static {}, La/ofm0;->m()V

    .line 65
    .line 66
    .line 67
    iget-object v1, v0, La/o55;->c:Ljava/util/concurrent/Executor;

    .line 68
    .line 69
    new-instance v3, La/apj0;

    .line 70
    .line 71
    invoke-direct {v3, v0, p1}, La/apj0;-><init>(La/o55;La/ozw;)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    invoke-virtual {p0}, La/snf0;->a()V

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, La/snf0;->e:La/tu9;

    .line 81
    .line 82
    invoke-virtual {v1, p1}, La/tu9;->d(Ljava/lang/Throwable;)Z

    .line 83
    .line 84
    .line 85
    if-eqz v2, :cond_3

    .line 86
    .line 87
    iget-object p0, p0, La/snf0;->b:La/ito0;

    .line 88
    .line 89
    invoke-static {}, La/ofm0;->m()V

    .line 90
    .line 91
    .line 92
    const-string p1, "TakePictureManagerImpl"

    .line 93
    .line 94
    const-string v1, "Add a new request for retrying."

    .line 95
    .line 96
    invoke-static {p1, v1}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, La/ito0;->a:Ljava/util/ArrayDeque;

    .line 100
    .line 101
    invoke-virtual {p1, v0}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, La/ito0;->c()V

    .line 105
    .line 106
    .line 107
    :cond_3
    :goto_1
    return-void
.end method

.method public y0(La/y52;La/bcl;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, La/esg0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/t52;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, La/t52;->a:La/p7m0;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    instance-of v0, p1, La/x52;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, La/esg0;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, La/mne;

    .line 21
    .line 22
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 23
    .line 24
    new-instance v2, La/qa;

    .line 25
    .line 26
    const/16 v3, 0x18

    .line 27
    .line 28
    invoke-direct {v2, p0, p1, v1, v3}, La/qa;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v2, p2}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    sget-object p1, La/wne;->a:La/wne;

    .line 36
    .line 37
    if-ne p0, p1, :cond_0

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0
.end method

.method public z(ZLa/gz40;La/oqg0;)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget-object v4, v0, La/esg0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v4, La/cyu;

    .line 12
    .line 13
    iget-object v5, v3, La/oqg0;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v4, v5}, La/cyu;->L(Ljava/lang/String;)La/drg0;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const/4 v5, 0x0

    .line 20
    if-nez v4, :cond_3

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    const-string v2, "Fill"

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string v2, "Stroke"

    .line 28
    .line 29
    :goto_0
    iget-object v4, v3, La/oqg0;->a:Ljava/lang/String;

    .line 30
    .line 31
    filled-new-array {v2, v4}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const-string v4, "%s reference \'%s\' not found"

    .line 36
    .line 37
    invoke-static {v4, v2}, La/esg0;->E(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object v2, v3, La/oqg0;->b:La/grg0;

    .line 41
    .line 42
    iget-object v0, v0, La/esg0;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, La/csg0;

    .line 45
    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/esg0;->A0(La/csg0;ZLa/grg0;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    if-eqz v1, :cond_2

    .line 53
    .line 54
    iput-boolean v5, v0, La/csg0;->b:Z

    .line 55
    .line 56
    return-void

    .line 57
    :cond_2
    iput-boolean v5, v0, La/csg0;->c:Z

    .line 58
    .line 59
    return-void

    .line 60
    :cond_3
    instance-of v3, v4, La/erg0;

    .line 61
    .line 62
    const/4 v8, 0x3

    .line 63
    const/4 v9, 0x2

    .line 64
    sget-object v10, La/aqg0;->b:La/aqg0;

    .line 65
    .line 66
    const/high16 v13, 0x3f800000    # 1.0f

    .line 67
    .line 68
    const/4 v14, 0x1

    .line 69
    if-eqz v3, :cond_20

    .line 70
    .line 71
    check-cast v4, La/erg0;

    .line 72
    .line 73
    iget-object v3, v4, La/eqg0;->l:Ljava/lang/String;

    .line 74
    .line 75
    if-eqz v3, :cond_4

    .line 76
    .line 77
    invoke-static {v4, v3}, La/esg0;->G(La/eqg0;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :cond_4
    iget-object v3, v4, La/eqg0;->i:Ljava/lang/Boolean;

    .line 81
    .line 82
    if-eqz v3, :cond_5

    .line 83
    .line 84
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eqz v3, :cond_5

    .line 89
    .line 90
    move v3, v14

    .line 91
    goto :goto_1

    .line 92
    :cond_5
    move v3, v5

    .line 93
    :goto_1
    iget-object v15, v0, La/esg0;->c:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v15, La/csg0;

    .line 96
    .line 97
    const/high16 p3, 0x43800000    # 256.0f

    .line 98
    .line 99
    if-eqz v1, :cond_6

    .line 100
    .line 101
    iget-object v6, v15, La/csg0;->d:Landroid/graphics/Paint;

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_6
    iget-object v6, v15, La/csg0;->e:Landroid/graphics/Paint;

    .line 105
    .line 106
    :goto_2
    if-eqz v3, :cond_c

    .line 107
    .line 108
    iget-object v13, v15, La/csg0;->g:La/gz40;

    .line 109
    .line 110
    if-eqz v13, :cond_7

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_7
    iget-object v13, v15, La/csg0;->f:La/gz40;

    .line 114
    .line 115
    :goto_3
    iget-object v15, v4, La/erg0;->m:La/jqg0;

    .line 116
    .line 117
    if-eqz v15, :cond_8

    .line 118
    .line 119
    invoke-virtual {v15, v0}, La/jqg0;->d(La/esg0;)F

    .line 120
    .line 121
    .line 122
    move-result v15

    .line 123
    goto :goto_4

    .line 124
    :cond_8
    const/4 v15, 0x0

    .line 125
    :goto_4
    iget-object v11, v4, La/erg0;->n:La/jqg0;

    .line 126
    .line 127
    if-eqz v11, :cond_9

    .line 128
    .line 129
    invoke-virtual {v11, v0}, La/jqg0;->e(La/esg0;)F

    .line 130
    .line 131
    .line 132
    move-result v11

    .line 133
    :goto_5
    const/16 v17, 0x0

    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_9
    const/4 v11, 0x0

    .line 137
    goto :goto_5

    .line 138
    :goto_6
    iget-object v12, v4, La/erg0;->o:La/jqg0;

    .line 139
    .line 140
    if-eqz v12, :cond_a

    .line 141
    .line 142
    invoke-virtual {v12, v0}, La/jqg0;->d(La/esg0;)F

    .line 143
    .line 144
    .line 145
    move-result v12

    .line 146
    goto :goto_7

    .line 147
    :cond_a
    iget v12, v13, La/gz40;->d:F

    .line 148
    .line 149
    :goto_7
    iget-object v13, v4, La/erg0;->p:La/jqg0;

    .line 150
    .line 151
    if-eqz v13, :cond_b

    .line 152
    .line 153
    invoke-virtual {v13, v0}, La/jqg0;->e(La/esg0;)F

    .line 154
    .line 155
    .line 156
    move-result v13

    .line 157
    goto :goto_8

    .line 158
    :cond_b
    move/from16 v13, v17

    .line 159
    .line 160
    :goto_8
    move/from16 v20, v11

    .line 161
    .line 162
    move/from16 v21, v12

    .line 163
    .line 164
    move/from16 v22, v13

    .line 165
    .line 166
    move/from16 v19, v15

    .line 167
    .line 168
    goto :goto_c

    .line 169
    :cond_c
    const/16 v17, 0x0

    .line 170
    .line 171
    iget-object v11, v4, La/erg0;->m:La/jqg0;

    .line 172
    .line 173
    if-eqz v11, :cond_d

    .line 174
    .line 175
    invoke-virtual {v11, v0, v13}, La/jqg0;->c(La/esg0;F)F

    .line 176
    .line 177
    .line 178
    move-result v11

    .line 179
    move v15, v11

    .line 180
    goto :goto_9

    .line 181
    :cond_d
    move/from16 v15, v17

    .line 182
    .line 183
    :goto_9
    iget-object v11, v4, La/erg0;->n:La/jqg0;

    .line 184
    .line 185
    if-eqz v11, :cond_e

    .line 186
    .line 187
    invoke-virtual {v11, v0, v13}, La/jqg0;->c(La/esg0;F)F

    .line 188
    .line 189
    .line 190
    move-result v11

    .line 191
    goto :goto_a

    .line 192
    :cond_e
    move/from16 v11, v17

    .line 193
    .line 194
    :goto_a
    iget-object v12, v4, La/erg0;->o:La/jqg0;

    .line 195
    .line 196
    if-eqz v12, :cond_f

    .line 197
    .line 198
    invoke-virtual {v12, v0, v13}, La/jqg0;->c(La/esg0;F)F

    .line 199
    .line 200
    .line 201
    move-result v12

    .line 202
    goto :goto_b

    .line 203
    :cond_f
    move v12, v13

    .line 204
    :goto_b
    iget-object v7, v4, La/erg0;->p:La/jqg0;

    .line 205
    .line 206
    if-eqz v7, :cond_b

    .line 207
    .line 208
    invoke-virtual {v7, v0, v13}, La/jqg0;->c(La/esg0;F)F

    .line 209
    .line 210
    .line 211
    move-result v7

    .line 212
    move v13, v7

    .line 213
    goto :goto_8

    .line 214
    :goto_c
    invoke-virtual {v0}, La/esg0;->D0()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, v4}, La/esg0;->M(La/frg0;)La/csg0;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    iput-object v7, v0, La/esg0;->c:Ljava/lang/Object;

    .line 222
    .line 223
    new-instance v7, Landroid/graphics/Matrix;

    .line 224
    .line 225
    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    .line 226
    .line 227
    .line 228
    if-nez v3, :cond_10

    .line 229
    .line 230
    iget v3, v2, La/gz40;->b:F

    .line 231
    .line 232
    iget v11, v2, La/gz40;->c:F

    .line 233
    .line 234
    invoke-virtual {v7, v3, v11}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 235
    .line 236
    .line 237
    iget v3, v2, La/gz40;->d:F

    .line 238
    .line 239
    iget v2, v2, La/gz40;->e:F

    .line 240
    .line 241
    invoke-virtual {v7, v3, v2}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 242
    .line 243
    .line 244
    :cond_10
    iget-object v2, v4, La/eqg0;->j:Landroid/graphics/Matrix;

    .line 245
    .line 246
    if-eqz v2, :cond_11

    .line 247
    .line 248
    invoke-virtual {v7, v2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 249
    .line 250
    .line 251
    :cond_11
    iget-object v2, v4, La/eqg0;->h:Ljava/util/ArrayList;

    .line 252
    .line 253
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    if-nez v2, :cond_13

    .line 258
    .line 259
    invoke-virtual {v0}, La/esg0;->C0()V

    .line 260
    .line 261
    .line 262
    iget-object v0, v0, La/esg0;->c:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v0, La/csg0;

    .line 265
    .line 266
    if-eqz v1, :cond_12

    .line 267
    .line 268
    iput-boolean v5, v0, La/csg0;->b:Z

    .line 269
    .line 270
    return-void

    .line 271
    :cond_12
    iput-boolean v5, v0, La/csg0;->c:Z

    .line 272
    .line 273
    return-void

    .line 274
    :cond_13
    new-array v1, v2, [I

    .line 275
    .line 276
    new-array v3, v2, [F

    .line 277
    .line 278
    iget-object v11, v4, La/eqg0;->h:Ljava/util/ArrayList;

    .line 279
    .line 280
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 281
    .line 282
    .line 283
    move-result-object v11

    .line 284
    move v12, v5

    .line 285
    const/high16 v16, -0x40800000    # -1.0f

    .line 286
    .line 287
    :goto_d
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 288
    .line 289
    .line 290
    move-result v13

    .line 291
    if-eqz v13, :cond_18

    .line 292
    .line 293
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v13

    .line 297
    check-cast v13, La/frg0;

    .line 298
    .line 299
    check-cast v13, La/wqg0;

    .line 300
    .line 301
    iget-object v15, v13, La/wqg0;->h:Ljava/lang/Float;

    .line 302
    .line 303
    if-eqz v15, :cond_14

    .line 304
    .line 305
    invoke-virtual {v15}, Ljava/lang/Float;->floatValue()F

    .line 306
    .line 307
    .line 308
    move-result v15

    .line 309
    goto :goto_e

    .line 310
    :cond_14
    move/from16 v15, v17

    .line 311
    .line 312
    :goto_e
    if-eqz v12, :cond_16

    .line 313
    .line 314
    cmpl-float v18, v15, v16

    .line 315
    .line 316
    if-ltz v18, :cond_15

    .line 317
    .line 318
    goto :goto_f

    .line 319
    :cond_15
    aput v16, v3, v12

    .line 320
    .line 321
    goto :goto_10

    .line 322
    :cond_16
    :goto_f
    aput v15, v3, v12

    .line 323
    .line 324
    move/from16 v16, v15

    .line 325
    .line 326
    :goto_10
    invoke-virtual {v0}, La/esg0;->D0()V

    .line 327
    .line 328
    .line 329
    iget-object v15, v0, La/esg0;->c:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v15, La/csg0;

    .line 332
    .line 333
    invoke-virtual {v0, v15, v13}, La/esg0;->H0(La/csg0;La/drg0;)V

    .line 334
    .line 335
    .line 336
    iget-object v13, v0, La/esg0;->c:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v13, La/csg0;

    .line 339
    .line 340
    iget-object v13, v13, La/csg0;->a:La/xqg0;

    .line 341
    .line 342
    iget-object v15, v13, La/xqg0;->v:La/grg0;

    .line 343
    .line 344
    check-cast v15, La/aqg0;

    .line 345
    .line 346
    if-nez v15, :cond_17

    .line 347
    .line 348
    move-object v15, v10

    .line 349
    :cond_17
    iget v15, v15, La/aqg0;->a:I

    .line 350
    .line 351
    iget-object v13, v13, La/xqg0;->w:Ljava/lang/Float;

    .line 352
    .line 353
    invoke-virtual {v13}, Ljava/lang/Float;->floatValue()F

    .line 354
    .line 355
    .line 356
    move-result v13

    .line 357
    invoke-static {v13, v15}, La/esg0;->x(FI)I

    .line 358
    .line 359
    .line 360
    move-result v13

    .line 361
    aput v13, v1, v12

    .line 362
    .line 363
    add-int/lit8 v12, v12, 0x1

    .line 364
    .line 365
    invoke-virtual {v0}, La/esg0;->C0()V

    .line 366
    .line 367
    .line 368
    goto :goto_d

    .line 369
    :cond_18
    cmpl-float v10, v19, v21

    .line 370
    .line 371
    if-nez v10, :cond_19

    .line 372
    .line 373
    cmpl-float v10, v20, v22

    .line 374
    .line 375
    if-eqz v10, :cond_1a

    .line 376
    .line 377
    :cond_19
    if-ne v2, v14, :cond_1b

    .line 378
    .line 379
    :cond_1a
    invoke-virtual {v0}, La/esg0;->C0()V

    .line 380
    .line 381
    .line 382
    sub-int/2addr v2, v14

    .line 383
    aget v0, v1, v2

    .line 384
    .line 385
    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 386
    .line 387
    .line 388
    return-void

    .line 389
    :cond_1b
    sget-object v2, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 390
    .line 391
    iget v4, v4, La/eqg0;->k:I

    .line 392
    .line 393
    if-eqz v4, :cond_1c

    .line 394
    .line 395
    if-ne v4, v9, :cond_1d

    .line 396
    .line 397
    sget-object v2, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    .line 398
    .line 399
    :cond_1c
    :goto_11
    move-object/from16 v25, v2

    .line 400
    .line 401
    goto :goto_12

    .line 402
    :cond_1d
    if-ne v4, v8, :cond_1c

    .line 403
    .line 404
    sget-object v2, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    .line 405
    .line 406
    goto :goto_11

    .line 407
    :goto_12
    invoke-virtual {v0}, La/esg0;->C0()V

    .line 408
    .line 409
    .line 410
    new-instance v18, Landroid/graphics/LinearGradient;

    .line 411
    .line 412
    move-object/from16 v23, v1

    .line 413
    .line 414
    move-object/from16 v24, v3

    .line 415
    .line 416
    invoke-direct/range {v18 .. v25}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 417
    .line 418
    .line 419
    move-object/from16 v1, v18

    .line 420
    .line 421
    invoke-virtual {v1, v7}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 425
    .line 426
    .line 427
    iget-object v0, v0, La/esg0;->c:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v0, La/csg0;

    .line 430
    .line 431
    iget-object v0, v0, La/csg0;->a:La/xqg0;

    .line 432
    .line 433
    iget-object v0, v0, La/xqg0;->c:Ljava/lang/Float;

    .line 434
    .line 435
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    mul-float v0, v0, p3

    .line 440
    .line 441
    float-to-int v0, v0

    .line 442
    if-gez v0, :cond_1e

    .line 443
    .line 444
    goto :goto_13

    .line 445
    :cond_1e
    const/16 v1, 0xff

    .line 446
    .line 447
    if-le v0, v1, :cond_1f

    .line 448
    .line 449
    const/16 v5, 0xff

    .line 450
    .line 451
    goto :goto_13

    .line 452
    :cond_1f
    move v5, v0

    .line 453
    :goto_13
    invoke-virtual {v6, v5}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 454
    .line 455
    .line 456
    return-void

    .line 457
    :cond_20
    const/high16 p3, 0x43800000    # 256.0f

    .line 458
    .line 459
    const/16 v17, 0x0

    .line 460
    .line 461
    instance-of v3, v4, La/irg0;

    .line 462
    .line 463
    if-eqz v3, :cond_3a

    .line 464
    .line 465
    check-cast v4, La/irg0;

    .line 466
    .line 467
    iget-object v3, v4, La/eqg0;->l:Ljava/lang/String;

    .line 468
    .line 469
    if-eqz v3, :cond_21

    .line 470
    .line 471
    invoke-static {v4, v3}, La/esg0;->G(La/eqg0;Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    :cond_21
    iget-object v3, v4, La/eqg0;->i:Ljava/lang/Boolean;

    .line 475
    .line 476
    if-eqz v3, :cond_22

    .line 477
    .line 478
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 479
    .line 480
    .line 481
    move-result v3

    .line 482
    if-eqz v3, :cond_22

    .line 483
    .line 484
    move v3, v14

    .line 485
    goto :goto_14

    .line 486
    :cond_22
    move v3, v5

    .line 487
    :goto_14
    iget-object v6, v0, La/esg0;->c:Ljava/lang/Object;

    .line 488
    .line 489
    check-cast v6, La/csg0;

    .line 490
    .line 491
    if-eqz v1, :cond_23

    .line 492
    .line 493
    iget-object v6, v6, La/csg0;->d:Landroid/graphics/Paint;

    .line 494
    .line 495
    goto :goto_15

    .line 496
    :cond_23
    iget-object v6, v6, La/csg0;->e:Landroid/graphics/Paint;

    .line 497
    .line 498
    :goto_15
    if-eqz v3, :cond_27

    .line 499
    .line 500
    new-instance v7, La/jqg0;

    .line 501
    .line 502
    const/high16 v11, 0x42480000    # 50.0f

    .line 503
    .line 504
    const/16 v12, 0x9

    .line 505
    .line 506
    invoke-direct {v7, v11, v12}, La/jqg0;-><init>(FI)V

    .line 507
    .line 508
    .line 509
    iget-object v11, v4, La/irg0;->m:La/jqg0;

    .line 510
    .line 511
    if-eqz v11, :cond_24

    .line 512
    .line 513
    invoke-virtual {v11, v0}, La/jqg0;->d(La/esg0;)F

    .line 514
    .line 515
    .line 516
    move-result v11

    .line 517
    goto :goto_16

    .line 518
    :cond_24
    invoke-virtual {v7, v0}, La/jqg0;->d(La/esg0;)F

    .line 519
    .line 520
    .line 521
    move-result v11

    .line 522
    :goto_16
    iget-object v12, v4, La/irg0;->n:La/jqg0;

    .line 523
    .line 524
    if-eqz v12, :cond_25

    .line 525
    .line 526
    invoke-virtual {v12, v0}, La/jqg0;->e(La/esg0;)F

    .line 527
    .line 528
    .line 529
    move-result v12

    .line 530
    goto :goto_17

    .line 531
    :cond_25
    invoke-virtual {v7, v0}, La/jqg0;->e(La/esg0;)F

    .line 532
    .line 533
    .line 534
    move-result v12

    .line 535
    :goto_17
    iget-object v13, v4, La/irg0;->o:La/jqg0;

    .line 536
    .line 537
    if-eqz v13, :cond_26

    .line 538
    .line 539
    invoke-virtual {v13, v0}, La/jqg0;->b(La/esg0;)F

    .line 540
    .line 541
    .line 542
    move-result v7

    .line 543
    goto :goto_18

    .line 544
    :cond_26
    invoke-virtual {v7, v0}, La/jqg0;->b(La/esg0;)F

    .line 545
    .line 546
    .line 547
    move-result v7

    .line 548
    :goto_18
    move/from16 v21, v7

    .line 549
    .line 550
    move/from16 v19, v11

    .line 551
    .line 552
    :goto_19
    move/from16 v20, v12

    .line 553
    .line 554
    goto :goto_1c

    .line 555
    :cond_27
    iget-object v7, v4, La/irg0;->m:La/jqg0;

    .line 556
    .line 557
    const/high16 v11, 0x3f000000    # 0.5f

    .line 558
    .line 559
    if-eqz v7, :cond_28

    .line 560
    .line 561
    invoke-virtual {v7, v0, v13}, La/jqg0;->c(La/esg0;F)F

    .line 562
    .line 563
    .line 564
    move-result v7

    .line 565
    goto :goto_1a

    .line 566
    :cond_28
    move v7, v11

    .line 567
    :goto_1a
    iget-object v12, v4, La/irg0;->n:La/jqg0;

    .line 568
    .line 569
    if-eqz v12, :cond_29

    .line 570
    .line 571
    invoke-virtual {v12, v0, v13}, La/jqg0;->c(La/esg0;F)F

    .line 572
    .line 573
    .line 574
    move-result v12

    .line 575
    goto :goto_1b

    .line 576
    :cond_29
    move v12, v11

    .line 577
    :goto_1b
    iget-object v15, v4, La/irg0;->o:La/jqg0;

    .line 578
    .line 579
    if-eqz v15, :cond_2a

    .line 580
    .line 581
    invoke-virtual {v15, v0, v13}, La/jqg0;->c(La/esg0;F)F

    .line 582
    .line 583
    .line 584
    move-result v11

    .line 585
    :cond_2a
    move/from16 v19, v7

    .line 586
    .line 587
    move/from16 v21, v11

    .line 588
    .line 589
    goto :goto_19

    .line 590
    :goto_1c
    invoke-virtual {v0}, La/esg0;->D0()V

    .line 591
    .line 592
    .line 593
    invoke-virtual {v0, v4}, La/esg0;->M(La/frg0;)La/csg0;

    .line 594
    .line 595
    .line 596
    move-result-object v7

    .line 597
    iput-object v7, v0, La/esg0;->c:Ljava/lang/Object;

    .line 598
    .line 599
    new-instance v7, Landroid/graphics/Matrix;

    .line 600
    .line 601
    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    .line 602
    .line 603
    .line 604
    if-nez v3, :cond_2b

    .line 605
    .line 606
    iget v3, v2, La/gz40;->b:F

    .line 607
    .line 608
    iget v11, v2, La/gz40;->c:F

    .line 609
    .line 610
    invoke-virtual {v7, v3, v11}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 611
    .line 612
    .line 613
    iget v3, v2, La/gz40;->d:F

    .line 614
    .line 615
    iget v2, v2, La/gz40;->e:F

    .line 616
    .line 617
    invoke-virtual {v7, v3, v2}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 618
    .line 619
    .line 620
    :cond_2b
    iget-object v2, v4, La/eqg0;->j:Landroid/graphics/Matrix;

    .line 621
    .line 622
    if-eqz v2, :cond_2c

    .line 623
    .line 624
    invoke-virtual {v7, v2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 625
    .line 626
    .line 627
    :cond_2c
    iget-object v2, v4, La/eqg0;->h:Ljava/util/ArrayList;

    .line 628
    .line 629
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 630
    .line 631
    .line 632
    move-result v2

    .line 633
    if-nez v2, :cond_2e

    .line 634
    .line 635
    invoke-virtual {v0}, La/esg0;->C0()V

    .line 636
    .line 637
    .line 638
    iget-object v0, v0, La/esg0;->c:Ljava/lang/Object;

    .line 639
    .line 640
    check-cast v0, La/csg0;

    .line 641
    .line 642
    if-eqz v1, :cond_2d

    .line 643
    .line 644
    iput-boolean v5, v0, La/csg0;->b:Z

    .line 645
    .line 646
    return-void

    .line 647
    :cond_2d
    iput-boolean v5, v0, La/csg0;->c:Z

    .line 648
    .line 649
    return-void

    .line 650
    :cond_2e
    new-array v1, v2, [I

    .line 651
    .line 652
    new-array v3, v2, [F

    .line 653
    .line 654
    iget-object v11, v4, La/eqg0;->h:Ljava/util/ArrayList;

    .line 655
    .line 656
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 657
    .line 658
    .line 659
    move-result-object v11

    .line 660
    move v12, v5

    .line 661
    const/high16 v16, -0x40800000    # -1.0f

    .line 662
    .line 663
    :goto_1d
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 664
    .line 665
    .line 666
    move-result v13

    .line 667
    if-eqz v13, :cond_33

    .line 668
    .line 669
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v13

    .line 673
    check-cast v13, La/frg0;

    .line 674
    .line 675
    check-cast v13, La/wqg0;

    .line 676
    .line 677
    iget-object v15, v13, La/wqg0;->h:Ljava/lang/Float;

    .line 678
    .line 679
    if-eqz v15, :cond_2f

    .line 680
    .line 681
    invoke-virtual {v15}, Ljava/lang/Float;->floatValue()F

    .line 682
    .line 683
    .line 684
    move-result v15

    .line 685
    goto :goto_1e

    .line 686
    :cond_2f
    move/from16 v15, v17

    .line 687
    .line 688
    :goto_1e
    if-eqz v12, :cond_31

    .line 689
    .line 690
    cmpl-float v18, v15, v16

    .line 691
    .line 692
    if-ltz v18, :cond_30

    .line 693
    .line 694
    goto :goto_1f

    .line 695
    :cond_30
    aput v16, v3, v12

    .line 696
    .line 697
    goto :goto_20

    .line 698
    :cond_31
    :goto_1f
    aput v15, v3, v12

    .line 699
    .line 700
    move/from16 v16, v15

    .line 701
    .line 702
    :goto_20
    invoke-virtual {v0}, La/esg0;->D0()V

    .line 703
    .line 704
    .line 705
    iget-object v15, v0, La/esg0;->c:Ljava/lang/Object;

    .line 706
    .line 707
    check-cast v15, La/csg0;

    .line 708
    .line 709
    invoke-virtual {v0, v15, v13}, La/esg0;->H0(La/csg0;La/drg0;)V

    .line 710
    .line 711
    .line 712
    iget-object v13, v0, La/esg0;->c:Ljava/lang/Object;

    .line 713
    .line 714
    check-cast v13, La/csg0;

    .line 715
    .line 716
    iget-object v13, v13, La/csg0;->a:La/xqg0;

    .line 717
    .line 718
    iget-object v15, v13, La/xqg0;->v:La/grg0;

    .line 719
    .line 720
    check-cast v15, La/aqg0;

    .line 721
    .line 722
    if-nez v15, :cond_32

    .line 723
    .line 724
    move-object v15, v10

    .line 725
    :cond_32
    iget v15, v15, La/aqg0;->a:I

    .line 726
    .line 727
    iget-object v13, v13, La/xqg0;->w:Ljava/lang/Float;

    .line 728
    .line 729
    invoke-virtual {v13}, Ljava/lang/Float;->floatValue()F

    .line 730
    .line 731
    .line 732
    move-result v13

    .line 733
    invoke-static {v13, v15}, La/esg0;->x(FI)I

    .line 734
    .line 735
    .line 736
    move-result v13

    .line 737
    aput v13, v1, v12

    .line 738
    .line 739
    add-int/lit8 v12, v12, 0x1

    .line 740
    .line 741
    invoke-virtual {v0}, La/esg0;->C0()V

    .line 742
    .line 743
    .line 744
    goto :goto_1d

    .line 745
    :cond_33
    cmpl-float v10, v21, v17

    .line 746
    .line 747
    if-eqz v10, :cond_34

    .line 748
    .line 749
    if-ne v2, v14, :cond_35

    .line 750
    .line 751
    :cond_34
    move-object/from16 v22, v1

    .line 752
    .line 753
    goto :goto_24

    .line 754
    :cond_35
    sget-object v2, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 755
    .line 756
    iget v4, v4, La/eqg0;->k:I

    .line 757
    .line 758
    if-eqz v4, :cond_36

    .line 759
    .line 760
    if-ne v4, v9, :cond_37

    .line 761
    .line 762
    sget-object v2, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    .line 763
    .line 764
    :cond_36
    :goto_21
    move-object/from16 v24, v2

    .line 765
    .line 766
    goto :goto_22

    .line 767
    :cond_37
    if-ne v4, v8, :cond_36

    .line 768
    .line 769
    sget-object v2, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    .line 770
    .line 771
    goto :goto_21

    .line 772
    :goto_22
    invoke-virtual {v0}, La/esg0;->C0()V

    .line 773
    .line 774
    .line 775
    new-instance v18, Landroid/graphics/RadialGradient;

    .line 776
    .line 777
    move-object/from16 v22, v1

    .line 778
    .line 779
    move-object/from16 v23, v3

    .line 780
    .line 781
    invoke-direct/range {v18 .. v24}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 782
    .line 783
    .line 784
    move-object/from16 v1, v18

    .line 785
    .line 786
    invoke-virtual {v1, v7}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 787
    .line 788
    .line 789
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 790
    .line 791
    .line 792
    iget-object v0, v0, La/esg0;->c:Ljava/lang/Object;

    .line 793
    .line 794
    check-cast v0, La/csg0;

    .line 795
    .line 796
    iget-object v0, v0, La/csg0;->a:La/xqg0;

    .line 797
    .line 798
    iget-object v0, v0, La/xqg0;->c:Ljava/lang/Float;

    .line 799
    .line 800
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 801
    .line 802
    .line 803
    move-result v0

    .line 804
    mul-float v0, v0, p3

    .line 805
    .line 806
    float-to-int v0, v0

    .line 807
    if-gez v0, :cond_38

    .line 808
    .line 809
    goto :goto_23

    .line 810
    :cond_38
    const/16 v1, 0xff

    .line 811
    .line 812
    if-le v0, v1, :cond_39

    .line 813
    .line 814
    move v5, v1

    .line 815
    goto :goto_23

    .line 816
    :cond_39
    move v5, v0

    .line 817
    :goto_23
    invoke-virtual {v6, v5}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 818
    .line 819
    .line 820
    return-void

    .line 821
    :goto_24
    invoke-virtual {v0}, La/esg0;->C0()V

    .line 822
    .line 823
    .line 824
    sub-int/2addr v2, v14

    .line 825
    aget v0, v22, v2

    .line 826
    .line 827
    invoke-virtual {v6, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 828
    .line 829
    .line 830
    return-void

    .line 831
    :cond_3a
    instance-of v2, v4, La/vqg0;

    .line 832
    .line 833
    if-eqz v2, :cond_42

    .line 834
    .line 835
    check-cast v4, La/vqg0;

    .line 836
    .line 837
    iget-object v2, v4, La/drg0;->e:La/xqg0;

    .line 838
    .line 839
    const-wide v6, 0x180000000L

    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    const-wide v8, 0x100000000L

    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    const-wide v10, 0x80000000L

    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    if-eqz v1, :cond_3e

    .line 855
    .line 856
    invoke-static {v2, v10, v11}, La/esg0;->b0(La/xqg0;J)Z

    .line 857
    .line 858
    .line 859
    move-result v2

    .line 860
    if-eqz v2, :cond_3c

    .line 861
    .line 862
    iget-object v2, v0, La/esg0;->c:Ljava/lang/Object;

    .line 863
    .line 864
    check-cast v2, La/csg0;

    .line 865
    .line 866
    iget-object v3, v2, La/csg0;->a:La/xqg0;

    .line 867
    .line 868
    iget-object v10, v4, La/drg0;->e:La/xqg0;

    .line 869
    .line 870
    iget-object v10, v10, La/xqg0;->z:La/grg0;

    .line 871
    .line 872
    iput-object v10, v3, La/xqg0;->b:La/grg0;

    .line 873
    .line 874
    if-eqz v10, :cond_3b

    .line 875
    .line 876
    move v5, v14

    .line 877
    :cond_3b
    iput-boolean v5, v2, La/csg0;->b:Z

    .line 878
    .line 879
    :cond_3c
    iget-object v2, v4, La/drg0;->e:La/xqg0;

    .line 880
    .line 881
    invoke-static {v2, v8, v9}, La/esg0;->b0(La/xqg0;J)Z

    .line 882
    .line 883
    .line 884
    move-result v2

    .line 885
    if-eqz v2, :cond_3d

    .line 886
    .line 887
    iget-object v2, v0, La/esg0;->c:Ljava/lang/Object;

    .line 888
    .line 889
    check-cast v2, La/csg0;

    .line 890
    .line 891
    iget-object v2, v2, La/csg0;->a:La/xqg0;

    .line 892
    .line 893
    iget-object v3, v4, La/drg0;->e:La/xqg0;

    .line 894
    .line 895
    iget-object v3, v3, La/xqg0;->A:Ljava/lang/Float;

    .line 896
    .line 897
    iput-object v3, v2, La/xqg0;->c:Ljava/lang/Float;

    .line 898
    .line 899
    :cond_3d
    iget-object v2, v4, La/drg0;->e:La/xqg0;

    .line 900
    .line 901
    invoke-static {v2, v6, v7}, La/esg0;->b0(La/xqg0;J)Z

    .line 902
    .line 903
    .line 904
    move-result v2

    .line 905
    if-eqz v2, :cond_42

    .line 906
    .line 907
    iget-object v0, v0, La/esg0;->c:Ljava/lang/Object;

    .line 908
    .line 909
    check-cast v0, La/csg0;

    .line 910
    .line 911
    iget-object v2, v0, La/csg0;->a:La/xqg0;

    .line 912
    .line 913
    iget-object v2, v2, La/xqg0;->b:La/grg0;

    .line 914
    .line 915
    invoke-static {v0, v1, v2}, La/esg0;->A0(La/csg0;ZLa/grg0;)V

    .line 916
    .line 917
    .line 918
    return-void

    .line 919
    :cond_3e
    invoke-static {v2, v10, v11}, La/esg0;->b0(La/xqg0;J)Z

    .line 920
    .line 921
    .line 922
    move-result v2

    .line 923
    if-eqz v2, :cond_40

    .line 924
    .line 925
    iget-object v2, v0, La/esg0;->c:Ljava/lang/Object;

    .line 926
    .line 927
    check-cast v2, La/csg0;

    .line 928
    .line 929
    iget-object v3, v2, La/csg0;->a:La/xqg0;

    .line 930
    .line 931
    iget-object v10, v4, La/drg0;->e:La/xqg0;

    .line 932
    .line 933
    iget-object v10, v10, La/xqg0;->z:La/grg0;

    .line 934
    .line 935
    iput-object v10, v3, La/xqg0;->d:La/grg0;

    .line 936
    .line 937
    if-eqz v10, :cond_3f

    .line 938
    .line 939
    move v5, v14

    .line 940
    :cond_3f
    iput-boolean v5, v2, La/csg0;->c:Z

    .line 941
    .line 942
    :cond_40
    iget-object v2, v4, La/drg0;->e:La/xqg0;

    .line 943
    .line 944
    invoke-static {v2, v8, v9}, La/esg0;->b0(La/xqg0;J)Z

    .line 945
    .line 946
    .line 947
    move-result v2

    .line 948
    if-eqz v2, :cond_41

    .line 949
    .line 950
    iget-object v2, v0, La/esg0;->c:Ljava/lang/Object;

    .line 951
    .line 952
    check-cast v2, La/csg0;

    .line 953
    .line 954
    iget-object v2, v2, La/csg0;->a:La/xqg0;

    .line 955
    .line 956
    iget-object v3, v4, La/drg0;->e:La/xqg0;

    .line 957
    .line 958
    iget-object v3, v3, La/xqg0;->A:Ljava/lang/Float;

    .line 959
    .line 960
    iput-object v3, v2, La/xqg0;->e:Ljava/lang/Float;

    .line 961
    .line 962
    :cond_41
    iget-object v2, v4, La/drg0;->e:La/xqg0;

    .line 963
    .line 964
    invoke-static {v2, v6, v7}, La/esg0;->b0(La/xqg0;J)Z

    .line 965
    .line 966
    .line 967
    move-result v2

    .line 968
    if-eqz v2, :cond_42

    .line 969
    .line 970
    iget-object v0, v0, La/esg0;->c:Ljava/lang/Object;

    .line 971
    .line 972
    check-cast v0, La/csg0;

    .line 973
    .line 974
    iget-object v2, v0, La/csg0;->a:La/xqg0;

    .line 975
    .line 976
    iget-object v2, v2, La/xqg0;->d:La/grg0;

    .line 977
    .line 978
    invoke-static {v0, v1, v2}, La/esg0;->A0(La/csg0;ZLa/grg0;)V

    .line 979
    .line 980
    .line 981
    :cond_42
    return-void
.end method

.method public z0(FFFF)V
    .locals 1

    .line 1
    add-float/2addr p3, p1

    .line 2
    add-float/2addr p4, p2

    .line 3
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/csg0;

    .line 6
    .line 7
    iget-object v0, v0, La/csg0;->a:La/xqg0;

    .line 8
    .line 9
    iget-object v0, v0, La/xqg0;->p:La/n660;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, v0, La/n660;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, La/jqg0;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, La/jqg0;->d(La/esg0;)F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    add-float/2addr p1, v0

    .line 22
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, La/csg0;

    .line 25
    .line 26
    iget-object v0, v0, La/csg0;->a:La/xqg0;

    .line 27
    .line 28
    iget-object v0, v0, La/xqg0;->p:La/n660;

    .line 29
    .line 30
    iget-object v0, v0, La/n660;->a:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, La/jqg0;

    .line 33
    .line 34
    invoke-virtual {v0, p0}, La/jqg0;->e(La/esg0;)F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    add-float/2addr p2, v0

    .line 39
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, La/csg0;

    .line 42
    .line 43
    iget-object v0, v0, La/csg0;->a:La/xqg0;

    .line 44
    .line 45
    iget-object v0, v0, La/xqg0;->p:La/n660;

    .line 46
    .line 47
    iget-object v0, v0, La/n660;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, La/jqg0;

    .line 50
    .line 51
    invoke-virtual {v0, p0}, La/jqg0;->d(La/esg0;)F

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    sub-float/2addr p3, v0

    .line 56
    iget-object v0, p0, La/esg0;->c:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, La/csg0;

    .line 59
    .line 60
    iget-object v0, v0, La/csg0;->a:La/xqg0;

    .line 61
    .line 62
    iget-object v0, v0, La/xqg0;->p:La/n660;

    .line 63
    .line 64
    iget-object v0, v0, La/n660;->c:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, La/jqg0;

    .line 67
    .line 68
    invoke-virtual {v0, p0}, La/jqg0;->e(La/esg0;)F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    sub-float/2addr p4, v0

    .line 73
    :cond_0
    iget-object p0, p0, La/esg0;->a:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p0, Landroid/graphics/Canvas;

    .line 76
    .line 77
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 78
    .line 79
    .line 80
    return-void
.end method
