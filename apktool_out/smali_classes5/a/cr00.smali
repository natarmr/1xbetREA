.class public abstract La/cr00;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/lqd;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/w800;

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/w800;-><init>(B)V

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
    sput-object v1, La/cr00;->a:La/lqd;

    .line 14
    .line 15
    return-void
.end method
