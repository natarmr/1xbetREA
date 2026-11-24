.class public final La/i1e0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/util/List;


# instance fields
.field public final a:La/pzu;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, La/iqr0;->b:La/iqr0;

    .line 2
    .line 3
    sget-object v1, La/iqr0;->c:La/iqr0;

    .line 4
    .line 5
    sget-object v2, La/iqr0;->d:La/iqr0;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [La/iqr0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, La/i1e0;->b:Ljava/util/List;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(La/pzu;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/i1e0;->a:La/pzu;

    .line 5
    .line 6
    return-void
.end method
