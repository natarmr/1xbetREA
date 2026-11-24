.class public final synthetic La/ccc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:La/a4x;

.field public final synthetic b:La/vxl;

.field public final synthetic c:La/syl;

.field public final synthetic d:La/jyl;

.field public final synthetic e:Z

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/a4x;La/vxl;La/syl;La/jyl;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ccc;->a:La/a4x;

    iput-object p2, p0, La/ccc;->b:La/vxl;

    iput-object p3, p0, La/ccc;->c:La/syl;

    iput-object p4, p0, La/ccc;->d:La/jyl;

    iput-boolean p5, p0, La/ccc;->e:Z

    iput-object p6, p0, La/ccc;->f:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, La/ccc;->g:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, La/bpq;

    .line 2
    .line 3
    move-object v7, p2

    .line 4
    check-cast v7, La/fet;

    .line 5
    .line 6
    check-cast p3, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    and-int/lit8 p1, p2, 0x11

    .line 16
    .line 17
    const/16 p3, 0x10

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    if-eq p1, p3, :cond_0

    .line 21
    .line 22
    move p1, v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    :goto_0
    and-int/2addr p2, v0

    .line 26
    invoke-virtual {v7, p2, p1}, La/fet;->U(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    iget-object p1, p0, La/ccc;->a:La/a4x;

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    if-eqz p2, :cond_2

    .line 43
    .line 44
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    check-cast p2, La/lxl;

    .line 49
    .line 50
    invoke-static {p2, v7}, La/lcc;->g(La/lxl;La/fet;)La/lxl;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const/4 v8, 0x0

    .line 55
    iget-object v0, p0, La/ccc;->b:La/vxl;

    .line 56
    .line 57
    iget-object v2, p0, La/ccc;->c:La/syl;

    .line 58
    .line 59
    iget-object v3, p0, La/ccc;->d:La/jyl;

    .line 60
    .line 61
    iget-boolean v4, p0, La/ccc;->e:Z

    .line 62
    .line 63
    iget-object v5, p0, La/ccc;->f:Lkotlin/jvm/functions/Function1;

    .line 64
    .line 65
    iget-object v6, p0, La/ccc;->g:Lkotlin/jvm/functions/Function1;

    .line 66
    .line 67
    invoke-static/range {v0 .. v8}, La/lcc;->c(La/vxl;La/lxl;La/syl;La/jyl;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    invoke-virtual {v7}, La/fet;->X()V

    .line 72
    .line 73
    .line 74
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object p0
.end method
