.class public final La/cv2;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public synthetic k:Ljava/lang/Object;

.field public synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILa/yje;B)V
    .locals 0

    .line 13
    iput-byte p3, p0, La/cv2;->i:B

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/tzi;La/j700;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, La/cv2;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/cv2;->k:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/cv2;->l:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 p1, 0x4

    .line 9
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/cv2;->i:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/cv2;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/lang/Throwable;

    .line 11
    .line 12
    sget-object v3, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, La/cv2;->k:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, La/tzi;

    .line 20
    .line 21
    iget-object p0, p0, La/cv2;->l:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, La/j700;

    .line 24
    .line 25
    invoke-static {p0}, La/t9x;->J(La/j700;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-static {v0}, La/agc;->W(Ljava/lang/Throwable;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    if-eqz p0, :cond_0

    .line 36
    .line 37
    iget-object p0, p1, La/tzi;->i:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, La/t4v;

    .line 40
    .line 41
    invoke-virtual {p0}, La/t4v;->a()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    iget-object p0, p1, La/tzi;->j:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p0, La/wsc;

    .line 48
    .line 49
    invoke-virtual {p0}, La/wsc;->a()V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move v1, v2

    .line 54
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :pswitch_0
    iget-object v0, p0, La/cv2;->j:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, La/gxb;

    .line 62
    .line 63
    iget-object v3, p0, La/cv2;->k:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v3, Ljava/lang/String;

    .line 66
    .line 67
    iget-object p0, p0, La/cv2;->l:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p0, La/f9e;

    .line 70
    .line 71
    sget-object v4, La/wne;->a:La/wne;

    .line 72
    .line 73
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    new-instance p1, La/exb;

    .line 77
    .line 78
    iget-boolean v4, v0, La/gxb;->g:Z

    .line 79
    .line 80
    xor-int/lit8 v5, v4, 0x1

    .line 81
    .line 82
    if-nez v4, :cond_3

    .line 83
    .line 84
    instance-of p0, p0, La/e9e;

    .line 85
    .line 86
    if-eqz p0, :cond_2

    .line 87
    .line 88
    invoke-static {v3}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-lez p0, :cond_3

    .line 101
    .line 102
    :cond_2
    move v2, v1

    .line 103
    :cond_3
    iget-boolean p0, v0, La/gxb;->g:Z

    .line 104
    .line 105
    xor-int/2addr p0, v1

    .line 106
    invoke-direct {p1, v5, v2, p0}, La/exb;-><init>(ZZZ)V

    .line 107
    .line 108
    .line 109
    return-object p1

    .line 110
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 111
    .line 112
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iget-object p1, p0, La/cv2;->j:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p1, La/nv2;

    .line 118
    .line 119
    iget-object v0, p0, La/cv2;->k:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, La/vtj;

    .line 122
    .line 123
    iget-object p0, p0, La/cv2;->l:Ljava/lang/Object;

    .line 124
    .line 125
    invoke-virtual {v0, p0}, La/vtj;->d(Ljava/lang/Object;)F

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-nez v0, :cond_4

    .line 134
    .line 135
    invoke-static {p1, p0}, La/nv2;->b(La/nv2;F)V

    .line 136
    .line 137
    .line 138
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/cv2;->i:B

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, La/kmq;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Throwable;

    .line 10
    .line 11
    check-cast p3, Ljava/lang/Number;

    .line 12
    .line 13
    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    .line 14
    .line 15
    .line 16
    check-cast p4, La/yje;

    .line 17
    .line 18
    new-instance p1, La/cv2;

    .line 19
    .line 20
    iget-object p3, p0, La/cv2;->k:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p3, La/tzi;

    .line 23
    .line 24
    iget-object p0, p0, La/cv2;->l:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, La/j700;

    .line 27
    .line 28
    invoke-direct {p1, p3, p0, p4}, La/cv2;-><init>(La/tzi;La/j700;La/yje;)V

    .line 29
    .line 30
    .line 31
    iput-object p2, p1, La/cv2;->j:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p1, p0}, La/cv2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_0
    check-cast p1, La/gxb;

    .line 41
    .line 42
    check-cast p2, Ljava/lang/String;

    .line 43
    .line 44
    check-cast p3, La/f9e;

    .line 45
    .line 46
    check-cast p4, La/yje;

    .line 47
    .line 48
    new-instance p0, La/cv2;

    .line 49
    .line 50
    const/4 v0, 0x1

    .line 51
    invoke-direct {p0, v1, p4, v0}, La/cv2;-><init>(ILa/yje;B)V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, La/cv2;->j:Ljava/lang/Object;

    .line 55
    .line 56
    iput-object p2, p0, La/cv2;->k:Ljava/lang/Object;

    .line 57
    .line 58
    iput-object p3, p0, La/cv2;->l:Ljava/lang/Object;

    .line 59
    .line 60
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    invoke-virtual {p0, p1}, La/cv2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :pswitch_1
    check-cast p1, La/nv2;

    .line 68
    .line 69
    check-cast p2, La/vtj;

    .line 70
    .line 71
    check-cast p4, La/yje;

    .line 72
    .line 73
    new-instance p0, La/cv2;

    .line 74
    .line 75
    const/4 v0, 0x0

    .line 76
    invoke-direct {p0, v1, p4, v0}, La/cv2;-><init>(ILa/yje;B)V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, La/cv2;->j:Ljava/lang/Object;

    .line 80
    .line 81
    iput-object p2, p0, La/cv2;->k:Ljava/lang/Object;

    .line 82
    .line 83
    iput-object p3, p0, La/cv2;->l:Ljava/lang/Object;

    .line 84
    .line 85
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    invoke-virtual {p0, p1}, La/cv2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
