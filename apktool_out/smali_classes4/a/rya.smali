.class public final synthetic La/rya;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/uya;


# direct methods
.method public synthetic constructor <init>(La/uya;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rya;->a:B

    iput-object p1, p0, La/rya;->b:La/uya;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/rya;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/rya;->b:La/uya;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v10, p1

    .line 9
    check-cast v10, Ljava/lang/Throwable;

    .line 10
    .line 11
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, La/uya;->w:La/rjo;

    .line 15
    .line 16
    invoke-virtual {p1, v10}, La/rjo;->a(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, La/uya;->x:La/duj;

    .line 20
    .line 21
    new-instance v0, La/pua;

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    invoke-direct {v0, v1}, La/pua;-><init>(B)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v10, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 31
    .line 32
    iget-object v0, p1, La/ocj;->a:La/p7m0;

    .line 33
    .line 34
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 42
    .line 43
    move-object v2, v1

    .line 44
    move-object v1, p1

    .line 45
    check-cast v1, La/kya;

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    const-wide/16 v8, 0x0

    .line 51
    .line 52
    const/16 v11, 0x1ff

    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    const/4 v3, 0x0

    .line 56
    const/4 v4, 0x0

    .line 57
    const/4 v5, 0x0

    .line 58
    const/4 v6, 0x0

    .line 59
    const/4 v7, 0x0

    .line 60
    invoke-static/range {v1 .. v11}, La/kya;->a(La/kya;La/a4x;La/a4x;La/bi90;Ljava/lang/String;ZZJLjava/lang/Throwable;I)La/kya;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v0, p1, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_0

    .line 69
    .line 70
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, La/uya;->w:La/rjo;

    .line 79
    .line 80
    invoke-virtual {v0, p1}, La/rjo;->a(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, La/uya;->x:La/duj;

    .line 84
    .line 85
    new-instance v1, La/kea;

    .line 86
    .line 87
    const/4 v2, 0x7

    .line 88
    invoke-direct {v1, p1, p0, v2}, La/kea;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 92
    .line 93
    .line 94
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
