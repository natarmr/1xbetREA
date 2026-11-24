.class public abstract La/l39;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/lqd;

.field public static final b:La/k39;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/cp8;

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/cp8;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/lqd;

    .line 9
    .line 10
    invoke-direct {v1, v0}, La/lqd;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, La/l39;->a:La/lqd;

    .line 14
    .line 15
    new-instance v0, La/k39;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, La/l39;->b:La/k39;

    .line 21
    .line 22
    return-void
.end method
