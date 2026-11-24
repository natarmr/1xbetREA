.class public final La/p220;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Z

.field public synthetic k:Z

.field public synthetic l:Z


# direct methods
.method public synthetic constructor <init>(ILa/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/p220;->i:B

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/p220;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, La/p220;->j:Z

    .line 9
    .line 10
    iget-boolean v3, p0, La/p220;->k:Z

    .line 11
    .line 12
    iget-boolean p0, p0, La/p220;->l:Z

    .line 13
    .line 14
    sget-object v4, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    move v1, v2

    .line 26
    :cond_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_0
    iget-boolean v0, p0, La/p220;->j:Z

    .line 32
    .line 33
    iget-boolean v3, p0, La/p220;->k:Z

    .line 34
    .line 35
    iget-boolean p0, p0, La/p220;->l:Z

    .line 36
    .line 37
    sget-object v4, La/wne;->a:La/wne;

    .line 38
    .line 39
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    if-eqz p0, :cond_1

    .line 47
    .line 48
    move v1, v2

    .line 49
    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :pswitch_1
    iget-boolean v0, p0, La/p220;->j:Z

    .line 55
    .line 56
    iget-boolean v3, p0, La/p220;->k:Z

    .line 57
    .line 58
    iget-boolean p0, p0, La/p220;->l:Z

    .line 59
    .line 60
    sget-object v4, La/wne;->a:La/wne;

    .line 61
    .line 62
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    if-nez v0, :cond_2

    .line 66
    .line 67
    if-nez v3, :cond_2

    .line 68
    .line 69
    if-eqz p0, :cond_3

    .line 70
    .line 71
    :cond_2
    move v1, v2

    .line 72
    :cond_3
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte p0, p0, La/p220;->i:B

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    check-cast p1, Ljava/lang/Boolean;

    .line 5
    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    check-cast p2, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    check-cast p3, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    check-cast p4, La/yje;

    .line 26
    .line 27
    new-instance p3, La/p220;

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    invoke-direct {p3, v0, p4, v1}, La/p220;-><init>(ILa/yje;B)V

    .line 31
    .line 32
    .line 33
    iput-boolean p0, p3, La/p220;->j:Z

    .line 34
    .line 35
    iput-boolean p1, p3, La/p220;->k:Z

    .line 36
    .line 37
    iput-boolean p2, p3, La/p220;->l:Z

    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    invoke-virtual {p3, p0}, La/p220;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    check-cast p2, Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    check-cast p3, Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    check-cast p4, La/yje;

    .line 63
    .line 64
    new-instance p3, La/p220;

    .line 65
    .line 66
    const/4 v1, 0x1

    .line 67
    invoke-direct {p3, v0, p4, v1}, La/p220;-><init>(ILa/yje;B)V

    .line 68
    .line 69
    .line 70
    iput-boolean p0, p3, La/p220;->j:Z

    .line 71
    .line 72
    iput-boolean p1, p3, La/p220;->k:Z

    .line 73
    .line 74
    iput-boolean p2, p3, La/p220;->l:Z

    .line 75
    .line 76
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    invoke-virtual {p3, p0}, La/p220;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    check-cast p2, Ljava/lang/Boolean;

    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    check-cast p3, Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    check-cast p4, La/yje;

    .line 100
    .line 101
    new-instance p3, La/p220;

    .line 102
    .line 103
    const/4 v1, 0x0

    .line 104
    invoke-direct {p3, v0, p4, v1}, La/p220;-><init>(ILa/yje;B)V

    .line 105
    .line 106
    .line 107
    iput-boolean p0, p3, La/p220;->j:Z

    .line 108
    .line 109
    iput-boolean p1, p3, La/p220;->k:Z

    .line 110
    .line 111
    iput-boolean p2, p3, La/p220;->l:Z

    .line 112
    .line 113
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    invoke-virtual {p3, p0}, La/p220;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    return-object p0

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
