.class public final La/l0c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/k0c;


# instance fields
.field public final a:La/j0c;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/k0c;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/l0c;->Companion:La/k0c;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(ILa/j0c;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    and-int/lit8 v0, p1, 0x7

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
    iput-object p2, p0, La/l0c;->a:La/j0c;

    .line 10
    .line 11
    iput-object p3, p0, La/l0c;->b:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, La/l0c;->c:Ljava/lang/String;

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sget-object p0, La/g0c;->a:La/g0c;

    .line 17
    .line 18
    invoke-virtual {p0}, La/g0c;->getDescriptor()La/ugi0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p1, v1, p0}, La/m2x;->I(IILa/ugi0;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    throw p0
.end method

.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 27
    new-instance v0, La/j0c;

    invoke-direct {v0, p1, p2, p3}, La/j0c;-><init>(JLjava/lang/String;)V

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object v0, p0, La/l0c;->a:La/j0c;

    .line 30
    iput-object p4, p0, La/l0c;->b:Ljava/lang/String;

    .line 31
    iput-object p5, p0, La/l0c;->c:Ljava/lang/String;

    return-void
.end method
