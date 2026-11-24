.class public final La/siu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/riu0;
.implements La/wmv;


# instance fields
.field public final synthetic a:La/piu0;

.field public final synthetic b:La/miu0;

.field public final synthetic c:La/wbf;

.field public final synthetic d:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(La/piu0;La/miu0;La/wbf;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/siu0;->a:La/piu0;

    .line 5
    .line 6
    iput-object p2, p0, La/siu0;->b:La/miu0;

    .line 7
    .line 8
    iput-object p3, p0, La/siu0;->c:La/wbf;

    .line 9
    .line 10
    iput-object p4, p0, La/siu0;->d:Landroid/os/Bundle;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final g()La/piu0;
    .locals 0

    .line 1
    iget-object p0, p0, La/siu0;->a:La/piu0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n()La/miu0;
    .locals 0

    .line 1
    iget-object p0, p0, La/siu0;->b:La/miu0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final o()La/by40;
    .locals 5

    .line 1
    new-instance v0, La/by40;

    .line 2
    .line 3
    iget-object v1, p0, La/siu0;->c:La/wbf;

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/by40;-><init>(La/wbf;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, La/lun;->a:La/lun;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    new-array v2, v1, [Lkotlin/Pair;

    .line 15
    .line 16
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, [Lkotlin/Pair;

    .line 21
    .line 22
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v2, v0, La/wbf;->a:Ljava/util/LinkedHashMap;

    .line 27
    .line 28
    sget-object v3, La/zzg0;->c:La/cge0;

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    check-cast v4, Landroid/os/Bundle;

    .line 35
    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    iget-object v4, p0, La/siu0;->d:Landroid/os/Bundle;

    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    sget-object v1, La/zzg0;->b:La/gne0;

    .line 53
    .line 54
    invoke-interface {v2, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    return-object v0
.end method
