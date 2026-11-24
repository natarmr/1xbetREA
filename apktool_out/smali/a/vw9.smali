.class public abstract La/vw9;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/z04;

.field public static final b:La/b14;

.field public static final c:La/b14;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, La/o2e;->Y(I)La/z04;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sput-object v0, La/vw9;->a:La/z04;

    .line 7
    .line 8
    new-instance v0, La/b14;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    iput-wide v1, v0, La/b14;->a:J

    .line 16
    .line 17
    sput-object v0, La/vw9;->b:La/b14;

    .line 18
    .line 19
    new-instance v0, La/b14;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-wide v1, v0, La/b14;->a:J

    .line 25
    .line 26
    sput-object v0, La/vw9;->c:La/b14;

    .line 27
    .line 28
    return-void
.end method
