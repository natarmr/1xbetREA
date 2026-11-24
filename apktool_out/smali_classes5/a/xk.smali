.class public final La/xk;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation


# static fields
.field public static final Companion:La/tk;


# instance fields
.field public final a:La/wk;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/tk;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/xk;->Companion:La/tk;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(ILa/wk;Ljava/lang/String;Ljava/lang/String;)V
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
    iput-object p2, p0, La/xk;->a:La/wk;

    .line 10
    .line 11
    iput-object p3, p0, La/xk;->b:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, La/xk;->c:Ljava/lang/String;

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sget-object p0, La/sk;->a:La/sk;

    .line 17
    .line 18
    invoke-virtual {p0}, La/sk;->getDescriptor()La/ugi0;

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

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    new-instance v0, La/wk;

    invoke-direct {v0, p1, p2}, La/wk;-><init>(Ljava/lang/String;I)V

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object v0, p0, La/xk;->a:La/wk;

    .line 30
    iput-object p3, p0, La/xk;->b:Ljava/lang/String;

    .line 31
    iput-object p4, p0, La/xk;->c:Ljava/lang/String;

    return-void
.end method
