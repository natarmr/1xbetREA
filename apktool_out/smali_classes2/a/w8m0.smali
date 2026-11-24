.class public final La/w8m0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:La/w8m0;


# instance fields
.field public final a:La/peg0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/w8m0;

    .line 2
    .line 3
    invoke-direct {v0}, La/w8m0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/w8m0;->b:La/w8m0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/peg0;

    .line 5
    .line 6
    const/16 v1, 0xe

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/peg0;-><init>(B)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/w8m0;->a:La/peg0;

    .line 12
    .line 13
    return-void
.end method
