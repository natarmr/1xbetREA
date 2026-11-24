.class public final synthetic La/o6n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/e2d;


# direct methods
.method public synthetic constructor <init>(La/e2d;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/o6n;->a:B

    iput-object p1, p0, La/o6n;->b:La/e2d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/o6n;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/high16 v3, 0x3f800000    # 1.0f

    .line 6
    .line 7
    iget-object p0, p0, La/o6n;->b:La/e2d;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, La/uag0;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget-object v0, La/qmk;->a:La/zcl;

    .line 18
    .line 19
    iget-object p0, p0, La/e2d;->a:La/oyq0;

    .line 20
    .line 21
    invoke-virtual {p0}, La/oyq0;->a()F

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    sub-float/2addr v3, p0

    .line 26
    const/high16 p0, 0x41c00000    # 24.0f

    .line 27
    .line 28
    mul-float/2addr v3, p0

    .line 29
    const/16 p0, 0xc

    .line 30
    .line 31
    invoke-static {v3, v3, v2, v2, p0}, La/vgg0;->c(FFFFI)La/ugg0;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p1, p0}, La/uag0;->D(La/yjj0;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v1}, La/uag0;->g(Z)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_0
    check-cast p1, La/uag0;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v1}, La/uag0;->g(Z)V

    .line 50
    .line 51
    .line 52
    if-eqz p0, :cond_0

    .line 53
    .line 54
    iget-object p0, p0, La/e2d;->f:La/a8z;

    .line 55
    .line 56
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, La/l7m0;

    .line 61
    .line 62
    if-eqz p0, :cond_0

    .line 63
    .line 64
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, Ljava/lang/Boolean;

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-nez p0, :cond_0

    .line 75
    .line 76
    sget-object p0, La/qmk;->a:La/zcl;

    .line 77
    .line 78
    const/high16 p0, 0x41800000    # 16.0f

    .line 79
    .line 80
    const/4 v0, 0x7

    .line 81
    invoke-static {v2, v2, v2, p0, v0}, La/vgg0;->c(FFFFI)La/ugg0;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    goto :goto_0

    .line 86
    :cond_0
    sget-object p0, La/jd8;->n:La/ljc;

    .line 87
    .line 88
    :goto_0
    invoke-virtual {p1, p0}, La/uag0;->D(La/yjj0;)V

    .line 89
    .line 90
    .line 91
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    return-object p0

    .line 94
    :pswitch_1
    check-cast p1, Ljava/lang/Float;

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    iget-object p0, p0, La/e2d;->a:La/oyq0;

    .line 101
    .line 102
    iget-object v0, p0, La/oyq0;->c:La/agk0;

    .line 103
    .line 104
    invoke-virtual {v0}, La/agk0;->l()F

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    add-float/2addr v0, p1

    .line 109
    invoke-virtual {p0, v0}, La/oyq0;->c(F)V

    .line 110
    .line 111
    .line 112
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    return-object p0

    .line 115
    :pswitch_2
    check-cast p1, La/uag0;

    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    iget-object p0, p0, La/e2d;->a:La/oyq0;

    .line 121
    .line 122
    invoke-virtual {p0}, La/oyq0;->a()F

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    sub-float/2addr v3, p0

    .line 127
    invoke-virtual {p1, v3}, La/uag0;->b(F)V

    .line 128
    .line 129
    .line 130
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_3
    check-cast p1, La/uag0;

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    iget-object p0, p0, La/e2d;->a:La/oyq0;

    .line 139
    .line 140
    invoke-virtual {p0}, La/oyq0;->a()F

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    invoke-virtual {p1, p0}, La/uag0;->b(F)V

    .line 145
    .line 146
    .line 147
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object p0

    .line 150
    :pswitch_4
    check-cast p1, La/uag0;

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    iget-object p0, p0, La/e2d;->a:La/oyq0;

    .line 156
    .line 157
    invoke-virtual {p0}, La/oyq0;->a()F

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    sub-float/2addr v3, p0

    .line 162
    invoke-virtual {p1, v3}, La/uag0;->b(F)V

    .line 163
    .line 164
    .line 165
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 166
    .line 167
    return-object p0

    .line 168
    nop

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
