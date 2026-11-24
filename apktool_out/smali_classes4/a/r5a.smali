.class public final La/r5a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p5a;


# instance fields
.field public final a:La/gmq;


# direct methods
.method public constructor <init>(La/gmq;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/r5a;->a:La/gmq;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, La/qo3;

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, La/qo3;-><init>(La/kmq;B)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/r5a;->a:La/gmq;

    .line 9
    .line 10
    invoke-interface {p0, v0, p2}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object p1, La/wne;->a:La/wne;

    .line 15
    .line 16
    if-ne p0, p1, :cond_0

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0
.end method
