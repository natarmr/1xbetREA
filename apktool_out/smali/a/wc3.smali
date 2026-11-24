.class public final La/wc3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/g0h0;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/kd30;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/wc3;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, La/wc3;->b:Ljava/lang/Object;

    .line 13
    .line 14
    const-string v0, "androidx.savedstate.Restarter"

    .line 15
    .line 16
    invoke-virtual {p1, v0, p0}, La/kd30;->S(Ljava/lang/String;La/g0h0;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(La/yc3;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/wc3;->a:B

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/wc3;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 2

    .line 1
    iget-byte v0, p0, La/wc3;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/wc3;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/lun;->a:La/lun;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    new-array v1, v0, [Lkotlin/Pair;

    .line 15
    .line 16
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, [Lkotlin/Pair;

    .line 21
    .line 22
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast p0, Ljava/util/LinkedHashSet;

    .line 27
    .line 28
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, La/l8x;->q0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const-string v1, "classes_to_restore"

    .line 40
    .line 41
    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_0
    new-instance v0, Landroid/os/Bundle;

    .line 46
    .line 47
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 48
    .line 49
    .line 50
    check-cast p0, La/yc3;

    .line 51
    .line 52
    invoke-virtual {p0}, La/yc3;->t()La/hd3;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p0, v0}, La/hd3;->u(Landroid/os/Bundle;)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
