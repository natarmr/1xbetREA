.class public final La/s910;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/u910;


# direct methods
.method public synthetic constructor <init>(La/u910;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/s910;->a:B

    iput-object p1, p0, La/s910;->b:La/u910;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/s910;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/s910;->b:La/u910;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, La/u910;->e()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, La/u910;->c:La/pz40;

    .line 13
    .line 14
    check-cast v1, La/hgk0;

    .line 15
    .line 16
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-ne v0, v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, La/u910;->f()F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object p0, p0, La/u910;->m:La/zbk;

    .line 33
    .line 34
    invoke-virtual {p0}, La/zbk;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Ljava/lang/Number;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    cmpg-float p0, v0, p0

    .line 45
    .line 46
    if-nez p0, :cond_0

    .line 47
    .line 48
    const/4 p0, 0x1

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const/4 p0, 0x0

    .line 51
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :pswitch_0
    iget-object v0, p0, La/u910;->d:La/pz40;

    .line 57
    .line 58
    check-cast v0, La/hgk0;

    .line 59
    .line 60
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_1

    .line 71
    .line 72
    invoke-virtual {p0}, La/u910;->e()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    rem-int/lit8 v0, v0, 0x2

    .line 77
    .line 78
    if-nez v0, :cond_1

    .line 79
    .line 80
    invoke-virtual {p0}, La/u910;->g()F

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    neg-float p0, p0

    .line 85
    goto :goto_1

    .line 86
    :cond_1
    invoke-virtual {p0}, La/u910;->g()F

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    :goto_1
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0

    .line 95
    :pswitch_1
    invoke-virtual {p0}, La/u910;->c()La/fa10;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const/4 v1, 0x0

    .line 100
    if-nez v0, :cond_2

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_2
    invoke-virtual {p0}, La/u910;->g()F

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    cmpg-float v0, v0, v1

    .line 108
    .line 109
    if-gez v0, :cond_3

    .line 110
    .line 111
    invoke-virtual {p0}, La/u910;->b()V

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_3
    invoke-virtual {p0}, La/u910;->b()V

    .line 116
    .line 117
    .line 118
    const/high16 v1, 0x3f800000    # 1.0f

    .line 119
    .line 120
    :goto_2
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
