.class public final La/lie;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pzn;

.field public final b:La/alo;

.field public final c:La/agk0;

.field public d:La/u7k0;


# direct methods
.method public constructor <init>(La/pzn;La/alo;FLa/u7k0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/lie;->a:La/pzn;

    .line 5
    .line 6
    iput-object p2, p0, La/lie;->b:La/alo;

    .line 7
    .line 8
    invoke-static {p3}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, La/lie;->c:La/agk0;

    .line 13
    .line 14
    iput-object p4, p0, La/lie;->d:La/u7k0;

    .line 15
    .line 16
    return-void
.end method

.method public synthetic constructor <init>(La/pzn;La/alo;La/u7k0;I)V
    .locals 0

    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_0

    const/4 p3, 0x3

    const/4 p4, 0x0

    .line 17
    invoke-static {p4, p3}, La/ay3;->F(La/t4s;I)La/u7k0;

    move-result-object p3

    :cond_0
    const/4 p4, 0x0

    .line 18
    invoke-direct {p0, p1, p2, p4, p3}, La/lie;-><init>(La/pzn;La/alo;FLa/u7k0;)V

    return-void
.end method
