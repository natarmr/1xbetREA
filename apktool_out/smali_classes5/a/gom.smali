.class public final synthetic La/gom;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/pu90;La/wom;FLa/yjj0;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/gom;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/gom;->c:Ljava/lang/Object;

    iput-object p2, p0, La/gom;->d:Ljava/lang/Object;

    iput p3, p0, La/gom;->b:F

    iput-object p4, p0, La/gom;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/pz40;FLjava/util/Map;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/gom;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/gom;->c:Ljava/lang/Object;

    iput p2, p0, La/gom;->b:F

    iput-object p3, p0, La/gom;->d:Ljava/lang/Object;

    iput-object p4, p0, La/gom;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/gom;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/gom;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/gom;->d:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/gom;->c:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object v9, v3

    .line 13
    check-cast v9, La/pz40;

    .line 14
    .line 15
    move-object v7, v2

    .line 16
    check-cast v7, Ljava/util/Map;

    .line 17
    .line 18
    move-object v8, v1

    .line 19
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 20
    .line 21
    check-cast p1, La/hcz;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    move-object v5, v0

    .line 31
    check-cast v5, La/a4x;

    .line 32
    .line 33
    new-instance v0, La/k8e0;

    .line 34
    .line 35
    const/16 v1, 0xf

    .line 36
    .line 37
    invoke-direct {v0, v1}, La/k8e0;-><init>(B)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    new-instance v2, La/pwe0;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-direct {v2, v0, v5, v3}, La/pwe0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    new-instance v0, La/ubn;

    .line 51
    .line 52
    const/16 v3, 0x17

    .line 53
    .line 54
    invoke-direct {v0, v5, v3}, La/ubn;-><init>(La/a4x;B)V

    .line 55
    .line 56
    .line 57
    new-instance v4, La/d7s;

    .line 58
    .line 59
    iget v6, p0, La/gom;->b:F

    .line 60
    .line 61
    invoke-direct/range {v4 .. v9}, La/d7s;-><init>(La/a4x;FLjava/util/Map;Lkotlin/jvm/functions/Function1;La/pz40;)V

    .line 62
    .line 63
    .line 64
    new-instance p0, La/ugd;

    .line 65
    .line 66
    const v3, 0x799532c4

    .line 67
    .line 68
    .line 69
    const/4 v5, 0x1

    .line 70
    invoke-direct {p0, v3, v5, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v1, v2, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 74
    .line 75
    .line 76
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_0
    check-cast v3, La/pu90;

    .line 80
    .line 81
    check-cast v2, La/wom;

    .line 82
    .line 83
    check-cast v1, La/yjj0;

    .line 84
    .line 85
    move-object v0, p1

    .line 86
    check-cast v0, La/ou90;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    new-instance v4, La/ny2;

    .line 92
    .line 93
    const/4 p1, 0x3

    .line 94
    iget p0, p0, La/gom;->b:F

    .line 95
    .line 96
    invoke-direct {v4, v2, p0, v1, p1}, La/ny2;-><init>(Ljava/lang/Object;FLjava/lang/Object;B)V

    .line 97
    .line 98
    .line 99
    const/4 v5, 0x4

    .line 100
    const/4 v2, 0x0

    .line 101
    move-object v1, v3

    .line 102
    const/4 v3, 0x0

    .line 103
    invoke-static/range {v0 .. v5}, La/ou90;->F(La/ou90;La/pu90;IILkotlin/jvm/functions/Function1;I)V

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
