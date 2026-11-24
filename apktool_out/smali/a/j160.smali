.class public final synthetic La/j160;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bdz;

.field public final synthetic c:La/a4x;

.field public final synthetic d:Z

.field public final synthetic e:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/bdz;La/a4x;ZLkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/j160;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/j160;->b:La/bdz;

    iput-object p2, p0, La/j160;->c:La/a4x;

    iput-boolean p3, p0, La/j160;->d:Z

    iput-object p4, p0, La/j160;->e:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/j160;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x10

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    check-cast p1, La/ir8;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object v8, p2

    .line 13
    check-cast v8, La/fet;

    .line 14
    .line 15
    check-cast p3, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    and-int/lit8 p1, p2, 0x11

    .line 25
    .line 26
    if-eq p1, v2, :cond_0

    .line 27
    .line 28
    move v1, v3

    .line 29
    :cond_0
    and-int/lit8 p1, p2, 0x1

    .line 30
    .line 31
    invoke-virtual {v8, p1, v1}, La/fet;->U(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    const/4 v9, 0x0

    .line 38
    iget-object v4, p0, La/j160;->b:La/bdz;

    .line 39
    .line 40
    iget-object v5, p0, La/j160;->c:La/a4x;

    .line 41
    .line 42
    iget-boolean v6, p0, La/j160;->d:Z

    .line 43
    .line 44
    iget-object v7, p0, La/j160;->e:Lkotlin/jvm/functions/Function1;

    .line 45
    .line 46
    invoke-static/range {v4 .. v9}, La/epv0;->q(La/bdz;La/a4x;ZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {v8}, La/fet;->X()V

    .line 51
    .line 52
    .line 53
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_0
    move-object v5, p2

    .line 57
    check-cast v5, La/fet;

    .line 58
    .line 59
    check-cast p3, Ljava/lang/Integer;

    .line 60
    .line 61
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    and-int/lit8 p1, p2, 0x11

    .line 69
    .line 70
    if-eq p1, v2, :cond_2

    .line 71
    .line 72
    move v1, v3

    .line 73
    :cond_2
    and-int/lit8 p1, p2, 0x1

    .line 74
    .line 75
    invoke-virtual {v5, p1, v1}, La/fet;->U(IZ)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_3

    .line 80
    .line 81
    const/4 v8, 0x0

    .line 82
    const/4 v4, 0x0

    .line 83
    iget-object v6, p0, La/j160;->c:La/a4x;

    .line 84
    .line 85
    iget-object v7, p0, La/j160;->b:La/bdz;

    .line 86
    .line 87
    iget-object v9, p0, La/j160;->e:Lkotlin/jvm/functions/Function1;

    .line 88
    .line 89
    iget-boolean v10, p0, La/j160;->d:Z

    .line 90
    .line 91
    invoke-static/range {v4 .. v10}, La/nia0;->y(ILa/fet;La/a4x;La/bdz;La/mm40;Lkotlin/jvm/functions/Function1;Z)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    invoke-virtual {v5}, La/fet;->X()V

    .line 96
    .line 97
    .line 98
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object p0

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
