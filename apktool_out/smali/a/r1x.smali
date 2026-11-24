.class public abstract La/r1x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/kuo;

.field public static final b:La/kuo;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/kuo;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/kuo;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/r1x;->a:La/kuo;

    .line 9
    .line 10
    new-instance v0, La/kuo;

    .line 11
    .line 12
    invoke-direct {v0, v1}, La/kuo;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sput-object v0, La/r1x;->b:La/kuo;

    .line 16
    .line 17
    return-void
.end method
