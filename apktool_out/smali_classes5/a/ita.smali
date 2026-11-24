.class public final La/ita;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cgk0;

.field public final synthetic c:La/cgk0;

.field public final synthetic d:La/t33;


# direct methods
.method public synthetic constructor <init>(La/cgk0;La/cgk0;La/t33;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/ita;->a:B

    iput-object p1, p0, La/ita;->b:La/cgk0;

    iput-object p2, p0, La/ita;->c:La/cgk0;

    iput-object p3, p0, La/ita;->d:La/t33;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/ita;->a:B

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, La/ita;->d:La/t33;

    .line 7
    .line 8
    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    .line 9
    .line 10
    const/high16 v6, 0x42c80000    # 100.0f

    .line 11
    .line 12
    iget-object v7, p0, La/ita;->c:La/cgk0;

    .line 13
    .line 14
    iget-object p0, p0, La/ita;->b:La/cgk0;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast p1, Lkotlin/Pair;

    .line 20
    .line 21
    iget-object v0, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Ljava/lang/Number;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object p1, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-virtual {v7}, La/cgk0;->l()I

    .line 38
    .line 39
    .line 40
    move-result v8

    .line 41
    invoke-virtual {p0, v8}, La/cgk0;->m(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v7, p1}, La/cgk0;->m(I)V

    .line 45
    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    int-to-float p0, p1

    .line 50
    int-to-float p1, v0

    .line 51
    div-float/2addr p0, p1

    .line 52
    mul-float/2addr p0, v6

    .line 53
    invoke-static {p0}, La/si30;->b(F)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    int-to-double p0, p0

    .line 58
    div-double/2addr p0, v4

    .line 59
    double-to-float p0, p0

    .line 60
    invoke-static {p0, v2, v1}, La/l1e0;->c(FFF)F

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    new-instance p1, Ljava/lang/Float;

    .line 65
    .line 66
    invoke-direct {p1, p0}, Ljava/lang/Float;-><init>(F)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3, p2, p1}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    sget-object p1, La/wne;->a:La/wne;

    .line 74
    .line 75
    if-ne p0, p1, :cond_0

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    :goto_0
    return-object p0

    .line 84
    :pswitch_0
    check-cast p1, Lkotlin/Pair;

    .line 85
    .line 86
    iget-object v0, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Ljava/lang/Number;

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget-object p1, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p1, Ljava/lang/Number;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    invoke-virtual {v7}, La/cgk0;->l()I

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    invoke-virtual {p0, v8}, La/cgk0;->m(I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v7, p1}, La/cgk0;->m(I)V

    .line 110
    .line 111
    .line 112
    if-eqz v0, :cond_3

    .line 113
    .line 114
    int-to-float p0, p1

    .line 115
    int-to-float p1, v0

    .line 116
    div-float/2addr p0, p1

    .line 117
    mul-float/2addr p0, v6

    .line 118
    invoke-static {p0}, La/si30;->b(F)I

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    int-to-double p0, p0

    .line 123
    div-double/2addr p0, v4

    .line 124
    double-to-float p0, p0

    .line 125
    invoke-static {p0, v2, v1}, La/l1e0;->c(FFF)F

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    new-instance p1, Ljava/lang/Float;

    .line 130
    .line 131
    invoke-direct {p1, p0}, Ljava/lang/Float;-><init>(F)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v3, p2, p1}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    sget-object p1, La/wne;->a:La/wne;

    .line 139
    .line 140
    if-ne p0, p1, :cond_2

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    :goto_1
    return-object p0

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
