.class public final La/dq40;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/cq40;


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/cq40;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/dq40;->Companion:La/cq40;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(JJLjava/lang/String;)V
    .locals 0

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-wide p1, p0, La/dq40;->a:J

    .line 29
    iput-object p5, p0, La/dq40;->b:Ljava/lang/String;

    .line 30
    iput-wide p3, p0, La/dq40;->c:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JJI)V
    .locals 2

    .line 1
    and-int/lit8 v0, p6, 0x7

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    if-ne v1, v0, :cond_0

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-wide p2, p0, La/dq40;->a:J

    .line 10
    .line 11
    iput-object p1, p0, La/dq40;->b:Ljava/lang/String;

    .line 12
    .line 13
    iput-wide p4, p0, La/dq40;->c:J

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sget-object p0, La/bq40;->a:La/bq40;

    .line 17
    .line 18
    invoke-virtual {p0}, La/bq40;->getDescriptor()La/ugi0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p6, v1, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    throw p0
.end method
