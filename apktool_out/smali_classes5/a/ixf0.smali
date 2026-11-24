.class public final synthetic La/ixf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/sxf0;


# direct methods
.method public synthetic constructor <init>(La/sxf0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ixf0;->a:B

    iput-object p1, p0, La/ixf0;->b:La/sxf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/ixf0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ixf0;->b:La/sxf0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/sxf0;->p:La/duj;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/Throwable;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, La/sxf0;->j:La/rjo;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, La/rjo;->a(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 21
    .line 22
    .line 23
    instance-of v1, p1, Ljava/net/SocketTimeoutException;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    instance-of v1, p1, Ljava/net/UnknownHostException;

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    :goto_0
    iget-object p0, p0, La/sxf0;->t:La/ol60;

    .line 33
    .line 34
    sget-object p1, La/oxf0;->a:La/oxf0;

    .line 35
    .line 36
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    instance-of v1, p1, La/zhi0;

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    if-eqz v1, :cond_4

    .line 44
    .line 45
    move-object v1, p1

    .line 46
    check-cast v1, La/zhi0;

    .line 47
    .line 48
    iget-object v1, v1, La/zhi0;->c:La/kuw;

    .line 49
    .line 50
    sget-object v3, La/i2o;->i2:La/i2o;

    .line 51
    .line 52
    if-ne v1, v3, :cond_3

    .line 53
    .line 54
    iget-object p0, p0, La/sxf0;->o:La/joc;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-nez p1, :cond_2

    .line 61
    .line 62
    const-string p1, ""

    .line 63
    .line 64
    :cond_2
    iget-object p0, p0, La/joc;->a:La/g090;

    .line 65
    .line 66
    iget-object p0, p0, La/g090;->a:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, La/d190;

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget-object p0, p0, La/d190;->g:La/qoj0;

    .line 74
    .line 75
    invoke-virtual {p0, p1}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    new-instance v1, La/jxf0;

    .line 80
    .line 81
    invoke-direct {v1, p0, v2}, La/jxf0;-><init>(La/sxf0;B)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    new-instance v1, La/jxf0;

    .line 89
    .line 90
    invoke-direct {v1, p0, v2}, La/jxf0;-><init>(La/sxf0;B)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 94
    .line 95
    .line 96
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, La/sxf0;->p:La/duj;

    .line 105
    .line 106
    new-instance v1, La/jxf0;

    .line 107
    .line 108
    const/4 v2, 0x0

    .line 109
    invoke-direct {v1, p0, v2}, La/jxf0;-><init>(La/sxf0;B)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 113
    .line 114
    .line 115
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    return-object p0

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
