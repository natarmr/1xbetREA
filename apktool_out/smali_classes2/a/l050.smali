.class public abstract La/l050;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/pfw;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/pfw;

    .line 2
    .line 3
    const-string v1, "NO_OWNER"

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    invoke-direct {v0, v1, v2}, La/pfw;-><init>(Ljava/lang/String;B)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/l050;->a:La/pfw;

    .line 10
    .line 11
    return-void
.end method
