.class public abstract La/keo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/pfw;

.field public static final b:La/pfw;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/pfw;

    .line 2
    .line 3
    const-string v1, "REMOVED_TASK"

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    invoke-direct {v0, v1, v2}, La/pfw;-><init>(Ljava/lang/String;B)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/keo;->a:La/pfw;

    .line 10
    .line 11
    new-instance v0, La/pfw;

    .line 12
    .line 13
    const-string v1, "CLOSED_EMPTY"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, La/pfw;-><init>(Ljava/lang/String;B)V

    .line 16
    .line 17
    .line 18
    sput-object v0, La/keo;->b:La/pfw;

    .line 19
    .line 20
    return-void
.end method
