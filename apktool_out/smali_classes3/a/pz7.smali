.class public final La/pz7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kwk;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/pz7;->a:B

    iput-object p1, p0, La/pz7;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-byte v0, p0, La/pz7;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/pz7;->b:Landroid/view/View;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/ujk;->a:Ljava/util/ArrayList;

    .line 9
    .line 10
    sget-object v0, La/ujk;->a:Ljava/util/ArrayList;

    .line 11
    .line 12
    new-instance v1, La/oz7;

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    invoke-direct {v1, p0, v2}, La/oz7;-><init>(Landroid/view/View;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, La/w3d;->y(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    new-instance v1, La/vbk;

    .line 23
    .line 24
    const/4 v2, 0x4

    .line 25
    invoke-direct {v1, v2}, La/vbk;-><init>(B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, La/w3d;->y(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 29
    .line 30
    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    sget-object p0, La/ujk;->b:Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 54
    .line 55
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    return-void

    .line 60
    :pswitch_0
    const/4 v0, 0x0

    .line 61
    invoke-virtual {p0, v0}, Landroid/view/View;->setKeepScreenOn(Z)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
