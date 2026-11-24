.class public final synthetic La/dl90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/el90;


# direct methods
.method public synthetic constructor <init>(La/el90;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/dl90;->a:B

    iput-object p1, p0, La/dl90;->b:La/el90;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/dl90;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/dl90;->b:La/el90;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/el90;->m2:La/nh70;

    .line 10
    .line 11
    iget-object v0, p0, La/el90;->l2:La/phf0;

    .line 12
    .line 13
    sget-object v2, La/el90;->n2:[La/iiy;

    .line 14
    .line 15
    aget-object v3, v2, v1

    .line 16
    .line 17
    invoke-virtual {v0, p0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    aget-object v1, v2, v1

    .line 22
    .line 23
    invoke-virtual {v0, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 28
    .line 29
    new-instance v2, Lkotlin/Pair;

    .line 30
    .line 31
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0, p0, v3}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, La/yo8;->x0()V

    .line 46
    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_0
    sget-object v0, La/el90;->m2:La/nh70;

    .line 52
    .line 53
    iget-object v0, p0, La/el90;->l2:La/phf0;

    .line 54
    .line 55
    sget-object v2, La/el90;->n2:[La/iiy;

    .line 56
    .line 57
    aget-object v3, v2, v1

    .line 58
    .line 59
    invoke-virtual {v0, p0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    aget-object v1, v2, v1

    .line 64
    .line 65
    invoke-virtual {v0, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 70
    .line 71
    new-instance v2, Lkotlin/Pair;

    .line 72
    .line 73
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {v0, p0, v3}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, La/yo8;->x0()V

    .line 88
    .line 89
    .line 90
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
