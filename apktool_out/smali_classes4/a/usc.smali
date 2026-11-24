.class public final La/usc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/rkr0;


# direct methods
.method public synthetic constructor <init>(La/rkr0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/usc;->a:La/rkr0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/bnn0;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/usc;->a:La/rkr0;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La/rkr0;->h(La/bnn0;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, La/wne;->a:La/wne;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 13
    .line 14
    return-object p0
.end method
