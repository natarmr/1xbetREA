.class public final synthetic La/mit;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/sit;


# direct methods
.method public synthetic constructor <init>(La/sit;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mit;->a:B

    iput-object p1, p0, La/mit;->b:La/sit;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/mit;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/mit;->b:La/sit;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Throwable;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/sit;->F:La/ax5;

    .line 14
    .line 15
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p0, p0, La/bvc;->a:Lkotlin/coroutines/CoroutineContext;

    .line 20
    .line 21
    invoke-virtual {v0, p1, p0}, La/ax5;->l(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 31
    .line 32
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 33
    .line 34
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, La/i3t0;->f:La/oyg0;

    .line 42
    .line 43
    move-object v3, v1

    .line 44
    check-cast v3, La/zht;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    const/4 v12, 0x0

    .line 50
    const/16 v13, 0x3df

    .line 51
    .line 52
    const/4 v4, 0x0

    .line 53
    const/4 v5, 0x0

    .line 54
    const/4 v6, 0x0

    .line 55
    const/4 v7, 0x0

    .line 56
    const/4 v8, 0x0

    .line 57
    const/4 v9, 0x0

    .line 58
    const/4 v10, 0x0

    .line 59
    const/4 v11, 0x0

    .line 60
    invoke-static/range {v3 .. v13}, La/zht;->a(La/zht;La/zo80;La/bdq;ZLa/yo80;La/yo80;ZZLjava/util/List;Ljava/util/List;I)La/zht;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_0

    .line 69
    .line 70
    iget-object v0, p0, La/sit;->y:La/qu;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    iget-object v0, v0, La/qu;->a:La/kt2;

    .line 76
    .line 77
    const-string v1, "generate_coupon_done"

    .line 78
    .line 79
    const-string v2, "status"

    .line 80
    .line 81
    const-string v3, "decline"

    .line 82
    .line 83
    invoke-static {v2, v3, v0, v1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, La/sit;->C:La/x20;

    .line 87
    .line 88
    iget-object v0, v0, La/x20;->a:La/s1p;

    .line 89
    .line 90
    const-wide/16 v1, 0xc8c

    .line 91
    .line 92
    invoke-static {v3, v0, v1, v2}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, La/sit;->w:La/duj;

    .line 96
    .line 97
    new-instance v1, La/sjs;

    .line 98
    .line 99
    const/4 v2, 0x5

    .line 100
    invoke-direct {v1, p1, p0, v2}, La/sjs;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 104
    .line 105
    .line 106
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
