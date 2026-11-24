.class public abstract La/wtw0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/yqw0;

.field public static final b:La/h7x0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/yqw0;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1}, La/yqw0;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/wtw0;->a:La/yqw0;

    .line 8
    .line 9
    new-instance v0, La/qow0;

    .line 10
    .line 11
    const/16 v1, 0x12

    .line 12
    .line 13
    invoke-direct {v0, v1}, La/qow0;-><init>(B)V

    .line 14
    .line 15
    .line 16
    new-instance v1, La/h7x0;

    .line 17
    .line 18
    const-class v2, La/qtw0;

    .line 19
    .line 20
    const-class v3, La/tmw0;

    .line 21
    .line 22
    invoke-direct {v1, v2, v3, v0}, La/h7x0;-><init>(Ljava/lang/Class;Ljava/lang/Class;La/c7x0;)V

    .line 23
    .line 24
    .line 25
    sput-object v1, La/wtw0;->b:La/h7x0;

    .line 26
    .line 27
    return-void
.end method
