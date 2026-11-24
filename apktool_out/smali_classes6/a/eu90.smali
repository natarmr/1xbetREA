.class public final La/eu90;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/p430;


# direct methods
.method public constructor <init>(La/p430;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/eu90;->a:La/p430;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(La/vt20;La/zje;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/eu90;->a:La/p430;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, La/p430;->a(La/vt20;La/zje;)Ljava/lang/Object;

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
