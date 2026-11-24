.class public final La/amt;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/hps0;


# static fields
.field public static final p:La/ddk;


# instance fields
.field public final o:La/zlt;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/ddk;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/amt;->p:La/ddk;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(La/zlt;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/lm40;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/amt;->o:La/zlt;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final j()Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, La/amt;->p:La/ddk;

    .line 2
    .line 3
    return-object p0
.end method
