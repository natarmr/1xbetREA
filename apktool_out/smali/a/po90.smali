.class public final La/po90;
.super La/zzf0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic j:B

.field public k:Z

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/po90;->j:B

    iput-object p1, p0, La/po90;->m:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/zzf0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/po90;->j:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/po90;

    .line 7
    .line 8
    iget-object p0, p0, La/po90;->m:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/po90;-><init>(Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/po90;->l:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/po90;

    .line 18
    .line 19
    iget-object p0, p0, La/po90;->m:Lkotlin/jvm/functions/Function1;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, p0, p2, v1}, La/po90;-><init>(Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 23
    .line 24
    .line 25
    iput-object p1, v0, La/po90;->l:Ljava/lang/Object;

    .line 26
    .line 27
    return-object v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/po90;->j:B

    .line 2
    .line 3
    check-cast p1, La/inn0;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/po90;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/po90;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/po90;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    sget-object p0, La/wne;->a:La/wne;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/po90;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, La/po90;

    .line 29
    .line 30
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, La/po90;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/po90;->j:B

    .line 2
    .line 3
    iget-object v1, p0, La/po90;->m:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    iget-boolean v5, p0, La/po90;->k:Z

    .line 15
    .line 16
    if-eqz v5, :cond_1

    .line 17
    .line 18
    if-ne v5, v3, :cond_0

    .line 19
    .line 20
    iget-object v2, p0, La/po90;->l:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, La/inn0;

    .line 23
    .line 24
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, La/po90;->l:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, La/inn0;

    .line 38
    .line 39
    move-object v2, p1

    .line 40
    :cond_2
    :goto_0
    sget-object p1, La/xoa0;->a:La/xoa0;

    .line 41
    .line 42
    iput-object v2, p0, La/po90;->l:Ljava/lang/Object;

    .line 43
    .line 44
    iput-boolean v3, p0, La/po90;->k:Z

    .line 45
    .line 46
    invoke-virtual {v2, p1, p0}, La/inn0;->a(La/xoa0;La/yje;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-ne p1, v0, :cond_3

    .line 51
    .line 52
    move-object v4, v0

    .line 53
    :goto_1
    return-object v4

    .line 54
    :cond_3
    :goto_2
    check-cast p1, La/woa0;

    .line 55
    .line 56
    invoke-virtual {p1}, La/woa0;->a()Landroid/view/MotionEvent;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :pswitch_0
    iget-object v0, p0, La/po90;->l:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, La/inn0;

    .line 69
    .line 70
    sget-object v5, La/wne;->a:La/wne;

    .line 71
    .line 72
    iget-boolean v6, p0, La/po90;->k:Z

    .line 73
    .line 74
    if-eqz v6, :cond_5

    .line 75
    .line 76
    if-ne v6, v3, :cond_4

    .line 77
    .line 78
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iput-object v4, p0, La/po90;->l:Ljava/lang/Object;

    .line 90
    .line 91
    iput-boolean v3, p0, La/po90;->k:Z

    .line 92
    .line 93
    const/4 p1, 0x0

    .line 94
    const/4 v2, 0x2

    .line 95
    invoke-static {v0, p1, p0, v2}, La/tto0;->b(La/inn0;ZLa/yje;I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    if-ne p0, v5, :cond_6

    .line 100
    .line 101
    move-object v4, v5

    .line 102
    goto :goto_4

    .line 103
    :cond_6
    :goto_3
    sget-object p0, La/fo90;->a:La/fo90;

    .line 104
    .line 105
    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    :goto_4
    return-object v4

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
