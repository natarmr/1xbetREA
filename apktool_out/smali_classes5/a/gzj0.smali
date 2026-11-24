.class public final synthetic La/gzj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/jzj0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/jzj0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/gzj0;->a:B

    iput-object p1, p0, La/gzj0;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/gzj0;->c:La/jzj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/gzj0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/gzj0;->c:La/jzj0;

    .line 4
    .line 5
    iget-object p0, p0, La/gzj0;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/x5q0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    instance-of v0, p1, La/w5q0;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    check-cast p1, La/w5q0;

    .line 20
    .line 21
    iget-object p1, p1, La/w5q0;->a:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v0, v1, La/jzj0;->a:La/u0f0;

    .line 24
    .line 25
    new-instance v2, Lkotlin/text/Regex;

    .line 26
    .line 27
    const-string v3, "[^\\p{L}\\p{M}\\s\'.\\-]"

    .line 28
    .line 29
    invoke-direct {v2, v3}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    if-eq v0, v3, :cond_0

    .line 40
    .line 41
    const/4 v3, 0x2

    .line 42
    if-eq v0, v3, :cond_0

    .line 43
    .line 44
    const/16 v3, 0x1c

    .line 45
    .line 46
    if-eq v0, v3, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const-string v0, ""

    .line 50
    .line 51
    invoke-virtual {v2, p1, v0}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    :goto_0
    iget-object v0, v1, La/jzj0;->a:La/u0f0;

    .line 56
    .line 57
    new-instance v1, La/n3f0;

    .line 58
    .line 59
    invoke-direct {v1, v0, p1}, La/n3f0;-><init>(La/u0f0;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_0
    check-cast p1, La/jly;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    new-instance p1, La/a3f0;

    .line 74
    .line 75
    iget-object v0, v1, La/jzj0;->a:La/u0f0;

    .line 76
    .line 77
    invoke-direct {p1, v0}, La/a3f0;-><init>(La/u0f0;)V

    .line 78
    .line 79
    .line 80
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_1
    check-cast p1, La/jly;

    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    new-instance p1, La/y2f0;

    .line 92
    .line 93
    iget-object v0, v1, La/jzj0;->a:La/u0f0;

    .line 94
    .line 95
    invoke-direct {p1, v0}, La/y2f0;-><init>(La/u0f0;)V

    .line 96
    .line 97
    .line 98
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object p0

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
