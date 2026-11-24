.class public abstract La/ms00;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/lqd;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/ejd;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    sget-object v2, La/ns00;->a:La/wsz;

    .line 5
    .line 6
    invoke-direct {v0, v2, v1}, La/ejd;-><init>(Ljava/lang/Object;B)V

    .line 7
    .line 8
    .line 9
    new-instance v1, La/lqd;

    .line 10
    .line 11
    invoke-direct {v1, v0}, La/lqd;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 12
    .line 13
    .line 14
    sput-object v1, La/ms00;->a:La/lqd;

    .line 15
    .line 16
    return-void
.end method

.method public static a(La/fet;)La/riu0;
    .locals 1

    .line 1
    sget-object v0, La/ms00;->a:La/lqd;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/riu0;

    .line 8
    .line 9
    return-object p0
.end method
