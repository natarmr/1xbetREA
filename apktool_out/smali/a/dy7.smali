.class public abstract La/dy7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/qo8;

.field public static final b:La/qo8;

.field public static final c:La/pfw;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "\n"

    .line 2
    .line 3
    invoke-static {v0}, La/qo8;->g(Ljava/lang/String;)La/qo8;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sput-object v1, La/dy7;->a:La/qo8;

    .line 8
    .line 9
    const-string v1, "\r\n"

    .line 10
    .line 11
    invoke-static {v1}, La/qo8;->g(Ljava/lang/String;)La/qo8;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sput-object v1, La/dy7;->b:La/qo8;

    .line 16
    .line 17
    new-instance v1, La/pfw;

    .line 18
    .line 19
    invoke-direct {v1, v0}, La/pfw;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    sput-object v1, La/dy7;->c:La/pfw;

    .line 23
    .line 24
    return-void
.end method
