.class public final synthetic La/n4p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/d4p;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/d4p;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/n4p;->a:B

    iput-object p1, p0, La/n4p;->b:La/mm40;

    iput-object p2, p0, La/n4p;->c:La/d4p;

    iput-object p3, p0, La/n4p;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/n4p;->a:B

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, La/n4p;->d:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    iget-object v4, p0, La/n4p;->c:La/d4p;

    .line 9
    .line 10
    iget-object p0, p0, La/n4p;->b:La/mm40;

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    check-cast p1, La/ir8;

    .line 14
    .line 15
    check-cast p2, La/fet;

    .line 16
    .line 17
    check-cast p3, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    packed-switch v0, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    and-int/lit8 p1, p3, 0x11

    .line 30
    .line 31
    if-eq p1, v1, :cond_0

    .line 32
    .line 33
    move p1, v2

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move p1, v5

    .line 36
    :goto_0
    and-int/2addr p3, v2

    .line 37
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    check-cast v4, La/c4p;

    .line 44
    .line 45
    iget-object p1, v4, La/c4p;->a:La/a4x;

    .line 46
    .line 47
    invoke-static {v5, p2, p1, p0, v3}, La/p8a;->C(ILa/fet;La/a4x;La/mm40;Lkotlin/jvm/functions/Function1;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-virtual {p2}, La/fet;->X()V

    .line 52
    .line 53
    .line 54
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    and-int/lit8 p1, p3, 0x11

    .line 61
    .line 62
    if-eq p1, v1, :cond_2

    .line 63
    .line 64
    move p1, v2

    .line 65
    goto :goto_2

    .line 66
    :cond_2
    move p1, v5

    .line 67
    :goto_2
    and-int/2addr p3, v2

    .line 68
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    check-cast v4, La/z3p;

    .line 75
    .line 76
    iget-object p1, v4, La/z3p;->a:La/a4x;

    .line 77
    .line 78
    invoke-static {v5, p2, p1, p0, v3}, La/p8a;->v(ILa/fet;La/a4x;La/mm40;Lkotlin/jvm/functions/Function1;)V

    .line 79
    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_3
    invoke-virtual {p2}, La/fet;->X()V

    .line 83
    .line 84
    .line 85
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object p0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
