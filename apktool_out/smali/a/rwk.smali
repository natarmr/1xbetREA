.class public final La/rwk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final a:La/gmq;

.field public final b:Lkotlin/jvm/functions/Function1;

.field public final c:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(La/gmq;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/rwk;->a:La/gmq;

    .line 5
    .line 6
    iput-object p2, p0, La/rwk;->b:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    iput-object p3, p0, La/rwk;->c:Lkotlin/jvm/functions/Function2;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, La/mie0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, La/k860;->a:La/pfw;

    .line 7
    .line 8
    iput-object v1, v0, La/mie0;->a:Ljava/lang/Object;

    .line 9
    .line 10
    new-instance v1, La/yj2;

    .line 11
    .line 12
    const/4 v2, 0x7

    .line 13
    invoke-direct {v1, p0, v0, p1, v2}, La/yj2;-><init>(Ljava/lang/Object;Ljava/io/Serializable;La/kmq;B)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/rwk;->a:La/gmq;

    .line 17
    .line 18
    invoke-interface {p0, v1, p2}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object p1, La/wne;->a:La/wne;

    .line 23
    .line 24
    if-ne p0, p1, :cond_0

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0
.end method
