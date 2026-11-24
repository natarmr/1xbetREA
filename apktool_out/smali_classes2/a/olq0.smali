.class public final La/olq0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/olq0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/olq0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/olq0;->a:La/olq0;

    .line 7
    .line 8
    return-void
.end method

.method public static a()La/pgq0;
    .locals 3

    .line 1
    new-instance v0, La/pgq0;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-direct {v0, v1, v2}, La/pgq0;-><init>(J)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
