.class public final La/nmf0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/mmf0;


# instance fields
.field public final a:La/mcy;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/mmf0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/nmf0;->Companion:La/mmf0;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(ILa/mcy;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 p1, p1, 0x1

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const-string p1, ""

    .line 9
    .line 10
    invoke-static {p1}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, La/nmf0;->a:La/mcy;

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iput-object p2, p0, La/nmf0;->a:La/mcy;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(La/jdy;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, La/nmf0;->a:La/mcy;

    return-void
.end method
