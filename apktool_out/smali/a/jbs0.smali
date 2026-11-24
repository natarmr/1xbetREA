.class public abstract La/jbs0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/sd90;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/sd90;

    .line 2
    .line 3
    sget-object v1, La/dvn;->c:La/dvn;

    .line 4
    .line 5
    new-instance v2, La/mmn;

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    invoke-direct {v2, v3}, La/mmn;-><init>(B)V

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, La/sd90;-><init>(La/dvn;La/mmn;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/jbs0;->a:La/sd90;

    .line 15
    .line 16
    return-void
.end method
