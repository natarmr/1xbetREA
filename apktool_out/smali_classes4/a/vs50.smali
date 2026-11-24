.class public final La/vs50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function0;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/kwj;

.field public final synthetic d:I


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/kwj;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/vs50;->a:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    iput-object p2, p0, La/vs50;->b:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    iput-object p3, p0, La/vs50;->c:La/kwj;

    .line 9
    .line 10
    iput p4, p0, La/vs50;->d:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/nlx;

    .line 2
    .line 3
    instance-of p1, p1, La/nel;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, La/vs50;->a:Lkotlin/jvm/functions/Function0;

    .line 8
    .line 9
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    iget-object p1, p0, La/vs50;->c:La/kwj;

    .line 14
    .line 15
    invoke-virtual {p1}, La/xk80;->k()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iget p2, p0, La/vs50;->d:I

    .line 20
    .line 21
    if-nez p2, :cond_1

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    rem-int/2addr p1, p2

    .line 26
    add-int/2addr p1, p2

    .line 27
    rem-int/2addr p1, p2

    .line 28
    :goto_0
    new-instance p2, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-direct {p2, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, La/vs50;->b:Lkotlin/jvm/functions/Function1;

    .line 34
    .line 35
    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0
.end method
