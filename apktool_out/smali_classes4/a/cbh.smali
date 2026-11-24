.class public final synthetic La/cbh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ujd;

.field public final synthetic c:Landroidx/fragment/app/Fragment;

.field public final synthetic d:La/k3t0;


# direct methods
.method public synthetic constructor <init>(La/ujd;Landroidx/fragment/app/Fragment;La/gbh;La/k3t0;)V
    .locals 0

    .line 1
    const/4 p3, 0x1

    iput-byte p3, p0, La/cbh;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/cbh;->b:La/ujd;

    iput-object p2, p0, La/cbh;->c:Landroidx/fragment/app/Fragment;

    iput-object p4, p0, La/cbh;->d:La/k3t0;

    return-void
.end method

.method public synthetic constructor <init>(La/ujd;Landroidx/fragment/app/Fragment;La/k3t0;B)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/cbh;->a:B

    iput-object p1, p0, La/cbh;->b:La/ujd;

    iput-object p2, p0, La/cbh;->c:Landroidx/fragment/app/Fragment;

    iput-object p3, p0, La/cbh;->d:La/k3t0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/cbh;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/cbh;->d:La/k3t0;

    .line 4
    .line 5
    iget-object v2, p0, La/cbh;->c:Landroidx/fragment/app/Fragment;

    .line 6
    .line 7
    iget-object p0, p0, La/cbh;->b:La/ujd;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, La/zdf0;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object p1, p1, La/zdf0;->a:La/sjd;

    .line 18
    .line 19
    invoke-virtual {p0, v2, p1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 20
    .line 21
    .line 22
    sget-object p0, La/rdf0;->a:La/rdf0;

    .line 23
    .line 24
    invoke-virtual {v1, p0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    check-cast p1, La/sbh;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    instance-of v0, p1, La/sbh;

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    iget-object p1, p1, La/sbh;->a:La/sjd;

    .line 40
    .line 41
    invoke-virtual {p0, v2, p1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 42
    .line 43
    .line 44
    sget-object p0, La/jbh;->a:La/jbh;

    .line 45
    .line 46
    invoke-virtual {v1, p0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    :goto_0
    return-object p0

    .line 57
    :pswitch_1
    check-cast p1, La/lwk;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance p1, La/qq2;

    .line 63
    .line 64
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    new-instance v0, La/ebh;

    .line 68
    .line 69
    const/4 v3, 0x0

    .line 70
    invoke-direct {v0, v1, v3}, La/ebh;-><init>(La/k3t0;B)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v2, p1, v0}, La/ujd;->c(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function1;)V

    .line 74
    .line 75
    .line 76
    new-instance p1, La/fbh;

    .line 77
    .line 78
    invoke-direct {p1, p0, v2, v3}, La/fbh;-><init>(La/ujd;Landroidx/fragment/app/Fragment;B)V

    .line 79
    .line 80
    .line 81
    return-object p1

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
