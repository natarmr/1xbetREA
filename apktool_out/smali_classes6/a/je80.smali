.class public final synthetic La/je80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a4x;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;

.field public final synthetic d:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(La/a4x;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/je80;->a:B

    iput-object p1, p0, La/je80;->b:La/a4x;

    iput-object p2, p0, La/je80;->c:Lkotlin/jvm/functions/Function2;

    iput-object p3, p0, La/je80;->d:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/je80;->a:B

    .line 2
    .line 3
    const v1, 0x799532c4

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    check-cast p1, La/hcz;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v4, p0, La/je80;->b:La/a4x;

    .line 16
    .line 17
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    new-instance v9, La/vdr0;

    .line 22
    .line 23
    invoke-direct {v9, v4, v2}, La/vdr0;-><init>(Ljava/util/List;B)V

    .line 24
    .line 25
    .line 26
    new-instance v3, La/le80;

    .line 27
    .line 28
    const/4 v8, 0x1

    .line 29
    iget-object v6, p0, La/je80;->c:Lkotlin/jvm/functions/Function2;

    .line 30
    .line 31
    iget-object v7, p0, La/je80;->d:Lkotlin/jvm/functions/Function2;

    .line 32
    .line 33
    move-object v5, v4

    .line 34
    invoke-direct/range {v3 .. v8}, La/le80;-><init>(Ljava/util/List;La/a4x;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;B)V

    .line 35
    .line 36
    .line 37
    new-instance p0, La/ugd;

    .line 38
    .line 39
    invoke-direct {p0, v1, v2, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-virtual {p1, v0, v1, v9, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    new-instance v0, La/zc70;

    .line 53
    .line 54
    const/16 v3, 0xe

    .line 55
    .line 56
    invoke-direct {v0, v3}, La/zc70;-><init>(B)V

    .line 57
    .line 58
    .line 59
    iget-object v5, p0, La/je80;->b:La/a4x;

    .line 60
    .line 61
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    new-instance v10, La/m160;

    .line 66
    .line 67
    const/16 v4, 0x11

    .line 68
    .line 69
    invoke-direct {v10, v0, v5, v4}, La/m160;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 70
    .line 71
    .line 72
    new-instance v0, La/a580;

    .line 73
    .line 74
    const/4 v4, 0x5

    .line 75
    invoke-direct {v0, v5, v4}, La/a580;-><init>(Ljava/util/List;B)V

    .line 76
    .line 77
    .line 78
    new-instance v4, La/le80;

    .line 79
    .line 80
    const/4 v9, 0x0

    .line 81
    iget-object v7, p0, La/je80;->c:Lkotlin/jvm/functions/Function2;

    .line 82
    .line 83
    iget-object v8, p0, La/je80;->d:Lkotlin/jvm/functions/Function2;

    .line 84
    .line 85
    move-object v6, v5

    .line 86
    invoke-direct/range {v4 .. v9}, La/le80;-><init>(Ljava/util/List;La/a4x;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;B)V

    .line 87
    .line 88
    .line 89
    new-instance p0, La/ugd;

    .line 90
    .line 91
    invoke-direct {p0, v1, v2, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v3, v10, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 95
    .line 96
    .line 97
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p0

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
