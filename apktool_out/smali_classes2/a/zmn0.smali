.class public abstract La/zmn0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/swq;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/swq;

    .line 2
    .line 3
    const-string v1, "kotlin.suspend"

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/swq;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/zmn0;->a:La/swq;

    .line 9
    .line 10
    new-instance v0, La/lp9;

    .line 11
    .line 12
    sget-object v1, La/j4m0;->l:La/swq;

    .line 13
    .line 14
    const-string v2, "suspend"

    .line 15
    .line 16
    invoke-static {v2}, La/g950;->e(Ljava/lang/String;)La/g950;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-direct {v0, v1, v2}, La/lp9;-><init>(La/swq;La/g950;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
